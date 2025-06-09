package numbers_Java_Programs;

public class Number_LCMOfTwoNumber
{
	
	public static void main(String[] args)
	{
		Method1();
		Method2();
	}
	public static void Method1()
	{
			int a = 20;
			int b = 25;
			int GCD=1;
			for(int i=1; i<=a; i++)
			{
				if(a%i==0 && b%i==0)
				{GCD=i;}
			}
			int LCM=a*b/GCD;	
			System.out.println("LCM of "+ a +" , " + b + " is -> " + LCM);	
	}
	
	public static void Method2()
	{
		int a=5 ;
		int b=6;
		int c=3;
		
		for(int i=1; i<=a*b*c;i++)
		{
			if(i%a==0 && i%b==0 && i%c==0)
			{
				System.out.println(i);
			break;
			}
		}
		
	}
	
	
}
