package String_Java_Programs;

public class Print_Duplicate_Character {

	public static void main(String[] args)
	{
		String x="viratkohli";
	
		for(int i=0; i <= x.length()-1;i++)
		{
			for(int j=i+1; j<= x.length()-1;j++)
			{
				if(x.charAt(i)==x.charAt(j))
				{
					System.out.println(x.charAt(j));
				}
			}
		}
	}

}
