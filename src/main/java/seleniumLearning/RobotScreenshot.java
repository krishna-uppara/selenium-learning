package seleniumLearning;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotScreenshot {

	public static void main(String[] args) throws IOException, AWTException
	{

		System.setProperty("webdriver.gecko.driver","./exes/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.programcreek.com/java-api-examples/java.awt.Robot");
		JavascriptExecutor js = (JavascriptExecutor)driver;
        Object h=js.executeScript("return document.body.scrollHeight");
        Object w =js.executeScript("return document.body.scrollWidth");
        int height=Integer.parseInt(h.toString());
        int width = Integer.parseInt(w.toString());
        System.out.println("Total height of the page:"+height+" pixels");
        System.out.println("Total height of the page:"+width+" pixels");
        Robot r = new Robot();
		Dimension d = new Dimension(width,height);
		Rectangle area =new Rectangle(d);
		BufferedImage screenshot = r.createScreenCapture(area);
		ImageIO.write(screenshot, "png", new File(".//ScreenShot//hhh123456789.png"));


	}

}
