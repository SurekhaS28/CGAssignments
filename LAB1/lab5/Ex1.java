package lab5;

import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
}
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			if(age<=15)
			{
				throw new AgeException("invalid age");
			}
			else
			{
				System.out.println("valid age");
			}
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
}
