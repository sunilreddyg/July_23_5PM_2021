package mq.java.constructor;

public class Remote 
{

	public Remote() 
	{
		System.out.println("power on");
	}

	
	public void Ivolume()
	{
		System.out.println("Volume Increased");
	}
	
	public void Dvolume()
	{
		System.out.println("Volume Decreased");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call any public class instant methods we should
		 * create object for class
		 * 	
		 * 		Classname obj=new ClassName();
		 * 		obj.methodname();
		 * 		obj.methodname();
		 */
		
		
		Remote obj=new Remote();
		obj.Ivolume();
		obj.Dvolume();
		

	}

}
