package array_Java_Problem;

public class String1_CountTheTotalNumberOfCharInString {

	public static void main(String[] args) {
		String str = "i am a good automation tester";
		int len = str.trim().replace(" ", "").length();
		System.out.println("Total character in String are - " + len);
	}
}
