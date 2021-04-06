package lab1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int n=0;
		int cube=0;
		int num=sc.nextInt();
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		cube=sum*sum*sum;
		System.out.println(cube);
	}

}
