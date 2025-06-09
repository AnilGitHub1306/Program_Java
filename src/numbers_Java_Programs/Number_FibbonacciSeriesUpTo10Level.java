package numbers_Java_Programs;

public class Number_FibbonacciSeriesUpTo10Level 
{
	public static void main(String[] args) 
	{
		Method1();
	//	Method2();
	}
	
		
	public static void Method1()
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=8;i++)
			{
				if(i<10)
				{
					c=a+b;
					System.out.println(c);
					a=b;
					b=c;
				}
			}
	}
	// Method 2 is best
	public static void Method2()
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10-2;i++)
			{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			}
	
	}
}