package numbers_Java_Programs;

public class Find_The_LCM_of_Numbers 
{
	public static void main(String[] args) {
		
		int a=40;
		int b=24;
		int GCD=1;
		
		for(int i=1; i<a;i++)
			{	
				if(a%i==0 && b%i==0)
				{GCD=i;
				}
			}
		System.out.println(GCD);
	}

}
