package Datamatics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datamatics.Abstractcomponents.Abstractcomponents;

public class Searchforvoucherbeneficiarypage extends  Abstractcomponents{
	WebDriver driver;
	public Searchforvoucherbeneficiarypage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@id='viewBeneficiaryForm:searchComponent:tabView:j_idt69'])[1]")
	WebElement SearchbyVCA;
	
	@FindBy(css="button[id='viewBeneficiaryForm:searchComponent:tabView:j_idt80'] span[class='ui-button-text ui-c']")
	WebElement SearchbUTTON;
	
	@FindBy(xpath="(//tr[@class='ui-widget-content ui-datatable-even ui-datatable-selectable'])[1]")
	WebElement SearchOPTION;
	
	@FindBy(xpath="(//button[@id='j_idt224'])[1]")
	WebElement Grievance;
	
	public SubmitGrievancepage searchforbeneficiary(String VCA) {
		SearchbyVCA.sendKeys(VCA);
		SearchbUTTON.click();
		SearchOPTION.click();
		Grievance.click();
		SubmitGrievancepage submitpage= new SubmitGrievancepage(driver);
		return submitpage;
	}
}
