package numbers_Java_Programs;

public class Print_The_Character_Whethe_It_Is_Ovel_Or_Consonent 
{

	public static void main(String[] args) {
		
		char character = 'i';
		
		if(character=='a' ||character=='A' ||
		   character=='e' ||character=='E' ||
		   character=='o' ||character=='O' ||
		   character=='i' ||character=='I' ||
		   character=='U' ||character=='u')
		{
			System.out.println(character + " : It is ovel");
		}
		else
		{
			System.out.println(character + " : It is consonent");
		}
	}
}
