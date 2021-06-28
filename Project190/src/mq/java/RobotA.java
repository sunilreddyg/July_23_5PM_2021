package mq.java;


public class RobotA 
{
	
	//Without  access modifier method only access with in package
	void run()
	{
		System.out.println("run program executed");
	}
	
	
	void walk()
	{
		System.out.println("walk program executed");
	}
	
	
	public static void main(String args[])
	{
		new RobotA().run();
		new RobotA().walk();
		
	}
	

}


