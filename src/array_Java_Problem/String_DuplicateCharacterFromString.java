package array_Java_Problem;

import java.util.HashSet;
import java.util.Set;

public class String_DuplicateCharacterFromString {

	public static void main(String[] args) {
		
		String str ="abcdabcdabcdefg";
		
		Set<Character> chardata = new HashSet<>();
		Set<Character> chardata1 = new HashSet<>();
		
		for(int i=0; i<=str.length()-1;i++)
		{
			if(chardata.add(str.charAt(i))==false)
			{chardata1.add(str.charAt(i));}
		}
		System.out.println("Duplicate character as : "+chardata1);
	}
}
