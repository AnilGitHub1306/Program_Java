package numbers_Java_Programs;
public class Number_CountTotalNumberOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		int num=12345;
		int temp=0;
		while(num>0) 
		{
			num=num/10;
			temp++;
		}
		System.out.println(temp);
	}
}
