package cwiczenie4.services;

import cwiczenie4.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//tylko klasa (nie interfejs) może być komponentem
@Component
public class CreditServiceImpl implements CreditService {

    //Service wykorzystuje jako swoją zależność komponent dostępu do bazy danych
    AccountDAO accountDAO;

    //Wstrzykujemy komponent DAO przez konstruktor
    @Autowired
    public CreditServiceImpl(@Qualifier("mainAccountDAO") AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public boolean getMortgate(String accountID, double amount) {
        //wykorzystanie dao ale na potrzeby ćwiczenia bez szczegółowej implementacji
        accountDAO.getAccountById(accountID);
        //niby coś robimy :)
        System.out.println("Wniosek o kredyt hipoteczny");
        return false;
    }

    @Override
    public boolean getCashLoad(String accountID, double amount) {
        //wykorzystanie dao ale na potrzeby ćwiczenia bez szczegółowej implementacji
        accountDAO.getAccountById(accountID);
        //tu też niby coś robimy
        System.out.println("Wniosek o pożyczkę gotówkową");
        return false;
    }
}
