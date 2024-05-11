package String_Java_Programs;

public class total_Number_Of_ovels_And_Consonants_In_String {

	public static void main(String[] args) {
		
		String a = "Hello , Good Morning";
		
		System.out.println(a.length());
		
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='A'||
				a.charAt(i)=='e'||a.charAt(i)=='E'||
				a.charAt(i)=='o'||a.charAt(i)=='O'||
				a.charAt(i)=='i'||a.charAt(i)=='I'||
				a.charAt(i)=='u'||a.charAt(i)=='U')
			{
				System.out.println("ovel is: "+a.charAt(i));
			}
			
			else
			{System.out.println("Consonant is : "+a.charAt(i));}
		}
		
	}
}
