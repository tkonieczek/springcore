package cwiczenie1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Stworzenie kontenera spring
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
