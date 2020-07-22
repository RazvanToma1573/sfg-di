package razvan.tom.sfgdi.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import razvan.tom.sfgdi.ExampleBeans.FakeDataSource;
import razvan.tom.sfgdi.ExampleBeans.FakeJMSBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//or
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${razvan.username}")
    String username;

    @Value("${razvan.password}")
    String password;

    @Value("${razvan.dburl}")
    String url;

    @Value("${razvan.jms.username}")
    String jmsUsername;

    @Value("${razvan.jms.password}")
    String jmsPassword;

    @Value("${razvan.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker() {
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUsername(jmsUsername);
        fakeJMSBroker.setPassword(jmsPassword);
        fakeJMSBroker.setUrl(jmsUrl);
        return fakeJMSBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
