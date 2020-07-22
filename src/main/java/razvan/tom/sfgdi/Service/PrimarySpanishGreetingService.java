package razvan.tom.sfgdi.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreeting("es");
    }

}
