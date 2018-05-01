package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class All 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
         FirefoxDriver driver1=new FirefoxDriver();
         driver1.navigate().to("https://www.flipkart.com");
         
        
         System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//Driver//IEDriverServer.exe");
         InternetExplorerDriver driver2=new InternetExplorerDriver();
         driver2.get("http://www.snapdeal.com");

	}

}
