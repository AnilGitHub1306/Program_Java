package array_Java_Problem;

public class String_ReverseTheStrings {
	public static void main(String[] args) {
		String x = "my name is ashitosh khurana";

		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
	}
}
