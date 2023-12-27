package pages.util_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class RegisterSuccessPage extends MenusPage{

	public RegisterSuccessPage(MainPageManager pages) {
		super(pages);
	}
	
	private final static String SUCCESS_MESSAGE = "Your registration completed";
	//private String rgisterSuccess=".result";
	
	public RegisterSuccessPage ensurePageLoaded(){
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".result"))));
		return this;
	}
	
	public RegisterSuccessPage verifyWelcomeText () {
		log.info("Verify home text is " + SUCCESS_MESSAGE);
		String actualMessage = driver.findElement(By.cssSelector(".result")).getText();
		Assert.assertTrue(actualMessage.equals(SUCCESS_MESSAGE),
		"Expected value: '" + SUCCESS_MESSAGE + "', but actual is '" + actualMessage + "'");
		return this;
		}
	
	public HomePage clickContinueButton(){
		log.info("Click Continue link");
		driver.findElement(By.linkText("CONTINUE")).click();
		return pages.homePage.ensurePageLoaded();
	}


}
