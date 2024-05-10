package numbers_Java_Programs;

import java.util.ArrayList;

public class Print_Even_Number_From_0_To_100_List 
{
	public static void main(String[] args) {
		
		ArrayList <Integer> numlist = new ArrayList<Integer>();
		
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
