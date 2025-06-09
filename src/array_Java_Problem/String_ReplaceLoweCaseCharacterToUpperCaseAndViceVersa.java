package array_Java_Problem;

public class String_ReplaceLoweCaseCharacterToUpperCaseAndViceVersa {
	
	 public static void main(String[] args) 
	 {
		String str = "AbCdEfGh";
		for(int i=0; i<str.length(); i++)
		{
			if(	Character.isLowerCase(str.charAt(i)))
			{System.out.print(Character.toUpperCase(str.charAt(i)));}
			else
			{System.out.print(Character.toLowerCase(str.charAt(i)));}
		}
	}
}
