package seleniumLearning.Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumLearning.DDF.DataDrivenFramework;

public class NavigateMethods
{
	public static void main(String[] args)
	{
		NavigateMethods a = new NavigateMethods();
				a.login123();
				a.login();
	}
	
//	public static void main(String[] args)
//	{
//		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
//		driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		
//		
//	}
	
	
	DataDrivenFramework ddf;
	public void login123 ()
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		try
		{
			seleniumLearning.DDF.DataDrivenFramework.fileReading("aaa.xlsx");
			ddf = new seleniumLearning.DDF.DataDrivenFramework();
			// System.out.println(ddf.getTestSheetName("krishna"));
			String un = ddf.getRow("login", "un");
			String pw = ddf.getRow("login", "pw");
			driver.manage().window().maximize();
			driver.findElement(By.name("firstname")).click();
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("firstname")).sendKeys(un);
			driver.findElement(By.name("lastname")).click();
			driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("lastname")).sendKeys(pw);
			ddf.setTestCaseStatus("login","pass");
			
		}
		catch (Exception e)
		{
			
			
			ddf.setTestCaseStatus("login","fail");
			e.printStackTrace();
		}
		
		driver.close();
	}
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		try
		{
			DataDrivenFramework.fileReading("aaa.xlsx");
			ddf = new DataDrivenFramework();
			// System.out.println(ddf.getTestSheetName("krishna"));
			String un = ddf.getRow("login", "un");
			String pw = ddf.getRow("login", "pw");
			driver.manage().window().maximize();
			driver.findElement(By.name("firstname")).click();
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("firstname")).sendKeys(un);
			driver.findElement(By.name("lastname")).click();
			driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("lastname")).sendKeys(pw);
			ddf.setTestCaseStatus("login","pass");
			
		}
		catch (Exception e)
		{
			
			
			ddf.setTestCaseStatus("login","fail");
			e.printStackTrace();
		}
	}

}
