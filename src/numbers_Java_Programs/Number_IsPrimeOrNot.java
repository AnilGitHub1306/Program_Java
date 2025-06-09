package numbers_Java_Programs;

public class Number_IsPrimeOrNot {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		int a = 83;
		int temp = 0;
		
		for (int i = 2; i <= a - 1; i++) 
		{
			if (a % i == 0) 
			{temp = temp + i;}
		}
		if (temp > 0) 
		{System.out.println(a + " is not prime number");}
		else 
		{System.out.println(a + " is prime number");}
	}
}
