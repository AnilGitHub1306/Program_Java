package array_Java_Problem;

import java.util.HashSet;

public class String_PrintDuplicateCharecterInString {
	public static void main(String[] args) {
	
		String str = "mynameisashitoshkhurannnmmmma";
		HashSet<Character> data = new HashSet();

		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length() - 2; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					data.add(str.charAt(i));
				}
			}
		}
		System.out.println(data);
	}
}
