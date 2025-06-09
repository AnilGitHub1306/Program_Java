package array_Java_Problem;
import java.util.Arrays;

public class String_SortStringInAlphabeticalorder {

	public static void main(String[] args) {
		String str = "automation";
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		
		for(char i: arr)
		System.out.print(i);
	}
}
