Feature: To Test All Datas in Document Details In Offering Stage 
@AT_DOC_01
Scenario: To verify Document Details is visible at Offering stage
Given navigate the IJARA URL
And login with valid credentials
#And click on module dropdown in IJRARAH
#And click on LOS option in module dropdown
And get the test data for test case ID AT_DOC_01
And click on mail box
And click on search box upon click on the mail box
And search the record reference number in search text box
And Select record after search
And User_626 click on Next and Document Details tab 
And User_626 click on the Action View button Below the Document Details
And User_626 verify Customer Name field should visible in Document details screen
And User_626 verify Document Namefield should visible in Document details screen
And User_626 verify Required At Stage field should visible in Document details screen
And User_626 verify Document Status field should visible in Document details screen
And User_626 verify ManDatory field should visible in Document details screen
And User_626 verify Document Category field should visible in Document details screen
And User_626 verify Upload Date field should visible in Document details screen
And User_626 verify Expected Receipt Date field should visible in Document details screen
And User_626 verify Deferral Stage field should visible in Document details screen
And User_626 verify Def Approval byfield should visible in Document details screen
And User_626 verify Change In Nature field should visible in Document details screen
And User_626 verify Document Form field should visible in Document details screen
And User_626 verify Document Quality field should visible in Document details screen
And User_626 verify Document ref No field should visible in Document details screen
And User_626 verify Document Received By field should visible in Document details screen
And User_626 verify Location field should visible in Document details screen
And User_626 verify Rack No field should visible in Document details screen
And User_626 verify Shelf No field should visible in Document details screen
And User_626 verify Box No field should visible in Document details screen
And User_626 verify Date Of Expiry field should visible in Document details screen
And User_626 verify Lodgement Amount field should visible in Document details screen
And User_626 verify Remarks field should visible in Document details screen
#DOC_01_04
And User_626 verify View field should visible in Document details screen
#DOC_01_05
And User_626 verify Generate Doc field should visible in Document details screen
And User_626 verify Status field should visible in Document details screen
And User_626 verify Help field should visible in Document details screen
#All Data Should Be Same
And User_626 verify Customer Name Data should visible As Entry stage screen
And User_626 verify Document Name Data should visible As Entry stage screen
And User_626 verify Document status Data should visible As Entry stage screen
And User_626 verify Mandatory optional Data should visible As Entry stage screen
And User_626 verify Document Category Data should visible As Entry stage screen
And User_626 verify Deferred Stage Data should visible As Entry stage screen
And User_626 verify quality Data should visible As Entry stage screen
And User_626 verify remarks Data should visible As Entry stage screen
#All Data should be in Display Only
And User_626 verify Customer Name field should visible in DisPlay Only
And User_626 verify Document Namefield should visible in DisPlay Only
And User_626 verify Required At Stage field should visible in DisPlay Only
And User_626 verify Document Status field should visible in DisPlay Only
And User_626 verify ManDatory field should visible in DisPlay Only
And User_626 verify Document Category field should visible in DisPlay Only
And User_626 verify Upload Date field should visible in DisPlay Only
And User_626 verify Expected Receipt Date field should visible in DisPlay Only
And User_626 verify Deferral Stage field should visible in DisPlay Only
And User_626 verify Def Approval byfield should visible in DisPlay Only
And User_626 verify Change In Nature field should visible in DisPlay Only
And User_626 verify Document Form field should visible in DisPlay Only
And User_626 verify Document Quality field should visible in DisPlay Only
And User_626 verify Document ref No field should visible in DisPlay Only
And User_626 verify Document Received By field should visible in DisPlay Only
And User_626 verify Location field should visible in DisPlay Only
And User_626 verify Rack No field should visible in DisPlay Only
And User_626 verify Shelf No field should visible in DisPlay Only
And User_626 verify Box No field should visible in DisPlay Only
And User_626 verify Date Of Expiry field should visible in DisPlay Only
And User_626 verify Lodgement Amount field should visible in DisPlay Only
And User_626 verify Remarks field should visible in DisPlay Only
And User_626 verify View field should visible in DisPlay Only
And User_626 verify Generate Doc field should visible in DisPlay Only
And User_626 verify Status field should visible in DisPlay Only
Then User_626 clicking on back button system should navigate to the previous screen
Then User_626 logout from the ijaraApplication
@AT_DOC_03
Scenario: To verify Functionality of Save button in Document Details at Offering stage
Given navigate the IJARA URL
And login with valid credentials
And get the test data for test case ID AT_DOC_01
And click on mail box
And click on search box upon click on the mail box
And search the record reference number in search text box
And Select record after search
And User_626 click on Next and Document Details tab
And User_626 click on search Box and enter Data For Matching Data Check 
And User_626 click on search Box and enter Data For Not Matching Data Check 
Then User_626 logout from the ijaraApplication



