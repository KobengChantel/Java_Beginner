package Practice;
//Bank Account System
//
//Create a BankAccount class with attributes: accountNumber, holderName, and balance.
//Implement methods to deposit, withdraw, and check balance.
//Use encapsulation to protect balance modifications

public class BankAccount {
    private String number;
    private String type;
    private double balance;

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber("178563808");
                b.setHolderName("J Komape");
                b.setBalance(7890.89);
    }

    private void setAccountNumber(String number) {
        this.number = number;
    }
    private void setHolderName(String type) {
        this.type = type;
    }
    private void setBalance(double balance) {}

}
