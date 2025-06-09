package array_Java_Problem;

import java.util.Arrays;

public class Array9_PrintTheSecondLargestElementOfAnArrays 
{
	public static void main(String[] args) 
	{
		//1st Method
		int a[]={5,4,6,3,7,2,8,1,9,10};
		int largest=a[0];
		
		for(int i=0; i<=a.length-2;i++)
		{
			if(a[i]>largest)
			{largest=a[i];}
		}	
		System.out.println(largest);
		
		
		//2nd Method
		int b[]= {5,4,6,3,7,2,8,1,9,10};
		Arrays.sort(b);
		System.out.println(b[b.length-2]);	
		
		//3rd Method
		int [] arr = { 5, 4, 6, 3, 7, 2, 8, 1, 9, 10 };
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i]; 	// here just swapping the number
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		{System.out.print(arr[arr.length-2] + " ");}
	}
}
