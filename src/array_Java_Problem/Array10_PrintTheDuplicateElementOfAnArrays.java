package array_Java_Problem;

import java.util.HashSet;

public class Array10_PrintTheDuplicateElementOfAnArrays {

	public static void main(String[] args) {

		// Method 1
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
		HashSet<Integer> hashData = new HashSet();
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					hashData.add(a[i]);
				}
			}
		}
		System.out.println(hashData);

		// Method2 copy duplicate element in other array and print it.
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
		HashSet<Integer> hashData1 = new HashSet();
		for (int i = 0; i <= b.length - 1; i++) {
			for (int j = i + 1; j <= b.length - 1; j++) {
				if (b[i] == b[j]) {
					hashData1.add(b[i]);
				}
			}
		}
		Object[] newArr = hashData1.toArray();
		for (int i = 0; i <= newArr.length - 1; i++) {
			System.out.println(newArr[i]);
		}
		
		
		       
	}
}
