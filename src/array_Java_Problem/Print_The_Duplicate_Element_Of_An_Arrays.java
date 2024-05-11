package array_Java_Problem;

public class Print_The_Duplicate_Element_Of_An_Arrays {
	public static void main(String[] args) {
		
		int a[]= {4,6,8,4,9,10,15,6,4,8};
		
		for(int i=0; i<=a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
