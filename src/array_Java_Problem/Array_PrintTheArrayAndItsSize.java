package array_Java_Problem;

public class Array_PrintTheArrayAndItsSize {

	public static void main(String[] args) {
		
		int[] arr= {2,5,77,8,4,6,0,13,45};

		int size=arr.length;
	
		System.out.println("size of the array arr is :"+size);
		
	
		// here we can use for loop or for each loop
		
		System.out.println("print array element by for each loop:");
		for(int a1:arr)
		{System.out.println(a1);}
		
		System.out.println("print array element by for loop:");
		for(int i=0;i<arr.length;i++)
		{System.out.println(arr[i]);}

	}
	
	

}
