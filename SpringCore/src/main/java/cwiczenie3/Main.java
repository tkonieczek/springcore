package cwiczenie3;

import cwiczenie3.dao.AccountDAO;
import cwiczenie3.dao.AccountDAOImpl;
import cwiczenie3.services.CreditService;
import cwiczenie3.services.CreditServiceImpl;
import cwiczenie3.services.TransferService;
import cwiczenie3.services.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        //Dodatkowo: Sprawdzić ile instacji poszczególnych komponentów znajduję się kontenerze spring. Napisać kod który w jakiś sposób to potwierdzi.
        //kilkuktornie pobiramy z kontenera każdy z komponentów
        AccountDAO accountDAO = container.getBean(AccountDAOImpl.class);
        AccountDAO accountDAO2 = container.getBean(AccountDAOImpl.class);
        AccountDAO accountDAO3 = container.getBean(AccountDAOImpl.class);
        CreditService creditService = container.getBean(CreditServiceImpl.class);
        CreditService creditService2 = container.getBean(CreditServiceImpl.class);
        CreditService creditService3 = container.getBean(CreditServiceImpl.class);
        CreditService creditService4 = container.getBean(CreditServiceImpl.class);
        TransferService transferService = container.getBean(TransferServiceImpl.class);
        TransferService transferService2 = container.getBean(TransferServiceImpl.class);
        TransferService transferService3 = container.getBean(TransferServiceImpl.class);
        TransferService transferService4 = container.getBean(TransferServiceImpl.class);
        TransferService transferService5 = container.getBean(TransferServiceImpl.class);
        //wywołanie dowolnej metody na komponentach

        //wyświetlamy na ekranie każdy z liczników
        System.out.println(AccountDAOImpl.counter);
        System.out.println(CreditServiceImpl.counter);
        System.out.println(TransferServiceImpl.counter);
    }
}
