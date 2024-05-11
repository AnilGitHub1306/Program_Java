package String_Java_Programs;

public class Revers_The_String_Word_By_Word {


public static void main(String[] args)
{
	String name="My Name Is Anil";

	String newName[]=name.split(" ");
	
	for(int i=newName.length-1;i>=0;i--)
	{
		System.out.print(newName[i] + " ");	
	}
}

}
