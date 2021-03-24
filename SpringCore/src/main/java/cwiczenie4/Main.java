package cwiczenie4;

import cwiczenie4.dao.AccountDAO;
import cwiczenie4.dao.AccountDAOImpl;
import cwiczenie4.services.CreditService;
import cwiczenie4.services.CreditServiceImpl;
import cwiczenie4.services.TransferService;
import cwiczenie4.services.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        //W pierwszej części ćwiczenia dodajemy drugą implementację AccountDAO --> AccountDAOImpl2
        //Powoduje to błąd związany z tym, że spring nie wie który z nich wstrzyknąć

        //W drugim etapie ćwiczenia nadajemy komponentom DAO nazwy a następnie używamy Qualifier w serwisach
        //w konstruktorze mówiąc springowi który komponent chcemy wstrzyknąć
        AccountDAO accountDAO = container.getBean(AccountDAOImpl.class);
        CreditService creditService = container.getBean(CreditServiceImpl.class);
        TransferService transferService = container.getBean(TransferServiceImpl.class);
    }
}
