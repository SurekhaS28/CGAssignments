package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Ex1 e=new Ex1();
		System.out.println(e.getSecondSmallest(arr));
	}

}
