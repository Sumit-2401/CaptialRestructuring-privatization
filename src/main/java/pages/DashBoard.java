package pages;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;
	
	@FindBy(xpath="(//*[@class='button-blue'])[1]") private WebElement startInvesting;
	
	@FindBy(xpath="(//*[@id='search-input'])[2]") private WebElement searchStock;
	
	@FindBy(xpath="(//*[@type='button'])[4]") private WebElement buyStock;
	
	@FindBy(xpath="//*[@type='number']")private WebElement stockQuantity;


	public DashBoard(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void startinves() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		startInvesting.click();
	}
	public void search() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		searchStock.sendKeys("INFY JUN FUT");
		Actions act = new Actions(driver);
		act.sendKeys(searchStock,Keys.ENTER).perform();
	}
	public void buy() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		buyStock.click();
	}
	public void quantity() {
		stockQuantity.sendKeys("10");
	}
}
