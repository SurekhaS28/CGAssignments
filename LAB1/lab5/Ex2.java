package lab5;

import java.util.Scanner;

class EmployeeException extends Exception {
	 
	 public EmployeeException(String str) {
	  System.out.println(str);
	 }
}

public class Ex2 {
	public static void main(String[] args)
	{
		try	
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first name:");
			String Fname=sc.nextLine();
			System.out.println("enter last name:");
			String Lname=sc.nextLine();
			if(Fname.length()==0 & Lname.length()==0)
			{
				throw new EmployeeException("The first name or last name is not entered");
			}
			else
			{
				System.out.println(Fname+" "+Lname);
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
}
