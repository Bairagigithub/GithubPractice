package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PracticeTest {
	WebDriver driver = null;

    @Test
	public void m1Test()
	{
    	System.out.println("Hello");
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	*/
    	
    	/*String BROWSER = System.getProperty("browser");
    	String URL = System.getProperty("url");
    	
    	if(BROWSER.equalsIgnoreCase("chrome"))
    	{
    		driver = new ChromeDriver();
    	}
    	else if(BROWSER.equalsIgnoreCase("firefox"))
    	{
    		driver = new FirefoxDriver();
    	}
    	else 
    	{
    		driver = new ChromeDriver();
    	}
    	
    	driver.get(URL);*/
	}	
	
	}


