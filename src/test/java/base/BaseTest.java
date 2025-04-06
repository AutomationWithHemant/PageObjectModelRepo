package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelReader;

public class BaseTest {

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader("./src/test/resources/excel/TestDataSheet.xlsx", 0);
	public Properties OR = new Properties();
	public Properties config = new Properties();
	private FileInputStream fis;
	private Logger log = Logger.getLogger(BaseTest.class);
	private WebDriverWait wait;
	
	public void setUp()
	{
		PropertyConfigurator.configure("./src/test/resources/OR.properties");
		log.info("Test case started!!");
		
	}
}

