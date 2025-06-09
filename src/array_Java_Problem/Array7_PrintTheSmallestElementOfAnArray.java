package array_Java_Problem;

import java.util.Arrays;

public class Array7_PrintTheSmallestElementOfAnArray 
{
	public static void main(String[] args) 
	{
		//1st Method
		int a[]= {5,4,6,3,7,2,8,1,9,10};
		
		int smallest=a[0];
		
			for(int i=0; i<a.length; i++)
			{
				if (a[i] < smallest)
				{
					smallest = a[i];
				}
			}
			System.out.println(smallest);
			
			
		//2nd Method
			
		int b[]= {5,4,6,3,7,2,8,1,9,10};
		Arrays.sort(b);
		System.out.println(b[0]);	
		
		//3 method
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
	
		System.out.print(arr[0]);
	}		
}
