package programsJava;

import java.util.Scanner;

public class subString {
	public static void main(String args[]) {
		String str = "Rahul";
		String sub;

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = 1; j <= str.length()-i; j++) 
			{
				sub = str.substring(i, i + j);
				System.out.println(sub);
			}
		}
	}
}
