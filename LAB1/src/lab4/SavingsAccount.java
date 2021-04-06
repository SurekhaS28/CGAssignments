package lab4;

public class SavingsAccount extends Account {
	
	
	SavingsAccount(long accNum, double Balance, Person accHolder) {
		super(accNum, getBalance1(), accHolder);
	}

	public void withdraw(int amount)
		{
			final int minimumBalance = 500;
	        if(minimumBalance<getBalance1() && amount<=getBalance1())
	        {
	        	Balance = Balance-amount;
	        	System.out.println("Amount Withdrawn!! Available Balance: "+Balance);
	        }
	        else
	        {
	            System.out.println("Insufficient funds!!");
		    }
	    }
}
