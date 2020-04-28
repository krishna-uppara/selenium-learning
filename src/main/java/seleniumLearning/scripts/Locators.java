package seleniumLearning.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Locators
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");

		List<WebElement> anchortag = driver.findElements(By.tagName("a"));
		System.out.println("anchor tag size :"+anchortag.size());
		for (WebElement text : anchortag)
		{
			String textvalue = text.getText();
			System.out.println(textvalue);
			System.err.print("/n");
		}
		List<WebElement> input = driver.findElements(By.tagName("input"));
		System.out.println("input tag size :"+ input.size());
		driver.get("");
		
		String title = driver.getTitle();
		System.out.println("current web page title:" + title);
		String p1text = driver.findElement(By.xpath("//body/p[1]")).getText();
		System.out.println("Paragraph text:::::"+ p1text);
		String p2text = driver.findElement(By.xpath("//body/p[2]")).getText();
		System.out.println("Paragraph text:::::"+ p2text);
		String attributeValue = driver.findElement(By.tagName("a")).getAttribute("href");
		System.out.println("id attribute value::" + attributeValue);
		String attributeValue1 = driver.findElement(By.tagName("a")).getAttribute("href");
		driver.findElement(By.partialLinkText("a")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String htmlcode = driver.getPageSource();
		//System.out.println(htmlcode);
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("dlkjflk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.close();


	}

}
