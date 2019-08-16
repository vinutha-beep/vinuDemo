package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	static
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_2019\\Selenium_2019_Demo\\software\\chromedriver.exe");
	}
	@Test
	public void TestDemoone()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumhq.org/");
	System.out.println(driver.getTitle());
	driver.close();
	}
	
}
