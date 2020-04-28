package seleniumLearning.Synchronization;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ImplicitWait
{

	public static void main(String[] args)
	{

		
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
		// WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String aTitle = driver.getTitle();
		String eTitle = "locator";
			
		if (aTitle.contentEquals(eTitle))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		long start = (System.currentTimeMillis()/1000)%60;
//		System.out.println(start);
		List<WebElement> anchortag = driver.findElements(By.tagName("a"));
		System.out.println("anchor tag size :"+anchortag.size());
		for (WebElement text : anchortag)
		{
			String textvalue = text.getText();
			System.out.println(textvalue);
			System.err.print("/n");
		}
		
		long end = (System.currentTimeMillis()/1000)%60;
//		System.out.println(end);
		long durationOfExecution = end - start;
		System.out.println("duration Of Execution" + durationOfExecution);
		

	}

}
