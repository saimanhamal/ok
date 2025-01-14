package week3tut;

public class Task1 {
    public static void main(String args[]) {
        BankAccount bankAccount = new BankAccount("123456", -10.0);
        
        System.out.println("Initial Balance: " + bankAccount.getBalance());
        bankAccount.deposit(400.0);
        System.out.println("Amount after the deposit: " + bankAccount.getBalance());
        
        bankAccount.withdraw(50.0);
        System.out.println("Amount after the withdraw: " + bankAccount.getBalance());
    }
    
}

class BankAccount{
    private String accountNumber;
    private double balance;
    
    
    BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        }
        else {
            this.balance = 0;
        }
        
    }
    
    //getter for AccountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    
    //setter for AccountNumber
    public void setAccountNumber(String acNo) {
        this.accountNumber = acNo;
    }

    //getter for Balance
    public double getBalance() {
        return balance;
    }
    
    //setter for Balance
    public void setBalance(double amount) {
        if(amount > 0) {
            this.balance = amount;
        }else {
            System.out.println("Amount cannot be negative.");
        }   
    }
    
    //method for deposit
    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
            balance += depositAmount;
        }else {
            System.out.println("Cannot deposit negative amount.");
        }
    }
    
    //method for withdraw
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount >= 0) {
            if(withdrawAmount <= balance) {
                balance -= withdrawAmount;
            }else {
                System.out.println("Insufficient amounts.");
            }
        }else {
            System.out.println("Cannot withdraw negative amount.");
        }
    }
}



