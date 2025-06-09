package numbers_Java_Programs;
import java.util.ArrayList;
	
public class Number_SmallestNumberFromLists 
{
	public static void main(String[] args) {
		
		ArrayList <Integer> numlist = new ArrayList<Integer>();
		
		for (int i=55; i<=111;i++)
		{numlist.add(i);}
		
		int smallest=numlist.get(0);
		
		for(int j=0;j<numlist.size();j++)
		{
			if(numlist.get(j)<smallest)
			{smallest=numlist.get(j);}
		}
		
		System.out.println(smallest);
	}

}
