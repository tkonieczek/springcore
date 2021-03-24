package cwiczenie5;


import cwiczenie5.dao.AccountDAO;
import cwiczenie5.dao.AccountDAOImpl;
import cwiczenie5.services.CreditServiceImpl;
import cwiczenie5.services.TransferService;
import cwiczenie5.services.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Etap 1");
        //Pierwszy etap zadania tworzymy kontener i wypisujemy licznik kazdej klasy komponentu
        System.out.println(AccountDAOImpl.counter);
        System.out.println(CreditServiceImpl.counter);
        System.out.println(TransferServiceImpl.counter);

        //Nasptęmnie oznaczamy np. komponentTransferServiveImpl jako @Lazy i robimy to samo
        System.out.println("Etap 2");
        System.out.println(AccountDAOImpl.counter);
        System.out.println(CreditServiceImpl.counter);
        System.out.println(TransferServiceImpl.counter);

        System.out.println("Etap 3");
        //następny etap zadania to wyciągnięcie komponentu komponentTransferServiveImpl z kontenera i ponowne wypisanie
        TransferService transferService = container.getBean(TransferServiceImpl.class);
        System.out.println(AccountDAOImpl.counter);
        System.out.println(CreditServiceImpl.counter);
        System.out.println(TransferServiceImpl.counter);

        System.out.println("Etap 4");
        //W kolejnym etapie zmieniamy zasięg komponentu np.AccountDAOImpl na prototype dodająć adnotację @Scope
        System.out.println(AccountDAOImpl.counter);
        System.out.println(CreditServiceImpl.counter);
        System.out.println(TransferServiceImpl.counter);

        //Na koniec wyciągamy jeszcze kilka komponentow o zasięgu prototype i wypisujemy ich stworzoną ilość
        AccountDAO accountDAO = container.getBean(AccountDAOImpl.class);
        AccountDAO accountDAO2 = container.getBean(AccountDAOImpl.class);
        AccountDAO accountDAO3 = container.getBean(AccountDAOImpl.class);
        AccountDAO accountDAO4 = container.getBean(AccountDAOImpl.class);

        System.out.println(AccountDAOImpl.counter);
    }
}
