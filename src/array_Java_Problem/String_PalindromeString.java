package array_Java_Problem;
public class String_PalindromeString {
	
	public static void main(String[] args) 
	{
		//1st Approch
	        String str = "madam";
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println(str.equals(reversed) ? "Palindrome" : "Not Palindrome");
	    
	      //2nd Approch
	        String str1="";
	        
	        for(int i=str.length()-1; i>=0; i--)
	        {str1=str1+str.charAt(i); }
	        System.out.println(str1);
	}
}
