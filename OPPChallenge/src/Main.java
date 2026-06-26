public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("12345", 500.0, "Bob Brown", "myemail@bob.com", "+2348167310747");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "12345");
        System.out.println("Account No: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getName());
    }

}
