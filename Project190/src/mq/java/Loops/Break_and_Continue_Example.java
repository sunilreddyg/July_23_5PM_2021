package mq.java.Loops;

public class Break_and_Continue_Example {

	public static void main(String[] args) {
		
		//To stop iteration on perticual condition
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
			if(i==4)
			{
				break; 
			}
		
		}
		
		
		//Skip Iteration on Perticular condition
		for (int i = 1; i <= 10; i++) 
		{
				
				if(i==5 || i==7)  //  || [or]
				{
					continue;
				}
				System.out.println(i);
		}
		
		
		

	}

}
