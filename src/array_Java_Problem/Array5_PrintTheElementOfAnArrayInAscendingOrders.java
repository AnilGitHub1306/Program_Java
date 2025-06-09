package array_Java_Problem;

import java.util.Arrays;

public class Array5_PrintTheElementOfAnArrayInAscendingOrders {
	public static void main(String[] args) {
		method1();
		bubbleSortMethod();
	}

	public static void method1() {
		int a[] = { 5, 4, 6, 3, 7, 2, 8, 1, 9, 10 };
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) 
		{System.out.print(a[i]+ " ");}
		
		System.out.println();
	}
	
	public static void bubbleSortMethod() 
	{
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
		for (int i = 0; i < arr.length; i++) 
		{System.out.print(arr[i] + " ");}
	}	
}
