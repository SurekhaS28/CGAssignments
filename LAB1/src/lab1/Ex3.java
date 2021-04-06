package lab1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("Enter the number n to print the faboniccs series ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Series s=new Series();
        long b=s.input(a);
        System.out.println("The "+a+"th number of the faboniccs series is "+b);
    }
}

class Series 
{
    int a=1,b=1,c=0,count;
 
    int input(int a)
    {
        count=a;
        count=fabo(count);
        return count;
    }
    
    int fabo(int count)
    {
        if(count!=2)
        {
            c=a+b;
            a=b;
            b=c;
            fabo(--count);
        }
        return c;
    }

	

}
