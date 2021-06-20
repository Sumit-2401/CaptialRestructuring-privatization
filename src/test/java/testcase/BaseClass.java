package testcase;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;

import pages.LoginPage;

public class BaseClass {
	static WebDriver driver;
	LoginPage lp;
	DashBoard db;
	
	@BeforeSuite
	public void Browser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\software testing (manua,autol)\\chromedriver_win32\\chromedriver.exe");
		
     WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");  
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
	@BeforeClass
		public void creatObject() {
		lp=new LoginPage(driver);
		 db=new DashBoard(driver);
		 
	}
	
//	@AfterSuite
//	public void quitBrowser() {
//		
//	}

}

