package pluralsight;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public void BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double charge(double amount) {
        return amount * 0.1;
    }

    double amount(double pay) {
        return pay * 0.1;
    }

    public double getValue() {
        return balance;
    }
}
