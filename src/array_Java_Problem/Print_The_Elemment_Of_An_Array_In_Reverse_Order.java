package array_Java_Problem;

public class Print_The_Elemment_Of_An_Array_In_Reverse_Order 
{

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}
}
