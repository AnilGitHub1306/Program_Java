package numbers_Java_Programs;

public class Number_FindThePerfectSquareOfTheNumber {
	public static void main(String[] args) 
	{
		int n=144;
		
		if (n>0)
		{
			for(int i=1;i<=n-1;i++)
			{	if(i*i==n)
				{System.out.println(n+" is a perfect square of "+i);}	
			}
		}
		else
		{System.out.println("Perfect numbers should be greater than 1");}
	}
}
