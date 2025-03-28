public class BankAccount { 
    private double balance;
    private String owner;
    private int accountNumber;
    private String type;
    
    public BankAccount(double balance, String owner, int accountNumber, String type) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.type = type;
    }
    
    public void deposit(double amount) {
        if (amount < 0) {

            System.out.println("Invalid deposit amount.");
            return;
        }
        else {
            this.balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        else {
        this.balance -= amount;
        }
    }
    
    public void transfer(BankAccount account, double amount) {
        this.withdraw(amount);
        account.deposit(amount);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, "John Doe", 123456, "Checking");
        BankAccount accountA = new BankAccount(5000, "Jane Doe", 654321, "Savings");
        System.out.println("Account created with balance: " + account.balance + " owner: " + account.owner + " account number: " + account.accountNumber + " type: " + account.type + ".");
        double depositAmount = -500;
        account.deposit(depositAmount);
        System.out.println("Account balance after deposit: " + account.balance + ".");
        account.withdraw(200);
        System.out.println("Account balance after withdrawal: " + account.balance + ".");
        account.transfer(accountA, 100);
        System.out.println("Account balance after transfer: " + account.balance + ".");
        System.out.println("Account A balance after transfer: " + accountA.balance + ".");
    }
    
}
