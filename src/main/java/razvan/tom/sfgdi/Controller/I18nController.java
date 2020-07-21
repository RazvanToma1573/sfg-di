package razvan.tom.sfgdi.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import razvan.tom.sfgdi.Service.GreetingService;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
