package com.stepdefinition.sprinttwo;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
import excel.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Del_StepDef4 {

	

	@Given("User is logged in and navigates to admin tab")
	public void user_is_logged_in_and_navigates_to_admin_tab() {
		LoginPage.lpage(ReadData.config("url"));
		DashboardPage.adminTab();
		AdminTabPg.Admin();
		System.out.println("User is on admin tab");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("user selects a record")
	public void user_selects_a_record() {
		AdminTabPg.deleterecord();
		System.out.println("Record deleted");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("user is able to delete a record from database")
	public void user_is_able_to_delete_a_record_from_database() {
		System.out.println("Deleted record not found in database");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}





}
