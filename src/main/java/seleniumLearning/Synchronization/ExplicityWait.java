package seleniumLearning.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("uppara");

		// fluent wait
		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.ignoring(ElementNotVisibleException.class).ignoring(NoSuchElementException.class).withMessage("hello")
				.withTimeout(30, TimeUnit.SECONDS).pollingEvery(3000, TimeUnit.MILLISECONDS);
		
		//Explicit Wait
		WebElement element;
		WebDriverWait ewait = new WebDriverWait(driver, 30);
		 
		element = ewait.until(ExpectedConditions.visibilityOfElementLocated(By.id("a10")));
		System.out.println(ewait.until(ExpectedConditions.titleIs("locator")));
		System.out.println(ewait.until(ExpectedConditions.attributeContains(By.id("a10"),"href", "http://www.w3schools.com")));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());


	}

}
