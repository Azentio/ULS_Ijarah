Feature: To verify AutoLoan-Offering-CustomerDetails
@AT_AL_OFF_CD_01

Scenario: To verify the availability of Customer Information tab 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Offering-CustomerDetails
And User_6047 Get the test data for test case ID AT_AL_OFF_CD_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
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
