
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance >= 0 ? balance : 0;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAccountHolder(String holder) {
        if (holder != null && !holder.trim().isEmpty()) {
            accountHolder = holder;
        }
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful: Rs. " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Withdrawal Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful: Rs. " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

       

        BankAccount account =
            new BankAccount("Puneet", 12345, 5000);

        System.out.println("Account Holder: " +
                           account.getAccountHolder());

        System.out.println("Account Number: " +
                           account.getAccountNumber());

        System.out.println("Initial Balance: Rs. " +
                           account.getBalance());

        System.out.println("\nPerforming Transactions:");

        account.deposit(2000);
        account.deposit(-500);

        account.withdraw(1000);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\nFinal Account Details:");
        System.out.println("Account Holder: " +
                           account.getAccountHolder());

        System.out.println("Account Number: " +
                           account.getAccountNumber());

        System.out.println("Final Balance: Rs. " +
                           account.getBalance());
    }
}
