package mq.java.Loops;

public class ForEach_Example {

	public static void main(String[] args) 
	{
		
		
		String tools[]= {"ide","webdriver","grid","appium","postman","cucumber"};
		
		for (String eachtool : tools)
		{
				if(eachtool.equals("cucumber"))
				{
					System.out.println("Set up configuration");
				}
		}
		
		
		//Get Index value of toolname
		int i=0;
		for (String eachtool : tools)
		{
				if(eachtool.equals("cucumber"))
				{
					System.out.println("tool available at position --> "+i);
				}
				i=i+1;
		}
		
		
		
		

	}

}
