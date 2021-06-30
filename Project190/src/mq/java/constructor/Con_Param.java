package mq.java.constructor;


public class Con_Param 
{
	
	public Con_Param(String firstname) 
	{
		System.out.println(firstname);
	}
	
	public void method1(String lastname)
	{
		System.out.println(lastname);
	}
	

	public static void main(String[] args) {
		
		Con_Param obj=new Con_Param("WebDriver");
		obj.method1("Newuser");
		
		

	}

}
