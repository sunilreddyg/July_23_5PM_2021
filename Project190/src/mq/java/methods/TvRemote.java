package mq.java.methods;

public class TvRemote 
{
	
	
	public void ON()
	{
		System.out.println("power is on");
	}
	
	
	public void OFF()
	{
		System.out.println("power is off");
	}
	
	
	public static void main(String[] args) 
	{
		
		new TvRemote().ON();
		new TvRemote().OFF();

	}
	
	

}
