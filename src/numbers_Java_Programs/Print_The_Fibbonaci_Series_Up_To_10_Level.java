package numbers_Java_Programs;

public class Print_The_Fibbonaci_Series_Up_To_10_Level 
{

	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		
		System.out.println(a);
		System.out.println(b);
		int c;
		
		for(int i=3; i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
		}
		
	}
}
