package cwiczenie4.dao;

import cwiczenie4.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> getAccounts();

    Account getAccountById(String accountId);
}
