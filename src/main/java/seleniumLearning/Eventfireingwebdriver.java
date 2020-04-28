package seleniumLearning;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Eventfireingwebdriver
	{

		String a = this.getClass().toString();

		public void m1() throws IOException
			{
				System.setProperty("webdriver.gecko.driver", "./exes/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com");
				// here we are doing type casting
				EventFiringWebDriver t = new EventFiringWebDriver(driver);
				File srcFile = t.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./" + a + "/" + a + "" + System.currentTimeMillis() + ".png");
				FileUtils.copyFile(srcFile, destFile);
				driver.quit();
			}

		public static void main(String[] A) throws IOException
			{

				new Eventfireingwebdriver().m1();

			}

	}
