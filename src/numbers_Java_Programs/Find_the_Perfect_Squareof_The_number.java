package numbers_Java_Programs;

public class Find_the_Perfect_Squareof_The_number {
	public static void main(String[] args) 
	{
		int n=144;
		
		for(int i=1;i<=n-1;i++)
		{
			if(i*i==n)
			{
				System.out.println(n+" is a perfect square of "+i);
			}	
		}
	}

}
