package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	int[] modifArray(int arr[])
	{
		//remove duplicates
		int i,len=0;
		int dec[]=new int[arr.length];
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				dec[i]=arr[i];
			}
		}
		dec[i]=arr[arr.length-1];
		
		//finding the length of array after removing the duplicate values
		for ( i=0; i<dec.length; i++)
		{
			if (dec[i] != 0)
				len++;
	     }
		
		//assigning to the new array after removing the duplicate values
		int [] newArray = new int[len];
		int j=0;
        for ( i=0; i<dec.length; i++)
        {
            if (dec[i] != 0) 
            {
                newArray[j] = dec[i];
                j++;
            }
        }
        
        //descending order
        int temp=0;
        for (i = 0; i < newArray.length; i++)
        {     
            for (int k = i+1; k < newArray.length; k++)
            {     
               if(newArray[i] < newArray[k]) 
               {    
                   temp = newArray[i];    
                   newArray[i] = newArray[k];    
                   newArray[k] = temp;  
               }
            }
        }
		return newArray;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Ex4 e=new Ex4();
		int arr1[]=e.modifArray(arr);
		System.out.println(Arrays.toString(arr1));		
	}

}
