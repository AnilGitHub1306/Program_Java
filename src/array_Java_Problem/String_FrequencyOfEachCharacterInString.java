package array_Java_Problem;

import java.util.HashMap;

public class String_FrequencyOfEachCharacterInString {
	public static void main(String[] args) {

		String str1 = "Virat Kohli is a good cricketer";
		String str = str1.replace(" ", "").toLowerCase();
		int count = 0;
		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = 0; j <= str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			
			frequencyMap.put(str.charAt(i), count);
			count = 0;
		}
		System.out.println(frequencyMap);

	}
}
