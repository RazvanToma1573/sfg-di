package razvan.tom.sfgdi.Service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
