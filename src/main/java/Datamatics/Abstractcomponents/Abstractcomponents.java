package Datamatics.Abstractcomponents;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Abstractcomponents {
	
	 WebDriver driver;
	public Abstractcomponents(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementToAppear(By findBy) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	
	public void waitForwebElementToAppear(WebElement ele) throws InterruptedException {
		Thread.sleep(3000);
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	
	
	public void waitForElementToDisapper(WebElement Ele) throws InterruptedException {
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.invisibilityOf(Ele));
	}
	

	
}
