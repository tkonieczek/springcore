package cwiczenie2;

import cwiczenie2.dao.AccountDAO;
import cwiczenie2.dao.AccountDAOImpl;
import cwiczenie2.services.CreditService;
import cwiczenie2.services.CreditServiceImpl;
import cwiczenie2.services.TransferService;
import cwiczenie2.services.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountDAO accountDAO = (AccountDAO)container.getBean("accountDAOImpl");
        // lub
        AccountDAO accountDAO2 = container.getBean(AccountDAOImpl.class);

        CreditService creditService = container.getBean(CreditServiceImpl.class);
        TransferService transferService = container.getBean(TransferServiceImpl.class);

        //wywołanie dowolnej metody na komponentach
        accountDAO.getAccounts();
        creditService.getMortgate("id1", 5000d);
        transferService.deposit("id1", 5000d);
    }
}
