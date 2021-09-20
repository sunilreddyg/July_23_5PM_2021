package mq.java.Arrays;

public class Runtime_Double_DimensionalArray 
{

	public static void main(String[] args) 
	{
		
		
		
		String data[][]= 
			{
				{"Iphone","50000"},
				{"SamSung","40000"},
				{"OnePlus","30000"},
				{"Vivo","20000"},
				
			};
		
		System.out.println("Mobile name is -->"+data[2][0]);
		System.out.println("Array lenth is ---> "+data.length);
		
		
		//Read Double dimensional array using foreach loop
		for (String[] Row : data) 
		{
			System.out.println(Row[0]+"   "+Row[1]);
		}
		

	}

}
