package sri.spring.boot.properties.external;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:configForPropertiesOne.xml")
@ComponentScan("sri.spring.boot.properties.core")
public class ExternalPropertiesWithXmlConfigOne {

    public ExternalPropertiesWithXmlConfigOne() {
        super();
    }

}
