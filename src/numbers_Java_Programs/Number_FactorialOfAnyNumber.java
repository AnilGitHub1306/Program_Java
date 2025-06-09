package numbers_Java_Programs;

public class Number_FactorialOfAnyNumber 
{
	public static void main(String[] args)
	{
		int x=4;
		int Factorial=1;
		
		for(int i=1; i<=x; i++)
		{ 	
			Factorial=Factorial*i;
		}
		
		System.out.println(Factorial);
	}
}
