package org.project;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.page.CreatePage;
import org.page.ForgotPage;
import org.page.LoginPage;
import org.page.NewAccount;
import org.page.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB extends BaseClass{
	PageManager manager = new PageManager();
	
	@When("user enter the username and password using 1D datatable with heading")
	public void user_enter_the_username_and_password_using_1d_datatable_with_heading(io.cucumber.datatable.DataTable dataTable) {
	    LoginPage log = manager.getloginPage();
	    Map<String, String> asMap = dataTable.asMap();
	    highlight(log.getUserName());
	    highlight(log.getPass());
	    log.getUserName().sendKeys(asMap.get("username"));
	    log.getPass().sendKeys(asMap.get("password"));
	}
	@When("click login button")
	public void click_login_button() {
		LoginPage log = manager.getloginPage();
		clickIt(log.getButton());
	}
	@When("navigate back to previous url")
	public void navigate_back_to_previous_url() {
	    navigateBack();
	}
	
	@When("click the forgotButton")
	public void click_the_forgot_button() {
	   ForgotPage forgot = manager.getForgetPage();
	   clickIt(forgot.getForgotButton());
	}


	@When("click the create page button")
	public void click_the_create_page_button() {
	    CreatePage page = manager.getCreatePage();
	    clickIt(page.getPage());
	}
	@When("choose the community")
	public void choose_the_community() {
		CreatePage page = manager.getCreatePage();
		clickIt(page.getCommunity());
	}
	@Then("back to login page")
	public void back_to_login_page() {
		navigateBack();
	}


	@When("click the create new account button using")
	public void click_the_create_new_account_button_using() {
	   NewAccount acc = manager.getAccount();
	   clickIt(acc.getNewAccButton());
	}
	@Then("user enter the firstname and surname using 2D datatable with heading")
	public void user_enter_the_firstname_and_surname_using_2d_datatable_with_heading(io.cucumber.datatable.DataTable dataTable) {
		NewAccount acc = manager.getAccount();
		List<Map<String,String>> asMaps = dataTable.asMaps();
		acc.getFirstName().sendKeys(asMaps.get(0).get("firstname"));
		acc.getSurName().sendKeys(asMaps.get(0).get("surname"));
	}
	@Then("user enter the email and password using 2D datatable")
	public void user_enter_the_email_and_password_using_2d_datatable(io.cucumber.datatable.DataTable dataTable) {
		NewAccount acc = manager.getAccount();
		List<List<String>> asLists = dataTable.asLists();
		acc.getEmail().sendKeys(asLists.get(0).get(0));
		acc.getReEmail().sendKeys(asLists.get(0).get(0));
		acc.getPass().sendKeys(asLists.get(0).get(1));
	}
	@Then("user enter the DOB and select gender")
	public void user_enter_the_dob_and_select_gender() {
		NewAccount acc = manager.getAccount();
		dropSelectingByText(acc.getDate(), "6");
		dropSelectingByText(acc.getMonth(),"May");
		dropSelectingByText(acc.getyear(), "1996");
		clickIt(acc.getGender());
		clickIt(acc.getSignup());
	}








	




}
