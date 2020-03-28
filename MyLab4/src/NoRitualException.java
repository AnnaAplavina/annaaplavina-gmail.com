public class NoRitualException extends NullPointerException {
    private String exceptionString;
    public NoRitualException(){
        exceptionString = "Ошибка проведения ворожбы ";
    }

    public NoRitualException(String addInfo){
        super();
        exceptionString = "Ошибка проведения ворожбы, " + addInfo;
    }
    public String getEx() {
        return exceptionString;
    }
}