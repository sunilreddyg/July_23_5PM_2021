package mq.java.variable.initialize_Variables;

public class Method_Initializer 
{
	int a;
	int b;
	
	public void methodA(int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void methodB()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Method_Initializer obj=new Method_Initializer();
		obj.methodA(100, 200);
		obj.methodB();

	}

}
