package testcase;

import org.testng.annotations.Test;

import pages.LoginPage;



public class Logintest extends BaseClass{

	@Test(priority = 1)
	public void loginWithValidcre() {
		
		lp.loginToApp();
		
	}
	@Test(priority = 2)
	public void actualLogin() {
		lp.enterpin();
	}
}


