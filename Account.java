package oopsconcepts;

	
	//Question 4	
	
	public class Account
	{
	    // Data members
	    private String accountHolderName;
	    private double balance;

	    // No-argument constructor
	    public Account() {
	        this.accountHolderName = "Unknown";
	        this.balance = 0.0;
	    }

	    // Constructor with two arguments
	    public Account(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance > 0 ? initialBalance : 0.0;
	    }

	    // Method to deposit money
	    public void deposit(double amount)
	    {
	        if (amount > 0)
	        {
	            balance += amount;
	            System.out.println("Successfully deposited: $" + amount);
	        } else
	        {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount)
	    {
	        if (amount > 0) 
	        {
	            if (amount <= balance) 
	            {
	                balance -= amount;
	                System.out.println("Successfully withdrew: $" + amount);
	            } else
	            {
	                System.out.println("Insufficient balance.");
	            }
	        } else 
	        {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    // Method to check balance
	    public double checkBalance() 
	    {
	        return balance;
	    }

	    // Method to display account details
	    public void displayAccountDetails() 
	    {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Current Balance: $" + balance);
	    }

	    
	    public static void main(String[] args) {
	        // Using no-argument constructor
	        Account account1 = new Account();
	        account1.displayAccountDetails();
	        account1.deposit(500);
	        account1.withdraw(200);
	        System.out.println("Balance: $" + account1.checkBalance());

	        System.out.println();

	        // Using constructor with arguments
	        Account account2 = new Account("Jeevan", 1000);
	        account2.displayAccountDetails();
	        account2.withdraw(300);
	        account2.deposit(200);
	        System.out.println("Balance: $" + account2.checkBalance());
	    }
	}
	
	/*OUTPUT:
	 
Account Holder: Jeevan
Current Balance: $1000.0
Successfully withdrew: $300.0
Successfully deposited: $200.0
Balance: $900.0

*/
