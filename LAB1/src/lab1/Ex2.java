package lab1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		switch(str)
		{
			case "red":
				System.out.println("stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
		}
	}

}
