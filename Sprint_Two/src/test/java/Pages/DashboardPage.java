package Pages;

import org.openqa.selenium.WebElement;

import Locators.locators;

public class DashboardPage {
	public static void adminTab() {
		WebElement adminEl = locators.adminEl();
		adminEl.click();
		}
}
