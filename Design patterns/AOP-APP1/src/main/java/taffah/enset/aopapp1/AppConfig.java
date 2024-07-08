package taffah.enset.aopapp1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"taffah.enset.aopapp1.metier", "taffah.enset.aopapp1.aspects"})
public class AppConfig {
}
