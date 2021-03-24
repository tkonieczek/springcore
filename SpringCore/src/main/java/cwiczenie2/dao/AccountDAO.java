package cwiczenie2.dao;

import cwiczenie2.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> getAccounts();

    Account getAccountById(String accountId);
}
