package array_Java_Problem;

public class String_subString {

	public static void main(String[] args) {
		String a = "RAHULKUMAR";
		 //         0123456789
		
		//kumar
		System.out.println(a.substring(5));
				
		//umar
		System.out.println(a.substring(6));
		
		//rahul
		//end index + 1
		System.out.println(a.substring(0, 5));
		
		//hulk
		System.out.println(a.substring(2, 6));


	}

}
