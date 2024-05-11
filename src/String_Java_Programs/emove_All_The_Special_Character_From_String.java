package String_Java_Programs;

public class emove_All_The_Special_Character_From_String {

	public static void main(String[] args) {
		

		String str = "my name is lakhan ! & im 1 2 ka 4";
		
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
	}
}
