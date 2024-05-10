package numbers_Java_Programs;

import java.util.ArrayList;

public class Print_The_largest_Number_from_List 
{
	public static void main(String[] args) {
		
		ArrayList <Integer> numlist = new ArrayList<Integer>();
		
		for (int i=0; i<=111;i++)
		{
			numlist.add(i);
		}
		int largest=numlist.get(0);
		
		for(int j=0;j<numlist.size();j++)
		{
			if(numlist.get(j)>largest)
			{
				largest=numlist.get(j);			}
		}
		
		System.out.println(largest);
	}

}
