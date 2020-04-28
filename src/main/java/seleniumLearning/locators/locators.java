package seleniumLearning.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("a1")).click();
		driver.findElement(By.className("link1")).click();
		driver.findElement(By.name("link1")).click();
		driver.findElement(By.linkText("This is a link")).click();
		driver.findElement(By.partialLinkText("a")).click();
		String p3text = driver.findElement(By.xpath("//body")).getText();
		System.out.println("bodytext::" + p3text);
	}

}
