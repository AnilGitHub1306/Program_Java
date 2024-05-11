package array_Java_Problem;

import java.util.Arrays;

public class Print_The_Element_Of_An_Array_In_Ascending_Order 
{
	public static void main(String[] args) {
		
		int a[]= {11,2,22,3,4,5,6,7,8};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}	
		
		
	}
}
