package numbers_Java_Programs;

public class Revers_number {
	
	public static void main(String[] args) {
		
		int a=12345;
		int temp=a;
		
		int rev=0;
		int rem=0;
		
		while(a>0)
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		
		System.out.println(rev);
	}
}
