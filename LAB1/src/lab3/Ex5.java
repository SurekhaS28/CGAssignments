package lab3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int character=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			character++;
		}
		System.out.println("Total number of character "+character);
		String[] s=str.split("\\s+");
		System.out.println("Total number of words "+s.length);
	}

}
