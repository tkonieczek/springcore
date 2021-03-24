package cwiczenie2.services;

public interface TransferService {

    void deposit(String accountId, double amount);

    void withdraw(String accountId, double amount);

    void transfer(String sourceAccountId, String destinationAccountId, double amount);
}
