package numbers_Java_Programs;

import java.util.ArrayList;

public class Number_PrintEvenNumberFrom0To100List2 
{
	public static void main(String[] args) {
		
		ArrayList <Integer> numlist = new ArrayList<Integer>();
	
		// Here we have to add numbers to the arraylist
		for (int i=0; i<=100;i++)
		{
			numlist.add(i);
		}
		
		for(int j=0;j<numlist.size();j++)
		{
			if(numlist.get(j)%2==0)
			{
				System.out.println(j);
			}
		}
	}

}
