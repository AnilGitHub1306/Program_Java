package numbers_Java_Programs;

public class Number_ReverseTheNumber 
{
	public static void main(String[] args) 
	{
		int num=154;
		int rev=0;
		int rem=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		System.out.println(" reverse of 154 is = "+ rev);
	}
}
