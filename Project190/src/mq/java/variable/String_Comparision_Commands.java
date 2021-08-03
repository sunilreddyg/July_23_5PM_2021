package mq.java.variable;

public class String_Comparision_Commands 
{

	public static void main(String[] args)
	{
		
		/*
		 * => String store set of characters into referenced variable
		 * => String is not only a datatype also called as class.
		 * => Because String is a class it contains set of methods to validate
		 * 		stored characters
		 */
		
		
		
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision between two strings
		 * 			and return boolean value true/false.The comparison is
		 * 			case sensitive
		 */
		
		
		String Act_result="Account Created Successfull";
		String Exp_result="account created successfull";
		
		
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal comparison is ---> "+flag);
		
		
		
		/*
		 * EqualIgnorecase:-->
		 * 
		 * 			Method verify equal comparision between two string 
		 * 			by ignoring case sensitive.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("Equal Ignore case comparision is ---> "+flag1);
		
		
		/*
		 * Contains:-->
		 * 			Method verify sub string characters available at main String
		 * 			and return boolean value true of false
		 */
		String Status="account 100 created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Sub String available status is ---> "+flag2);
		
		
		/*
		 * length:-->
		 * 		  Method return number of characers available with in string
		 * 		  in numeric format.
		 */
		String zipcode="9030248855";
		int len=zipcode.length();
		System.out.println("Mobile number length is --> "+len);
		
		
		/*
		 * subString:-->
		 * 		 Method return substring characters into string format
		 */
		String Account_num="0000454567678888";
		String sub=Account_num.substring(4);
		System.out.println("Sub String characters are --> "+sub);
		
		//Get middel characters using starting and ending index numbers
		String middle_chars=Account_num.substring(8, 12);
		System.out.println("Middle characters with in string --> "+middle_chars);
		
		
		/*
		 * trim:-->
		 * 		Methd trim extra characters from the left and right string.
		 */
		String passcode="    0023456   ";
		System.out.println("Before trim passcode length is --> "+passcode.length());
		
		String New_passcode=passcode.trim();
		System.out.println("After trim passcode length is ---> "+New_passcode.length());
		
	
		
		/*
		 * Startswith:-->
		 * 			Method verify given string starts with expected character sequence
		 * 			and return boolean value true/false.
		 */
		 String IFSC_Code="HDFC00123456";
		 boolean flag3=IFSC_Code.startsWith("HDFC");
		 System.out.println("Charcters starts with expected characters ?--> "+flag3);
		
		 
		 /*
		 * Endswith:-->
		 * 			Method verify given string ends with expected character sequence
		 * 			and return boolean value true/false.
		 */
		 boolean flag4=IFSC_Code.endsWith("00123456");
		 System.out.println("Characters ends with expected characters ?--> "+flag4);
		 
		 
		 /*
		  * isEmpty:-->
		  * 		Method verify characters available at string and return
		  * 		boolean valu true/false
		  */
		 String var1="";
		 String var2="MINDQ";
		 
		 System.out.println("Var1 empty status is ---> "+var1.isEmpty());
		 System.out.println("Var2 empty status is ---> "+var2.isEmpty());
			
		 
		 /*
		  * touppercase:-->
		  * 		With in string all lowercase characters converting into uppercase
		  * 		characters
		  */
		 String data="Selenium WebDriver";
		 String Ucase=data.toUpperCase();
		 System.out.println("charcters in uppercase --> "+Ucase);
			
		 
		 /*
		  * toLowerCase:-->
		  * 		With in string all Uppercase characters converting into Lowercase
		  * 		characters
		  */
		 String Lcase=data.toLowerCase();
		 System.out.println("Charcters in lowercase --> "+Lcase);
		 
		 
		 /*
		  * Replace:-->
		  * 		methdo replace existing characters with new character
		  */
		 String name="Hema";
		 String newName=name.replace("H", "S");
		 System.out.println(newName);
		 
		 
		 /*
		  * Replaceall:-->
		  * 		method replace all required characters with new characters
		  */
		 String s1="hello world";  
		 String replaceString=s1.replaceAll("l","i");//replaces all occurrences of "l" to "i"  
		 System.out.println(replaceString);  
		 
		 
		 /*
		  * charAt:-->
		  * 		using index number it return single character with in string
		  */
		 String toolname="WebDriver";
		 char ch=toolname.charAt(3);
		 System.out.println("3 index character is --> "+ch);
		 
		 
	}

}
