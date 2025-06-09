package numbers_Java_Programs;

public class Number_SumOfDigits {
	public static void main(String[] args) 
	{
		
			int num = 123;
			int rem = 0;
			int sum = 0;
			
			while (num > 0) 
			{
				rem = num % 10;
				sum = sum  + rem;
				num = num / 10;
			}
			System.out.println(sum);
		}
	
}