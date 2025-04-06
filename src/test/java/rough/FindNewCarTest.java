package rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.NewCarsPage;
import pages.TataCarsPage;

public class FindNewCarTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		HomePage home = new HomePage(driver);
		NewCarsPage car = home.findNewCars();
		TataCarsPage tata = car.goToTata();
		tata.getCarTitle();
		
		//new HomePage(driver).findNewCars().goToTata().getCarTitle();
	}

}
