package seleniumLearning.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class W3
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_button_active&stacked=h");
		List<WebElement> button = driver.findElements(By.xpath("//button[@type='button']"));
		System.out.println(button.size());
//		String classAttributeValue = driver.findElement(By.xpath("//button[text()='Active Primary']")).getAttribute("class");
//		System.out.println(classAttributeValue);
	}

}
