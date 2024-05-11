package String_Java_Programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Duplicate_Character {

	public static void main(String[] args) {
		
		String str = "abcdefabc";
	
		Set<Character> s4 =  new LinkedHashSet();
		for(int i=0; i<=str.length()-1;i++)
		{
			s4.add(str.charAt(i));
		}
		
		
		
		StringBuilder sb =new StringBuilder();
		for(Character c : s4)
		{
		sb.append(c);
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
	}
}
