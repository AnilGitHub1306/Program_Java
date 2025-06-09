package array_Java_Problem;

import java.util.HashSet;

public class String_PrintUniqueCharecterInString {
	public static void main(String[] args) {
	
		String str = "abcdabcdabacdabcdabcd";
		HashSet<Character> data = new HashSet();

		for (int i = 0; i <= str.length() - 1; i++) 
		{data.add(str.charAt(i));}
		
		System.out.println(data);
	}
}
