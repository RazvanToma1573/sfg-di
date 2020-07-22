package razvan.tom.sfgdi.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreeting("de");
    }
}
