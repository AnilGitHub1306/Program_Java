package array_Java_Problem;

public class String2_TotalNumberOfOvelsAndConsonantsInStrings 
{
	public static void main(String[] args) 
	{
		String a = "Hello , Good Morning";
		int consonent=0;
		int ovels=0;
		
		for(int i=0; i<a.length();i++)
		{
			if( a.charAt(i)=='a'||a.charAt(i)=='A'||
				a.charAt(i)=='e'||a.charAt(i)=='E'||
				a.charAt(i)=='o'||a.charAt(i)=='O'||
				a.charAt(i)=='i'||a.charAt(i)=='I'||
				a.charAt(i)=='u'||a.charAt(i)=='U'||a.charAt(i)==' ')
			{
				ovels++;
			}
			else 
			{
				
				consonent++;
			}
		}
		System.out.println("Number Of Ovels are: "+ovels);
		System.out.println("Number Of consonent are: "+consonent);
		
	}
}
