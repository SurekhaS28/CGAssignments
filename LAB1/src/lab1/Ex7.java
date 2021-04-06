package lab1;

import java.util.Scanner;

public class Ex7 {
	boolean checkNumber(int number)
	{
		boolean flag=false;
			int num=number%10;
			number=number/10;
			while(number>0)
			{
				if(num<=number%10)
				{
					flag=true;
					break;
				}
				num=number%10;
				number=number/10;
			}
			if(flag)
			{
				return false;
			}
			else
			{
				return true;
			}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Ex7 e=new Ex7();
		System.out.println(e.checkNumber(number));
	}
}
