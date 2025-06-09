package numbers_Java_Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=83;
		int temp=0;
		for(int i=2; i<a; i++)
		{	
			if(a%i==0)
			{temp=temp+i;}
		}
		if(temp >0)
		{System.out.println(a+" is not prime number");}
	
		else 
		{System.out.println(a+" is prime number");}		
	}

}
