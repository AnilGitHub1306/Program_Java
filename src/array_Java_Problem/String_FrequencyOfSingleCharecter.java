package array_Java_Problem;

public class String_FrequencyOfSingleCharecter 
{
	public static void main(String[] args) 
	{
		String x= "ashitossssh";
		char ch='s';
		int temp=0;
		for(int i=0; i<=x.length()-1;i++)
		{
			if(ch==x.charAt(i))
			{temp++;}
		}
		
		System.out.println(temp);
	}
}
