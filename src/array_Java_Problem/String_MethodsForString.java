package array_Java_Problem;

public class String_MethodsForString {

	public static void main(String[] args) {
		String str = "Hello World";
		String str2 = "hello world";
		String str3 = "Hello";
		String str4 = " World";
		String str5 = "";
		String str6 = "a,b,c";

		// length()
		System.out.println("length(): " + str.length()); // 11

		// charAt(int index)
		System.out.println("charAt(1): " + str.charAt(1)); // 'e'

		// substring(int beginIndex)
		System.out.println("substring(6): " + str.substring(6)); // "World"

		// substring(int begin, int end)
		System.out.println("substring(0,5): " + str.substring(0, 5)); // "Hello"

		// equals(Object obj)
		System.out.println("equals(str2): " + str.equals(str2)); // false

		// equalsIgnoreCase(String s)
		System.out.println("equalsIgnoreCase(str2): " + str.equalsIgnoreCase(str2)); // true

		// compareTo(String s)
		System.out.println("compareTo(str2): " + str.compareTo(str2)); // negative or positive (case sensitive)

		// contains(CharSequence s)
		System.out.println("contains(\"World\"): " + str.contains("World")); // true

		// startsWith(String prefix)
		System.out.println("startsWith(\"Hell\"): " + str.startsWith("Hell")); // true

		// endsWith(String suffix)
		System.out.println("endsWith(\"rld\"): " + str.endsWith("rld")); // true

		// indexOf(int ch)
		System.out.println("indexOf('o'): " + str.indexOf('o')); // 4

		// lastIndexOf(int ch)
		System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o')); // 7

		// toLowerCase()
		System.out.println("toLowerCase(): " + str.toLowerCase()); // "hello world"

		// toUpperCase()
		System.out.println("toUpperCase(): " + str.toUpperCase()); // "HELLO WORLD"

		// trim()
		String strWithSpaces = "   Hello   ";
		System.out.println("trim(): '" + strWithSpaces.trim() + "'"); // "Hello"

		// replace(char old, char new)
		System.out.println("replace('l', 'p'): " + str.replace('l', 'p')); // "Heppo Worpd"

		// split(String regex)
		String[] parts = str6.split(",");
		System.out.print("split(\",\"): ");
		for (String part : parts) {
			System.out.print("[" + part + "] ");
		}
		System.out.println();

		// isEmpty()
		System.out.println("isEmpty() on empty string: " + str5.isEmpty()); // true
		System.out.println("isEmpty() on str: " + str.isEmpty()); // false

		// valueOf(...)
		int number = 123;
		System.out.println("valueOf(123): " + String.valueOf(number)); // "123"

		// concat(String str)
		System.out.println("concat(): " + str3.concat(str4)); // "Hello World"
	}
}
