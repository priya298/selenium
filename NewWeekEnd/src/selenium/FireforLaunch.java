package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireforLaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");

	}

}
