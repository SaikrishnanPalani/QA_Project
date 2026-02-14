package com.stepDefinition;

import java.io.IOException;

import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriLoginPageStepDef extends Baseclass {

	@Given("User launch the Browser and the URL for Naukri Application")
	public void user_launch_the_browser_and_the_url_for_naukri_application() throws IOException {
		Browserlaunch(PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("browser"));
	}

	@When("User clicks the Log in button in the URL landed page")
	public void user_clicks_the_log_in_button_in_the_url_landed_page() throws IOException {
		Gettingurl(PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("url"));
	}

	@When("User enter the valid email id in the email id input field")
	public void user_enter_the_valid_email_id_in_the_email_id_input_field() throws IOException {
		PageObjectManager.getPageobjectmanager().getLoginpage().getUserName();
	}

	@When("User enter the Password in the password input field")
	public void user_enter_the_password_in_the_password_input_field() throws IOException {
		PageObjectManager.getPageobjectmanager().getLoginpage().getPassword();
	}
	@When("User click the Login Button in the Log in page")
	public void user_click_the_login_button_in_the_log_in_page() {
		PageObjectManager.getPageobjectmanager().getLoginpage().getLoginbtn();
	}

	@Then("User landed in the home page of Naukri Application")
	public void user_landed_in_the_home_page_of_naukri_application() {
		PageObjectManager.getPageobjectmanager().getLoginpage().getLoginNameValidation();
	}

	@When("User click View and update profile in the Naukri home page")
	public void user_click_view_and_update_profile_in_the_naukri_home_page() throws InterruptedException {
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getProfilepage();
	}

	@When("User click the edit option in the Profile update page")
	public void user_click_the_edit_option_in_the_profile_update_page() throws InterruptedException {
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getedit();

	}
	
//@When("User Enters the Name and selects the Work status in the Basic Details Page")
	//public void user_enters_the_name_and_selects_the_work_status_in_the_basic_details_page(){

	@When("User fills the total experience field and current salary field")
	public void user_fills_the_total_experience_field_and_current_salary_field()throws InterruptedException, IOException {
		
	Thread.sleep(6000);
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getExperience();
	}
	

	@When("User selects salary break down and selects current location")
	public void user_selects_salary_break_down_and_selects_current_location() throws InterruptedException, IOException {
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getSalarybreak();

	}

	@When("User selects Notice period in the Basic detail page")
	public void user_selects_notice_period_in_the_basic_detail_page() throws InterruptedException {
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getNoticePeriod();

	}
	@When("User click save button")
	public void user_click_save_button() throws InterruptedException {

		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().getSavebtn();

	}
	
	

	@When("User click the Upload Resume link in the Profile update page")
	public void user_click_the_upload_resume_link_in_the_profile_update_page() {
	   PageObjectManager.getPageobjectmanager().getResumeuploadpage().getClickUploadResume();
	}
	@When("User copy the Resume path and paste in the File name input field using keyboard actions")
	public void user_copy_the_resume_path_and_paste_in_the_file_name_input_field_using_keyboard_actions() {
	    PageObjectManager.getPageobjectmanager().getResumeuploadpage().getClickUploadResume();
	}
	//@When("User give enter using key board actions")
	//public void user_give_enter_using_key_board_actions() {
	   
	//}
	@Then("Resume get uploaded and user landed in profile update page")
	public void resume_get_uploaded_and_user_landed_in_profile_update_page() {
	   
	}



	
	
}
