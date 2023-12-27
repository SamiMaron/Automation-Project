package tests.basic;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

import tests.supers.TestBase;
import util.GenUtils;

public class OldCodeTest extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			driver.get("https://demo.nopcommerce.com/");

			log.info("Click Register link");
			driver.findElement(By.linkText("Register")).click();

			log.info("Select male");
			driver.findElement(By.id("gender-male")).click();

			log.info("Enter first name Sami");
			driver.findElement(By.id("FirstName")).sendKeys("Sami");
			
			log.info("Enter last name Maron");
			driver.findElement(By.id("LastName")).sendKeys("Maron");
			
			log.info("type day 15");
			Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
			day.selectByVisibleText("15");
			
			log.info("type month October");
			Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
			month.selectByVisibleText("October");
			
			log.info("type year 2000");
			Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
			year.selectByVisibleText("2000");
			
			log.info("Enter mail samima@edu.hac.ac.il");
			driver.findElement(By.id("Email")).sendKeys("samima@edu.hac.ac.il");
			
			log.info("Enter Password sami1234");
			driver.findElement(By.id("Password")).sendKeys("sami1234");
			
			log.info("Enter confirm Password sami1234");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("sami1234");
			
			log.info("Click Register link");
			driver.findElement(By.id("register-button")).click();
			
			
			final String SUCCESS_MESSAGE = "Your registration completed";
			log.info("Verify message: " + SUCCESS_MESSAGE);
			String actualTextRegistration =
			driver.findElement(By.cssSelector(".result")).getText();
			Assert.assertTrue(actualTextRegistration.equals(SUCCESS_MESSAGE),
					"Expected value: '" + SUCCESS_MESSAGE + "', but actual is '" +
					actualTextRegistration + "'");
			
			log.info("Click Continue link");
			driver.findElement(By.linkText("CONTINUE")).click();
			 
			final String HOME_PAGE = "Welcome to our store";
			log.info("Verify message: " + HOME_PAGE);
			String homeText =
			driver.findElement(By.className("topic-block-title")).getText();
			Assert.assertTrue(homeText.equals(HOME_PAGE),
					"Expected value: '" + HOME_PAGE + "', but actual is '" +
					homeText + "'");
			
			

			GenUtils.sleepMillis(2000);

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
