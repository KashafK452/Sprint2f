package Pages;

import org.openqa.selenium.WebElement;
import Locators.locators;

public class AdminTabPg {
	public static void Admin() {
		WebElement adminbtn = locators.adminEl();
		adminbtn.click();
		
	}
public static void inputUserName(String name) {
	WebElement inputtxt = locators.inputUsrn();
	inputtxt.sendKeys(name);
}
public static void searchrecord() {
	WebElement srchbtn = locators.searchbtn();
	srchbtn.click();
}
public static void resetrecord() {
	WebElement rstbtn = locators.resetbtn();
	rstbtn.click();
	
}
public static void addrecord() {
	WebElement addbtnn = locators.addbtn();
	addbtnn.click();
}
public static void addrecord2() {
	
	locators.empname().sendKeys("Kashaf");
	locators.eusername().sendKeys("Kashafk452");
	//locators.status();
	locators.addpassword().sendKeys("12345@");
	locators.addcpassword().sendKeys("12345@");
	//locators.addsvbtn().click();

		
}



public static void deleterecord() {
	locators.selrec().click();
	WebElement delbtn = locators.deletebtn();
	delbtn.click();
	//locators.okbtn().click();
}



public static void seltoedit() {
	locators.selrec1().click();
	WebElement editbtn = locators.editbtn();
	editbtn.click();
}
public static void editrecord() {
	
	//locators.editurole();
	locators.editempname().sendKeys("Dominic C");
	locators.editeus().sendKeys("Arvindd");
	//locators.editstatus();
	locators.changepass().click();
	locators.epassword().sendKeys("56789@");
	locators.econfirmpass().sendKeys("56789@");
	locators.savereport().click();
	
	
}

}
