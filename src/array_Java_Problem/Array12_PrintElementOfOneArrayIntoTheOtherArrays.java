package array_Java_Problem;

public class Array12_PrintElementOfOneArrayIntoTheOtherArrays {

	public static void main(String[] args) {

		//Method1
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) 
		{b[i] = a[i];}

		for (int i = 0; i < b.length; i++) 
		{System.out.println(b[i]);}
		
		//Method2
		int [] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int [] d = c.clone();
		for (int i = 0; i < d.length; i++) 
		{System.out.println(d[i]);}
	}
}
