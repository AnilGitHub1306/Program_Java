package array_Java_Problem;

import java.util.Arrays;

public class Array8_PrintTheLargestElementOfAnArrays 
{
	public static void main(String[] args) 
	{
		//1st Method
		int a[]={5,4,6,3,7,2,8,1,9,10};
		int largest=a[0];
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{largest=a[i];}
		}	
		System.out.println(largest);
		
		
		//2nd Method
		int b[]= {5,4,6,3,7,2,8,1,9,10};
		Arrays.sort(b);
		System.out.println(b[b.length-1]);	
	}		
}

