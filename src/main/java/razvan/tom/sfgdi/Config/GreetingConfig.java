package razvan.tom.sfgdi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import razvan.tom.sfgdi.Service.*;

@Configuration
public class GreetingConfig {


    @Bean
    public GreetingRepository greetingRepository() {
        return new GreetingRepositoryImpl();
    }

    @Bean
    public GreetingServiceFactory greetingServiceFactory() {
        return new GreetingServiceFactory(greetingRepository());
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }
}
