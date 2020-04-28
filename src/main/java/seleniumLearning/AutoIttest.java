package seleniumLearning;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AutoIttest
{
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://css-tricks.com/examples/DragAndDropFileUploading/");
		Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("E://drag and drop");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("folder Not Found");
        }
        Runtime.getRuntime().exec("E://CVimport//cvimport1.exe");
        Thread.sleep(10000);
        driver.close();
        Robot robot = new Robot();
        robot.delay(50000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
        System.out.println("folder folder closed");
        
        
		
		
		
		
	}

}

