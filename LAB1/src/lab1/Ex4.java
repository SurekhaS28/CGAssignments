package lab1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String prime="";
		for(int i=1;i<num;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				prime=prime+i+" ";
			}
		}
		System.out.println(prime);
	}
}
