package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import okhttp3.Address;

public class page1st extends test1st{
	@FindBy(xpath="//form[@id='basicBootstrapForm']")
	WebElement form;
	@FindBy(xpath="+form+'"+"//textarea[@ng-model='Adress']")
	WebElement address123;
	public page1st() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void registerForm()
	{
		address123.sendKeys("aaaaaaaa");
	}

}
