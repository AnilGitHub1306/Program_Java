package String_Java_Programs;

public class count_Number_Of_ovels_And_Consonants_In_String {

	public static void main(String[] args) {
		
		String a = "Hello , Good Morning";
		int temp=0;
		int kemp=0;
		System.out.println(a.length());
		
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='A'||
				a.charAt(i)=='e'||a.charAt(i)=='E'||
				a.charAt(i)=='o'||a.charAt(i)=='O'||
				a.charAt(i)=='i'||a.charAt(i)=='I'||
				a.charAt(i)=='u'||a.charAt(i)=='U')
			{
				temp++;
			}
			
			else
			{kemp++;}
		}
		
		System.out.println("Total number of ovel in string are : "+temp);
		System.out.println("Total number of consonant in string are : "+kemp);
	}
}
