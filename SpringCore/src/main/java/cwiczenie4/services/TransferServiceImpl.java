package cwiczenie4.services;

import cwiczenie4.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransferServiceImpl implements TransferService {

    //Analogicznie jak w CreditService Service wykorzystuje jako swoją zależność komponent dostępu do bazy danych
    AccountDAO accountDAO;

    @Autowired
    public TransferServiceImpl(@Qualifier("mainAccountDAO") AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void deposit(String accountId, double amount) {
        //wykorzystanie dao ale na potrzeby ćwiczenia bez szczegółowej implementacji
        accountDAO.getAccountById(accountId);
        System.out.println("Wpłata " + amount + " PLN");
    }

    @Override
    public void withdraw(String accountId, double amount) {
        //jak wyzej
        accountDAO.getAccountById(accountId);
        System.out.println("Wypłata wypłata " + amount);
    }

    @Override
    public void transfer(String sourceAccountId, String destinationAccountId, double amount) {
        //jak wyzej
        accountDAO.getAccountById(sourceAccountId);
        accountDAO.getAccountById(destinationAccountId);
        System.out.println("Przelew w wysokości " + amount + " z konta " + sourceAccountId + " na konto " + destinationAccountId);
    }
}
