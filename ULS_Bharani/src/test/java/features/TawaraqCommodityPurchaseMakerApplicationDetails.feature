Feature: Tawaraq Commodity Purchase Maker Application Details
 @AT_TW_CSM_10
  Scenario: To verify the availability of Application Details tab & verify already added details
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_604 get the test data for test case AT_TW_CSM_10
		And click on module dropdown in IJRARAH
		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And user_604 search the record Tawarruq Commodity Purchase Maker Customer Details
    And User_604 click the Entitle button under inbox
		And User_604 Click Application Details tab   
    And User_604 validate the Classification value displayed correctly under Application details screen
    And User_604 validate the Product value displayed correctly under Application details screen
    And User_604 validate the Total Finance Amount Requested value displayed correctly under Application details screen
    And User_604 validate the Declared Net Monthly Income value displayed correctly under Application details screen
    And User_604 validate the Sourcing Channel value displayed correctly under Application details screen
    And User_604 validate the Business Center Code value displayed correctly under Application details screen
    And User_604 validate the Servicing Type value displayed correctly under Application details screen
    And User_604 validate the Region value displayed correctly under Application details screen
    And User_604 validate the Servicing Branch value displayed correctly under Application details screen
    And User_604 validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen
    And User_604 verify the Classification field available under Application details screen
		And User_604 verify the Product field available under Application details screen
		And User_604 verify the Total Finance Amount Requested field available under Application details screen
		And User_604 verify the Declared Net Monthly Income field available under Application details screen
		And User_604 verify the Declared Current Obligations field available under Application details screen
		And User_604 verify the Special Promotion field available under Application details screen
		And User_604 verify the Sourcing Channel field available under Application details screen
		And User_604 verify the Business Center Code field available under Application details screen
		And User_604 verify the Servicing Type field available under Application details screen
		And User_604 verify the Region field available under Application details screen
		And User_604 verify the Servicing Branch field available under Application details screen
		And User_604 verify the Spoke Location field available under Application details screen
		And User_604 verify the Closing Staff or Servicing Staff or RM field available under Application details screen
		And User_604 verify the Topup Type field available under Application details screen
		And User_604 verify the Topup Application No field available under Application details screen
    Then logout from the ijaraApplication
  
