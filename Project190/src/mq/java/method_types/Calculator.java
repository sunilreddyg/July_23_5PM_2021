package mq.java.method_types;

public class Calculator 
{
	
	//Void:--> Void is a method type and it doesn't return value to method.
	public void open()
	{
		System.out.println("calculator is opened");
		System.out.println("Ready to use");
	}
	
	
	
	/*
	 * => Other than void type all methods return value 
	 * => When mehod type is not void we should write return keyword at end ot the method
	 * => the return value should be match with type of the method
	 * => Finally return value to method name
	 */
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	
	public String getAppName()
	{
		String name="Free Calculator";
		return name;
	}

	public static void main(String[] args) 
	{
		
		Calculator obj=new Calculator();
		//Calling void method
		obj.open();
		
		//Calling Integer return method
		int x=obj.add(120, 80);
		System.out.println(x/2);
		
		//Calling String return method
		String appname=obj.getAppName();
		System.out.println(appname);

	}

}
