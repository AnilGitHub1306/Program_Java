package numbers_Java_Programs;

public class Number_AlternetPrimeNumberbetween1to100 
{
	public static void main(String[] args) 
	{
	int alt=0;
	
	for(int n=1;n<=100;n++)	
	{	int temp=0;
		for(int i=2; i<=n-1;i++)
			{
			if(n%i==0)
			{temp=temp+1;}
			}
		
		if(temp==0)
			{ 	
			alt++;
			if(alt%2!=0)
			{System.out.println(n);}
			}
	}
	}
}
