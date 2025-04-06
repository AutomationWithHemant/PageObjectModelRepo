package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class NewCarsPage extends BasePage {

	
	public NewCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//a[@title='Tata']")
	private WebElement tata;
	
	public TataCarsPage goToTata()
	{
		tata.click();
		//driver.findElement(By.xpath("//a[@title='Tata']")).click();
		return new TataCarsPage(driver);
	}
	
	@FindBy(xpath="//a[@title='Toyota']")
	private WebElement toyota;
	
	public ToyotaCars goToToyota()
	{
		toyota.click();
		return PageFactory.initElements(driver, ToyotaCars.class);
	}
	
	@FindBy(xpath="//a[@title='BMW']")
	private WebElement BMW;
	
	public BMWCarsPage goToBMW()
	{
		BMW.click();

		return PageFactory.initElements(driver, BMWCarsPage.class);
	}
	
	@FindBy(xpath="//a[@title='Audi']")
	private WebElement Audi;
	
	public void goToAudi()
	{
		Audi.click();

	}
}
