package seleniumLearning.Select;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedORNOT
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
		String msg = "sorted";

		for (int j = 0; j < languagesList.size(); j++)
		{
			String a = languagesList.get(j).getText();
			String b = languagesList.get(j + 1).getText();
			if (a.compareTo(b) >= 1)
			{
				msg = "notsorted";
				break;
			}

		}
		System.out.println(msg);
		ArrayList<String> a = new ArrayList<>();
		for (int i = 0; i < languagesList.size(); i++)
		{
			a.add(languagesList.get(i).getText());
		}

		Collections.sort(a);
		String msg1 = "sorted";
		for (int i =0 ; i < a.size(); i++)
		{
			for (int j = i + 1; j < a.size(); j++)
			{
				String c = a.get(i);
				String d = a.get(j);
				if (c.compareTo(d) >= 1)
				{
					msg1 = "notsorted";
					break;
				}

			}
		}

		System.out.println(msg1);
		driver.close();
	}
}
