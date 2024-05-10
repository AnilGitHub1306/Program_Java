package numbers_Java_Programs;

public class Amstrong_Number {

	public static void main(String[] args) {

		int a=153;
		int temp=a;
		
		int rev=0;
		int rem=0;
		
		while(a>0)
		{
		rem=a%10;
		rev=rev+rem*rem*rem;
		a=a/10;
		}
		
		System.out.println(rev);
		System.out.println(temp);
		
		if(rev==temp)
		{System.out.println("It is amstrong number");}
		else
		{System.out.println("Its not a amstrong number");}

	}

}
