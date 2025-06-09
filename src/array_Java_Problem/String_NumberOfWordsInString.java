package array_Java_Problem;
public class String_NumberOfWordsInString {

	public static void main(String[] args) 
	{
		//1st Approch
		String str ="Sachin tendulkar is a good bastman";
		String[] newstr=str.trim().split(" ");
		System.out.println(newstr.length);
		
		//2nd Approch
		String givenString ="Sachin tendulkar is a good bastman";
		int count=1;
		for(int i=0;i<givenString.length()-1;i++)
		{ 
			if((givenString.charAt(i)==' ') && (givenString.charAt(i+1)!=' '))
			{count++;}
		}
		System.out.println(count);
	}
}
