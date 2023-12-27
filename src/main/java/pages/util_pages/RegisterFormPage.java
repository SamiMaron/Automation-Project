package pages.util_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class RegisterFormPage extends MenusPage {

	public RegisterFormPage(MainPageManager pages) {
		super(pages);
	}
	
	public RegisterFormPage ensurePageLoaded(){
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.presenceOfElementLocated(By.id("register-button")));
		return this;
	}
	
	public RegisterFormPage clickMale(){
		log.info("Select male");
		driver.findElement(By.id("gender-male")).click();
		return this;
	}
	
	public RegisterFormPage writeFirstName(String firstName ){
		log.info("Enter first name" + firstName);
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		return this;
	}
	
	public RegisterFormPage setLastName(String lastName){
		log.info("Enter last" + lastName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		return this;
	}
	
	public RegisterFormPage selectBirthDay(String dayOfBirth){
		log.info("type day" + dayOfBirth);
		Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		day.selectByVisibleText(dayOfBirth);
		return this;
	}
	
	public RegisterFormPage selectBirthMonth(String monthOfBirth){
		log.info("type month" + monthOfBirth);
		Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		month.selectByVisibleText(monthOfBirth);
		return this;
	}
	
	public RegisterFormPage selectBirthYear(String yearOfBirth){
		log.info("type year" + yearOfBirth);
		Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByVisibleText(yearOfBirth);
		return this;
	}
	
	public RegisterFormPage setEmail(String email){
		log.info("Enter mail" + email);
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterFormPage setPassword(String password){
		log.info("Enter Password" + password);
		driver.findElement(By.id("Password")).sendKeys(password);
		return this;
	}
	
	public RegisterFormPage setPasswordConfirm(String passConfirm){
		log.info("Enter confirm Password" + passConfirm);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(passConfirm);
		return this;
	}
	
	public RegisterSuccessPage clickRegisterButton(){
		log.info("Click Register link");
		driver.findElement(By.id("register-button")).click();
		return pages.registerSuccessPage.ensurePageLoaded();
	}

}

