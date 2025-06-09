package numbers_Java_Programs;

public class Number_amstrongNumberBetween0to100 {
	public static void main(String[] args) 
	{
		for (int num = 1; num <= 100; num++) 
		{
			int temp, rem = 0, rev = 0;
			temp = num;
			while (temp > 0) 
			{
				rem = temp % 10;
				rev = (rev * 10) + rem;
				temp = temp / 10;
			}
			if (num == rev) 
			{
				System.out.println(num);
			}
		}
	}
}