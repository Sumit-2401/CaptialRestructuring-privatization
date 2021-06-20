package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class LoginPage {
	WebDriver driver;
	
@FindBy(xpath="//*[@id='userid']") private WebElement userid;	

@FindBy(xpath="//*[@id='password']") private WebElement password;	

@FindBy(xpath="//*[@class='button-orange wide']") private WebElement login;	

@FindBy(xpath="//*[@id='pin']") private WebElement pin;

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void loginToApp() {
	userid.sendKeys("DV1510");
	password.sendKeys("Reset@123");
	login.click();
}
 	public void enterpin() {
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		pin.sendKeys("959594");
 		login.click();
 	}

 }










