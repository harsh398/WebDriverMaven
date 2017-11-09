import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Login {

	/**
	 * @param args
	 */
	public static WebDriver driver;
	
		// TODO Auto-generated method stub
	@BeforeSuite
public void setup()
{
		 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");					
	         driver = new ChromeDriver();
	}
@Test
public void doLogin()
{
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("harsh398@live.com");
	
	 driver.findElement(By.xpath("//*[@id='next']")).click();
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("jumper398");
	 driver.findElement(By.xpath("//*[@id='signIn']")).click();
	 
	
}
@AfterSuite
public void tearDown()
{
driver.quit();
}
}
