package cwiczenie3.services;

import cwiczenie3.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferServiceImpl implements TransferService {

    //Analogicznie jak w CreditService Service wykorzystuje jako swoją zależność komponent dostępu do bazy danych
    AccountDAO accountDAO;

    // statyczny licznik do liczenie ilości utworzonych komponentów
    public static int counter;

    @Autowired
    public TransferServiceImpl(AccountDAO accountDAO) {
        // zwiekszamy licznik za każdym razem jak tworzony jest nowy obiekt tj. wywoływany jego konstruktor
        counter++;
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
