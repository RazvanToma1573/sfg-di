package razvan.tom.sfgdi.Service;

public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGreeting(String lang) {
        switch (lang) {
            case "en":
                return "Hello World - EN";
            case "de":
                return "GUTTEN WELT - DE";
            case "es":
                return "HOLA MUNDO - ES";
            default:
                return "Hello World - EN";
        }
    }
}
