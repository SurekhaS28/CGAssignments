package lab3;

import java.util.Scanner;

public class Ex6 {
	Boolean positiveString(String str)
	{
		int len=str.length();
		for(int i=0;i<len-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Ex6 e=new Ex6();
		System.out.println(e.positiveString(str));
		
	}
}
