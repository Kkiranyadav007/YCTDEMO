package Datamatics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Datamatics.Abstractcomponents.Abstractcomponents;

public class SubmitGrievancepage extends  Abstractcomponents{
	WebDriver driver;
	public SubmitGrievancepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@id='formId:componentGrievance:componentBenDetailsGeolocation:j_idt138'])[1]")
	WebElement Geolocation;
	
	@FindBy(xpath="(//input[@id='formId:componentGrievance:beneficiaryMobileNumbersComponent:cellPhoneNumber'])[1]")
	WebElement cellPhoneNumber;
///	Facility
	@FindBy(xpath="(//label[@id='formId:componentGrievance:componentGrievanceDetailsGeolocation:j_idt201_label'])[1]")
	WebElement Facilitydropdown;
	
	@FindBy(xpath="(//input[@id='formId:componentGrievance:componentGrievanceDetailsGeolocation:j_idt201_filter'])[1]")
	WebElement Facility;
	
	@FindBy(xpath="(//div[@id='formId:componentGrievance:componentGrievanceDetailsGeolocation:j_idt201_panel'])[1]")
	WebElement results;
	
	@FindBy(xpath="(//li[@id='formId:componentGrievance:componentGrievanceDetailsGeolocation:j_idt201_1'])[1]")
	WebElement Selectfacility;
	
///Category
	@FindBy(xpath="(//label[@id='formId:componentGrievance:j_idt225_label'])[1]")
	WebElement Categorydropdown;
	
	
	@FindBy(xpath="(//input[@id='formId:componentGrievance:j_idt225_filter'])[1]")
	WebElement Category;
	
	@FindBy(xpath="(//div[@id='formId:componentGrievance:j_idt225_panel'])[1]")
	WebElement Resultspanel;
	
	@FindBy(xpath="(//li[@id='formId:componentGrievance:j_idt225_1'])[1]")
	WebElement SelectCategory;
	
	@FindBy(xpath="(//tbody)[4]")
	WebElement SubCategorypanel;
	
	@FindBy(xpath="(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c'])[1]")
	WebElement SelectSubCategory;
	
///Grievanceagainst
	@FindBy(xpath="(//label[@id='formId:componentGrievance:grievanceAgainst_label'])[1]")
	WebElement Grievanceagianstdropdown;
	
	@FindBy(xpath="(//input[@id='formId:componentGrievance:grievanceAgainst_filter'])[1]")
	WebElement Grievanceagianst;
	
	@FindBy(xpath="(//div[@id='formId:componentGrievance:grievanceAgainst_panel'])[1]")
	WebElement Grievanceagianstpanel;
	
	@FindBy(xpath="(//li[@id='formId:componentGrievance:grievanceAgainst_1'])[1]")
	WebElement selectGrievanceagianst;
	
///Channel	
	@FindBy(xpath="(//label[@id='formId:componentGrievance:grievanceChannel_label'])[1]")
	WebElement Channeldropdown;
	
	@FindBy(xpath="(//input[@id='formId:componentGrievance:grievanceChannel_filter'])[1]")
	WebElement Channel;
	
	@FindBy(xpath="(//div[@id='formId:componentGrievance:grievanceChannel_panel'])[1]")
	WebElement Channelpannel;
	
	@FindBy(xpath="(//li[@id='formId:componentGrievance:grievanceChannel_1'])[1]")
	WebElement SelectChannel;
	
//Observations & specifications
	
	@FindBy(xpath="(//textarea[@id='formId:componentGrievance:j_idt267'])[1]")
	WebElement Observations;
//savebutton	
	@FindBy(xpath="(//span[normalize-space()='Save'])[1]")
	WebElement Savebutton;
//Alertpopup
	By Alertpopup=By.xpath("(//div[@id='formId:confirmExistingDialog'])[1]");
	
@FindBy(xpath="(//button[@id='formId:saveNoButtonExistingGrievance'])[1]")
    WebElement closeAlertpopup;
	
//Dialogbox	
	@FindBy(xpath="(//div[@id='formId:confirmSaveDialog'])[1]")
    WebElement Dailogbox;
	
	
//ok button
	@FindBy(xpath="(//button[@id='formId:closeSaveYesButton'])[1]")
	WebElement Okbutton;
	
	
	public void submitgrievenaceforvoucherbeneficiary(String Direction,String Number) {
		Geolocation.sendKeys(Direction);
		cellPhoneNumber.sendKeys(Number);
	}
		
		public void selectFacility(String Facilityname) throws InterruptedException {
			Facilitydropdown.click();
			waitForwebElementToAppear(results);
			Actions a =new Actions(driver);
			a.sendKeys(Facility, Facilityname).build().perform();
			waitForwebElementToAppear(results);
			Selectfacility.click();
			}
	
		public void selectCategory(String Categoryname) throws InterruptedException {
			Categorydropdown.click();
			waitForwebElementToAppear(Resultspanel);
			Actions a =new Actions(driver);
			a.sendKeys(Category, Categoryname).build().perform();
			waitForwebElementToAppear(Resultspanel);
			SelectCategory.click();
			waitForwebElementToAppear(SubCategorypanel);
			SelectSubCategory.click();
		}
		
		public void selectgrievanceagainst(String grievanceagainstname) throws InterruptedException {
			Grievanceagianstdropdown.click();
			waitForwebElementToAppear(Grievanceagianstpanel);
			Actions a =new Actions(driver);
			a.sendKeys(Grievanceagianst, grievanceagainstname).build().perform();
			waitForwebElementToAppear(Grievanceagianstpanel);
			selectGrievanceagianst.click();
			
		}
		public void selectchannel(String ChannelName,String Observationss) throws InterruptedException {
			Channeldropdown.click();
			waitForwebElementToAppear(Channelpannel);
			Actions a =new Actions(driver);
			a.sendKeys(Channel, ChannelName).build().perform();
			waitForwebElementToAppear(Channelpannel);
			SelectChannel.click();
			Observations.sendKeys(Observationss);
			Savebutton.click();
			waitForElementToAppear(Alertpopup);
			closeAlertpopup.click();
		   waitForwebElementToAppear(Dailogbox);
			Okbutton.click();
		}
			
			
				
			}
			
		

