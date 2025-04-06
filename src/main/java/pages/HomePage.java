package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);

		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[normalize-space()='NEW CARS']")
	private WebElement newCars;

	@FindBy(xpath="//div[contains(text(),'Find New Cars')]")
	private WebElement findNewCar;
	
	
	public NewCarsPage findNewCars() throws InterruptedException
	{
		Thread.sleep(4000);
		//WebElement newCars = driver.findElement(By.xpath("//div[normalize-space()='NEW CARS']"));
		new Actions(driver).moveToElement(newCars).perform();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[contains(text(),'Find New Cars')]")).click();
		findNewCar.click();
		return new NewCarsPage(driver);
	}
	
	public void searchCars()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/input")).sendKeys("Jeep");
		
	}
	
	public void goToPopularCars()
	{
		
	}
}
