package lab4;

public class Ex1 {
	public static void main(String[] args) {
		Person p1=new Person("smith",25);
		Account a1=new Account(123,2000,p1);
		
		a1.deposit(3000);
		
		System.out.println("smith balance: "+a1.getBalance1());
		System.out.println("Account Number: "+a1.getAccNum());
		System.out.println("Person Age: "+p1.getAge());
		
		Account sa1=new SavingsAccount(0, 0, p1);
		sa1.withdraw(2000);
		
		Account ca=new CurrentAccount(0,0,p1);
		ca.withdraw(3);
	}
}
