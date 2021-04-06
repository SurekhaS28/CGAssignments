package lab4;

public class Account {
	private long accNum;
	protected static double Balance;
	private Person accHolder;
	
	Account(long accNum,double Balance,Person accHolder)
	{
		this.accNum=accNum;
		this.Balance=Balance;
		this.accHolder=accHolder;
	}
	
	void deposit(int amount)
	{
		System.out.println(Balance=Balance+amount);
	}
    
	static double getBalance1()
	{
		return Balance;
	}
	
    void withdraw(int amount){
    }

	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

}
