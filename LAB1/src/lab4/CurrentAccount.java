package lab4;

public class CurrentAccount extends Account {
	CurrentAccount(long accNum, double Balance, Person accHolder) {
		super(accNum, getBalance1(), accHolder);
	}
	int overdriftLimit=5;
	public void withdraw(int amount)
	{
		if(overdriftLimit>amount)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	
	

}

