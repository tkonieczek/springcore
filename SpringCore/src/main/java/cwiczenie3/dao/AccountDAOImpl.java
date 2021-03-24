package cwiczenie3.dao;

import cwiczenie3.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDAOImpl implements AccountDAO {

    // statyczny licznik do liczenie ilości utworzonych komponentów
    public static int counter;

    public AccountDAOImpl() {
        // zwiekszamy licznik za każdym razem jak tworzony jest nowy obiekt tj. wywoływany jego konstruktor
        counter++;
    }

    @Override
    public List<Account> getAccounts() {
        System.out.println("Pobieram wszystkie konta");
        return null;
    }

    @Override
    public Account getAccountById(String accountId) {
        System.out.println("Pobieram konto o id " + accountId);
        return null;
    }
}
