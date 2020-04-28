package seleniumLearning;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class RobotClass1
	{
		

		public static void main(String[] args) throws AWTException, IOException
			{
				Robot r = new Robot();
				Dimension d = new Dimension(200,200);
				Rectangle area =new Rectangle(d);
				BufferedImage screenshot = r.createScreenCapture(area);
				ImageIO.write(screenshot, "png", new File(".//ScreenShot//hhh11111.png"));
			}

	}
