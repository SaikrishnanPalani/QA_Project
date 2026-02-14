Feature: Naukri Job Application Testing
Scenario: Login wih Valid credentials.

Given  User launch the Browser and the URL for Naukri Application
When  User clicks the Log in button in the URL landed page
And  User enter the valid email id in the email id input field
And  User enter the Password in the password input field
And  User click the Login Button in the Log in page
Then  User landed in the home page of Naukri Application

#Scenario: Log in with invalid credentials

#When: User click the Log in button in the URL Landed page
#And: User enters the invalid email id in the email id field
#And: User enter the invalid Password in the Password field.
#And: User click the Log in button in the Login page
#Then: User can see the message Enter valid email id and password


Scenario: Adding Candidate details in Profile Update page.

When User click View and update profile in the Naukri home page 
And User click the edit option in the Profile update page 
And User Enters the Name and selects the Work status in the Basic Details Page
And User fills the total experience field and current salary field
And User selects salary break down and selects current location
#And User selects Notice period in the Basic detail page
#And User click save button 
#Then User landed in the profile update page

Scenario: Uploadin the Resume

When User click the Upload Resume link in the Profile update page
And User copy the Resume path and paste in the File name input field using keyboard actions
#And User give enter using key board actions
Then Resume get uploaded and user landed in profile update page

Scenario: Updating the Resume Headline in the Profile Update page

When User click the edit option in the Resume Headline 
And User Select all and clear the content in the input field 
And User Paste the new content in the input box 
And User click Save button in the Resume Headline page
Then User landed in the Profile update page

Scenario: Updating the Key-Skills in the Profile update page

When: User click the edit button in the Key-Skill page
And: User gives some skills in the input box and selects them from the drop down 
And: User click save 
Then: User Navigate to Profile update page.

Scenario: Adding Employement

When: User click add Employement butto in the Profile update page
And: User select the current employement type and Employement type
And: User selects the total experience and fills the current employement company name in the input field
And: User fill the current job title in the input field and selects the joining date from the drop-down menu
And: User enter the current salary and also senter the skill used and select skill from the dop-down listed
And: User Paste the job profile and select the notice period by giving the value and by selecting from the drop  down
And: User click save 
Then: User landed in profile update page

Scenario: Adding Education in the profile update page

When: User click the add education button in the Profile update page
And: User Select the Education in the Drop down at Education field
And: User enters the University name in the input field and selects the unviersity suggestion on the drop down
And: User Selects the course from the suggested drop down on the field
And: User Selects the specialization form the drop down below the select specialization input field
And: User Selects the Course type by clicking the radio button 
And: User Selects the course duration and grading system from the input field.
And: User clicks the Save button in the add education page
Then: User navigated to Profile update page

Scenario: Adding IT-Skills 

When: User click the Add details in the IT skill 
And: User enters the Skill or Software name in the input field
And: User Clicks Save button in the IT-Skills Page
Then: User landed in Project profile page

Scenario: Adding Project in the Profile Page

When: User click the Add Project field in the project update page
And: User enters the Project title in the input field
And: User enter the client name in the input field and selecting them from the drop down
And: User selects the Project status by clicking the radio button 
And: User selects the Project duration drom the drop dwon provided in the input field
And: User enters the project details in the details input field
And: User click Save button 
Then: User landed in the Profile update page

Scenario: Update Profile Summary in the Profile update page

When: User click the edit button in the Profile Summary 
And: User selcts the Profile summary description and select all and clear the existing content 
And: User enter the profile summary 
And: User click save button  
Then: User Landed into the profile update page

Scenario: Adding Carrer Profile information in the Profile update page

When: User click the edit button in the Carrer profile 
And:  User select the current industry from the drop down
And: User select the department and role catogory from the drop down in the respected fields
And: User select the job role from the drop down list in the input field
And: User click save button 
Then: User navigated to Profile update page

Scenario: Adding Personal Details in the Profile update page

When: User click the edit button in the Personal details
And:  User clicl the Gender type
And: User selects the Reson for break from the given options
And: User selects the Break started from the drop dowm provided in the input field
And: User select the Break ended date from the drop down given in the field
And: User Selects the Language from the list in the drop down and clicks the check box of fluency
And: User click save button
Then: User navigate to profile update page

Scenario: Log out from the Application

When: User clicks the profile page 
And: User clicks the Log out button in the Profile page
Then: User landed in Naukri guest user page

