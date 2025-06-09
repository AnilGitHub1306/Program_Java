package numbers_Java_Programs;
public class Number_SquareRootOfNumber {
	public static void main(String[] args) 
	{
		method1();
		method2();
	}	
	
	public static void method1()
	{ 	int a= 3;
		double squaRoot = Math.sqrt(a);
		System.out.println(squaRoot);
	}
	
	public static void method2() 
	{
		    double number = 64;
		    if(number > 0) 
		    {
		    	double precision = 0.0001;
		    	double low = 0;
		    	double mid = 0;
		        double high = number;
		          	            
		           while ((high - low) > precision) 
		           {
		               mid = (high + low) / 2;
		               if (mid * mid > number) 
		               {high = mid;} 
		               else 
		               {low = mid;}
		           }
		            
		            System.out.println("The approximate square root of " + number + " is: " + mid);
		    }
		    else 
		    {System.out.println("Square root of a negative number is not real.");}      	
	}
}
