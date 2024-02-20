Feature: To check the customer details feature
@AT_AL_OFF_CD_01

Scenario: To verify the availability of Customer Information tab 

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the Personal Details
Then User_6047 verify the Contact Details

Then User_6047 verify the field Customer Type
Then User_6047 verify the field Applicant Type 
Then User_6047 verify the field KYC status 
Then User_6047 verify the field Salutation 
Then User_6047 verify the field First Name 
Then User_6047 verify the field Middle Name  
Then User_6047 verify the field Last Name 
Then User_6047 verify the field Father First Name 
Then User_6047 verify the field Father Middle Name 
Then User_6047 verify the field Father Last Name 
Then User_6047 verify the field Spouse First Name 
Then User_6047 verify the field Spouse Middle Name 
Then User_6047 verify the field Spouse Last Name 
Then User_6047 verify the field No Of Children 
Then User_6047 verify the field Spouse Status 
Then User_6047 verify the field Date Of Birth 
Then User_6047 verify the field Gender 
Then User_6047 verify the field Marital Status 
Then User_6047 verify the field Education Level 
Then User_6047 verify the field Nationality 
Then User_6047 verify the field Category 
Then User_6047 verify the field Religion 
Then User_6047 verify the field Residential Status 
Then User_6047 verify the field Language 
Then User_6047 verify the field No Of Dependents 
Then User_6047 verify the field Mothers Maiden Name 
Then User_6047 verify the field Type Of Residence 
Then User_6047 verify the field Industry Segmentation 
Then User_6047 verify the field Is Income Considered 
Then User_6047 verify the field Customer Profile 
Then User_6047 verify the field Relationship 
Then User_6047 verify the field Existing Bank Relationship 
Then User_6047 verify the field Blacklisted 
Then User_6047 verify the field Remarks 
Then User_6047 verify the field Initiate Video KYC button
Then User_6047 verify the field Back button
Then logout from the ULS Application

@AT_AL_OFF_CD_02

Scenario: To verify the availability of Contact Details in Customer Information tab 

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the field Phone number
Then User_6047 verify the field Mobile number(Primary)
Then User_6047 verify the field Mobile number(Secondary)
Then User_6047 verify the field Email
Then User_6047 verify the field Preferred contact method
Then User_6047 verify the field Preferred Time for contact
Then logout from the ULS Application

@AT_AL_OFF_CD_03

Scenario: To verify the same record should get saved in the system 

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the data in Customer Type
Then User_6047 verify the data in Applicant Type 
Then User_6047 verify the data in Salutation 
Then User_6047 verify the data in First Name 
Then User_6047 verify the data in Last Name 
Then User_6047 verify the data in Father First Name 
Then User_6047 verify the data in Father Last Name 
Then User_6047 verify the data in Date Of Birth 
Then User_6047 verify the data in Gender 
Then User_6047 verify the data in Marital Status 
Then User_6047 verify the data in Nationality 
Then User_6047 verify the data in Category 
Then User_6047 verify the data in Religion 
Then User_6047 verify the data in Residential Status 
Then User_6047 verify the data in Language 
Then User_6047 verify the data in Mothers Maiden Name 
Then User_6047 verify the data in Type Of Residence 
Then User_6047 verify the data in Is Income Considered 
Then User_6047 verify the data in Remarks 
Then User_6047 verify the data in Phone number
Then User_6047 verify the data in Mobile number(Primary)
Then User_6047 verify the data in Email
Then User_6047 verify the data in Preferred contact method
Then logout from the ULS Application

@AT_AL_OFF_CD_04

Scenario: To verify the field should be display only,text,dropdown,mandatory,nonmandatory

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the field Customer Type should be display only,dropdown,mandatory,data
Then User_6047 verify the field Applicant Type should be display only,dropdown,mandatory,data
Then User_6047 verify the field KYC status should be non editable,textbox,nonmandatory,data
Then User_6047 verify the field Salutation should be display only,dropdown,mandatory,data
Then User_6047 verify the field First Name should be display only,textbox,mandatory,data
Then User_6047 verify the field Middle Name should be display only,textbox,nonmandatory,data 
Then User_6047 verify the field Last Name should be display only,textbox,mandatory,data
Then User_6047 verify the field Father First Name should be display only,textbox,mandatory,data
Then User_6047 verify the field Father Middle Name should be display only,textbox,nonmandatory,data 
Then User_6047 verify the field Father Last Name should be display only,textbox,mandatory,data
Then logout from the ULS Application

@AT_AL_OFF_CD_05

Scenario: To verify the field should be display only,text,dropdown,mandatory,nonmandatory

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the field Spouse First Name should be display only,textbox,Nonmandatory,data
Then User_6047 verify the field Spouse Middle Name should be display only,textbox,Nonmandatory,data
Then User_6047 verify the field Spouse Last Name should be display only,textbox,Nonmandatory,data
Then User_6047 verify the field No Of Children should be display only,number,Nonmandatory,data
Then User_6047 verify the field Spouse Status should be display only,dropdown,Nonmandatory,data
Then User_6047 verify the field Date Of Birth should be display only,calendar,mandatory,data 
Then User_6047 verify the field Gender should be display only,dropdown,mandatory,data
Then User_6047 verify the field Marital Status should be display only,dropdown,mandatory,data
Then User_6047 verify the field Education Level Name should be display only,dropdown,mandatory,data 
Then User_6047 verify the field Nationality should be display only,dropdown,mandatory,data
Then logout from the ULS Application

@AT_AL_OFF_CD_06

Scenario: To verify the field should be display only,text,dropdown,mandatory,nonmandatory

Given Navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search thee Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details screen
And User_6047 click Edit Button 
Then User_6047 verify the field Category should be display only,dropdown,mandatory,data
Then User_6047 verify the field Religion should be display only,dropdown,mandatory,data
Then User_6047 verify the field Residential Status should be display only,dropdown,mandatory,data 
Then User_6047 verify the field Language should be display only,dropdown,mandatory,data
Then User_6047 verify the field No Of Dependents should be display only,textbox,Nonmandatory,data
Then User_6047 verify the field Mothers Maiden Name should be display only,textbox,mandatory,data
Then User_6047 verify the field Type Of Residence should be display only,dropdown,mandatory,data
Then User_6047 verify the field Industry Segmentation should be display only,dropdown,mandatory,data
Then User_6047 verify the field Is Income Considered should be display only,dropdown,Nonmandatory,data
Then User_6047 verify the field Customer Profile should be display only,dropdown,Nonmandatory,data
Then logout from the ULS Application
@AT_AL_OFF_CD_07
Scenario: To verify that field validation of Autoloan_Offering_customer details
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_07
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Click on eye icon of existing record in AutoLoan_Offering_customer details
And Validate that Relationship field is present in customer details
And Validate that Existing bank Relationship field is present in customer details
And Validate that Blacklisted field is present in customer details
And Validate that Politically Exposed field is present in customer details
And Validate that Remarks field is present in customer details

@AT_AL_OFF_CD_08
Scenario: To verify that field validation of Autoloan_Offering_customer details
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_08
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Click on eye icon of existing record in AutoLoan_Offering_customer details
And Validate that Phone number field is present in customer details
And Validate that Mobile number primary field is present in customer details
And Validate that Mobile number secondary field is present in customer details
And Validate that Email field is present in customer details
And Validate that Prefered customer method field is present in customer details
And Validate that Prefered time for customer field is present in customer details


@AT_AL_OFF_CD_09
Scenario: To verify that field validation of Autoloan_Offering_customer details view list
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_09
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Validate the CIF ID field is present in Customer details view list
And Validate the First name field is present in Customer details view list
And Validate the Middle name field is present in Customer details view list
And Validate the Last name field is present in Customer details view list
And Validate the Customer type field is present in Customer details view list
And Validate the Applicant type field is present in Customer details view list
And Validate the Customer rating field is present in Customer details view list
And Validate the Status field is present in Customer details view list
And Search the customer details record with valid data
And Search the customer details record with invalid data


@AT_AL_OFF_CD_10
Scenario: To verify that export functionality in Autoloan_Offering_customer details view list
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_10
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Validate the export to PDF functionality in Autoloan_Offering_Customer details
And Validate the export to Excel functionality in Autoloan_Offering_Customer details

