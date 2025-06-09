package programsJava;

public class RandomMethod {

	public static void randomDoubleValue() {
		double a = Math.random();
		System.out.println(a);
	}

	public static void randomIntegerValue() {
		double a = Math.random();

		int b = (int) (a * 100);
		System.out.println(b);
	}

	public static void randomNumberBetweenValue() {

		int max = 100;
		int min = 90;
		int b = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println(b);
	}

	public static void main(String[] args) {

		// randomDoubleValue();
		// randomIntegerValue();
		randomNumberBetweenValue();
	}

}
