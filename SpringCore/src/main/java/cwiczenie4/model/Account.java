package cwiczenie4.model;

public class Account {

    String id;
    double saldo;
    String name;
    String surname;

    public Account() {
    }

    public Account(String id, double saldo, String name, String surname) {
        this.id = id;
        this.saldo = saldo;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
