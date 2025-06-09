package array_Java_Problem;
public class Array_RotaryArray {

	public static void main(String[] args) 
	{		
		rotatArrayClockwise();
		System.out.println();
		rotatArrayAntiClockwise();
	}
	
	public static void rotatArrayClockwise()
	{
		int[] arr = {1,2,3,4,5,6,7};
		int steps =2;
		
		for (int i = 1; i <= steps; i++) 
		{
			for (int j=arr.length-1; j>0; j--) 
			{
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		for(int ele:arr)
		{System.out.print(ele);}
	}
	
	public static void rotatArrayAntiClockwise()
	{
		int[] arr = {1,2,3,4,5,6,7};
		int steps =2;
		int totalArrayElement=7;
		
		for (int i = 1; i <= totalArrayElement-steps; i++) 
		{
			for (int j=arr.length-1; j>0; j--) 
			{
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		for(int ele:arr)
		{System.out.print(ele);}
	}
}

