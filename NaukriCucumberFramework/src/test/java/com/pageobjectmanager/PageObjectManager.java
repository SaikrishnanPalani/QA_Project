package com.pageobjectmanager;

import com.pageobjectmodel.CareerProfilePage;
import com.pageobjectmodel.EducationPage;
import com.pageobjectmodel.EmployeementPage;
import com.pageobjectmodel.ITSkillsPage;
import com.pageobjectmodel.KeySkillsPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.LogoutPage;
import com.pageobjectmodel.PersonalPage;
import com.pageobjectmodel.ProfileSummaryPage;
import com.pageobjectmodel.ProfileUpdatePage;
import com.pageobjectmodel.ProjectsPage;
import com.pageobjectmodel.ResumeHeadlinePage;
import com.pageobjectmodel.ResumeUploadPage;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;
import com.utility.FileReaderManager;


public class PageObjectManager extends Baseclass {

	private LoginPage loginpage;
	private FileReaderManager filereadermanager;
	private static PageObjectManager pageobjectmanager;
	private ProfileUpdatePage profileUpdatePage;
	private ResumeUploadPage resumeuploadpage;
	private ExcelUtility excelutility;
	private ResumeHeadlinePage resumeheadline;
	private KeySkillsPage keyskillpage;
	private EmployeementPage employeementPage;
	private EducationPage educationpage;
	private ITSkillsPage itskill;
	private ProjectsPage projectspage;
	private ProfileSummaryPage profilesummarypage;
	private CareerProfilePage careerProfilepage;
	private PersonalPage personalPage;
	private LogoutPage logoutPage;
	

	public CareerProfilePage getCareerProfilepage() {
		
		if(careerProfilepage ==null) {
			
			careerProfilepage = new CareerProfilePage();
		}
		return careerProfilepage;
	}

	public KeySkillsPage getKeyskillpage() {
		if (keyskillpage == null) {
			keyskillpage = new KeySkillsPage();
		}

		return keyskillpage;
	}

	public ResumeHeadlinePage getResumeheadline() {

		if (resumeheadline == null) {

			resumeheadline = new ResumeHeadlinePage();

		}
		return resumeheadline;
	}

	public ExcelUtility getExcelutility() {
		if (excelutility == null) {

			excelutility = new ExcelUtility();
		}

		return excelutility;
	}

	public LoginPage getLoginpage() {
		if (loginpage == null) {
			loginpage = new LoginPage();
		}
		return loginpage;
	}

	public FileReaderManager getFilereadermanager() {
		if (filereadermanager == null) {

			filereadermanager = new FileReaderManager();
		}
		return filereadermanager;
	}

	public static PageObjectManager getPageobjectmanager() {
		if (pageobjectmanager == null) {

			pageobjectmanager = new PageObjectManager();
		}
		return pageobjectmanager;
	}

	public ProfileUpdatePage getProfileUpdatePage() {

		if (profileUpdatePage == null) {

			profileUpdatePage = new ProfileUpdatePage();
		}
		return profileUpdatePage;
	}

	public ResumeUploadPage getResumeuploadpage() {

		if (resumeuploadpage == null) {

			resumeuploadpage = new ResumeUploadPage();
		}
		return resumeuploadpage;
	}

	public EmployeementPage getEmployeementPage() {

		if (employeementPage == null) {

			employeementPage = new EmployeementPage();
		}
		return employeementPage;
	}

	public EducationPage getEducationpage() {
		
		if(educationpage ==null) {
			
			educationpage = new EducationPage();
		}
		return educationpage;
	}

	public ITSkillsPage getItskill() {
		
		if(itskill ==null) {
			
			itskill = new ITSkillsPage();
		}
		return itskill;
	}

	public ProjectsPage getProjectspage() {
		
		if(projectspage==null) {
			
			projectspage=new ProjectsPage();
		}
		return projectspage;
	}

	public ProfileSummaryPage getProfilesummarypage() {
		if(profilesummarypage==null) {
			
			profilesummarypage = new ProfileSummaryPage();
		}
		
		return profilesummarypage;
	}

	public PersonalPage getPersonalPage() {
		if(personalPage ==null) {
			
			personalPage = new PersonalPage();
			
		}
		
		return personalPage;
	}

	public LogoutPage getLogoutPage() {
		
		if(logoutPage==null) {
			
			logoutPage = new LogoutPage();
		}
		return logoutPage;
	}
	
	
	

}
