package numbers_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_AccendingOrder 
{
	public static void main(String[] args)
	{
		//Method 1
		int a[]= {4,7,8,3,9,0,2,1,6,5};
		Arrays.sort(a);
		for(int i:a)
		System.out.println(a[i]);
		
		//Method2
		int b[]= {4,7,8,3,9,0,2,1,6,5};
		for(int i=0; i<=b.length-1;i++)
		{	for(int j=i+1; j<=b.length-1;j++)
			{
				if(b[i]>b[j])
				{int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				}
			}
		}
		for(int i:b) {
		System.out.println(b[i]);}
	}
}
