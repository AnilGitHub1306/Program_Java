package array_Java_Problem;

import java.util.HashSet;

public class Array11_PrintTheUniqueElementOfAnArray {

	public static void main(String[] args) {

		// Method 1
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
	
		HashSet<Integer> hashData = new HashSet();
		for (int i = 0; i <= a.length - 1; i++) {
			hashData.add(a[i]);
		}
		System.out.println(hashData);
	}
}
