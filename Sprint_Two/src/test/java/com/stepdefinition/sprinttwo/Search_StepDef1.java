package com.stepdefinition.sprinttwo;

import org.openqa.selenium.By;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
import browser.Browser;
import excel.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDef1 extends Browser {
	String user_name =ReadData.readExcel(0, 1);
	//String designation = ReadData.readExcel(1, 1);

	@Given("User has already logged in and navigates to admin tab")
	public void user_has_already_logged_in_and_navigates_to_admin_tab() {
		try {
			String url =ReadData.config("url"); // config_properties
			 // login page
			String login_btn = ReadData.config("Login_button");
			LoginPage.cpage(url); 
			driver.findElement(By.id(login_btn)).click();
			
			DashboardPage.adminTab();
			  
			System.out.println("User logged in");  
	      	}
		catch (Exception e) {
			System.out.println("error in Given method");
		}
		// Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	}
	@When("user enters employee info and clicks on search")
	public void user_enters_employee_info() {
		try {
			//System.out.println(locators.geturl());
			AdminTabPg.Admin();
			AdminTabPg.inputUserName(user_name);
			AdminTabPg.searchrecord();
			System.out.println("Record searched");
		}
		catch (Exception e) {
			System.out.println("error in When ");
		}
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("user is able to see employee info")
	public void user_is_able_to_see_employee_info() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("Record found");
		driver.close();
	}








	
}
