package mq.java.constructor;

public class Change_Gear 
{

	public Change_Gear() 
	{
		System.out.println("Hold clutch");
	}
	
	
	public void Gear1()
	{
		System.out.println("First gear changed");
	}
	
	public void Gear2()
	{
		System.out.println("Second gear changed");
	}
	
	
	

	public static void main(String[] args) 
	{
		
		new Change_Gear().Gear1();
		new Change_Gear().Gear2();

	}

}
