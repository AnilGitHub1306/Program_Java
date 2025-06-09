package numbers_Java_Programs;

public class Number_SmallestNumberFromArrays {
	
	public static void main(String[] args) {
		
		int a[]= {45,35,55,25,65,15,75,-5};
		
		int smallest=a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}

}
