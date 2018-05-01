package selenium;

import java.sql.Driver;

public class BrowsLaun 
{

	public static void main(String[] args) throws Exception
	{
		browserLaunch(getdata("browser"),getData("url"));
	
		driver.manage().window().maximize();
		
		
		String title=driver
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().back();
		
		Thread.sleep(4000);
		
		driver.manage().forward();
		
		driver.manage().refresh();
		

	}

	private static void browserLaunch(Object getdata, Object data) {
		// TODO Auto-generated method stub
		
	}

	private static Object getdata(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object getData(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
