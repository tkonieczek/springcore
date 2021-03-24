package cwiczenie3.services;

import cwiczenie3.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//tylko klasa (nie interfejs) może być komponentem
@Component
public class CreditServiceImpl implements CreditService {

    //Service wykorzystuje jako swoją zależność komponent dostępu do bazy danych
    AccountDAO accountDAO;

    // statyczny licznik do liczenie ilości utworzonych komponentów
    public static int counter;

    //Wstrzykujemy komponent DAO przez konstruktor
    @Autowired
    public CreditServiceImpl(AccountDAO accountDAO) {
        // zwiekszamy licznik za każdym razem jak tworzony jest nowy obiekt tj. wywoływany jego konstruktor
        counter++;
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
