package Assessment1;

class BankAccount {
    
    
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

 
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Current Balance: " + acc.getBalance());
        
    }
}
