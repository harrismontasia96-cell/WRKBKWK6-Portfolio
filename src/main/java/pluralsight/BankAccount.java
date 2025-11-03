package pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String AccountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        AccountNumber = accountNumber;
        this.balance = balance;
    }


    public double deposit(double amount) {
        return amount + 0.5;
    }

    private double withdraw(double amount) {
        return amount - 0.5;
    }

    @Override
    public double getValue() {
        return balance;

    }
}
