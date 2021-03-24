package cwiczenie3.dao;

import cwiczenie3.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> getAccounts();

    Account getAccountById(String accountId);
}
