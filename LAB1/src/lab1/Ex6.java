package lab1;

import java.util.Scanner;

public class Ex6 {
	int calculateDifference(int n)
	{
		int sum=0,flag=0;
		int num=0,num1=0,num2=0;
		for(int i=1;i<=n;i++)
		{
			num=i*i;
			num1=num1+num;
		}
		for(int i=1;i<=n;i++)
		{
			num2=num2+i;
		}
		flag=num2*num2;
		sum=num1-flag;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Ex6 ex=new Ex6();
		System.out.println(ex.calculateDifference(n));
		
	}

}
