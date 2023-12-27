package pages.util_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class HomePage extends MenusPage {
	
	public HomePage(MainPageManager pages) {
		super(pages);
		}
		private final static String WELCOME_MESSAGE = "Welcome to our store";
		private String home="topic-block-title";
		
		public HomePage ensurePageLoaded() {
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(home))));
		return this;
		
		}
		
		public HomePage verifyWelcomeText () {
			
		log.info("Verify home text is "+WELCOME_MESSAGE);
		String homeText = driver.findElement(By.className(home)).getText();
		Assert.assertTrue(homeText.equals(WELCOME_MESSAGE),
		"Expected value: '" + WELCOME_MESSAGE + "', but actual is '" + homeText + "'");
		
		return this;
		
		}


}
