package numbers_Java_Programs;

public class Print_Even_Number_From_0_To_20_Array 
{

	public static void main(String[] args) {
		
		int a[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
		for(int i=0; i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
