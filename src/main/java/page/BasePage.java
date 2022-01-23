package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void waitForElement(WebDriver driver, int timeInSecond, WebElement elementLocator) {
		WebDriverWait wait =new WebDriverWait(driver, timeInSecond)	;
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
		}
	
	public int randomGenarator(int boundaryNumber) {
		Random rnd =new Random();
		int randomNumber=rnd.nextInt(boundaryNumber);
		return randomNumber;
	}
	
public void selectdropDown(WebElement element, String visibleText) {
		
		Select sel=new Select(element) ;
		sel.selectByVisibleText(visibleText);
	
	
	
}
}
