package array_Java_Problem;

public class String_ReversTheStringWordByWordsAndReverseThatWordAlso {

	public static void main(String[] args) {
		String str = "My Name Is Anil";

		String[] newStr = str.split(" ");

		for (int i = newStr.length - 1; i >= 0; i--) {
			for (int j = newStr[i].length() - 1; j >= 0; j--) {
				System.out.print(newStr[i].charAt(j));
			}

			System.out.println("");
		}
	}
}
