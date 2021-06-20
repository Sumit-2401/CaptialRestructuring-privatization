package testcase;

import org.testng.annotations.Test;

public class DashboardTest extends BaseClass {

	@Test(priority = 3)
	public void invest() {
		db.startinves();
	}
	
	@Test(priority = 4)
	public void searchStock() {
		db.search();
	}
	@Test(priority = 5)
	public void stockBuy() {
		db.buy();
		db.quantity();
	}

}