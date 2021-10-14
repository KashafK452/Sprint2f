package com.stepdefinition.sprinttwo;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_StepDef6 {

	

	@Given("user is logged in and directed to admin tab")
	public void user_is_logged_in_and_directed_to_admin_tab() {
		LoginPage.lpage(ReadData.config("url"));
		DashboardPage.adminTab();
		AdminTabPg.Admin();
		System.out.println("User is on admin tab");
		   
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on a record to edit")
	public void user_clicks_on_a_record_to_edit() {
		AdminTabPg.seltoedit();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("user enters updated info")
	public void user_enters_updated_info() {
		AdminTabPg.editrecord();
	    System.out.println("Defect! found");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("user is able to see updated record")
	public void user_is_able_to_see_updated_record() {
		
		System.out.println("No record updated");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}





}
