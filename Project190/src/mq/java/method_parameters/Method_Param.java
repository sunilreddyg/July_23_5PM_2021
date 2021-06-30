package mq.java.method_parameters;

public class Method_Param 
{
	
	//Method without parameter
	public void method1()
	{
		System.out.println("IDE");
	}
	
	
	//Method with parameter
	public void method2(String toolname)
	{
		System.out.println(toolname);
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Method_Param obj=new Method_Param();
		obj.method1();
		obj.method2("WD");
		obj.method2("GRID");

	}

}
