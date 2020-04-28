package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./exes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get("E:\\NoticeperiodSelenium\\seleniumLearning\\html\\NewFile.html");
		List <WebElement> l1 = driver.findElements(By.xpath("//ul[@id='classs']//li[text()='Coffee']/following-sibling::li"));
		List <WebElement> l2 = driver.findElements(By.xpath("//ul[@id='classs']//li[text()='Coffee']/following::li"));
		List <WebElement> l3 = driver.findElements(By.xpath("//ul[@id='classs']//li[text()='Milk1111']/preceding-sibling::li"));
		List <WebElement> l4 = driver.findElements(By.xpath("//ul[@id='classs']//li[text()='Milk1111']/preceding::li"));
		System.out.println("ancestor ::"+driver.findElement(By.xpath("//ancestor::ul")).getText());
		System.out.println("descendant ::"+driver.findElement(By.xpath("//descendant::ul")).getText());
		System.out.println("sibling ::"+driver.findElement(By.xpath("//parent::li")).getTagName());
		driver.switchTo().alert().accept();	
		for(WebElement lis : l1)
		{
			String a = lis.getText();
			System.out.println(a);
		}
		for(WebElement lis : l2)
		{
			String a = lis.getText();
			System.out.println(a);
		}
		
		for(WebElement lis : l3)
		{
			String a = lis.getText();
			System.out.println(a);
		}
		for(WebElement lis : l4)
		{
			String a = lis.getText();
			System.out.println(a);
		}
		driver.close();

	}

}
