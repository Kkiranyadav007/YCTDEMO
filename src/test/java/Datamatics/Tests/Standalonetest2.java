package Datamatics.Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Datamatics.Grievancenumber;
import Datamatics.Homepage;
import Datamatics.Searchforvoucherbeneficiarypage;
import Datamatics.SubmitGrievancepage;
import Datamatics.YCTMISLoginpage;
import Datamatics.Testcomponents.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalonetest2 extends Basetest {
	
	
	@Test
public void Submitgrievance() throws IOException, InterruptedException {
		Homepage home =	login.loginapplication("Kiran-Test","Test@12345");
		Searchforvoucherbeneficiarypage Search=home.gotosubmitgrievance();
		SubmitGrievancepage submitpage=Search.searchforbeneficiary("045-258-128450");
		submitpage.submitgrievenaceforvoucherbeneficiary("West", "712345678");
		submitpage.selectFacility("وحدة القشري الصحية");
		submitpage.selectCategory("Gender issues");
		submitpage.selectgrievanceagainst("Local leaders");
		submitpage.selectchannel("Call Centre", "Test");
		Grievancenumber grievance=new Grievancenumber(driver);
		grievance.getgrievancenumber();
		grievance.clickok();
			
}
	
	
	
	
	
}
