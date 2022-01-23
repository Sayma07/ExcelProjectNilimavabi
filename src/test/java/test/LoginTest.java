package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.loginpage;
import util.Browserfactory;
import util.ExcelReader;

public class LoginTest {
WebDriver driver;

ExcelReader exlread=new ExcelReader("src\\main\\java\\data\\data.xlsx");

String username=exlread.getCellData("LogInInfo", "UserName", 2);
String password=exlread.getCellData("LogInInfo", "Password", 2);
@Test
public void validUserShouldBeAbleToLogin() {
	driver=Browserfactory.init();
	
	loginpage logInPage=PageFactory.initElements(driver, loginpage.class);
	
	logInPage.insertUserName(username);
	logInPage.insertPassword(password);
	logInPage.clickOnSignInButton();

	DashboardPage dashboard= PageFactory.initElements(driver, DashboardPage.class);

	dashboard.validateDashboardHeader();
	Browserfactory.tearDown();
}	
	
	
	
}
