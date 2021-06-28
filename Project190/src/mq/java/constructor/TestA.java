package mq.java.constructor;

public class TestA 
{
	
	//This class have hidden constructor
	
	
	void method1()
	{
		System.out.println("Method1 executed");
	}
	
	
	public static void main(String args[])
	{
		
		/*
		 *  Here new keyword calling hidden constructor of class
		 */
		
		new TestA().method1();
	}

}
