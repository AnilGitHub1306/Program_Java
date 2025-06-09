package array_Java_Problem;

public class String3_RemoveAllTheSpacesFomTheStrings {

	public static void main(String[] args) {
		
		String str = "  Hi i am a Good Automation Tester       ";
		String newStr=str.replaceAll(" ", "");
		System.out.println(newStr);
		
		String newStr1=str.replace(" ", "");
		System.out.println(newStr1);
	}
}
