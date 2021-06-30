package mq.java.method_parameters;

public class RobotB 
{
	
	
	public void standardRun()
	{
		System.out.println("Run completed with average speed  8 KM");
		//Here 10 KM speed is hardcoded
	}
	
	
	public void CustomizeRun(int KM)
	{
		System.out.println("Run Completed with Customized speed -->"+KM);
	}
	
	
	/*
	 * Method Parameter advantages:-->
	 * 		=> Method parameter can change method behaviour at runtime
	 * 		=> We can pass actual values to method at runtime without hard coding inside method
	 * 		=> We can pass multiple parameters by separating cama
	 */
	
	
	public void walk(int KM, String phase)
	{
		System.out.println("Running in speed ---> "+KM);
		System.out.println("Running phase is --->"+phase);
	}
	
	

	public static void main(String[] args)
	{
		
		RobotB obj=new RobotB();
		obj.standardRun();
		obj.CustomizeRun(12);
		obj.CustomizeRun(15);
		obj.CustomizeRun(20);
		
		//Calling method with multiple arguments/ Runtime parameters
		obj.walk(8, "Right");
		obj.walk(8, "Lefct");
		obj.walk(10, "Forward");
		obj.walk(6, "backward");
	}

}
