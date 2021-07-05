package other_package;

import mq.java.instantmethods.TvRemote;

public class Calling_Other_Package_Methods 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Inorder to call other pakage methods and variables
		 * we need to follow below instructions.
		 * 
		 * Rule:--> Only public modfier method and variables
		 * 			we an call outside package..
		 * 
		 * Rule2:--> We should import other pakage classes
		 * 			 into current class
		 * 
		 * 		How to write import:-->
		 * 
		 * 				import packagename.classname;
		 * 				import pakagename.*;
		 * 
		 * 		Where to write import:-->
		 * 				Under package template and Before Classname template
		 */
		TvRemote obj=new TvRemote();
		obj.ON();
		obj.OFF();
		
		
		
		
	}

}
