public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("45663", 2.50, "Default name", "Default email", "Default Phone");
        System.out.println("BankAccount constructor");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("45663", 100.55, name, email, phoneNumber);
    }

    public void depositFunds(double amount) {
        balance += amount;

        System.out.println("Deposit of $" + amount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds to withdraw");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed, Remaining balance = $" + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
