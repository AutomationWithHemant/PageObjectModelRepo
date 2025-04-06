package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSCrollBar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Slider.html");
		//driver.manage().window().maximize();
		WebElement elmeent = driver.findElement(By.id("slider"));
		Actions ac = new Actions(driver);
		ac.moveByOffset(100, 0);
	}
}
