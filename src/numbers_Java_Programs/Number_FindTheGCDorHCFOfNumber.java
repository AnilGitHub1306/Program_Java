package numbers_Java_Programs;

public class Number_FindTheGCDorHCFOfNumber 
{
	public static void main(String[] args) {
	
		// Method1-------------------------
//		int a=5;
//		int b=10;
//		int GCD=1;
//		
//		for(int i=1; i<=a*b;i++)
//			{	
//				if(i%a==0 && i%b==0)
//				{GCD=i;
//				break;
//				}
//			}
//		System.out.println(LCM);
		
		// Method2-------------------------
		int a=18;
		int b=12;
		int GCD=1;
		
		for(int i=1; i<=a;i++)
			{	
				if(a%i==0 && b%i==0)
				{GCD=i;}
			}
		System.out.println("GCD of "+a+" "+b+ " is: "+GCD);

		
	}

}
