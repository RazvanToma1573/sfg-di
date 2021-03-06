package razvan.tom.sfgdi.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreeting("en");
    }
}
