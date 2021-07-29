package mq.java.variable.initialize_Variables;

public class Variable_initializer 
{
	int a;
	int b;
	
	public void method1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
	
		Variable_initializer obj=new Variable_initializer();
		obj.a=100;
		obj.b=200;
		obj.method1();

	}

}
