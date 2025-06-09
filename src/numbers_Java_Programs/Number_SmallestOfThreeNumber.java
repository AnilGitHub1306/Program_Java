package numbers_Java_Programs;

public class Number_SmallestOfThreeNumber 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=-800;
		int c=300;
		
		if (a<b && a<c)
		{System.out.println("Smaller number is " + a);}
		
		else if (b<a && b<c)
		{System.out.println("Smaller number is " + b);}
		
		else 
		{System.out.println("Smaller number is " + c);}	
	}

}
