package array_Java_Problem;

public class Java_Program_To_Print_Element_Of_One_Array_Into_The_other_Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int b[]=new int[a.length-1];
		
		for(int i=0; i<a.length-1;i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
