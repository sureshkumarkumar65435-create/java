class BankAccount {
    private double balance;

    // Setter method
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(5000.0);

        System.out.println("Account Balance: " + account.getBalance());
    }
}
