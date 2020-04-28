package seleniumLearning.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{

	public static void main(String[] args)
	{
		//System.setProperty(�webdriver.gecko.driver�, �.//exes//geckodriver64.exe�);
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("dkfjhdsk");
		
		driver.close();

	}

}
