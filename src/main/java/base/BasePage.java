package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;

public class BasePage {

public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
}
