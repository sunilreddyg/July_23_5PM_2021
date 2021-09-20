package mq.java.Arrays;

public class Runtime_SIngle_Dimensional_Array 
{

	public static void main(String[] args)
	{
		
		/*
		 * How to Declare runtime array
		 * 		=> Store vall value in curly braces  {}
		 * 		=> And each array value should be spearated with , operator
		 */
		
		
		//Runtime Array
		String browsers[]= {"chrome","safari","opera","edge","ie","firefox","Epic"};
		System.out.println("3rd index value is --> "+browsers[3]);
		System.out.println("Array length is --> "+browsers.length);
		
		
		//Read array next value using foreach loop
		for (String Eachbrowser : browsers) 
		{
			System.out.println("=>"+Eachbrowser);
		}
		
		
		
		//Store Numers into array
		int num[]= {100,200,300,400,500,600};
		System.out.println("3rd index vaule is --> "+num[3]);
		
		//Read Array next values
		for (int i : num) 
		{
			System.out.println(i);
		}
		
	}

}
