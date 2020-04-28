package seleniumLearning.ROBOT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rob
{

	public static void main(String[] args)
	{System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver32.exe");
	WebDriver driver = new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com");
		
		
		try
		{
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON3_MASK);
			r.keyPress(KeyEvent.VK_Z);
			
		}
		catch (AWTException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
