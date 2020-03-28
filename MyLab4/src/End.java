import java.util.*;
public class End {
    private static int numberOfEventsAboutToEnd = 0;
    NewEnding ending;
    private String whatEnded;
    public End(String whatEnded, String howEnded){
        this.whatEnded = whatEnded;
        ending = new NewEnding(howEnded);
        EventsToEndProcessor.addEvent(whatEnded);
    }
    public static void printNumOfEventsAboutToEnd(){
        System.out.println(numberOfEventsAboutToEnd + " - число действий, которые могут завершиться");
    }
    public void endEvent(){
        /*EventsToEndProcessor.printNumOfEvToEnd();*/
        System.out.print("Действие ");
        ending.end();
    }
    class NewEnding{
    String howEnded;
    public NewEnding(String howEnded){
        this.howEnded = howEnded;
    }
    private void end(){
        System.out.println(whatEnded + ", " + howEnded);
        EventsToEndProcessor.deleteEvent(whatEnded);
        }
    }

    private static class EventsToEndProcessor{
        static ArrayList<String> ends = new ArrayList<String>();
        private static void addEvent(String end) {
            ends.add(end);
            numberOfEventsAboutToEnd = ends.size();
        }
        private static void deleteEvent(String end){
            ends.remove(end);
            numberOfEventsAboutToEnd = ends.size();
        }
    }
}
