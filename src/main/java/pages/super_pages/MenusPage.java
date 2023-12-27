package pages.super_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages._pages_mngt.MainPageManager;
import pages.util_pages.RegisterFormPage;

public class MenusPage extends AnyPage{

	public MenusPage(MainPageManager pages) {
		super(pages);
	}
	
	public MenusPage ensurePageLoaded(){
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
		return this;
	}
	
	public RegisterFormPage clickRegister() {
		log.info("Click Register link");
		driver.findElement(By.linkText("Register")).click();
		return pages.registerFormPage.ensurePageLoaded();
		}


}
