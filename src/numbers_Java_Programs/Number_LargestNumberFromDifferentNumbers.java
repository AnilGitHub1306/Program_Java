package numbers_Java_Programs;

public class Number_LargestNumberFromDifferentNumbers {

	public static void main(String[] args) {

		// 1: largest number from two numbers
		// 2: largest number from three numbers
		// 3: largest number from different multiple numbers - here use array or arraylist

	
		// 1: largest number from two numbers
		int a=45; int b=90;
		
		if(a>b)
		{System.out.println("largest number is: "+a);}
		else
		{System.out.println("largest number is: "+b);}
		
		
		// 2: largest number from three numbers
		int x=45; int y=560; int z=56;
		
		if(x>y && x>z)
		{System.out.println("largest number is: "+x);}
		else if (y>x && y>z)
		{System.out.println("largest number is: "+y);}
		else
		{System.out.println("largest number is: "+z);}
		
				
	}

}
