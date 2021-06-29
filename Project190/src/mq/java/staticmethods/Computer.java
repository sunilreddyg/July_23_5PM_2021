package mq.java.staticmethods;

public class Computer 
{
	
	
	static void Keyboard()
	{
		System.out.println("Keyboard is active");
	}
	
	static void Mouse()
	{
		System.out.println("Mouse is active");
	}
	
	

	public static void main(String[] args) 
	{
		
		/*
		 * With in a class to call static methods from main method
		 * no need class of classname
		 */
		
		
		Keyboard();
		Mouse();

	}

}
