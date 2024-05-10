package numbers_Java_Programs;

public class Swap_Two_Number_WithOut_Using_Third_Variable {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		
		b=a+b;	//5
		a=b-a;	//3
		b=b-a;	//2
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
