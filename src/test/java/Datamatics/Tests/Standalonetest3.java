package Datamatics.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Datamatics.Grievancenumber;
import Datamatics.Homepage;
import Datamatics.Searchforvoucherbeneficiarypage;
import Datamatics.SubmitGrievancepage;
import Datamatics.YCTMISLoginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalonetest3 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		YCTMISLoginpage login =new YCTMISLoginpage(driver);
		login.Goto();
		login.loginapplication("Kiran001","Test@1234");
		Homepage home =new Homepage(driver);
		home.gotosubmitgrievance();
		Searchforvoucherbeneficiarypage Search=new Searchforvoucherbeneficiarypage(driver);
		Search.searchforbeneficiary("045-258-128450");
		SubmitGrievancepage submitpage= new SubmitGrievancepage(driver);
		submitpage.submitgrievenaceforvoucherbeneficiary("West", "712345678");
		submitpage.selectFacility("وحدة محل حنينة الصحية");
		submitpage.selectCategory("Gender issues");
		submitpage.selectgrievanceagainst("Local leaders");
		submitpage.selectchannel("Call Centre", "Test");
		Grievancenumber grievance=new Grievancenumber(driver);
		grievance.getgrievancenumber();
		grievance.clickok();
		
		
		
}
}
