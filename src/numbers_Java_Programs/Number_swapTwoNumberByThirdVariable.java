package numbers_Java_Programs;

public class Number_swapTwoNumberByThirdVariable 
{
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		int c;
		c=a+b;
		a=c-a;
		b=c-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
