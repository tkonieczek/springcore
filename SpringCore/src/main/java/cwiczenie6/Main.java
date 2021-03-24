package cwiczenie6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Tworzomy kontener co spowoduje utworzenia w nim beana AccountDAOImpl
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
