package conditional_Statement;

public class continueStatement {

	public static void main(String[] args) {
		

		for (int i=0; i<6; i++)
		{
			if(i>3) 
			{
			continue;
			}
			else {System.out.println("Its a "+i);}
			System.out.println("___");
		}
	}

}
