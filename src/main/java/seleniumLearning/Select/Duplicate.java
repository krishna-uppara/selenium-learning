package seleniumLearning.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		Select select = new Select(driver.findElement(By.id("language")));
		List<WebElement> languagesList = select.getOptions();
		System.out.println("List language to be learn:\t " + languagesList.size());
		int count = 0;
		for (int i = 0; i < languagesList.size(); i++)
		{

			for (int j = i + 1; j < languagesList.size(); j++)
			{
				String a = languagesList.get(i).getText();
				String b = languagesList.get(j).getText();
				if (a.equals(b))
				{

					count++;
					System.out.println(count);
					System.out.println(a);
				}
			}
		}
		
		driver.close();
	}

}
