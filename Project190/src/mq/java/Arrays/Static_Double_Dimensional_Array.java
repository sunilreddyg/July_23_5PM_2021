package mq.java.Arrays;

public class Static_Double_Dimensional_Array {

	public static void main(String[] args)
	{
		
		
		//Crate obejct for double dimensional array
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="Arjun";
		data[0][1]="Arj123";
		
		//2nd row data
		data[1][0]="Kumar";
		data[1][1]="kr@123";
		
		//3rd row data
		data[2][0]="Sam";
		data[2][1]="Sam@123";
		
		System.out.println(data[1][0]);
		
		/*
		 * Double dimensional array only return size of rows
		 */
		int Array_length=data.length;
		System.out.println("Array length is ---> "+Array_length);
		
		
		//Read all array next values
		for (String[] Row : data) 
		{
			System.out.println(Row[0]+"   "+Row[1]);
		}

	}

}
