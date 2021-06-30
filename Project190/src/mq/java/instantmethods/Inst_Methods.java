package mq.java.instantmethods;


public class Inst_Methods 
{
	
	public void method1()
	{
		System.out.println("method 1 executed");
	}
	
	public void method2()
	{
		System.out.println("method 2 executed");
	}

	public void method3()
	{
		System.out.println("method 3 executed");
	}
	
	public void method4()
	{
		method1();
		method2();
		method3();
	}

	public static void main(String[] args)
	{
		Inst_Methods ref=new Inst_Methods();
		ref.method4();
	
	}

}
