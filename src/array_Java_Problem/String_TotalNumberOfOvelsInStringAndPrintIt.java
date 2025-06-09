package array_Java_Problem;

public class String_TotalNumberOfOvelsInStringAndPrintIt 
{
	public static void main(String[] args) 
	{
		String a = "Hello , Good Morning";
		int ovel=0;
		
		for(int i=0; i<a.length();i++)
		{
			if( a.charAt(i)=='a'||a.charAt(i)=='A'||
				a.charAt(i)=='e'||a.charAt(i)=='E'||
				a.charAt(i)=='o'||a.charAt(i)=='O'||
				a.charAt(i)=='i'||a.charAt(i)=='I'||
				a.charAt(i)=='u'||a.charAt(i)=='U')
			{ 
				System.out.println(a.charAt(i));
				ovel++;
			}
		}
		System.out.println("Number Of ovels are: "+ovel);		
	}
}
