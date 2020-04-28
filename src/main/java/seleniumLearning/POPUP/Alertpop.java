package seleniumLearning.POPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Alertpop
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
//		System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver64.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		//alert popup
		Alert alert;
		driver.findElement(By.id("alert")).click();
		Thread.sleep(5000);
		alert = driver.switchTo().alert();
		String aa = alert.getText();
		System.out.println("Alert Pop- up  "+aa);
		alert.accept();
	
		//confirmation pop up
//		driver.findElement(By.id("confirm")).click();
//		
//		alert = driver.switchTo().alert();
//		String bb = alert.getText();
//		System.out.println("Comfirmation Pop- up"+bb);
//		Thread.sleep(5000);
////		alert.accept();
//		alert.dismiss();
		
//prompt popup
				driver.findElement(By.id("prompt")).click();
				alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				driver.switchTo().alert().sendKeys("hello");
				Thread.sleep(5000);
				alert.accept();
				
//				alert.dismiss();
		
		
	

	}

}
