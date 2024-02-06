package Datamatics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datamatics.Abstractcomponents.Abstractcomponents;

public class Grievancenumber extends  Abstractcomponents{
	WebDriver driver;
	public Grievancenumber(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	///Finaldialogbox	
		@FindBy(xpath="(//div[@id='formId:dialogVerificationDone'])[1]")
		WebElement FinalDailogbox;
	///Gettext	
		@FindBy(css="body > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1)")
		WebElement GetgrivanceNumber;
		
	///Click ok
		@FindBy(xpath="(//span[normalize-space()='Ok'])[1]")
		WebElement Okbutton2;
		
		
		public Object getgrievancenumber() throws InterruptedException {
			waitForwebElementToAppear(FinalDailogbox);			
			 return GetgrivanceNumber.getText().trim();
			 
		}
			
		public void clickok() {
			Okbutton2.click();
		}
			
}

