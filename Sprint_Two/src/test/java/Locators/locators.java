package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import browser.Browser;

public class locators extends Browser{
	
	public static WebElement username() {
		
		WebElement uname =  driver.findElement(By.name("txtUsername"));
		return uname;
	}
	public static WebElement password() {
		
		WebElement passw =  driver.findElement(By.name("txtPassword"));
		return passw;
	}
	public static WebElement loginbtn() {
		
		WebElement loginbtn =  driver.findElement(By.id("btnLogin"));
		return loginbtn;
	}
	public static String geturl() {
		
		String url =  driver.getCurrentUrl();
		return url;
	}

	public static WebElement adminEl() {
	    WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		return admin;
	}

	public static WebElement inputUsrn() {
		WebElement inputtxt =  driver.findElement(By.id("searchSystemUser_userName"));
		return inputtxt;
	}
	public static WebElement searchbtn() {
		WebElement  search  = driver.findElement(By.id("searchBtn"));
		return search; 
	}
	public static WebElement resetbtn() {
		WebElement reset   = driver.findElement(By.id("resetBtn"));
		return reset;
	}
	
	
	public static WebElement addbtn() {
		WebElement addur   = driver.findElement(By.id("btnAdd"));
		return addur;
	}
	public static WebElement urole() {
		WebElement addur = driver.findElement(By.xpath("//input[@id='systemUser_userType']"));
		
		//WebElement addur   = driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]"));
				
		return addur;
	}
	public static WebElement empname() {
		WebElement addenm   = driver.findElement(By.id("systemUser_employeeName_empName"));
		return addenm;
	}
	public static WebElement eusername() {
		WebElement addus   = driver.findElement(By.id("systemUser_userName"));
		return addus;
	}
	public static void status() {
		Select addst   = new Select(driver.findElement(By.id("systemUser_status")));
		addst.selectByValue("1");
		
	}
	public static WebElement addpassword() {
		WebElement addp   = driver.findElement(By.id("systemUser_password"));
		return addp;
	}
	
	public static WebElement addcpassword() {
		WebElement addcp   = driver.findElement(By.id("systemUser_confirmPassword"));
		return addcp;
	}
	
	public static WebElement addsvbtn() {
		WebElement adsave    = driver.findElement(By.className("addbutton"));
		return adsave;
	}
	
	public static WebElement selrec() {
		WebElement srec   = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_17']"));
		return srec;
	}//*[@id="ohrmList_chkSelectRecord_39"]
		
	
	public static WebElement deletebtn() {
		WebElement delete    = driver.findElement(By.id("btnDelete"));
		return delete;
	}
	
	public static WebElement okbtn() {
		WebElement ok   = driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']"));
		return ok;
	}
//	
	//editrec
	public static WebElement selrec1() {
		WebElement srec1   = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[6]/td[2]/a"));
		return srec1;
	}
		
	public static WebElement editbtn(){
		WebElement edit   = driver.findElement(By.xpath("//input[@id='btnSave']"));
		return edit;//*[@id="btnSave"]
	}
	public static WebElement editurole() {
		Select eur = new Select(driver.findElement(By.id("systemUser_userType")));
		eur.selectByValue("1");
		//WebElement addur   = driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]"));
				
		return editurole();
	}
	public static WebElement editempname() {
		WebElement editenm   = driver.findElement(By.id("systemUser_employeeName_empName"));
		return editenm ;
	}
	public static WebElement editeus() {
		WebElement editus   = driver.findElement(By.id("systemUser_userName"));
		return editus;
	}
	public static void editstatus() {
		Select editst   = new Select(driver.findElement(By.id("systemUser_status")));
		editst.selectByValue("1");
		
	}
	public static WebElement changepass() {
		WebElement passcheck =  driver.findElement(By.id("systemUser_chkChangePassword"));
		return passcheck;
	}
	public static WebElement epassword() {
		WebElement pass =  driver.findElement(By.id("systemUser_password"));
		return pass;
	}
	public static WebElement econfirmpass() {
		WebElement cpass =  driver.findElement(By.id("systemUser_confirmPassword"));
		return cpass;
	}
	public static WebElement savereport() {
		WebElement savebtn =  driver.findElement(By.id("btnSave"));
		return savebtn;
	}
	
	
//	public static WebElement NewReportname() {
//		WebElement newreporttxt =  driver.findElement(By.id("report_report_name"));
//		return newreporttxt;
//	}
	
	public static WebElement cancelbtn() {
		WebElement cnclbtn =  driver.findElement(By.id("btnCancel"));
		return cnclbtn;
	}
	
	
	
}
