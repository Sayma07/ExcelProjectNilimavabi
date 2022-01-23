package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.loginpage;
import util.Browserfactory;
import util.ExcelReader;

public class AddCustomerTest {
WebDriver driver;

ExcelReader exlread=new ExcelReader("src\\main\\java\\data\\data.xlsx");

String username=exlread.getCellData("LogInInfo", "UserName", 2);
String password=exlread.getCellData("LogInInfo", "Password", 2);
String fullName=exlread.getCellData("AddContactinfo", "FullName", 2);
String companyName=exlread.getCellData("AddContactinfo", "CompanyName", 2);
String email=exlread.getCellData("AddContactinfo", "Email", 2);
String phone=exlread.getCellData("AddContactinfo", "Phone", 2);
String address=exlread.getCellData("AddContactinfo", "Address", 2);
String city=exlread.getCellData("AddContactinfo", "City", 2);
String country=exlread.getCellData("AddContactinfo", "Country", 2);
String state=exlread.getCellData("AddContactinfo", "State", 2);
String zip=exlread.getCellData("AddContactinfo", "Zip", 2);



@Test
public void validUserShouldBeAbleToAddCustomer() throws InterruptedException {
	driver=Browserfactory.init();
	loginpage logInPage=PageFactory.initElements(driver, loginpage.class);
	logInPage.insertUserName(username);
	logInPage.insertPassword(password);
	logInPage.clickOnSignInButton();
	DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validateDashboardHeader();
	dashboardpage.clickOnCustomerButton();
	dashboardpage.clickOnaddCustomerButton();
	
	AddCustomerPage addcustomerpage=PageFactory.initElements(driver, AddCustomerPage.class);
	addcustomerpage.insertfullName(fullName);
    addcustomerpage.insertCompanyNmae(companyName);
    addcustomerpage.insertEmailAddress(email);
    addcustomerpage.insertphoneNumber(phone);
    addcustomerpage.insertaddress(address);
    addcustomerpage.insertcityName(city);
    addcustomerpage.insertstateName(state);
    //addcustomerpage.insertCountryNmae(country);
    addcustomerpage.clicksaveButton();
    //Thread.sleep(5000);
    addcustomerpage.clickOnListCustomerButton();
    addcustomerpage.verifyEnterName();
}





}
