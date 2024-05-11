package array_Java_Problem;

import java.util.Arrays;

public class Print_The_Second_Largest_Element_Of_An_Array 
{
	public static void main(String[] args) {
		
		int a[]= {11,2,22,3,4,5,6,7,8};
		
		Arrays.sort(a);
		
		System.out.println(a[a.length-2]);	
	}
}
