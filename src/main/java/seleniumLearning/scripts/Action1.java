package seleniumLearning.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.yatra.com/");
		WebElement menu = driver.findElement(By.xpath(".//*[@id='booking_engine_flights']"));
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		actions.moveToElement(menu).perform();
		Thread.sleep(5000);
		WebElement rightclick = driver.findElement(By.xpath(".//*[@id='booking_engine_flights']"));
		actions.contextClick(rightclick).perform();
		actions.sendKeys("W").perform();
		driver.close();

	}

}
