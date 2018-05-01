package selenium;


import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

	}
}