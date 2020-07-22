package razvan.tom.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import razvan.tom.sfgdi.Controller.*;
import razvan.tom.sfgdi.ExampleBeans.FakeDataSource;
import razvan.tom.sfgdi.ExampleBeans.FakeJMSBroker;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println("Username: " + fakeDataSource.getUsername());

		FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);

		System.out.println("Username jms: " + fakeJMSBroker.getUsername());
	}

}
