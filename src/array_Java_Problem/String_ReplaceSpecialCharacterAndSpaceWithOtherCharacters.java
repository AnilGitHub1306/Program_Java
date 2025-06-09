package array_Java_Problem;

public class String_ReplaceSpecialCharacterAndSpaceWithOtherCharacters {

	public static void main(String[] args) {
		
	//Method 1
	String str = "my name is lakhan ! & im 1 2 #ka 4";
	String str1=str.replace(" ", "");
	String str2=str1.replace("!", "" );
	String str3=str2.replace("&", "");
	String str4=str3.replace("#", "");
	System.out.println(str4);
	
	//Method 2
	String newString = str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(newString);

	}	
}
