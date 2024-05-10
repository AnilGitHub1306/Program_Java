package numbers_Java_Programs;

public class Palindom_number {
	
	public static void main(String[] args) {
		
		int a=151;
		
		int rev=0;
		int rem=0;
		
		int temp=a;
		
		while(a>0)
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		
		System.out.println(rev);
	
	
	if(rev==temp)
	{System.out.println("its a palindrom number");}
	else
	{System.out.println("its Not a palindrom number");}
	
	
	
	}
}
