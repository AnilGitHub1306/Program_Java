package numbers_Java_Programs;

public class Prime_Number_Beetwen_0_To_100 
{

	public static void main(String[] args) {
		
		for(int num=1;num<=100;num++)
		{
			int temp=0;
			for(int i=2; i<num;i++)
			{
				if(num%i==0)
				{temp++;}
			}
			
			if(temp>0) 
			{System.out.println(num+": Its not a prime number");}
			else 
			{System.out.println(num+": Its prime number");}
				
		}
	}
}
