/*Фрекен Снорк кивнула. От страха у нее побелела мордочка. Они принялись что-то бормотать и выписывать круги, притоптывая ногами.
Седьмой круг был самым долгим, потому что теперь им стало по-настоящему жутко. Но если ух начал ворожить в ночь на Иванов день,
то надо продолжать, а то еще неизвестно, чем все кончится.
 */

public class Main {
    public static void main(String[] args) {
        SpecialDate ivanov = new SpecialDate("Иванов день", TimeOfDay.NIGHT);
        MumiTroll snork = new MumiTroll("Фрекен+Снорк");
        MumiTroll notSnork = new MumiTroll("Снифф");
        snork.expressEmotion(Emotion.AFRAID);
        snork.nod();
        //Ritual ritual = new Ritual(ivanov,7, snork, notSnork);
        Ritual ritual = null;
        try{try{
        ritual.start();}
        catch (NullPointerException ex){
            throw new NoRitualException();
        }}
        catch (NoRitualException ex){
            System.out.println(ex.getEx());
            End ritualEnding = new End("Ворожба", "завершиось неизвестно чем");
            ritualEnding.endEvent();
        }
        End ivanovEnding = new End("Иванов День", "завершилось благопалучно");
        End.printNumOfEventsAboutToEnd();
        ivanovEnding.endEvent();
    }
}