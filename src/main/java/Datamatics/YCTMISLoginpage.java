package Datamatics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datamatics.Abstractcomponents.Abstractcomponents;

public class YCTMISLoginpage extends  Abstractcomponents{

	WebDriver driver;
	
	public YCTMISLoginpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
    WebElement UserName;
		
	@FindBy(id="password")
	WebElement userPassword;
	
	@FindBy(css=".ui-button-text.ui-c")
	WebElement login;
	
	@FindBy(xpath="(//div[@class='ui-message ui-staticmessage ui-message-error ui-widget ui-corner-all'])[1]")
	WebElement ErrorMessage;
	
	@FindBy(xpath="(//div[@class='ui-message ui-staticmessage ui-message-error ui-widget ui-corner-all'])[1]")
	WebElement UsernameErrorMessage;
	
	@FindBy(xpath="//div[@class='ui-g']//div[1]//div[1]//div[1]//div[2]")
	WebElement selectradio;
	
	@FindBy(xpath="(//button[@id='continueBtn'])[1]")
	WebElement continuebutton;
	
	@FindBy(xpath="(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[2]")
	WebElement selectradio2;
	
	
	public  Homepage loginapplication(String email,String password) throws InterruptedException {
		UserName.sendKeys(email);
		userPassword.sendKeys(password);
		login.click();
		selectradio.click();
	waitForwebElementToAppear(continuebutton);
		continuebutton.click();
		selectradio2.click();
		waitForwebElementToAppear(continuebutton);
		continuebutton.click();
	Homepage home =new Homepage(driver);
		return home;
	}
		
			
	public void Goto() {
		driver.get("https://yct-dev.yumnn.org/web/login.xhtml");
	}

public String getVerifypasswordErrormessage() throws InterruptedException {
	waitForwebElementToAppear(ErrorMessage);
return ErrorMessage.getText();
	
}
public String getUsernameErrormessage() throws InterruptedException {
	waitForwebElementToAppear(UsernameErrorMessage);
return UsernameErrorMessage.getText();
}
}
