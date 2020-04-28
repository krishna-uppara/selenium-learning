package seleniumLearning.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver32.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		List<WebElement> searchlist = driver.findElements(By.xpath("//ul[@class='sbsb_b']//li"));
		//div/ul/li//div[starts-with(text(),'selenium')]	System.out.println(searchlist.size());
		for(int i = 0; i<searchlist.size();i++)
		{
			
			String searchlistvalue = searchlist.get(i).getText();
			System.out.println(searchlistvalue);
		}
		
		String xp = "//div/ul/li//div[starts-with(text(),'selenium')]";
		List<WebElement> searchlists = driver.findElements(By.xpath(xp));
		System.out.println(searchlists.size());
		for(int i = 0; i<searchlists.size();i++)
		{
			
			String searchlistvalue = searchlists.get(i).getText();
			System.out.println(searchlistvalue);
			if(searchlistvalue.contains("webdriver"))
			{
				searchlists.get(i).click();
			}
		}

	}

}
