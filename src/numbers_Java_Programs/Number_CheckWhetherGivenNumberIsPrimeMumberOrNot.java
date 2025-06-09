package numbers_Java_Programs;

public class Number_CheckWhetherGivenNumberIsPrimeMumberOrNot {

	public static void main(String[] args) {
		
		int number=97;
		boolean status=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				status=false;
			}
		}
		if(status==false)
		{System.out.println("its not a prime number");}
		else
		{System.out.println("its a prime number");}
	}
}
