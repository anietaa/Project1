package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageMercuryTours {
	WebDriver driver;
	//constructor
	public HomePageMercuryTours(WebDriver driver) {
		this.driver = driver;
	}
	
	By sign_on = By.linkText("SIGN-ON");
	By register = By.linkText("REGISTER");
	
	
	public void clickOnSigninLink() {
		driver.findElement(sign_on).click();
	}
	
	public void clickOnRegister() {
		driver.findElement(register).click();
	}
	
	

}
