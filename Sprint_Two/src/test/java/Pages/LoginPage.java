package Pages;
//import org.openqa.selenium.By;

//import org.openqa.selenium.support.PageFactory;

import Locators.locators;
import browser.Browser;
//import java.sql.Driver;





public class LoginPage{
	
		
		
		public static void lpage(String url) {
			//Browser.driver.get(prop.getProperty("url"));
			Browser.gotourl(url);
			 locators.username().sendKeys("Admin");
				locators.password().sendKeys("admin123");
			    locators.loginbtn().click();
		}
		
		public static void cpage(String url) {
			//Browser.driver.get(prop.getProperty("url"));
			Browser.gotourl(url);
			 locators.username().sendKeys("Admin");
				locators.password().sendKeys("admin123");
			   // locators.loginbtn().click();
		}
		
		public static String geturl() {
		 String curl = locators.geturl();
		    return curl;
		}
	}

