package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2Test
{
	@Test
public void  d1Test()
{
	WebDriver driver = null;
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://www.flipkart.com/");
	
	System.out.println("hi");
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	String USERNAME = System.getProperty("username");
	
//	driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(BROWSER.equalsIgnoreCase("edge"))
	{

		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else {
		driver = new EdgeDriver();
	}
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(USERNAME);
}
}
//mvn -Dbrowser=firefox -Durl=https://www.flipkart.com/ test

//pushing now 1st push
//pushing now 2nd push













//pull
//pull back again

