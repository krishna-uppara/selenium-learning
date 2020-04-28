package seleniumLearning;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenSho 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./exes/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//here we are doing type casting
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShot/"+System.currentTimeMillis()+"google.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
		
	}

}
