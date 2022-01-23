package page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.testng.Assert;

public class DashboardPage extends BasePage{
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
@FindBy(how=How.XPATH,using="//h2[contains(text(),' Dashboard ')]")WebElement DashBoard_Header_Field;
@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
WebElement Customer;
@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
WebElement ADD_Customer_Button;


public void validateDashboardHeader() {
	
	waitForElement(driver, 5,DashBoard_Header_Field );
	
	Assert.assertEquals(DashBoard_Header_Field.getText(), "Dashboard","Dashboard Page not found");
}
public void clickOnCustomerButton() {
	Customer.click();
}

public void clickOnaddCustomerButton() {
waitForElement(driver, 3,ADD_Customer_Button);
ADD_Customer_Button.click();

}

}
