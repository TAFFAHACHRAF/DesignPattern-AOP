package taffah.enset.aopapp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import taffah.enset.aopapp1.aspects.MyApplicationContext;
import taffah.enset.aopapp1.metier.IMetier;

public class Application {
    public static void main(String[] args) {
        // Create the ApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Authenticate user using your custom MyApplicationContext
        MyApplicationContext.authenticateUser("root", "1234", new String[]{"ADMIN"});

        // Get the bean from the context
        IMetier metier = context.getBean(IMetier.class);

        // Use the metier bean
        metier.process();
        System.out.println(metier.compute());

        // Close the context when done
        context.close();
    }
}
