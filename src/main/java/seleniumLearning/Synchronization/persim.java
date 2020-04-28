package seleniumLearning.Synchronization;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class persim
{

	public static void main(String[] args)
	{

		
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new ChromeDriver(capabilities);
		 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://172.16.75.169:8080/prism/login.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pass");
		driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Application')]")).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		

	}

}
