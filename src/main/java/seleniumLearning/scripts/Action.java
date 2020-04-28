package seleniumLearning.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action
{

	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		
//		driver.navigate().refresh();driver.navigate().refresh();
//		WebElement drag = driver.findElement(By.xpath("//div[@id='box3']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='box103']"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(drag,drop).perform();
////		WebElement drop1 =driver.findElement(By.id("capitals")); 
//		actions.dragAndDrop(drop,drop1).perform();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		WebElement elefirstname = driver.findElement(By.name("firstname"));
//		WebElement elelastname = driver.findElement(By.name("lastname")); 
//		Boolean result = (elefirstname.isDisplayed() && elefirstname.isEnabled())&&(elelastname.isDisplayed() && elelastname.isEnabled());
//		if(result == true)
//		{
//			
//			driver.findElement(By.name("firstname")).click();
//			driver.findElement(By.name("firstname")).clear();
//			driver.findElement(By.name("firstname")).sendKeys("BOND");
//			driver.findElement(By.name("lastname")).click();
//			driver.findElement(By.name("lastname")).clear();
//			driver.findElement(By.name("lastname")).sendKeys("ADAPT");
//
//		}
//		else
//		{
//			System.out.println("ELEMENT is not Displayed/Enabled ");
//		}
//		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL,"a");
//		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL,"c");
//		driver.findElement(By.name("lastname")).sendKeys(Keys.SPACE," ");
//		driver.findElement(By.name("lastname")).sendKeys(Keys.CONTROL,"v");
//		Actions action = new Actions(driver);
//		WebElement ele = driver.findElement(By.xpath("//a[@hhh='ggg']"));
//		WebElement eledc = driver.findElement(By.xpath("//input[@type='submit']"));
//		action.doubleClick(eledc).perform();
		//input[@type='submit']
//		action.clickAndHold().build().perform();
		driver.findElement(By.name("firstname")).sendKeys("HJLDS");
		driver.findElement(By.name("firstname")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.CONTROL,"c"));
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.SPACE,Keys.CONTROL,"v"));
//		action.moveToElement(ele).build().perform();
//		action.moveToElement(ele, 420, 120);action.sendKeys(Keys.CONTROL).sendKeys(Keys.SHIFT,"I").build().perform();
		
//		action.sendKeys(Keys.SHIFT,"I");
		
		
		
	}

}
