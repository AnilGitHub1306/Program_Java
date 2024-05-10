package numbers_Java_Programs;

public class Find_The_Largest_Number_From_Array {
	
	public static void main(String[] args) {
		
		int a[]= {45,35,55,25,65,15,75,-5};
		
		int largest=a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
