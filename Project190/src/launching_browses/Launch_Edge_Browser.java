package launching_browses;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to launach Edgbe browser wedriver need
		 * edgedriver.exe support
		 * 
		 * 
		 * Download edge driver:-->
		 * 
		 * 			1. URL:--> https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
		 * 			2. Findout edge browser version
		 * 			3. W.r.t edge browser verison download edgedriver
		 * 			4. Set Runtime Environment variable before launch
		 */
		
		System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
		EdgeDriver edge=new EdgeDriver();
		edge.get("http://facebook.com");
		
		
		
		
		

	}

}
