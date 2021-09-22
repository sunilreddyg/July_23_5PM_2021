package mq.java.Loops;

public class For_Example {

	public static void main(String[] args) 
	{
		
		
		//Print numbers from 1 to 10
		for (int i = 1; i < 11; i++)
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print Array values
		String browsers[]= {"chrome","safari","opera","edge","firefox","ie"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String EachBrowser = browsers[i];
			System.out.println(EachBrowser);
		}
		
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i =1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		
		
		
		//How to reverse a string
		String name="webdriver";
		//Converting string into characters array
		char ch[]=name.toCharArray();
		String str="";
		for (int i = name.length()-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		
		//Reverse a string using string builder
		StringBuilder stbr=new StringBuilder(name);
		System.out.println(stbr.reverse());
		
		//Print Number in string format
		int a=100;
		StringBuilder strb=new StringBuilder(a);
		System.out.println(strb.toString());

	}

}
