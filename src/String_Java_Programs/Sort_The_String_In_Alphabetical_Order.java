package String_Java_Programs;

public class Sort_The_String_In_Alphabetical_Order {

	public static void main(String[] args) {
		String s="cbac";
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
