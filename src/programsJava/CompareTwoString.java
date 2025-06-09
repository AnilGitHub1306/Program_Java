package programsJava;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2= "Sachinsertret";
		System.out.println(s1.compareTo(s2));
		
		 if ( s1.compareTo(s2) > 0 )
		 System.out.println("First string is greater than second.");
		 else if ( s1.compareTo(s2) < 0 )
		 System.out.println("First string is smaller than second.");
		 else 
		 System.out.println("Both strings are equal.");
	}

}
