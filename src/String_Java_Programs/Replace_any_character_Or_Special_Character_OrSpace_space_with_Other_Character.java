package String_Java_Programs;

public class Replace_any_character_Or_Special_Character_OrSpace_space_with_Other_Character {

	public static void main(String[] args) {
		
	
	String str = "my name is lakhan ! & im 1 2 ka 4";
	
	String str1=str.replace(" ", "");
	System.out.println(str1);
	
	String str2=str.replace("!", "");
	System.out.println(str2);
	
	String str3=str.replace("2", "");
	System.out.println(str3);

	}	
}
