package array_Java_Problem;

public class String_FrequencyOfSpecialCharacter {

	public static void main(String[] args) {
		
		String str = "Virat Kohli is a good cricketer";
		char ch ='i';
		int count=0;
		for(int i=0; i<=str.length()-1; i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("Frequency of '"+ch+"' is : "+count);
	}

}
