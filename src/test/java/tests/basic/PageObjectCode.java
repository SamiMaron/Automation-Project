package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import tests.supers.TestBase;
import util.GenUtils;



public class PageObjectCode extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			driver.get("https://demo.nopcommerce.com/");
			
			app.pages().menusPage.clickRegister().clickMale().writeFirstName("Sami").setLastName("Maron")
			.selectBirthDay("15").selectBirthMonth("October").selectBirthYear("2000").setEmail("sami1@gmail.com")
			.setPassword("sami1234").setPasswordConfirm("sami1234").clickRegisterButton().verifyWelcomeText()
			.clickContinueButton().verifyWelcomeText();
			
			

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
