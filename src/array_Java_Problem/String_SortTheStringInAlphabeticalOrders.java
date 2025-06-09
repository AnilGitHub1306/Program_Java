package array_Java_Problem;

public class String_SortTheStringInAlphabeticalOrders {

	public static void main(String[] args) {
		method1();
		

	}
	
	public static void method1() {
		String s="dbac";
		char arr[]=s.toCharArray();
		char temp;
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(new String(arr));
	}

	
	
}
