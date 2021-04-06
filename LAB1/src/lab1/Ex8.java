package lab1;

import java.util.Scanner;

public class Ex8 {
	Boolean checkNumber(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		Ex8 e=new Ex8();
		System.out.println(e.checkNumber(n));
	}

}
