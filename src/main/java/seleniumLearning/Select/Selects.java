package seleniumLearning.Select;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selects
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		Select select = new Select(driver.findElement(By.id("language")));
		List<WebElement> languagesList = select.getOptions();
		System.out.println("List language to be learn:\t " + languagesList.size());
		List<String> ll = new ArrayList<String>();
		ll.add("2987sahdlkjh");
		ll.get(0);
		
		int a =0 , b= 0;
		int result= a+b;
		if (select.isMultiple() == true)
		{
			select.selectByIndex(2);
			select.selectByValue("java");
			select.selectByVisibleText("Python");
			select.deselectByIndex(2);
			select.deselectByValue("java");
			select.deselectByVisibleText("Python");
			select.selectByIndex(2);
			select.selectByValue("java");
			select.selectByVisibleText("Python");
			// select.deselectAll();
			// it retrieves all the selected values from list
			List<WebElement> languageList = select.getAllSelectedOptions();
			System.out.println(languageList.size());
			System.out.println(select.getFirstSelectedOption().getText());;
			for (WebElement language : languageList)
				
			{
				System.out.println(language.getText() + ":\t Selected languages to learn");
				
			}
		}
		else
		{
			System.out.println("it is not multiple");
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//option"));
		for(int i =0;i<options.size();i++ )
		{
			System.out.println(options.get(i).getText());
		}
		int z =options.size();
		for(int j=z-1;j>=0;j-- )
		{
			String text = options.get(j).getText();
			System.out.println(text);
		}
		driver.quit();

	}

}
