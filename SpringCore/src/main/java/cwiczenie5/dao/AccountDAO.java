package cwiczenie5.dao;

import cwiczenie5.model.Account;

import java.util.List;

public interface AccountDAO {

    List<Account> getAccounts();

    Account getAccountById(String accountId);
}
