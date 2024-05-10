package numbers_Java_Programs;

public class Check_Whether_Given_Number_Is_Prime_Mumber_Or_Not {

	public static void main(String[] args) {
		
		int number=97;
		int temp=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				temp++;
			}
		}
		if(temp>0)
		{System.out.println("its not a prime number");}
		else
		{System.out.println("its a prime number");}
	}
}
