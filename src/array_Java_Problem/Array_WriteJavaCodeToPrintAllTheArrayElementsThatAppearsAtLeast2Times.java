package array_Java_Problem;

import java.util.HashMap;

public class Array_WriteJavaCodeToPrintAllTheArrayElementsThatAppearsAtLeast2Times {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6,7,8,9,10,2,4,7,7};
		int count=1;
		HashMap<Integer, Integer> data =  new HashMap();
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=2)
			{
				data.put(a[i], count);
				System.out.println(a[i]+" = " +count);
			}
			count=1;
		}
		System.out.println(data);
	}
}
