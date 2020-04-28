package seleniumLearning.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageloadusingjs
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

		       ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>()
		       {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	           };
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(pageLoadCondition);
	    }

}
