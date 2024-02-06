package Datamatics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datamatics.Abstractcomponents.Abstractcomponents;

public class Homepage extends  Abstractcomponents {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//i[@class='fa fa-comment']")
	WebElement Menu;
	@FindBy(xpath="//span[normalize-space()='Submit grievance for Voucher/Beneficiary']")
	WebElement subMenu;
	
	public Searchforvoucherbeneficiarypage gotosubmitgrievance() {
		
		Menu.click();
		subMenu.click();
		Searchforvoucherbeneficiarypage Search=new Searchforvoucherbeneficiarypage(driver);
		return Search;
	
		
	}
	

}
