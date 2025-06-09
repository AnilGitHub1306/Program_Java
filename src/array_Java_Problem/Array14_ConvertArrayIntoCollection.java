package array_Java_Problem;

import java.util.Arrays;
import java.util.List;

public class Array14_ConvertArrayIntoCollection 
{
	public static void main(String[] args) 
	{
		String[] array = {"apple", "banana", "orange"};

        // Convert the array to a List
        List<String> list = Arrays.asList(array);
        System.out.println("List elements: " + list);
        
        //List into the array
       Object[]a= list.toArray();
       for(int i=0; i<=a.length-1;i++) 
       {System.out.println(a[i]);}
	}
}
