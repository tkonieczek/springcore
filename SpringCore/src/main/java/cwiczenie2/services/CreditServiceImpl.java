package cwiczenie2.services;

import org.springframework.stereotype.Component;

@Component
public class CreditServiceImpl implements CreditService{

    @Override
    public boolean getMortgate(String accountID, double amount) {
        System.out.println("Wniosek o kredyt hipoteczny");
        return false;
    }

    @Override
    public boolean getCashLoad(String accountID, double amount) {
        System.out.println("Wniosek o pożyczkę gotówkową");
        return false;
    }
}
