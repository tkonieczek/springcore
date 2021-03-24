package cwiczenie3.services;

public interface CreditService {

    boolean getMortgate(String accountID, double amount);

    boolean getCashLoad(String accountID, double amount);
}
