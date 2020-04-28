package seleniumLearning.Synchronization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSynchronization
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		while(true)
		{
			try
			{
				driver.findElement(By.name("firstname")).click();
			}
			catch(NoSuchElementException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
			}
		}
			
		}

	}


