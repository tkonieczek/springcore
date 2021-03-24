package cwiczenie4.dao;

import cwiczenie4.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("accountDAO")
public class AccountDAOImpl2 implements AccountDAO {

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
