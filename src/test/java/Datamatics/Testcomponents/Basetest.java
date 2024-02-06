package Datamatics.Testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Datamatics.YCTMISLoginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	public WebDriver driver;
	public YCTMISLoginpage login;
	
	
	public WebDriver initializedriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Datamatics\\resources\\GlobalData.properties");
		prop.load(fis);
String browsername= prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			
		}
		
       else if (browsername.equalsIgnoreCase("firefox")) {
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}

	@BeforeMethod
	public YCTMISLoginpage launchapplication() throws IOException {
		
		driver= initializedriver();
	    login =new YCTMISLoginpage(driver);
		login.Goto();
		return login;
	}
	@AfterMethod
	public void closedriver() {
		
		driver.close();
	}
}
