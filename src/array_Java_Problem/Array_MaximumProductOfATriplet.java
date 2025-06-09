package array_Java_Problem;

import java.util.Arrays;

public class Array_MaximumProductOfATriplet {

	
	public static void main(String[] args) {
		
		int [] arr = {10,5,20,5,7,8,3};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
	}
}
