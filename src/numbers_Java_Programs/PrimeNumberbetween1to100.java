package numbers_Java_Programs;

public class PrimeNumberbetween1to100 
{
	public static void main(String[] args) 
	{	
		int x=100;
		for(int i=1;i<=x;i++)	
		{	int temp=0;
			for(int j=2; j<=i-1;j++)
			{
				if(i%j==0)
				{temp=temp+1;}
			}
			if(temp==0)
			{ System.out.println(i);}
		}
	}
}
