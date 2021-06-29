package mq.java.instantmethods;

public class TvRemote 
{
	
	//Instant method
	public void ON()
	{
		System.out.println("power is on");
	}
	
	
	//Instant method
	public void OFF()
	{
		System.out.println("power is off");
	}
	
	
	public static void main(String[] args) 
	{
		
		TvRemote obj=new TvRemote();
		obj.ON();
		obj.OFF();

	}
	
	

}
