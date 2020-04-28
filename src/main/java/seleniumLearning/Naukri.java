package seleniumLearning;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Naukri
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.naukri.com");
		driver.findElement(By.id("emailTxt")).sendKeys("krishnaputtu1987@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("vamshi1987");
		driver.findElement(By.name("Login")).submit();
		driver.findElement(By.className("w205")).click();
		driver.findElement(By.id("deleteLink1")).click();
		driver.findElement(By.xpath("//div[@id='deleteLayer']//button[@class='w85bt fl']")).click();
		driver.findElement(By.id("uploadLink")).click();
		driver.findElement(By.id("attachCV")).sendKeys("D:\\learning\\seleniumtraining\\src\\resume\\krishna\\krishna_5yrs_Selenium_60Days.docx");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement link = driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(link).perform();
//		WebElement link = driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
		int x = link.getLocation().getX();
		int y = link.getLocation().getY();
		int height = link.getSize().getHeight();
		int width = link.getSize().getWidth();
		Robot ro;
		try
		{
			ro = new Robot();
			ro.mouseMove(x + 80, y);
		}
		catch (AWTException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.className("logout")).click();
		 driver.close();
		 
		
	}
	

}
