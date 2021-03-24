package cwiczenie2.services;

import org.springframework.stereotype.Component;

@Component
public class TransferServiceImpl implements TransferService {

    @Override
    public void deposit(String accountId, double amount) {
        System.out.println("Wpłata " + amount + " PLN");
    }

    @Override
    public void withdraw(String accountId, double amount) {
        System.out.println("Wypłata wypłata " + amount);
    }

    @Override
    public void transfer(String sourceAccountId, String destinationAccountId, double amount) {
        System.out.println("Przelew w wysokości " + amount + " z konta " + sourceAccountId + " na konto " + destinationAccountId);
    }
}
