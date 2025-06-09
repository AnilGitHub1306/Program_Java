package programsJava;

import java.util.Arrays;

public class sortTheArrayOrBubbleSort {
	public static void main(String[] args) {
		// Hardcoded array
		int[] arr = { 10,5,0,9,4,1,8,3,2,7,6 };

//		// Bubble Sort
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					// Swap elements
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		// Print sorted array
//		for (int num : arr) {
//			System.out.print(num + " ");
//		}
		 Arrays.sort(arr);
		for(int num:arr) 
		{
			System.out.println(num);
		}
		
	}
}
