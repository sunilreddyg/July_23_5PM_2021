package mq.java.Arrays;

public class StaticArray_SIngle_Dimensional {

	public static void main(String[] args) {
		
		//Store set of Strings
		String browsers[]=new String[4];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="safari";
		browsers[3]="edge";
		System.out.println(browsers[3]);
		System.out.println("Array length is --> "+browsers.length);
		
		
		//Store set of numbers
		int num[]=new int[5];
		num[0]=100;
		num[1]=101;
		num[2]=102;
		num[3]=103;
		num[4]=104;
		
		System.out.println(num[2]);
		
		
		//Set Group of objects
		Object obj[]=new Object[4];
		obj[0]="iphone";
		obj[1]=10;
		obj[2]=22000.00;
		obj[3]=true;
		
		
		String productname=(String) obj[0];
		int numberofproducts=(int) obj[1];
		double productprice=(double) obj[2];
		boolean productstatus=(boolean) obj[3];
		
		System.out.println(productname+"   "+numberofproducts+"   "+productprice+"    "+productstatus);
		
		

	}

}
