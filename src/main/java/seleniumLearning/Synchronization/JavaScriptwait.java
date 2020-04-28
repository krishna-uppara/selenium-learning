package seleniumLearning.Synchronization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptwait
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//exes//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///D:/learning/seleniumtraining/htmlpages/demo.html");
		//page load timeout 
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//        //Call executeAsyncScript() method to wait for 5 seconds	
//		JavascriptExecutor js = (JavascriptExecutor)driver;	
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
//        driver.quit();
		
		
 		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://demo.guru99.com/V4/");
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
	
	        //Fetching the Domain Name of the site. Tostring() change object to name.		
	        String DomainName = js.executeScript("return document.domain;").toString();			
	        System.out.println("Domain name of the site = "+DomainName);					
	          		
	        //Fetching the URL of the site. Tostring() change object to name		
	        String url = js.executeScript("return document.URL;").toString();			
	        System.out.println("URL of the site = "+url);					
	          		
	       //Method document.title fetch the Title name of the site. Tostring() change object to name		
	       String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);					

	        		
	      //Navigate to new Page i.e to generate access page. (launch new url)		
	      js.executeScript("window.location = 'http://demo.guru99.com/'");	
	        //Vertical scroll down by 600  pixels		
	        js.executeScript("window.scrollBy(0,600)");
	        
	}

}
