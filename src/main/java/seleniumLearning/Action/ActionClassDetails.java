package seleniumLearning.Action;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDetails
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
//		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys(Keys.TAB);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ALT,Keys.SHIFT,"z");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		firstname.click();
		Action  seriesaction = action.keyDown(firstname,Keys.SHIFT).sendKeys(firstname,"hello")
								.keyUp(firstname, Keys.SHIFT).doubleClick().build();
		seriesaction.perform();
		driver.findElement(By.name("firstname")).sendKeys(Keys.TAB);
		Action ss = action.moveToElement(submit).build();
		ss.perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.close()");
		
		
		
	}

}
