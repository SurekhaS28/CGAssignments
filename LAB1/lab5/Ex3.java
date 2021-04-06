package lab5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		try 
		{
			Scanner sc=new Scanner(System.in);
			int salary=sc.nextInt();
			if(salary<3000)
			{
				throw new EmployeeException("salary is below 3000");
			}
			else
			{
				System.out.println("Invalid salary");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}

}
