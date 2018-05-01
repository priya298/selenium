package selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class Ie {

	public static void main(String[] args) 
	{
		
		 System.setProperty("webdriver.ie.driver", "E:\\selenium\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe");
         InternetExplorerDriver driver=new InternetExplorerDriver();
         driver.get("http://www.snapdeal.com");
	}

}    
