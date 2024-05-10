package numbers_Java_Programs;

public class Find_The_GCD_Or_HCF_of_Numbers 
{
	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		int LCM=1;
		
		for(int i=1; i<=a*b;i++)
			{	
				if(i%a==0 && i%b==0)
				{LCM=i;
				break;
				}
			}
		System.out.println(LCM);
		
	}

}
