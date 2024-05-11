package String_Java_Programs;

public class Remove_All_The_Spaces_Fom_The_String {

	public static void main(String[] args) {
		
		String str = " Hey hai buddy ";
		String newStr=str.replaceAll("\\s", "");
		System.out.println(newStr);
	}
}
