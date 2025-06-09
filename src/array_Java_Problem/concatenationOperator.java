package array_Java_Problem;

public class concatenationOperator {

	public static void main(String[] args) {
		String a = "Laptop ";
		String b = "Hp";
		
		System.out.println(a+b);	//Laptop Hp
	//	System.out.println(a-b);  // Not Possible
	//	System.out.println(a*b);  // Not Possible
		
	//**************************************************	
		String c = "Laptop10";
		String d = "200";
		System.out.println(c+d);	//Laptop10200
		
	//**************************************************	
		String e = "10";
		String f = "200";
		System.out.println(e+f);	//10200
		
	//**************************************************	
		String g = "Table";
		int h = 200;
		int i = 20;
		System.out.println(g+h+i);	//Table20020
		
	//**************************************************	
		String g1 = "Table";
		int h1 = 200;
		int i1 = 20;
		System.out.println(g1+(h1+i1));	//Table220
		
	}

}
