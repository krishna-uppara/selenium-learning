package seleniumLearning.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		long start = (System.currentTimeMillis()/1000)%60;
		System.out.println(start);

		try
		{
			Thread.sleep(20000);
		}
		catch (InterruptedException e)
		{
			System.out.println("Element was not found ");
			e.printStackTrace();
		}
		long end = (System.currentTimeMillis()/1000)%60;
		System.out.println(end);
		long durationOfExecution = end - start;
		System.out.println("duration Of Execution" + durationOfExecution);

	}

}
