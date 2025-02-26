package Practice;
//Bank Account System
//
//Create a BankAccount class with attributes: accountNumber, holderName, and balance.
//Implement methods to deposit, withdraw, and check balance.
//Use encapsulation to protect balance modifications

//public class BankAccount {
//    private String number;
//    private String type;
//    private double balance;
//
//    public static void main(String[] args) {
//        BankAccount b = new BankAccount();
//        b.setAccountNumber("178563808");
//                b.setHolderName("J Komape");
//                b.setBalance(7890.89);
//    }
//
//    private void setAccountNumber(String number) {
//        this.number = number;
//    }
//    private void setHolderName(String type) {
//        this.type = type;
//    }
//    private void setBalance(double balance) {}
//
//}
//Corrections & Improvements:
//Getter Methods Missing: You haven't added getter methods to retrieve values.
//Incorrect Naming (setHolderName): The attribute type should be holderName (or something similar).
//Balance Not Being Set: Your setBalance() method is empty, meaning the balance value is never assigned.
//Encapsulation & Constructor Improvement: It’s better to use a constructor to initialize the account details instead of relying only on setters.
//Printing Account Details: After setting the values, print them to verify the object is correctly initialized.


public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    //constructor for initialization
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    //setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: R" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: R" + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object using the constructor
        BankAccount account = new BankAccount("178563808", "J Komape", 7890.89);

        // Display initial details
        account.displayAccountDetails();

        // Perform transactions
        account.deposit(500.00);
        account.withdraw(2000.00);

        // Display updated details
        account.displayAccountDetails();
    }
}
