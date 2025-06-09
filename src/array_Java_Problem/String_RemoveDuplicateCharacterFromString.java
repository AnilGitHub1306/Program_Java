package array_Java_Problem;

import java.util.HashSet;
import java.util.Set;

public class String_RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		
		String str ="abcdabcdabcd";
		
		Set<Character> chardata = new HashSet<>();
		
		for(int i=0; i<=str.length()-1;i++)
		{chardata.add(str.charAt(i));}
		System.out.println(chardata);
	}
}
