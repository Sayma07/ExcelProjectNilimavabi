package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement Add_Contact_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='account'  ]")
	WebElement FULL_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement Company_Nmae_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement Email_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement Phone_NO_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement Address_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement City_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement State_Field_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement Zip_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]")
	WebElement Country_Locator;
	
	/*
	 * @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement
	 * Phone_Field_Locator;
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement Save_Button_Locator;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"summary\"]")
	WebElement Summery_Button;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement List_Customer_Button;

	
	String enterdedName;
	public void insertfullName(String fullName) {
		
		
		int genNum=randomGenarator(999);
		
		 enterdedName=fullName+genNum;
		
		
		FULL_NAME_LOCATOR.sendKeys(fullName+genNum);	//shorashori nam deya jabe na
	}

	public void insertCompanyNmae(String companyName) {
		selectdropDown(Company_Nmae_Locator,companyName);
	
	}

public void insertEmailAddress(String email) {
	
	int genNum=randomGenarator(999);	

	Email_Locator.sendKeys(email+genNum);
	
	}	
public void insertphoneNumber(String phone) {
	int genNum=randomGenarator(999);	
	Phone_NO_Locator.sendKeys(phone+genNum);
}
public void insertaddress(String Address) {
	Address_Locator.sendKeys(Address);

}
public void insertcityName(String city) {
	City_Locator.sendKeys(city);

}

public void insertstateName(String state) {
	State_Field_Locator.sendKeys(state);

}
public void insertCountryNmae(String countryname) {
	selectdropDown(Country_Locator,countryname);

}

public void clicksaveButton() {
	Save_Button_Locator.click();
waitForElement(driver,10,Summery_Button);
}

public void clickOnListCustomerButton() {
	List_Customer_Button.click();
}

//tbody/tr[1]/td[3]
	//t]body/tr[2]/td[3
	//t]body/tr[3]/td[3
//tbody/tr[1]/td[7]/a[2]
//tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]

public void verifyEnterName() {
	String before_xpath="//tbody/tr[";
	String after_xpath="]/td[3]";

	for(int i=1;i<=10;i++   ) {
String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			/*
			 * System.out.println(name); Assert.assertEquals(name, enterdedName,"Entered Name doesnot exist");
			 *  break;
			 */
	
if(name.contains(enterdedName)) {
	System.out.println("entered name exist");
	//driver.findElement(By.xpath("//tbody/tr["+i+"]/td[3]/following-sibling::td[4]/a[2]"));
	driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[2]")).click();;

}


}






	}
	
}





