package lab2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Ex2 {
	String sortString(String arr[])
	{
        arr = Stream.of(arr).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
		int len=0;
		String[]arr1=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			len=arr[i].length();
			if(len%2==0)
			{
				arr1[i]+=arr[i].substring(0,len/2).toUpperCase();
				arr1[i]+=arr[i].substring(len/2).toLowerCase();
			}
			else
			{
				arr1[i]+=arr[i].substring(0,(len/2)+1).toUpperCase();
				arr1[i]+=arr[i].substring((len/2)+1).toLowerCase();
			}
			
		}
		return Arrays.toString(arr1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[]arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		sc.close();
		Ex2 e=new Ex2();
		System.out.println(e.sortString(arr));
	}

}
