package seleniumLearning.Synchronization;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class Fluent
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("krishna");
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("uppara");
		//fluent wait
		@SuppressWarnings("unchecked")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .ignoring(ElementNotVisibleException.class)
				 .ignoring(NoSuchElementException.class)
				 .withMessage("hello")
				 .withTimeout(30, TimeUnit.SECONDS)
				 .pollingEvery(3000, TimeUnit.MILLISECONDS);
		WebElement ele = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver arg)
			{
				String aTitle = arg.getTitle();
				String eTitle = "locator";
				if (aTitle.contentEquals(eTitle))
					System.out.println("pass");
				else
					System.out.println("fail");
				List<WebElement> anchortag = arg.findElements(By.tagName("a"));
				System.out.println("anchor tag size :" + anchortag.size());
				for (WebElement text : anchortag)
				{
					String textvalue = text.getText();
					System.out.println(textvalue);
					System.err.print("/n");
				}
				WebElement jj= arg.findElement(By.xpath("//a[1]"));
				return jj;
			}
		});
		System.out.println("Final visible status is >>>>> " + ele.isDisplayed());
//		WebElement element = wait.until(new Function<WebDriver, WebElement>()
//		{
//			public WebElement apply(WebDriver arg)
//			{
//				String aTitle = arg.getTitle();
//				String eTitle = "locator";
//				if (aTitle.contentEquals(eTitle))
//					System.out.println("pass");
//				else
//					System.out.println("fail");
//				List<WebElement> anchortag = arg.findElements(By.tagName("a"));
//				System.out.println("anchor tag size :" + anchortag.size());
//				for (WebElement text : anchortag)
//				{
//					String textvalue = text.getText();
//					System.out.println(textvalue);
//					System.err.print("/n");
//				}
//				return null;
//			}
//
////		});
//		wait.until(new Function<WebDriver, WebElement>(){
//
//			@Override
//			public WebElement apply(WebDriver arg0)
//			{
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//		});
//		System.out.println("Final visible status is >>>>> " + ele.isDisplayed());

	}

}