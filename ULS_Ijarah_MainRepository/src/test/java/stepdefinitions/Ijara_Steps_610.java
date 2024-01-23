package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijara_Steps_610 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath =configFileReader.getIjarahTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");

	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(excelTestDataPath, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	ExcelData IjarahExecutionSheet = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker", "TestCase ID");
	Map<String, String> testData;
	Map<String, String> executionData;
	ExcelData morabha_AppDataEntry = new ExcelData(excelTestDataPath, "Morabha_AppDataEntry", "DataSet ID");
	Map<String, String> testData01;

	// ------------AD followUp Details

	@And("User_610 get the test data set id for DS_AT_AD_FU_002")
	public void get_the_test_data_set_id_for_DS_AT_AD_FU_002() {
		testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_AD_FU_002");
	}
	
	// ------------data check identification details 

	@And("User_610 get the test data set id for DS_AT_DC_ID_001")
	public void get_the_test_data_set_id_for_DS_AT_DC_ID_001() {
		executionData=IjarahExecutionSheet.getTestdata("AT_DC_ID_001");
		testData = ad_CustomerFolllowUpDetails_610.getTestdata(executionData.get("dataSet_ID"));
	}
	
	//----------offering offer details 
	
	@And("User_610 get the test data set id for DS_AT_OF_OFD_001")
	public void get_the_test_data_set_id_for_DS_AT_OF_OFD_001() {
		executionData=IjarahExecutionSheet.getTestdata("AT_OFL_01");
		testData = ad_CustomerFolllowUpDetails_610.getTestdata(executionData.get("dataSet_ID"));
	}
	
	//----------New Application Customer Reference
	
		@And("User_610 get the test data set id for DS_AT_NEWAPP_CR_001")
		public void get_the_test_data_set_id_for_DS_AT_NEWAPP_CR_001() {
			testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_NEWAPP_CR_001");
		}
		
		
	//----------Murabha app data entery documents details 
		
		@And("User_610 get the test data set id for DS_AT_MU_DOC_01")
		public void get_the_test_data_set_id_for_DS_AT_MU_DOC_01() {
			testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_MU_DOC_01");
		}
		
	//----------Murabha app data entery FollowUp Details
		
		@And("User_610 get the test data set id for DS_AT_MU_FU_01")
		public void get_the_test_data_set_id_for_DS_AT_MU_FU_01() {
			testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_MU_FU_01");
			}
			
	//---Murabha App Data Entry FollowUp Details @AT_MU_FU_005  
		
		@And("User_610 get the test data set id for DS_AT_MU_FU_005")
		public void get_the_test_data_set_id_for_DS_AT_MU_FU_005() {
			testData01 = morabha_AppDataEntry.getTestdata("DS_AT_MU_FU_005");  
			}
		
		//---Ijara App Data Check Insurance Info
		
		@And("User_610 get the test data set id for DS_AT_IJ_IA_01")
		public void get_the_test_data_set_id_for_DS_AT_IJ_IA_01() {
			executionData=IjarahExecutionSheet.getTestdata("AT_IJ_IA_01");
			testData = ad_CustomerFolllowUpDetails_610.getTestdata(executionData.get("dataSet_ID"));  
			}		
		
		//----------Murabha app data Check Insurance nd Quatation Info
		
		 @And("User_610 get the test data set id for DS_AT_MU_IA_01")
	       	public void get_the_test_data_set_id_for_DS_AT_MU_IA_01() {
			 testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_MU_IA_01");
		}
		 
		//----------Tawarru app data entery Employment Details
			
			@And("User_610 get the test data set id for DS_AT_TW_AD_EMPD_07")
			public void get_the_test_data_set_id_for_DS_AT_TW_AD_EMPD_07() {
				testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_TW_AD_EMPD_07");
				}
			
	   //----------Tawarrqu app data entery Living Expenses
			
			@And("User_610 get the test data set id for DS_AT_TW_AD_LEA_001")
			public void get_the_test_data_set_id_for_DS_AT_TW_AD_LEA_001() {
				testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_TW_AD_LEA_001");
				}
			
       //----------Tawarrqu Commondity Maker --- Adhoc Payment
			
			@And("User_610 get the test data set id for DS_AT_TW_CSM_06")
			public void get_the_test_data_set_id_for_DS_AT_TW_CSM_06() {
				testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_TW_CSM_06");
				}
			
      //----------Tawarrqu Offering - Offering Stage
			
			@And("User_610 get the test data set id for DS_AT_TW_OFO_13")
			public void get_the_test_data_set_id_for_DS_AT_TW_OFO_13() {
				testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_TW_OFO_13");
				}
			
			
			
	
	// -------------steps ---------------
	@And("User_610 click the module name")
	public void user_select_the_module_name_to_los() throws Throwable {
		
		Thread.sleep(500);
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_ModuleName_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
       
	}

	@And("User_610 select the LOS in module name")
	public void user_select_the_los_in_module_name() throws Throwable {
		
			String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
	        String moduleLength = "";
	        for (int i = 0; i <= 500; i++) {
	            try {
	                moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
	                System.out.println("Module Length " + moduleLength);
	                if (!(moduleLength.isEmpty())) {
	                    break;
	                }
	            } catch (Exception e) {
	                if (i == 499) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	        int premitiveIntegerLength = Integer.parseInt(moduleLength);

//			document.querySelectorAll('ion-radio-group ion-item')[0].textContent
	        for (int i = 0; i < premitiveIntegerLength; i++) {
	            for (int j = 0; j <= 300; j++) {
	                try {
	                    String moduleName = javascriptHelper.executeScript(
	                            "return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
	                            .toString();
	                    System.out.println("Module name " + moduleName);
	                    if (moduleName.equalsIgnoreCase("LOS")) {
	                    //if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
	                        System.out
	                                .println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
	                        javascriptHelper
	                                .executeScriptWithWebElement(
	                                        "document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
	                                .click();
	                    }
	                } catch (Exception e) {
	 	                }
	            }
	        }	
	       
	        	}

	// -------------------

	@And("User_610 click Inbox")
	public void user_click_inbox() throws Throwable {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_inbox_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 click search button")
	public void user_click_search_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_searchButton_610")));
		//javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_searchButton_610")).click();
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_searchButton_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 enter the value in search button")
	public void user_enter_the_value_in_search_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("enter_theName_InSearchBtn_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("enter_theName_InSearchBtn_610")).sendKeys(testData.get("Search Button Value"));
		
		
		//System.out.println(jsPaths2.getElement("clickEditBtnIn_FirstRow_UnderInbox_610"));
		Thread.sleep(1000);
		//document.querySelectorAll('ion-label')[2]
		
	}

	@And("User_610 click edit button under inbox screen")
	public void user_click_edit_button_under_inbox_screen() throws Throwable {
	
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickEditBtnIn_FirstRow_UnderInbox_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		Thread.sleep(4000);
			}
	
	@And("User_610 click edit button under inbox screen02")
	public void user_click_edit_button_under_inbox_screen02() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtnIndex2_610")));
//		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtnIndex2_610")).click();

		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtnIndex2_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		Thread.sleep(4000);
	}

	@And("User_610 click document details")
	public void user_click_document_details() throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_DocumentDetails_610")));
		// javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_DocumentDetails_610")));
   
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_DocumentDetails_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_610 click add button under document details")
	public void user_click_add_button_under_document_details() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
//				.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")));
		
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@And("User_610 validate customer name field enabled or not under document details")
	public void user_validate_customer_name_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("customerName_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("customerName_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate document name field enabled or not under document details")
	public void user_validate_document_name_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	// -------------

	@And("User_610 validate Required At Stage field enabled or not under document details")
	public void user_validate_required_at_stage_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("requiredAtStage_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("requiredAtStage_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate Document Status field enabled or not under document details")
	public void user_validate_document_status_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate Manitory Option field enabled or not under document details")
	public void user_validate_manitory_option_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate Document Category field enabled or not under document details")
	public void user_validate_document_category_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate Upload Date field enabled or not under document details")
	public void user_validate_upload_date_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("uploadDate_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("uploadDate_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_610 validate expected Recepited Date field enabled or not under document details")
	public void user_validate_expected_recepited_date_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("expectedRecepitedDate_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("expectedRecepitedDate_UnderDocumentDetails_610"))
				.isDisplayed());
	}

	@And("User_610 validate deferral Stage field enabled or not under document details")
	public void user_validate_deferral_stage_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate def Approvel By field enabled or not under document details")
	public void user_validate_def_approvel_by_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("defApprovelBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("defApprovelBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate change In Nature Approved By field enabled or not under document details")
	public void user_validate_change_in_nature_approved_by_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("changeInNatureApprovedBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(
								jsPaths2.getElement("changeInNatureApprovedBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate document Form field enabled or not under document details")
	public void user_validate_document_form_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentForm_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentForm_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate document Quality field enabled or not under document details")
	public void user_validate_document_quality_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 document Refercence Number field enabled or not under document details")
	public void user_document_refercence_number_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentRefercenceNumber_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(
								jsPaths2.getElement("documentRefercenceNumber_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate document Received By enabled or not under document details")
	public void user_validate_document_received_by_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentReceivedBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentReceivedBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate location Where Received enabled or not under document details")
	public void user_validate_location_where_received_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("locationWhereReceived_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("locationWhereReceived_UnderDocumentDetails_610"))
				.isDisplayed());
	}

	// ---

	@And("User_610 validate rank Number field enabled or not under document details")
	public void user_validate_rank_number_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("rankNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("rankNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_610 validate sheIf Number field enabled or not under document details")
	public void user_validate_she_if_number_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("sheIfNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("sheIfNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_610 validate box number field enabled or not under document details")
	public void user_validate_box_number_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("boxNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("boxNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_610 validate date Of expiry field enabled or not under document details")
	public void user_validate_date_of_expiry_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("dateOfexpiry_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("dateOfexpiry_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate lodgement Amount field enabled or not under document details")
	public void user_validate_lodgement_amount_field_enabled_or_not_under_document_details()
			throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("lodgementAmount_UnderDocumentDetails_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("lodgementAmount_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("lodgementAmount_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_610 validate remarks field enabled or not under document details")
	public void user_validate_remarks_field_enabled_or_not_under_document_details() throws Throwable {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_610 click save and verify")
	public void user_click_save_and_verify() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("clickSaveBotton_underDocumentDetails")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickSaveBotton_underDocumentDetails"))
				.click();
	}

	// -----------------select dropdown

	@And("User_610 select Manitory Option field enabled or not under document details")
	public void user_select_manitory_option_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_610 select deferral Stage field enabled or not under document details")
	public void user_select_deferral_stage_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_610 select document Quality field enabled or not under document details")
	public void user_select_document_quality_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610"))
				.click();
		;
	}

	@And("User_610 select document name field enabled or not under document details")
	public void user_select_document_name_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_610 select Document Status field enabled or not under document details")
	public void user_select_document_status_field_enabled_or_not_under_document_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_610 select Document Category field enabled or not under document details")
	public void user_select_document_category_field_enabled_or_not_under_document_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_610 select remarks field enabled or not under document details")
	public void user_select_remarks_field_enabled_or_not_under_document_details() throws Throwable {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")).click();
	}

	// ------------------- customer followup details

	@And("User_610 click the customer follow details")
	public void user_click_the_customer_follow_details() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_nxtBtn_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_CustomerFollowUpDetailsTab_610")));
		// javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_DocumentDetails_610")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("click_CustomerFollowUpDetailsTab_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 validate Add button field enabled or not under customer follow details")
	public void user_validate_add_button_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")));
		
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")).isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 click add button under customer follow details")
	public void user_click_add_button_under_customer_follow_details() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")));
		// javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")).click();
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
	}

	@And("User_610 validate called when field enabled or not under customer follow details")
	public void user_validate_called_when_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_CalledWhen_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_CalledWhen_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Customer Responce field enabled or not under customer follow details")
	public void user_validate_customer_resbonce_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponce_UnderFollowUp_610")));
		if (!javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponce_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Follow Up Data field enabled or not under customer follow details")
	public void user_validate_follow_up_data_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_FollowUPDate_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_FollowUPDate_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Sign Status field enabled or not under customer follow details")
	public void user_validate_single_status_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_signStatus_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_signStatus_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Remark Category field enabled or not under customer follow details")
	public void user_validate_remark_category_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_remark_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_remark_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Back button field enabled or not under customer follow details")
	public void user_validate_back_button_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_backButton_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_backButton_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_610 validate Save button field enabled or not under customer follow details")
	public void user_validate_save_button_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610")).isDisplayed()) {
			softAssert.fail();
		}
		softAssert.assertAll();
	}

	// ------------------------@AT_AD_FU_002--------------------------
	

	@And("User_610 validate the called when field should be date , mandatory and editable")
	public void validate_the_called_when_field_should_be_date_mandatory_and_editable() throws Throwable {

		// -------------------validate type should be date

		Thread.sleep(3000);
		String calledWhenFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("getAtribute_InCalledWhen_610"))
				.getAttribute("ng-reflect-icon");
		System.err.println("first print  " + calledWhenFormat);

		String assertCalledWhenFormat = "pi pi-calendar";
		
		Assert.assertEquals(assertCalledWhenFormat, calledWhenFormat);

		// ----------------validate mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String calledwhen = "document.querySelector('ion-label[ng-reflect-text=\\\"SCR.FOLLOWUPDTL.CALLED_WHEN.TO\\\"').innerText";
				String calledwhenName = (String) javascriptHelper.executeScript("return " + calledwhen);
				System.out.println(calledwhenName);
				Assert.assertTrue(calledwhenName.contains("*"));
				
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
			Thread.sleep(5000);
		}

		// ----------------click

		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_CalledWhen_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);

		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("selectTodayDateIn_FollowUPDate_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_610 validate the customer responce field should be lookUp , mandatory and editable")
	public void validate_the_customer_resbonce_field_should_be_look_up_mandatory_and_editable() throws Throwable {

		
		// ----------------validate mandatory field

				for (int b = 0; b < 200; b++) {
					try {
						String customerResponce = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.CUST_RESP.TOOL\"]').innerText";
						String customerResponceName = (String) javascriptHelper.executeScript("return " + customerResponce);
						System.out.println(customerResponceName);
						Assert.assertTrue(customerResponceName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (b == 199) {
							Assert.fail(e.getMessage());
						}
					}
				}
					Thread.sleep(3000);
					
		// ----------------click

		for (int a = 0; a < 300; a++) {
		try {
			javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponceSelect_UnderFollowUp_610")).click();
			break;
		} catch (Exception e) {
			if (a == 299) {
				Assert.fail(e.getMessage());
			}
		}
	}
		
		// ----------dropdown-------

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("CustomerResponce").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((testData.get("CustomerResponce")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
				}	

	@And("User_610 validate the follow up date field should be date , mandatory and editable")
	public void validate_the_follow_up_date_field_should_be_date_mandatory_and_editable() throws Throwable {

		
		// ----------------validate mandatory field ---------bug
//
//		for (int b = 0; b < 2000; b++) {
//			try {
//				String followUpDate = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.FOLL_UP_DT.TOO\"').innerText";
//				String followUpDateName = (String) javascriptHelper.executeScript("return " + followUpDate);
//				System.out.println(followUpDate);
//				Assert.assertTrue(followUpDate.contains("*"));
//				
//				break;
//			} catch (Exception e) {
//				if (b == 1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//			Thread.sleep(3000);
			
			
		// -------------------validate type should be date

				Thread.sleep(3000);
				String followUpDateFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("getAtribute_InFolloUpDate_610"))
						.getAttribute("ng-reflect-icon");
				System.err.println("first print  " + followUpDateFormat);

				String assertfollowUpDateFormat = "pi pi-calendar";
				Assert.assertEquals(assertfollowUpDateFormat, followUpDateFormat);
				
				// ----------------click

				for (int a = 0; a < 300; a++) {
				try {
					javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_FollowUPDate_UnderFollowUp_610"))
							.click();
					break;
				} catch (Exception e) {
					if (a == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
				
							
				Thread.sleep(3000);
				for (int b = 0; b < 300; b++) {
					try {
						javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("selectTodayDateIn_FollowUPDate_UnderFollowUp_610"))
								.click();
						break;
					} catch (Exception e) {
						if (b == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				Thread.sleep(5000);
	}

	@And("User_610 validate the sign Status field should be dropdown , mandatory and editable")
	public void validate_the_status_field_should_be_dropdown_mandatory_and_editable() throws Throwable {
		
		// ----------------validate mandatory field

//		for (int b = 0; b < 2000; b++) {
//			try {
//				String statusField = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.SIGN_STATUS.TO\"').innerText";
//				String statusFieldName = (String) javascriptHelper.executeScript("return " + statusField);
//				System.out.println(statusFieldName);
//				Assert.assertTrue(statusFieldName.contains("*"));
//				
//				break;
//			} catch (Exception e) {
//				if (b == 1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//			Th.sleep(3000);
			
// ----------------click

for (int a = 0; a < 300; a++) {
try {
	javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_signStatus_UnderFollowUp_610"))
			.click();
	break;
} catch (Exception e) {
	if (a == 299) {
		Assert.fail(e.getMessage());
	}
}
}

// ----------dropdown-------

String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
String dropdownLength = "";
boolean isDropdownValueSelected = false;
String dropdownString = "";

for (int i = 0; i <= 300; i++) {
	try {
		dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
		System.out.println("Dropdown length " + dropdownLength);
		if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
			break;
		}
	} catch (Exception e) {
		if (i == 300) {
			Assert.fail(e.getMessage());
		}
	}
}

int premitiveDropdownLength = Integer.parseInt(dropdownLength);

for (int j = 0; j <= premitiveDropdownLength; j++) {
	for (int l = 0; l <= 300; l++) {
		try {
			System.out.println("L value is " + l);
			System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
			dropdownString = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
					.toString();
			if (!(dropdownString.isEmpty())) {
				System.out.println(dropdownString);
				System.out.println("Loop count " + l + " got breaked");
				break;
			}
		} catch (Exception e) {
			if (l == 300 && !(dropdownString.isEmpty())) {
				Assert.fail(e.getMessage());
			}
		}
		if (!(dropdownString.isEmpty())) {
			System.out.println(dropdownString);
			System.out.println("Loop count " + l + " got breaked");
			break;
		}
	}

	System.out.println("String " + dropdownString.trim());
	System.out.println("Map " + testData.get("Sign Status").trim());
	if ((dropdownString.trim())
			.equalsIgnoreCase((testData.get("Sign Status")).trim())) {
		for (int k = 0; k <= 300; k++) {
			try {
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
				clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
				isDropdownValueSelected = true;
				break;
			} catch (Exception e) {
				if (k == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	if (isDropdownValueSelected == true) {
		break;
	}
}
		}
		
	
	@And("User_610 validate the remarks field should be textbox , mandatory and editable")
	public void validate_the_remarks_field_should_be_textbox_mandatory_and_editable() throws Throwable {

		// ----------------validate mandatory field

//		for (int b = 0; b < 2000; b++) {
//			try {
//				String remarksField = "document.querySelector('ion-label[ng-reflect-text=\"SCR.REMARKS.TOOLTIP\"').innerText";
//				String remarksFielddName = (String) javascriptHelper.executeScript("return " + remarksField);
//				System.out.println(remarksFielddName);
//				Assert.assertTrue(remarksFielddName.contains("*"));
//				
//				break;
//			} catch (Exception e) {
//				if (b == 1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//			Th.sleep(3000);
//				}	
		
		
		// -------------------validate type should be text

		Thread.sleep(3000);
		String remarkFormat1 = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InRemark_610")).getAttribute("name");
		
//		String remarkFormat = "document.querySelector('ion-label[ng-reflect-text=\"SCR.REMARKS.TOOLTIP\"').nextElementSibling.querySelector('textarea').getAttribute('name')";
//		String remarkFormat1 = (String) javascriptHelper.executeScript("return "+remarkFormat);
		
		System.err.println("first print  " + remarkFormat1);

		String assertremarkFormatFormat = "ion-textarea-0";
		Assert.assertEquals(assertremarkFormatFormat, remarkFormat1);
		Thread.sleep(3000);
		
		//-------sendkey
		
		for (int a = 0; a < 300; a++) {
			try {
			 javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_remarkInputBox_UnderFollowUp_610")).sendKeys("text");
			 break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
			}
		Thread.sleep(3000);
		
}
	
	@And("User_610 validate the save button under customer follow details")
	public void validate_the_save_button_under_customer_follow_details() {
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	
	@And("User_610 validate the conformation message after save button and close button")
	public void user_validate_the_conformation_message_after_save_button() {
		
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	    
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("toastMsgCloseBtn_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
		}
	
	
	@And("User_610 vaildate the message for blank field is which mandatory")
	public void user_vaildate_the_message_for_blank_field_is_which_mandatory() {
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("fillAllTheDetails_Popup_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}
	
	//------------------------@AT_AD_FU_005
	
	@And("User_610 validate Edit button field enabled or not under customer follow details")
	public void user_validate_edit_button_field_enabled_or_not_under_customer_follow_details() {
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtn_UnderFollowUp_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("User_610 validate search for the record field enabled or not under customer follow details")
	public void user_validate_search_for_the_record_field_enabled_or_not_under_customer_follow_details() {
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("searchForTheRecord_UnderFollowUp_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("User_610 validate export to PDF and EXCEL field enabled or not under customer follow details")
	public void user_validate_export_to_pdf_and_excel_field_enabled_or_not_under_customer_follow_details() {
		
		for (int a = 0; a < 300; a++) {
			try {
			 javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_ExportBtn_UnderFollowUp_610")).click();;
			 break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
			}
		
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("exportToPDF_UnderFollowUp_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
		
		for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("exportToEXCEL_UnderFollowUp_610")).isDisplayed()) {
             		softAssert.fail();
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("User_610 validate followUp details field enabled or not under customer follow details")
	public void user_validate_follow_up_details_field_enabled_or_not_under_customer_follow_details() {
	    
	}
	
	//----------------------------------------@AT_AD_FU_005------------------------
	
	@And("User_610 to verify the values in list view should be not editable")
	public void user_to_verify_the_values_in_list_view_should_be_not_editable() throws Throwable {
		
	    for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickActiveBtn_Status_underListView_610")).sendKeys("test");
				break;
				} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    Thread.sleep(5000); 
	}

	@And("User_610 to verify the functionality of add button should allow create new record")
	public void user_to_verify_the_functionality_of_add_button_should_allow_create_new_record() throws Throwable {
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("followUpDetailsScreen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//-----back btn  validate
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Thread.sleep(2000);
		
	}	

	@And("User_610 to verify the functionality of edit button should redirct the edit page")
	public void user_to_verify_the_functionality_of_edit_button_should_redirct_the_edit_page() throws Throwable {
	    
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtn_UnderFollowUp_610")).click();;
				break;
				} catch (Exception e) {
				// TODO: handle exception			
				}
	       }
		Thread.sleep(1000);
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("followUpDetailsScreen_610")).isDisplayed()) {
					softAssert.fail();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Thread.sleep(2000);
	}

	@And("User_610 to verify the functionality of search box with matching data should be show matching data")
	public void user_to_verify_the_functionality_of_search_box_with_matching_data_should_be_show_matching_data() throws Throwable {
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("searchBtn_underFollowUpList_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_underFollowUpDetails_610")).sendKeys("22");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    Thread.sleep(4000);
	    for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("validate_theMatchingData_610")).isDisplayed()) {
					softAssert.fail();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_610 to verfiy the functionality of search box with not matching data should not be show no data")
	public void user_to_verfiy_the_functionality_of_search_box_with_not_matching_data_should_not_be_show_no_data() throws Throwable {
	    
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_underFollowUpDetails_610")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("searchBtn_underFollowUpList_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_underFollowUpDetails_610")).sendKeys("22222");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    Thread.sleep(4000);
	    for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("vaildate_theMisMatchingData_610")).isDisplayed()) {
					softAssert.fail();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	    
	    softAssert.assertAll();
	}

	
	@And("User_610 to verify the functionality of export to PDF button should download PDF file")
	public void user_to_verify_the_functionality_of_export_to_pdf_button_should_download_pdf_file() {
	    
	    
	}

	@And("User_610 to verify the functionality of export to EXCEL button should download EXCEL file")
	public void user_to_verify_the_functionality_of_export_to_excel_button_should_download_excel_file() {
	    
	    
	}
	
	
	
	//---------------------------------identification details
	
	
	@And("User_610 verify the field Save button under identification details")
	public void user_verify_the_field_save_button_under_identification_details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_610 verify the field Back button under identification details")
	public void user_verify_the_field_back_button_under_identification_details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn_UnderCustomerDetails_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	@And("User_610 click additional customer info")
	public void user_click_additional_customer_info() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("additionalCustomerInfo_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
							}
		}
	}

	@And("User_610 click edit button under additional customer info")
	public void user_click_edit_button_under_additional_customer_info() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtn_UnderFollowUp_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("User_610 click add button in customer identification")
	public void user_click_add_button_in_customer_identification() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("identificationAddBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
			Thread.sleep(1000);
	}
	
	@And("User_610 click view button in customer identification")
	public void user_click_view_button_in_customer_identification() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("viewIcon_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
			Thread.sleep(3000);
	}
	
	@And("User_610 click eye button in customer identification")
	public void user_click_eye_button_in_customer_identification() throws Throwable {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("identificationEyeBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
			
		Thread.sleep(2000);
	}
	
	@And("User_610 verify the field ID Type under identification details")
	public void user_verify_the_field_id_type_under_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Type_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the field ID Number under identification details")
	public void user_verify_the_field_id_number_under_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Number_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the field ID Issue Date under identification details")
	public void user_verify_the_field_id_issue_date_under_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Issue_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the field ID Expiry identification details")
	public void user_verify_the_field_id_expiry_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Expiry_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the field Issuing Authority under identification details")
	public void user_verify_the_field_issuing_authority_under_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the field Control Of Issue under identification details")
	public void user_verify_the_field_control_of_issue_under_identification_details() {
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}
	
	//----------------verify data display
	
	@And("User_610 verify the Data Display in ID Type under identification details")
	public void user_verify_the_data_display_in_id_type_under_identification_details() {
		String IDVerify = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Type_UnderCustomerIdentificationDetails_610"))
				.getAttribute("aria-label");
		String IDVerify1 =IDVerify.substring(1,7);
		
		String IDVeriy = "AADHAR";
		
		System.err.println("first print  " + IDVerify1);
		
		Assert.assertEquals(IDVeriy, IDVerify1);
	    
	}

	@And("User_610 verify the Data Display in ID Number under identification details")
	public void user_verify_the_data_display_in_id_number_under_identification_details() {
		String IDNumber = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Number_UnderCustomerIdentificationDetails_610"))
				.getAttribute("ng-reflect-model");
	//	String IDNumber1 =IDVerify.substring(1,7);
		//----numeric
		String IDNumber1 = "XXXXXXXX5642";
		
		System.err.println("IDNumber :" + IDNumber);
		
		Assert.assertEquals(IDNumber1, IDNumber);
	    
	}

	@And("User_610 verify the Data Display in ID Issue Date under identification details")
	public void user_verify_the_data_display_in_id_issue_date_under_identification_details() {
		String IDIssueData1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Issue_Date_UnderCustomerIdentificationDetails_610"))
				.getAttribute("ng-reflect-max-date");
		String IDIssueData2 =IDIssueData1.substring(4,15);
		
		String IDIssueData = "Jan 31 2023";
		
		System.err.println("IDIssueData :" + IDIssueData2);
		
		Assert.assertEquals(IDIssueData, IDIssueData2);
	    
	}

	@And("User_610 verify the Data Display in ID Expiry identification details")
	public void user_verify_the_data_display_in_id_expiry_identification_details() {
		String IDExpiryData1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Expiry_Date_UnderCustomerIdentificationDetails_610"))
				.getAttribute("ng-reflect-model");
		String IDExpiryData2 =IDExpiryData1.substring(4,15);
		
		String IDExpiryData = "May 01 2045";
		
		System.err.println("IDIssueData :" + IDExpiryData2);
		
		Assert.assertEquals(IDExpiryData, IDExpiryData2);
	    
	}

	@And("User_610 verify the Data Display in Issuing Authority under identification details")
	public void user_verify_the_data_display_in_issuing_authority_under_identification_details() {
		String IssuingAuthority1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610"))
				.getAttribute("aria-label");
		String IssuingAuthority2 =IssuingAuthority1.substring(1,20);
		
		String IssuingAuthority = "Government of India";
		
		System.err.println("IDIssueData :" + IssuingAuthority2);
		
		Assert.assertEquals(IssuingAuthority, IssuingAuthority2);
	    
	}

	@And("User_610 verify the Data Display in Control Of Issue under identification details")
	public void user_verify_the_data_display_in_control_of_issue_under_identification_details() {
		String ControlOfIssue1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610"))
				.getAttribute("aria-label");
		String ControlOfIssue2 =ControlOfIssue1.substring(1,6);
		
		String ControlOfIssue = "INDIA";
		
		System.err.println("ControlOfIssue :" + ControlOfIssue2);
		
		Assert.assertEquals(ControlOfIssue, ControlOfIssue2);
	    
	}
	
	
	//------------------------@AT_DC_ID_005-----------------------------------
	
	
	@And("User_610 verify ID Type field should be mandatory display and text box")
	public void user_verify_id_type_field_should_be_mandatory_display_and_text_box() throws Throwable {
		
		// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String IdType = "document.querySelector('[ng-reflect-text=\\\"ID Type tooltip\\\"]').innerText";
						String IdTypeName = (String) javascriptHelper.executeScript("return " + IdType);
						
						System.err.println("IdType:"+IdTypeName);
						System.out.println("print");
						
						Assert.assertTrue(IdTypeName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
									}
				
				//---------------display
				
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Type_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							softAssert.fail();
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
										
					}

	@And("User_610 verify ID Type number should be mandatory display and numberic")
	public void user_verify_id_type_number_should_be_mandatory_display_and_numberic() throws Throwable {
		
		// ----------------validate mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String IdNumber = "document.querySelector('[ng-reflect-text=\\\"SCR.ID_NUMBER.TOOLTIP\\\"]').innerText";
				String IdNumberName = (String) javascriptHelper.executeScript("return " + IdNumber);
				
				System.err.println("IdNumber:"+ IdNumberName);
				Assert.assertTrue(IdNumberName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		//-----------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Id_Number_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}

	@And("User_610 verify Issue Date field should be non mandatory display and calender")
	public void user_verify_id_type_field_should_be_non_mandatory_display_and_calender() throws Throwable {
	    
		// ----------------validate non-mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String IssueDate = "document.querySelector('label[ng-reflect-text=\"Issue Date\"]').innerText";
				String IssueDateName = (String) javascriptHelper.executeScript("return " + IssueDate);
				
				System.err.println("IssueDate:"+IssueDateName);
				Assert.assertTrue(!IssueDateName.contains("*"));
				
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		//-------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Issue_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
		// -------------------validate type  date

		Thread.sleep(1000);
		
		String IssueDateFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("getAtribute_InIssueDate_610"))
				.getTagName();
		
		System.err.println("IdType:  " + IssueDateFormat);

		String assertIssueDateFormat = "p-calendar";
		
		Assert.assertEquals(assertIssueDateFormat, IssueDateFormat);
		
		
	}
	
	//-----------------------------@AT_DC_ID_006-----------------------------------
	
	
	@And("User_610 verify Expiry Date field should be non mandatory display and text box")
	public void user_verify_expiry_date_field_should_be_mandatory_display_and_text_box() throws Throwable {
		
		// ----------------validate non-mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String ExpiryDate = "document.querySelector('label[ng-reflect-text=\"Expiry Date\"').innerText";
						String ExpiryDateName = (String) javascriptHelper.executeScript("return " + ExpiryDate);
						
						System.err.println("ExpiryDate:"+ExpiryDateName);
						Assert.assertTrue(!ExpiryDateName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				//---------------display
				
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Expiry_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							softAssert.fail();
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
				
				// -------------------validate type  date

				Thread.sleep(1000);
				
				String ExpiryDateFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("getAtribute_InExpiryeDate_610"))
						.getTagName();
				
				System.err.println("ExpiryDate:  " + ExpiryDateFormat);

				String assertExpiryDateFormat = "p-calendar";
				
				Assert.assertEquals(assertExpiryDateFormat, ExpiryDateFormat);
	    
	}

	@And("User_610 verify Issuing Authority number should be non mandatory display and numberic")
	public void user_verify_issuing_authority_number_should_be_mandatory_display_and_numberic() {
		
		// ----------------validate non-mandatory field

//				for (int i = 0; i < 2000; i++) {
//					try {
//						String IssuingAuthority = "document.querySelector('ion-label[ng-reflect-text="Issuing Authority"').innerText";
//						String IssuingAuthorityName = (String) javascriptHelper.executeScript("return " + IssuingAuthority);
//						
//						System.err.println("IssuingAuthority:"+IssuingAuthorityName);
//						Assert.assertTrue(!IssuingAuthorityName.contains("*"));
//						
//						break;
//					} catch (Exception e) {
//						if (i == 1999) {
//							Assert.fail(e.getMessage());
//						}
//					}
//							}
		
		//----------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify Country of Issue field should be non mandatory display and calender")
	public void user_verify_country_of_issue_field_should_be_non_mandatory_display_and_calender() {
		
		// ----------------validate non-mandatory field

//				for (int i = 0; i < 2000; i++) {
//					try {
//						String CountryofIssue = "document.querySelector('ion-label[ng-reflect-text=\"Country of Issue\"').innerText";
//						String CountryofIssueName = (String) javascriptHelper.executeScript("return " + CountryofIssue);
//						
//						System.err.println("CountryofIssue:"+CountryofIssueName);
//						Assert.assertTrue(!CountryofIssueName.contains("*"));
//						
//						break;
//					} catch (Exception e) {
//						if (i == 1999) {
//							Assert.fail(e.getMessage());
//						}
//					}
//							}
		
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}
	
	//--------------------------CD product details or facility details 
	
	@And("User_610 click Facility Info Screen")
	public void user_click_facility_info_screen() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FacilityInfo_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Scheme field")
	public void user_verify_the_scheme_field() {
		
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Scheme_610")).isDisplayed()) {
							softAssert.fail();
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
		}

	@And("User_610 verify the product field")
	public void user_verify_the_product_field() {
		
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Product_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Request Amount field")
	public void user_verify_the_request_amount_field() {
		
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RequestAmount_610")).isDisplayed()) {
							softAssert.fail();
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	    
	}

	@And("User_610 verify the Loan Tenure field")
	public void user_verify_the_loan_tenure_field() {
	    
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("LoanTenure_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}
	
	
	//------------data under product of facility details @AT_DC_PD_003
	
	
	@And("User_610 verify the Data under Scheme field")
	public void user_verify_the_data_under_scheme_field() {
		String scheme1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Scheme_610")).getAttribute("aria-label");
		String scheme2 =scheme1.substring(1,32);
		
		String scheme = "Ijara auto retail loan scheme A";
		
		System.err.println("scheme :" + scheme2);
		
		Assert.assertEquals(scheme, scheme2);
	    
	}

	@And("User_610 verify the Data under product field")
	public void user_verify_the_data_under_product_field() {
		
		String product1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Product_610"))
				.getAttribute("aria-label");
		String product2 =product1.substring(1,51);
		
		String product = "Ijara Auto Retail Loan-Ijara Auto Retails Loan Sub";
		
		System.err.println("product :" + product2);
		
		Assert.assertEquals(product, product2);
	    
	}

	@And("User_610 verify the Data under Request Amount field")
	public void user_verify_the_data_under_request_amount_field() {
		String RequestAmt1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RequestAmount_610"))
				.getAttribute("ng-reflect-model");
		String RequestAmt2 =RequestAmt1.substring(0,7);
		
		String RequestAmt = "1405000";
		
		System.err.println("RequestAmt :" + RequestAmt2);
		
		Assert.assertEquals(RequestAmt1, RequestAmt2);
	    
	}

	@And("User_610 verify the Data under Loan Tenure field")
	public void user_verify_the_data_under_loan_tenure_field() {
	    
		String LoanTenure1 = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("LoanTenure_610"))
				.getAttribute("ng-reflect-model");
		String LoanTenure2 =LoanTenure1.substring(0,2);
		
		String LoanTenure = "48";
		
		System.err.println("LoanTenure :" + LoanTenure2);
		
		Assert.assertEquals(LoanTenure, LoanTenure2);
	}
	
	
	//-------------------------@AT_DC_PD_005
	
	@And("User_610 verify the Product field should be mandatory Display and field should text")
	public void user_verify_the_product_field_should_be_mandatory_display_and_field_should_text() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Product_610")).isDisplayed()) {
							softAssert.fail();
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
				
				// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String productMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
						String productMandtoryName = (String) javascriptHelper.executeScript("return " + productMandtory);
						
						System.err.println("productMandtory:"+productMandtoryName);
										
						Assert.assertTrue(productMandtoryName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
									}
			// -----------------select format 
				
				String productSelectFormat = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InProduct_610"))
						.getAttribute("ng-reflect-placeholder");
				
				System.err.println("productSelect:  " + productSelectFormat);

				String assertProductSelectFormat = "Select";
				
				Assert.assertEquals(assertProductSelectFormat, productSelectFormat);		
	    
	}

	@And("User_610 verify the Request Type field should be mandatory Display and field should text")
	public void user_verify_the_request_type_field_should_be_mandatory_display_and_field_should_text() {
	    
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("facilityType_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	
	
	// -----------------select format 
	
	String facilityTypeSelectFormat = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InFacilityType_610"))
			.getAttribute("ng-reflect-placeholder");
	
	System.err.println("facilityTypeSelectFormat:  " + facilityTypeSelectFormat);

	String assertfacilityTypeSelectFormat = "Select";
	
	Assert.assertEquals(assertfacilityTypeSelectFormat, facilityTypeSelectFormat);		
	
	
}
	
	//-----------------  @AT_DC_PD_006 
	
	@And("User_610 verify the Scheme field should be mandatory Display and field should text")
	public void user_verify_the_scheme_field_should_be_mandatory_display_and_field_should_text() {
	    
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Scheme_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
		// ----------------validate mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String schemeMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.MODULE.FACILITY_DETAILS.SC\"]').innerText";
				String schemeMandtoryName = (String) javascriptHelper.executeScript("return " + schemeMandtory);
				
				System.err.println("schemeMandtoryName:"+schemeMandtoryName);
								
				Assert.assertTrue(schemeMandtoryName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
							}
		
		// -----------------select format 
		
		String schemeSelectFormat = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InFacilityType_610"))
				.getAttribute("ng-reflect-placeholder");
		
		System.err.println("schemeSelectFormat:  " + schemeSelectFormat);

		String assertschemeSelectFormat= "Select";
		
		Assert.assertEquals(assertschemeSelectFormat, schemeSelectFormat);
	    
	}

	@And("User_610 verify the Request Amount field should be Non mandatory Display and field should text")
	public void user_verify_the_request_amount_field_should_be_non_mandatory_display_and_field_should_text() {
	    
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RequestAmount_610")).isDisplayed()) {
					softAssert.fail();
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
		
		// ----------------validate mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String requestAmountMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.MODULE.FACILITY_DETAILS.AM\"]').innerText";
				String requestAmountMandtoryName = (String) javascriptHelper.executeScript("return " + requestAmountMandtory);
				
				System.err.println("requestAmountMandtoryName:"+requestAmountMandtoryName);
								
				Assert.assertTrue(requestAmountMandtoryName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
							}
		
		// -----------------select numeric 
		
		String requestAmtNumericFormat = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RequestAmount_610"))
				.getAttribute("mode");
		
		System.err.println("requestAmtNumericFormat:  " + requestAmtNumericFormat);

		String assertrequestAmtNumericFormat = "decimal";
		
		Assert.assertEquals(assertrequestAmtNumericFormat, requestAmtNumericFormat);
		
	    
	}
	
	 //--------------------------------------@AT_DC_PD_007
	
	@And("User_610 verify the Tenure Months field should be mandatory Display and field should text")
	public void user_verify_the_tenure_months_field_should_be_mandatory_display_and_field_should_text() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("LoanTenure_610")).isDisplayed()) {
							softAssert.fail();
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
				
				
				// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String tenureMonthMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.MODULE.FACILITY_DETAILS.TE\"]').innerText";
						String tenureMonthMandtoryName = (String) javascriptHelper.executeScript("return " + tenureMonthMandtory);
						
						System.err.println("tenureMonthMandtoryName:"+tenureMonthMandtoryName);
										
						Assert.assertTrue(tenureMonthMandtoryName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
									}
				
				// -----------------select numeric 
				
				String requestAmtNumericFormat = javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InTenure_610"))
						.getAttribute("type");
				
				System.err.println("requestAmtNumericFormat:  " + requestAmtNumericFormat);

				String assertrequestAmtNumericFormat = "number";
				
				Assert.assertEquals(assertrequestAmtNumericFormat, requestAmtNumericFormat);
				
				
	}
	
	//------------offering offer details  @AT_OFL_01-------------------------------------------------------------------------------------
	
	@And("User_610 verify the Customer Decline button field available on offer details screen")
	public void user_verify_the_customer_decline_button_field_available_on_offer_details_screen() {
		//---------------------display
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InTenure_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Print button field available on offer details screen")
	public void user_verify_the_print_button_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_InTenure_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Back button field available on offer details screen")
	public void user_verify_the_back_button_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn_UnderCustomerDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Accept Offer field available on offer details screen")
	public void user_verify_the_accept_offer_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("AcceptOffer_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Offer Details Section field available on offer details screen")
	public void user_verify_the_offer_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
			System.out.println(jsPaths2.getElement("OfferDetailsSection_610"));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OfferDetailsSection_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						
					}
				}
	}

	@And("User_610 verify the Finance Details Section field available on offer details screen")
	public void user_verify_the_finance_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FinanceDetailsSection_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Credit Risk Factor Sectioin field available on offer details screen")
	public void user_verify_the_credit_risk_factor_sectioin_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditRiskFactor_610")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditRiskFactor_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Credit Score Details Section field available on offer details screen")
	public void user_verify_the_credit_score_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditScoreDetails_610")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditScoreDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Eligibility Details Screen field available on offer details screen")
	public void user_verify_the_eligibility_details_screen_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("EligibilityDetails_610")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("EligibilityDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Interest Rate Structure Section field available on offer details screen")
	public void user_verify_the_interest_rate_structure_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("InterestRateStructure_610")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("InterestRateStructure_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Installments Section field available on offer details screen")
	public void user_verify_the_installments_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("InstallmentsSection_610")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("InstallmentsSection_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	}

	@And("User_610 verify the Appeal Request Section field available on offer details screen")
	public void user_verify_the_appeal_request_section_field_available_on_offer_details_screen() {
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("AppealRequestsection_610")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("AppealRequestsection_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 199) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
	    
	}
	
	//-----------------data should read only-------------
	
	@And("User_610 verify Product data should be read only")
	public void user_verify_product_data_should_be_read_only() {
	String offProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_product_610"))
			.getAttribute("ng-reflect-readonly");
	    System.err.println(offProduct);
	    
	    Assert.assertEquals("true",offProduct);
	    
	    	}

	@And("User_610 verify Sub Product data should be read only")
	public void user_verify_sub_product_data_should_be_read_only() {
		String offSubProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_SubProduct_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offSubProduct);
	    Assert.assertEquals("true",offSubProduct);
	}

	@And("User_610 verify Scheme data should be read only")
	public void user_verify_scheme_data_should_be_read_only() {
		String offScheme=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_Scheme_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offScheme);
	    Assert.assertEquals("true",offScheme);
	}

	@And("User_610 verify Princing Indicator data should be read only")
	public void user_verify_princing_indicator_data_should_be_read_only() {
		String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_PrincingIndicator_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offPrincingIndicator);
	    Assert.assertEquals("true",offPrincingIndicator);
	}
	
	//------------------------@AT_OFL_02
	
	@And("User_610 verify the Back button field")
	public void user_verify_the_back_button_field() throws Throwable {
	    
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn_UnderCustomerDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn_UnderCustomerDetails_610")).click();
		
//		//---------------------display
//		
//		for (int j = 0; j < 200; j++) {
//			try {
//				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn_UnderCustomerDetails_610")).isDisplayed()) {
//					Assert.assertTrue(true);
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_NavigativeFacilityScreen_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_NavigativeFacilityScreen_610")).isDisplayed());
		
	}
	
	//---------------------@AT_OFL_03   offer details screen
	
	@And("User_610 verify the Product field available in offer details")
	public void user_verify_the_product_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflProduct_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflProduct_610"))
						.isDisplayed());
		
		//--read only
		
		String offProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_product_610"))
				.getAttribute("ng-reflect-readonly");
		    System.err.println(offProduct);
		    
		    Assert.assertEquals("true",offProduct);
	    
	}

	@And("User_610 verify the Sub Product field available in offer details")
	public void user_verify_the_sub_product_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflSubProduct_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflSubProduct_610"))
						.isDisplayed());
		
		//--read only
		
		String offSubProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_SubProduct_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offSubProduct);
	    Assert.assertEquals("true",offSubProduct);
	    
	}

	@And("User_610 verify the Scheme field available in offer details")
	public void user_verify_the_scheme_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflScheme_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflScheme_610"))
						.isDisplayed());
		//------------read only
		
		String offScheme=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_Scheme_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offScheme);
	    Assert.assertEquals("true",offScheme);
	    
	}

	@And("User_610 verify the Pricing Indicator field available in offer details")
	public void user_verify_the_pricing_indicator_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflPrincingIndicator_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflPrincingIndicator_610"))
						.isDisplayed());
		
		//-------read only
		
		String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_PrincingIndicator_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offPrincingIndicator);
	    Assert.assertEquals("true",offPrincingIndicator);
	    
	}

	@And("User_610 verify the Product Offer Amount available in offer details")
	public void user_verify_the_product_offer_amount_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflOfferdAmount_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflOfferdAmount_610"))
						.isDisplayed());
		
		//-------read only
		
				String offProductOfferAmount=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflOfferdAmount_610")).getAttribute("ng-reflect-readonly");
			    System.err.println(offProductOfferAmount);
			    Assert.assertEquals("true",offProductOfferAmount);
	    
	}

	@And("User_610 verify the Tenure field available in offer details")
	public void user_verify_the_tenure_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflTenure_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflTenure_610"))
						.isDisplayed());
		
		//-------read only
		
		String offTenure=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflTenure_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offTenure);
	    Assert.assertEquals("true",offTenure);
	    
	}

	@And("User_610 verify the Nature Of Finance field available in offer details")
	public void user_verify_the_nature_of_finance_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("OflNaturalOfFinance_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("OflNaturalOfFinance_610"))
						.isDisplayed());
		
		//------------read only 
		
		String offNatureOfFinance=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflNaturalOfFinance_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(offNatureOfFinance);
	    Assert.assertEquals("true",offNatureOfFinance);
	    
	}
	
	@And("User_610 verify the Currency field available in offer details")
	public void user_verify_the_currency_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflCurrency_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflCurrency_610")).isDisplayed());
		
		//------------read only 
		
				String offCurrency=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflCurrency_610")).getAttribute("ng-reflect-readonly");
			    System.err.println(offCurrency);
			    Assert.assertEquals("true",offCurrency);
	    
	}
	
	//---------------------------@AT_OFL_04--------------------
	
	@And("User_610 verify the Amount Request field available in Finance details screen")
	public void user_verify_the_amount_request_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAmountRequested_610")));
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAmountRequested_610")));
//		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAmountRequested_610")).isDisplayed());
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAmountRequested_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_610 verify the Down Payment Amount field available in Finance details screen")
	public void user_verify_the_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentAmount_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentAmount_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentAmount_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Down Payment Amount field available in Finance details screen")
	public void user_verify_the_total_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalDownPaymentAmount_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalDownPaymentAmount_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalDownPaymentAmount_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Profit Amount field available in Finance details screen")
	public void user_verify_the_total_profit_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdProfitAmount_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdProfitAmount_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdProfitAmount_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Contract Value field available in Finance details screen")
	public void user_verify_the_total_contract_value_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalContractAmount_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalContractAmount_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalContractAmount_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Income field available in Finance details screen")
	public void user_verify_the_total_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalIncome_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalIncome_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalIncome_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Net Income field available in Finance details screen")
	public void user_verify_the_total_net_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalNetIncome")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalNetIncome")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalNetIncome")).isDisplayed());
	    
	}

	@And("User_610 verify the Installment Fraquency field available in Finance details screen")
	public void user_verify_the_installment_fraquency_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdInstallmentFrequence_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdInstallmentFrequence_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdInstallmentFrequence_610")).isDisplayed());
	    
	}

	@And("User_610 verify the IRR field available in Finance details screen")
	public void user_verify_the_irr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdIRR_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdIRR_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdIRR_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Tenure field available in Finance details screen")
	public void user_verify_the_tenure_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTenure_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTenure_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTenure_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Additional Down Payment field available in Finance details screen")
	public void user_verify_the_additional_down_payment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAdditionalDownPayment_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAdditionalDownPayment_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAdditionalDownPayment_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Down Payment Percentage field available in Finance details screen")
	public void user_verify_the_down_payment_percentage_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentPercentage_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentPercentage_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentPercentage_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Fees field available in Finance details screen")
	public void user_verify_the_total_fees_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalFees_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalFees_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalFees_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Total Obligations field available in Finance details screen")
	public void user_verify_the_total_obligations_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalObligation_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalObligation_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalObligation_610")).isDisplayed());
	    
	}

	@And("User_610 verify the No Of Installment field available in Finance details screen")
	public void user_verify_the_no_of_installment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdNoOfInstallment_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdNoOfInstallment_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdNoOfInstallment_610")).isDisplayed());
	    
	}

	@And("User_610 verify the Last Installment Amount field available in Finance details screen")
	public void user_verify_the_last_installment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdLastInstallmentAmount_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdLastInstallmentAmount_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdLastInstallmentAmount_610")).isDisplayed());
	    
	}

	@And("User_610 verify the APR field available in Finance details screen")
	public void user_verify_the_apr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAPR_610")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAPR_610")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAPR_610")).isDisplayed());
	    
	}
	
	//-----------------@AT_OFL_05---------------
	
	@And("User_610 verify the Offer Details Section Screen Under All field Should read only")
	public void user_verify_the_offer_details_section_screen_under_all_field_should_read_only() {
		
		//--read only  -- product
		
				String offProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_product_610"))
						.getAttribute("ng-reflect-readonly");
				System.err.println(offProduct);
				Assert.assertEquals("true",offProduct);
				    
	    //--read only      ---------sub product
					
		    String offSubProduct=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_SubProduct_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offSubProduct);
		    Assert.assertEquals("true",offSubProduct);	
		    
		//------------read only --------scheme
			
		    String offScheme=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_Scheme_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offScheme);
		    Assert.assertEquals("true",offScheme);	
		    
		//-------read only   ------ princing indicator
			
		    String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("getAttribute_PrincingIndicator_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offPrincingIndicator);
		    Assert.assertEquals("true",offPrincingIndicator);
		    
		//-------read only Product Offer Amount
			
			String offProductOfferAmount=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflOfferdAmount_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offProductOfferAmount);
		    Assert.assertEquals("true",offProductOfferAmount);		 
		    
		  //-------read only  ------- Tenure
			
			String offTenure=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflTenure_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offTenure);
		    Assert.assertEquals("true",offTenure);		
		    
		 //------------read only  --  Nature Of Finance
			
			String offNatureOfFinance=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflNaturalOfFinance_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offNatureOfFinance);
		    Assert.assertEquals("true",offNatureOfFinance);		    
		    
		 //------------read only 
			
			String offCurrency=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("OflCurrency_610")).getAttribute("ng-reflect-readonly");
		    System.err.println(offCurrency);
		    Assert.assertEquals("true",offCurrency);		    
	}
	

	@And("User_610 verify the Total Down Payment Amount field read only")
	public void user_verify_the_total_down_payment_amount_field_read_only() {
		String OffTotalDownPaymentAmount=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalDownPaymentAmount_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalDownPaymentAmount);
	    Assert.assertEquals("true",OffTotalDownPaymentAmount);
	    
	}

	@And("User_610 verify the Profit Amount field read only")
	public void user_verify_the_profit_amount_field_read_only() {
		String OffProfitAmount=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdProfitAmount_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffProfitAmount);
	    Assert.assertEquals("true",OffProfitAmount);
	    
	}

	@And("User_610 verify the Total Contract Value field read only")
	public void user_verify_the_total_contract_value_field_read_only() {
		String OffTotalContractValue=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdTotalContractAmount_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalContractValue);
	    Assert.assertEquals("true",OffTotalContractValue);
	    
	}

	@And("User_610 verify the Additional Down Payment field read only")
	public void user_verify_the_additional_down_payment_field_read_only() {
		String OffAdditionalDownPayment=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdAdditionalDownPayment_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffAdditionalDownPayment);
	    Assert.assertEquals("true",OffAdditionalDownPayment);
	    
	}

	@And("User_610 verify the Down Payment Percentage field read only")
	public void user_verify_the_down_payment_percentage_field_read_only() {
		String OffTotalDownPaymentPercentage=javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("FdDownPaymentPercentage_610")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalDownPaymentPercentage);
	    Assert.assertEquals("true",OffTotalDownPaymentPercentage);
	    
	}
	
	//---------------------@AT_OFL_06  credit rise factor --------
	
	@And("User_610 verify the Total Score field under credit rise factor")
	public void user_verify_the_total_score_field_under_credit_rise_factor() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditRiskFactor_610")));
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("TotalScore_610")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("TotalScore_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Rise Level field under credit rise factor")
	public void user_verify_the_rise_level_field_under_credit_rise_factor() {
	    
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RiseLevel_610")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RiseLevel_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	}
	
	//-------------------------@AT_OFL_07 credit Score details
	
	@And("User_610 verify the SR NO field under credit Score details")
	public void user_verify_the_sr_no_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CreditScoreDetails_610")));
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_SrNo_610")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_SrNo_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_610 verify the Customer Name field under credit Score details")
	public void user_verify_the_customer_name_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_CustomerName_610")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_CustomerName_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_610 verify the Credit Bureau Score field under credit Score details")
	public void user_verify_the_credit_bureau_score_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_CreditBureuaScore_610")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CSD_CreditBureuaScore_610")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}
	
	//-------------New Application Customer reference---------------------- @AT_IJ_NewApp_CR_01
	
	@And("User_610 click Addition Customer Info Under New Application")
	public void user_click_addition_customer_info_under_new_application() {
	    
		for (int a = 0; a < 300; a++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("additionalCustomerInfo_610")).click();
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
			}

	@And("User_610 click edit button Info Under New Application")
	public void user_click_edit_button_info_under_new_application() {
	    
		for (int a = 0; a < 300; a++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtnIndex2_610")).click();
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
					
	}

	@And("User_610 click Add button Info in Reference List View Under New Application")
	public void user_click_add_button_info_in_reference_list_view_under_new_application() {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isEmpty())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase((" References List View ").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	    
	}
	
	//-------------verify fields in reference customer
	
	@And("User_610 verify the Add and Save button field in Reference List View Under New Application")
	public void user_verify_the_add_and_save_button_field_in_reference_list_view_under_new_application() {
	   
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("backBtn02_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}
	
	
	@And("User_610 verify the Relationship Type field in Reference List View Under New Application")
	public void user_verify_the_relationship_type_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("relationshipType_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_610 verify the Salutation field in Reference List View Under New Application")
	public void user_verify_the_salutation_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("salutation_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the First Name field in Reference List View Under New Application")
	public void user_verify_the_first_name_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("firstName_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Middle Name field in Reference List View Under New Application")
	public void user_verify_the_middle_name_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("middleName_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Last Name field in Reference List View Under New Application")
	public void user_verify_the_last_name_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("lastName_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Customer Full Name field in Reference List View Under New Application")
	public void user_verify_the_customer_full_name_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("customerFullName_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Identification Type field in Reference List View Under New Application")
	public void user_verify_the_identification_type_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("identificationType_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Identification Number field in Reference List View Under New Application")
	public void user_verify_the_identification_number_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("IidentificationNumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Residence Address field in Reference List View Under New Application")
	public void user_verify_the_residence_address_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("residenceAddress_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Office Address field in Reference List View Under New Application")
	public void user_verify_the_office_address_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("officeAddress_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Contact Number field in Reference List View Under New Application")
	public void user_verify_the_contact_number_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("contactNumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Office Phone Number field in Reference List View Under New Application")
	public void user_verify_the_office_phone_number_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("officePhoneNumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Primary Mobile Number Number field in Reference List View Under New Application")
	public void user_verify_the_primary_mobile_number_number_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("primaryMobileNumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Alternative Mobile field in Reference List View Under New Application")
	public void user_verify_the_alternative_mobile_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("alternativeMobileNumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Email ID field in Reference List View Under New Application")
	public void user_verify_the_email_id_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("emailID_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the No Of Year Known field in Reference List View Under New Application")
	public void user_verify_the_no_of_year_known_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("NoOfYearKnow_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_610 verify the Cif NUmber field in Reference List View Under New Application")
	public void user_verify_the_cif_n_umber_field_in_reference_list_view_under_new_application() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CIFnumber_610")).isDisplayed()){
					Assert.assertTrue(true);
					break;
				} 
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}
	
	///---------------------------@AT_IJ_NewApp_CR_02
	
	@And("User_610 verify the any mandatory field blank and save system should not allow user to save the record")
	public void user_verify_the_any_mandatory_field_blank_and_save_system_should_not_allow_user_to_save_the_record() throws Throwable {
	   
		for (int i = 0; i < 3000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("saveBtn_610")).click();
				break;		}
			catch (Exception e) {
				// TODO: handle exception
				if (i==2999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	for (int i = 0; i < 3000; i++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("fillAllTheDetailsPopup_610")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			if (i==2999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	    Thread.sleep(2000);
	}

	@And("User_610 verify enter numeric value in character field system should not allow user to save the record")
	public void user_verify_enter_numeric_value_in_character_field_system_should_not_allow_user_to_save_the_record() {
	    	    
	}

	@And("User_610 verfiy enter character value in numeric field system should not allow user to save the record")
	public void user_verfiy_enter_character_value_in_numeric_field_system_should_not_allow_user_to_save_the_record() {
	    	    
	}

	@And("User_610 verify enters only special characters value in any field system should not allow user to save the record")
	public void user_verify_enters_only_special_characters_value_in_any_field_system_should_not_allow_user_to_save_the_record() {
		
		
		for (int i = 0; i < 3000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("firstName_610")).click();
				break;
				}
			 catch (Exception e) {
				// TODO: handle exception
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 3000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("firstName_610")).sendKeys("@#$@");
				break;
				}
			 catch (Exception e) {
				// TODO: handle exception
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 3000; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("onlyAlphaNumericCharterPopup_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	                                 //************************************  Murabha Product ***************************************
	
	@And("User_610 click document details in murabha")
	public void user_click_document_details_in_murabha() {
	   					
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Murabha_DocumentsDetailsScreen_610")).click();
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					// TODO: handle exception
				}
			}
			}
					
	}
	
	
	@And("User_610 verify the Required At Stage field is displayed in document details screen")
	public void user_verify_the_required_at_stage_field_is_displayed_in_document_details_screen() {
		
	    for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RequiredAtStage_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Documents Status field is displayed in document details screen")
	public void user_verify_the_documents_status_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentStatus_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Mandatory Optional field is displayed in document details screen")
	public void user_verify_the_mandatory_optional_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Mandatory_Optional_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Document categeroy field is displayed in document details screen")
	public void user_verify_the_document_categeroy_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentCategeroy_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Defferral Stage field is displayed in document details screen")
	public void user_verify_the_defferral_stage_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DefferralStage_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Def Approved By field is displayed in document details screen")
	public void user_verify_the_def_approved_by_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DefApprovedBy_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Change In Natural By field is displayed in document details screen")
	public void user_verify_the_change_in_natural_by_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("ChangeInNaturalBy_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Documents Form field is displayed in document details screen")
	public void user_verify_the_documents_form_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentsFrom_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Documents Quality field is displayed in document details screen")
	public void user_verify_the_documents_quality_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentQuality_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Documents Recevied By field is displayed in document details screen")
	public void user_verify_the_documents_recevied_by_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentRecivedBy")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Upload BY field is displayed in document details screen")
	public void user_verify_the_upload_by_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("UploadDate_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Expected Recepited Date field is displayed in document details screen")
	public void user_verify_the_expected_recepited_date_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("ExpectedRecepitedDate_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Data of Expiry field is displayed in document details screen")
	public void user_verify_the_data_of_expiry_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DataOfExpiry_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Documents Reference Number field is displayed in document details screen")
	public void user_verify_the_documents_reference_number_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentReferenceNumber_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Rack No field is displayed in document details screen")
	public void user_verify_the_rack_no_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("RackNo_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Shall No field is displayed in document details screen")
	public void user_verify_the_shall_no_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("ShelfN0_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Box No field is displayed in document details screen")
	public void user_verify_the_box_no_field_is_displayed_in_document_details_screen() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BoxNo_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		
	}
	
	
	                                                    //---------------------- @AT_MU_DOC_02 --------
	
	
	@And("User_610 select the optional in Mandatory Optional field")
	public void user_select_the_optional_in_mandatory_optional_field() throws Throwable {
		
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Mandatory_Optional_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();

					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}

				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}

				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());

		//	System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase("Optional")) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
						Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		} 
		Thread.sleep(3000);
	}

	@And("User_610 select the Pan Card in Document Name")
	public void user_select_the_pan_card_in_document_name() throws Throwable {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentName_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		
		//----------- Pan Card  dropdown
		
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();

					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}

				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}

				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());

		//	System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase("Pan Card")) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
						Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		} 
		Thread.sleep(3000);
	}
	

	@And("User_610 select the Not Received in Documents Status")
	public void user_select_the_not_received_in_documents_status() throws Throwable {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentStatus_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		
		//---------------dropdown
		
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();

					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}

				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}

				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());

		//	System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase("Not Received")) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
						Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		} 
		Thread.sleep(2000);
		
	}

	@And("User_610 select the KYC Document in Document Categery")
	public void user_select_the_kyc_document_in_document_categery() throws Throwable {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentCategeroy_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		
		//------------dropdown
		
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();

					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}

				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}

				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());

		//	System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase("KYC Document")) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
						Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		} 
		Thread.sleep(2000);
		
	}

	@And("User_610 select the optional in Document Quality")
	public void user_select_the_optional_in_document_quality() throws Throwable {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentQuality_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		
		//------------dropdown
		
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();

					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}

				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}

				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());

		//	System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase("Not Clear")) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
						Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		} 
		Thread.sleep(3000);
		
	}

	@And("User_610 enter the value in Remarks")
	public void user_enter_the_value_in_remarks() throws Throwable {
	    
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Remarks_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Remarks_610")).click();
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Remarks_610")).sendKeys("test");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
		Thread.sleep(4000);
			}
	//-----------click save btn -----------
	
	@And("User_610 click save button")
	public void user_click_save_button() {
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("saveBtn_610")).click();;
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
		}
	
	}
	
	//------------------Validate  the success message
	
	@And("User_610 save button and verify the success message")
	public void user_save_button_and_verify_the_success_meassage() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("ApplicationID_610")));
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610")).click();;
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
			
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
			
		}
		
		
	}
	
                                 	//-------------------------------- @AT_MU_DOC_03     ---------------------------
	
	
	@And("User_610 verify the Documents Name field should be mandatory")
	public void user_verify_the_documents_name_field_should_be_mandatory() {
	    
		// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String DocumentsName = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_NAME.TOOLTIP\"]').innerText";
						String DocumentsNameName2 = (String) javascriptHelper.executeScript("return " + DocumentsName);
						
						System.err.println("Documents:"+ DocumentsNameName2);
						Assert.assertTrue(DocumentsNameName2.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				// -------------------validate type should be dropdown  --- Select

				
				String DocumentNameFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("DocumentName_610"))
						.getAttribute("ng-reflect-placeholder");
				System.err.println("first print  " + DocumentNameFormat);

				String assertDocumentNameFormat = "Select";
				Assert.assertEquals(assertDocumentNameFormat, DocumentNameFormat);
				
				//---------field should be editable
				
				String DocumentNameEditable = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentName_610"))
						.getAttribute("ng-reflect-readonly");
				System.err.println("first print  " + DocumentNameEditable);

				String assertDocumentNameEditable = "false";
				Assert.assertEquals(assertDocumentNameEditable, DocumentNameEditable);
	    
	}

	@And("User_610 verify the status field should be mandator editable dropdown")
	public void user_verify_the_status_field_should_be_mandator_editable_dropdown() {
		
		// ----------------validate mandatory field

		for (int i = 0; i < 2000; i++) {
			try {
				String DocumentStatus = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_NAME.TOOLTIP\"]').innerText";
				String DocumentStatusName = (String) javascriptHelper.executeScript("return " + DocumentStatus);
				
				System.err.println("DocumentStatus:"+ DocumentStatusName);
				Assert.assertTrue(DocumentStatusName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		// -------------------validate type should be dropdown  --- Select

		
				String DocumentStatusFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("DocumentStatus_610"))
						.getAttribute("ng-reflect-placeholder");
				System.err.println("first print  " + DocumentStatusFormat);

				String assertDocumentStatusFormat = "Select";
				Assert.assertEquals(assertDocumentStatusFormat, DocumentStatusFormat);
	    
				
        //---------field should be editable
				
				String DocumentNameEditable = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentStatus_610"))
						.getAttribute("ng-reflect-readonly");
				System.err.println("first print  " + DocumentNameEditable);
				String assertDocumentNameEditable = "false";
				
				Assert.assertEquals(assertDocumentNameEditable, DocumentNameEditable);
				

	}

	@And("User_610 verify the quality field should be mandatory editable drpodown")
	public void user_verify_the_quality_field_should_be_mandatory_editable_drpodown() {
	    
		// ----------------validate mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String DocumentQuality = "document.querySelector('ion-label[ng-reflect-text=\"Document Quality.TOOLTIP\"]').innerText";
						String DocumentQualityName = (String) javascriptHelper.executeScript("return " + DocumentQuality);
						
						System.err.println("DocumentQuality:"+ DocumentQualityName);
						Assert.assertTrue(DocumentQualityName.contains("*"));
						
						//-------Non Mandatory
						//	Assert.assertEquals(false, DocumentQualityName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				// -------------------validate type should be dropdown  --- Select

				
				String DocumentQualityFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("DocumentStatus_610"))
						.getAttribute("ng-reflect-placeholder");
				System.err.println("first print  " + DocumentQualityFormat);

				String assertDocumentQualityFormat = "Select";
				Assert.assertEquals(assertDocumentQualityFormat, DocumentQualityFormat);
				
          //---------field should be editable
				
				String DocumentQualityEditable = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentQuality_610"))
						.getAttribute("ng-reflect-readonly");
				System.err.println("first print  " + DocumentQualityEditable);
				String assertDocumentQualityEditable = "false";
				
				Assert.assertEquals(assertDocumentQualityEditable, DocumentQualityEditable);
	    
	}

	@And("User_610 verify the date field should be non mandatory and date")
	public void user_verify_the_date_field_should_be_non_mandatory_and_date() {
	    
		// ----------------validate non mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String UploadDate = "document.querySelector('digital-prime-date[ng-reflect-title=\"UPLOAD_DATE\"]').innerText";
				String UploadDateName = (String) javascriptHelper.executeScript("return " + UploadDate);
				
				System.err.println("UploadDateName:"+ UploadDateName);
			
				Assert.assertEquals(false, UploadDateName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		// -------------------validate type should be date

		
		String UpLoadFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("UploadDate_610"))
				.getAttribute("ng-reflect-date-format");
		System.err.println("first print  " + UpLoadFormat);

		String assertUpLoadFormat = "dd-M-yy";
		Assert.assertEquals(assertUpLoadFormat, UpLoadFormat);
		
	}
	
	
	                                            //--------------------------  @AT_MU_DOC_04  --------------
	
	
	@And("User_610 verify the Location field should non be mandatory Select")
	public void user_verify_the_location_field_should_non_be_mandatory_Select() {
	    
		// ----------------validate non mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String UploadDate = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_DETAILS_LOCATION_WHER\"]').parentElement.lastChild.innerText";
						String UploadDateName = (String) javascriptHelper.executeScript("return " + UploadDate);
						
						System.err.println("UploadDateName:"+ UploadDateName);
					
						Assert.assertEquals(false, UploadDateName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				
             // -------------------validate type should be dropdown  --- Select

				
				String LocationFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("LocationRecivedBy_610"))
						.getAttribute("ng-reflect-placeholder");
				System.err.println("first print  " + LocationFormat);

				String assertDocumentQualityFormat = "Select";
				Assert.assertEquals(assertDocumentQualityFormat, LocationFormat);
				
				
	    
	}

	@And("User_610 verify the Rack No field should be non mandator TextBox")
	public void user_verify_the_rack_no_field_should_be_non_mandator_text_box() {
	    
		// ----------------validate non mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String RackNo = "document.querySelector('ion-label[ng-reflect-text=\"FORM.RACK_NUMBER.TOOLTIP\"]').parentElement.innerText";
						String RackNoName = (String) javascriptHelper.executeScript("return " + RackNo);
						
						System.err.println("RackNoName:"+ RackNoName);
					
						Assert.assertEquals(false, RackNoName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				// -------------------validate type should be Text

				
				String RackNoFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("RackNo_610"))
						.getAttribute("ng-reflect-type");
				System.err.println("first print  " + RackNoFormat);

				String assertRackNoFormat = "text";
				Assert.assertEquals(assertRackNoFormat, RackNoFormat);
				
	}

	@And("User_610 verify the Self No field should be non mandatory TextBox")
	public void user_verify_the_self_no_field_should_be_non_mandatory_text_box() {
	    
		// ----------------validate non mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String SelfNo = "document.querySelector('ion-label[ng-reflect-text=\"FORM.SHELF_NUMBER.TOOLTIP\"]').parentElement.innerText";
						String SelfNoName = (String) javascriptHelper.executeScript("return " + SelfNo);
						
						System.err.println("SelfNoName:"+ SelfNoName);
					
						Assert.assertEquals(false, SelfNoName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
       // -------------------validate type should be Text

				
				String SelfNoFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("ShelfN0_610"))
						.getAttribute("ng-reflect-type");
				System.err.println("first print  " + SelfNoFormat);

				String assertSelfNoFormat = "text";
				Assert.assertEquals(assertSelfNoFormat, SelfNoFormat);
				
	}

	@And("User_610 verify the Box No field should be non mandatory TextBox")
	public void user_verify_the_box_no_field_should_be_non_mandatory_text_box() {
	    
		// ----------------validate non mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String BoxNo = "document.querySelector('ion-label[ng-reflect-text=\"FORM.BOX_NUMBER.TOOLTIP\"]').parentElement.innerText";
						String BoxNoName = (String) javascriptHelper.executeScript("return " + BoxNo);
						
						System.err.println("BoxNoName:"+ BoxNoName);
					
						Assert.assertEquals(false, BoxNoName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
         // -------------------validate type should be Text

				
				String BoxNoFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("BoxNo_610"))
						.getAttribute("ng-reflect-type");
				System.err.println("first print  " + BoxNoFormat);

				String assertBoxNoFormat = "text";
				Assert.assertEquals(assertBoxNoFormat, BoxNoFormat);
	}
	
	
	                     //--------------------------  @AT_MU_DOC_05  --------------
	
	@And("User_610 verify the Documents Category field should be mandatory Select")
	public void user_verify_the_documents_category_field_should_be_mandatory_select() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String DocumentCategory = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_CATEGORY.TOOLTIP\"]').parentElement.innerText";
				String DocumentCategoryName = (String) javascriptHelper.executeScript("return " + DocumentCategory);
				
				System.err.println("DocumentCategory:"+ DocumentCategoryName);
			
				Assert.assertEquals(true, DocumentCategoryName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		// -------------------validate type should be dropdown  --- Select

		
		String DocumentCategoryFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("DocumentCategeroy_610"))
				.getAttribute("ng-reflect-placeholder");
		System.err.println("first print  " + DocumentCategoryFormat);

		String assertDocumentCategoryFormat = "Select";
		Assert.assertEquals(assertDocumentCategoryFormat, DocumentCategoryFormat);
				
	         
	}

	@And("User_610 verify the Document From field should be non mandator select")
	public void user_verify_the_document_from_field_should_be_non_mandator_select() {
	    
		// ----------------validate non mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String DocumentFrom = "document.querySelector('ion-label[ng-reflect-text=\"Document Form.TOOLTIP\"]').parentElement.innerText";
				String DocumentFromName = (String) javascriptHelper.executeScript("return " + DocumentFrom);
				
				System.err.println("BoxNoName:"+ DocumentFromName);
			
				Assert.assertEquals(false, DocumentFromName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		// -------------------validate type should be select

		
		String DocumentFrom = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("DocumentsFrom_610"))
				.getAttribute("ng-reflect-placeholder");
		System.err.println("first print  " + DocumentFrom);

		String assertDocumentFrom = "Select";
		Assert.assertEquals(assertDocumentFrom, DocumentFrom);
		
		
	 	//---------field should be editable
		
			String DocumentNameEditable = javascriptHelper
					.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentForm_610"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + DocumentNameEditable);
			String assertDocumentNameEditable = "false";
			
			Assert.assertEquals(assertDocumentNameEditable, DocumentNameEditable);

		
	}

	@And("User_610 verify the Expected date Of Receipt field should be non mandatory date")
	public void user_verify_the_expected_date_of_receipt_field_should_be_non_mandatory_date() {
	    
		// ----------------validate non mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String ExpectedDateOfReceipt = "document.querySelector('digital-prime-date[ng-reflect-title=\"Expected Receipt Date\"]').innerText";
				String ExpectedDateOfReceiptName = (String) javascriptHelper.executeScript("return " + ExpectedDateOfReceipt);
				
				System.err.println("BoxNoName:"+ ExpectedDateOfReceiptName);
			
				Assert.assertEquals(false, ExpectedDateOfReceiptName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		// -------------------validate type should be date

		
				String ExpectedDateOfReceiptFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("ExpectedRecepitedDate_610"))
						.getAttribute("ng-reflect-date-format");
				System.err.println("first print  " + ExpectedDateOfReceiptFormat);

				String assertUpLoadFormat = "dd-M-yy";
				Assert.assertEquals(assertUpLoadFormat, ExpectedDateOfReceiptFormat);
				
		
	}

	@And("User_610 verify the Waiver Defferral Approved By field should be non mandatory TextBox")
	public void user_verify_the_waiver_defferral_approved_by_field_should_be_non_mandatory_text_box() {
	    
		// ----------------validate non mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String DefApprovedBy = "document.querySelector('ion-label[ng-reflect-text=\"DEF_APPROVED_BY.TOOLTIP\"]').parentElement.innerText";
				String DefApprovedByName = (String) javascriptHelper.executeScript("return " + DefApprovedBy);
				
				System.err.println("BoxNoName:"+ DefApprovedByName);
			
				Assert.assertEquals(false, DefApprovedByName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
	}

	@And("User_610 verify the Change in Nature of Document Approved By field should be non mandatory TextBox")
	public void user_verify_the_change_in_nature_of_document_approved_by_field_should_be_non_mandatory_text_box() {
	    
		// ----------------validate non mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String ChangeNatureOfDocumentApp = "document.querySelector('ion-label[ng-reflect-text=\"Change In Nature Approved By.T\"]').parentElement.innerText";
				String ChangeNatureOfDocumentAppName = (String) javascriptHelper.executeScript("return " + ChangeNatureOfDocumentApp);
				
				System.err.println("ChangeNatureOfDocumentAppName:"+ ChangeNatureOfDocumentAppName);
			
				Assert.assertEquals(false, ChangeNatureOfDocumentAppName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
	}
	
	            //--------------------------  @AT_MU_DOC_06  --------------
	
	@And("User_610 verify the Documents Reference Number field should be non mandatory Text")
	public void user_verify_the_documents_reference_number_field_should_be_non_mandatory_text() {
	    
		// ----------------validate non mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String DocumentReferceNumber = "document.querySelector('ion-label[ng-reflect-text=\"FORM.DOCUMENT_NUMBER.TOOLTIP\"]').parentElement.innerText";
						String DocumentReferceNumberName = (String) javascriptHelper.executeScript("return " + DocumentReferceNumber);
						
						System.err.println("DocumentReferceNumberName:"+ DocumentReferceNumberName);
					
						Assert.assertEquals(false, DocumentReferceNumberName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
           //-----------------validate type should be Text

				
				String DocumentReferceNumberFormat = javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("DocumentReferenceNumber_610"))
						.getAttribute("ng-reflect-type");
				System.err.println("first print  " + DocumentReferceNumberFormat);

				String assertDocumentReferceNumberFormat = "text";
				Assert.assertEquals(assertDocumentReferceNumberFormat, DocumentReferceNumberFormat);
				
	}

	@And("User_610 verify the Remarks field should be mandator Text")
	public void user_verify_the_remarks_field_should_be_mandator_text() {
	    
		
		// ----------------validate mandatory field

				for (int i = 0; i < 200; i++) {
					try {
						String DocumentCategory = "document.querySelector('ion-label[ng-reflect-text=\"Remarks.TOOLTIP\"]').parentElement.innerText";
						String DocumentCategoryName = (String) javascriptHelper.executeScript("return " + DocumentCategory);
						
						System.err.println("DocumentCategory:"+ DocumentCategoryName);
					
						Assert.assertEquals(true, DocumentCategoryName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 199) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
		//-----------------validate type should be Text

		
		String RemarkFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("Remarks_Format_610"))
				.getAttribute("ng-reflect-input-type");
		System.err.println("first print  " + RemarkFormat);

		String assertRemarkFormat = "text";
		Assert.assertEquals(assertRemarkFormat, RemarkFormat);
		
	}
	
	@And("User_610 verify the upload document")
	public void user_verify_the_upload_document() {
		
		for(int i=0;i<200;i++){
			 try {
				 if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("UploadDocument_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				 break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		 }
		 
	}
	
	
	//--------------------edit button under documents details
	
	@And("User_610 click edit button under documents details")
	public void user_click_edit_button_under_documents_details() throws Throwable {
	    
	 for(int i=0;i<200;i++){
		 try {
			 javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtn_UnderFollowUp_610")).click();
				break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
			// TODO: handle exception
		}
	 }Thread.sleep(3000);
	 }
	
	 //-------------------------@AT_MU_DOC_08 ----------------  Screen should get open with already filled data
	
	@And("User_610 verify the Document Name Screen should get open with already filled data")
	public void user_verify_the_document_name_screen_should_get_open_with_already_filled_data() throws Throwable {
	    
		waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentNamePancard_610")));

		
		// -------------------validate Screen should get open with already filled data

		
		String DocumentNamealreadyData = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("DocumentNamePancard_610"))
				.getAttribute("aria-label");
		System.err.println("first print  :" + DocumentNamealreadyData);

		String assertDocumentNamealreadyData = " Pan Card ,  Document Name *";
		Assert.assertEquals(assertDocumentNamealreadyData, DocumentNamealreadyData);
		
	}

	@And("User_610 verify the Document Category Screen should get open with already filled data")
	public void user_verify_the_document_category_screen_should_get_open_with_already_filled_data() throws Throwable {
	    
		waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentCategoryDigitialKYC_610")));

		// -------------------validate Screen should get open with already filled data
		
		String DocumentcategoryalreadyData = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("DocumentCategoryDigitialKYC_610"))
				.getAttribute("aria-label");
		System.err.println("first print  :" + DocumentcategoryalreadyData);

		String assertDocumentcategoryalreadyData = " Digital KYC Document ,  Document Category *";
		Assert.assertEquals(DocumentcategoryalreadyData, assertDocumentcategoryalreadyData);
	}
	
	//------------------------------------  @AT_MU_DOC_09  ------------
	
	@And("User_610 veriy the Add Back and Search button or not editable")
	public void user_veriy_the_add_back_and_search_button_or_not_editable() {
	    
		//---------field should be editable
		
		String AddBTnEditable = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentName_610"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + AddBTnEditable);

		String assertAddBTnEditable = "false";
		Assert.assertEquals(assertAddBTnEditable, AddBTnEditable);
		
		//---------field should be editable
		
		String BachBtnEditable = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentName_610"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + BachBtnEditable);

		String assertBachBtnEditable = "false";
		Assert.assertEquals(assertBachBtnEditable, BachBtnEditable);
		
		
		//---------field should be editable
		
		String SearchBtnEditable = javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("EditableDocumentName_610"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + SearchBtnEditable);

		String assertSearchBtnEditable = "false";
		Assert.assertEquals(assertSearchBtnEditable, SearchBtnEditable);
		
	    
	}

	@And("User_610 verify the functionality of Add button")
	public void user_verify_the_functionality_of_add_button() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentDetailsScreen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (j==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Matching and Mismatching data of Search")
	public void user_verify_the_matching_and_mismatching_data_of_search() throws Throwable {
	    
	           	//---------- matching  --------
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("searchBtn_underFollowUpList_610")).click();
				//javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_murabhaDocumentDetails_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_murabhaDocumentDetails_610")).sendKeys("pan card");
				break;
			} catch (Exception e) {
				if (k==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    Thread.sleep(1000);
	    
	    for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("editBtn_UnderFollowUp_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				if (j==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	    
	  //----------     mismatching    ------------
	    
	    for (int l = 0; l < 200; l++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_murabhaDocumentDetails_610")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("searchBtn_underFollowUpList_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("inputBox_searchBtn_murabhaDocumentDetails_610")).sendKeys("ccard");
				break;
			} catch (Exception e) {
				if (l==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    Thread.sleep(1000);
	    
	    for (int m = 0; m < 200; m++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("vaildate_theMisMatchingData_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (m==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	  
	}

	@And("User_610 verify the functionality of back button")
	public void user_verify_the_functionality_of_back_button() {
	    
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("DocumentDetailsFirstScreen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (j==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}
	
	@And("User_610 click the customer follow details in morabha")
	public void user_click_the_customer_follow_details_in_morabha() throws Throwable {
	    
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("nextBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("nextBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("nextBtn_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_CustomerFollowUpDetailsTab_610")));
		// javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_DocumentDetails_610")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("click_CustomerFollowUpDetailsTab_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
			Thread.sleep(2000);		
	}
	
	//-----------------  morabha  @AT_MU_FU_001
	
	@And("User_610 verify the add buttton")
	public void user_verify_the_add_buttton() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
//				.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")));
								
		for (int m = 0; m < 200; m++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (m==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
	}
	
	@And("User_610 validate called when field enabled or not under murabha customer follow details")
	public void user_validate_called_when_field_enabled_or_not_under_murabha_customer_follow_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("CalledWhen_610")));
		
		for (int m = 0; m < 200; m++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CalledWhen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (m==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	}

	@And("User_610 validate Follow Up Data field enabled or not under murabha customer follow details")
	public void user_validate_follow_up_data_field_enabled_or_not_under_murabha_customer_follow_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("followUpDate_610")));
		
		if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("followUpDate_610")).isDisplayed()) {
			Assert.assertTrue(true);;
		}
	}
	
	
	//-----------------------------   @AT_MU_FU_002  -----
	
	@And("User_610 validate the called when field should be date , mandatory and editable in murabha")
	public void user_validate_the_called_when_field_should_be_date_mandatory_and_editable_in_murabha() throws Throwable {
//		store xpath in string
//		String calledPath = "document.querySelector('[id=\"calledWhen\"] p-calendar')";
//		WebElement attribute = javascriptHelper.executeScriptWithWebElement(calledPath);
		
		String MurabhacalledWhenFormat = javascriptHelper
				.executeScriptWithWebElement(jsPaths3.getElement("CalledWhen_610"))
				.getAttribute("ng-reflect-date-format");
		
		System.err.println("tagName:  " +MurabhacalledWhenFormat);

		String assertcalled = "dd-M-yy";
		
		Assert.assertEquals(assertcalled, MurabhacalledWhenFormat);
		
		// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String calledwhen = "document.querySelector('label[ng-reflect-text=\"SCR.FOLLOWUPDTL.CALLED_WHEN.TO\"').parentElement.innerText";
						String calledwhenName = (String) javascriptHelper.executeScript("return " + calledwhen);
						System.out.println(calledwhenName);
						Assert.assertTrue(calledwhenName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
					
				}

				// ----------------click

				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("CalledWhen_610"))
								.click();
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				Thread.sleep(1000);

				for (int b = 0; b < 300; b++) {
					try {
						javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("selectTodayDateIn_FollowUPDate_UnderFollowUp_610"))
								.click();
						break;
					} catch (Exception e) {
						if (b == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
	}


	@And("User_610 validate the customer responce field should be lookUp , mandatory and editable in Murabha")
	public void user_validate_the_customer_responce_field_should_be_look_up_mandatory_and_editable_in_murabha() throws Throwable {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String customerResponceMurabha = "document.querySelector('ion-label[ng-reflect-text=\\\"SCR.FOLLOWUPDTL.CUST_RESP.TOOL\\\"]').innerText";
				String customerResponceMurabhaName = (String) javascriptHelper.executeScript("return " + customerResponceMurabha);
				
				System.err.println("customerResponceMurabha:"+ customerResponceMurabhaName);
			
				Assert.assertEquals(true, customerResponceMurabhaName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponceSelect_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// ----------dropdown-------

				String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
				String dropdownLength = "";
				boolean isDropdownValueSelected = false;
				String dropdownString = "";

				for (int i = 0; i <= 300; i++) {
					try {
						dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
						System.out.println("Dropdown length " + dropdownLength);
						if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
							break;
						}
					} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}

				int premitiveDropdownLength = Integer.parseInt(dropdownLength);

				for (int j = 0; j <= premitiveDropdownLength; j++) {
					for (int l = 0; l <= 300; l++) {
						try {
							System.out.println("L value is " + l);
							System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
							dropdownString = javascriptHelper.executeScript(
									"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
									.toString();
							if (!(dropdownString.isEmpty())) {
								System.out.println(dropdownString);
								System.out.println("Loop count " + l + " got breaked");
								break;
							}
						} catch (Exception e) {
							if (l == 300 && !(dropdownString.isEmpty())) {
								Assert.fail(e.getMessage());
							}
						}
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					}

					System.out.println("String " + dropdownString.trim());
			//		System.out.println("Map " + testData.get("CustomerResponce").trim());
					if ((dropdownString.trim())
							.equalsIgnoreCase((" REA02 ").trim())) {
						for (int k = 0; k <= 300; k++) {
							try {
								clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
								clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
								isDropdownValueSelected = true;
								break;
							} catch (Exception e) {
								if (k == 300) {
									Assert.fail(e.getMessage());
								}
							}
						}
					}
					if (isDropdownValueSelected == true) {
						break;
					}
				}
				Thread.sleep(5000);
	}

	@And("User_610 validate the follow up date field should be date , mandatory and editable in murabha")
	public void user_validate_the_follow_up_date_field_should_be_date_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String followUpDate = "document.querySelector('label[ng-reflect-text=\\\"SCR.FOLLOWUPDTL.FOLL_UP_DT.TOO\\\"]').parentElement.innerText";
				String followUpDateName = (String) javascriptHelper.executeScript("return " + followUpDate);
				
				System.err.println("followUpDateName:"+ followUpDateName);
			
			//	Assert.assertEquals(true, followUpDateName.contains("*"));
				Assert.assertTrue(!followUpDateName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_610 validate the sign Status field should be dropdown , mandatory and editable in murabha")
	public void user_validate_the_sign_status_field_should_be_dropdown_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String signStatus = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.SIGN_STATUS.TO\"').nextElementSibling.parentElement.innerText";
				String signStatusName = (String) javascriptHelper.executeScript("return " + signStatus);
				
				System.err.println("signStatusName:"+ signStatusName);
			
			//	Assert.assertEquals(true, signStatusName.contains("*"));
				Assert.assertTrue(!signStatusName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_610 validate the remarks field should be textbox , mandatory and editable in murabha")
	public void user_validate_the_remarks_field_should_be_textbox_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String Remark = "document.querySelector('ion-label[ng-reflect-text=\"SCR.REMARKS.TOOLTIP\"]').parentElement.innerText";
				String RemarkName = (String) javascriptHelper.executeScript("return " + Remark);
				
				System.err.println("RemarkName:"+ RemarkName);
			
			//	Assert.assertEquals(true, DocumentCategoryName.contains("*"));
				
				Assert.assertTrue(!RemarkName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_610 validate the save button under customer follow details in murabha")
	public void user_validate_the_save_button_under_customer_follow_details_in_murabha() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i<=500; i++) {
         	try {
         		if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
             		Assert.assertTrue(true);
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	    
	}
	
	//----------------------------------- @AT_MU_FU_005 -----------------
	
	@And("User_610 to verify the functionality of search box with matching data should be show matching data in murabha")
	public void user_to_verify_the_functionality_of_search_box_with_matching_data_should_be_show_matching_data_in_murabha() throws Throwable {
	    Thread.sleep(1000);
//	    String jsPath = "document.querySelectorAll('button[icon=\"pi pi-search\"]')[1]";
//	    WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("searchBtnFollowUpDetails_610"));
//	    WebElement searchBtnString = javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement(jsPath));
		for (int k = 0; k < 2000; k++) {
			try {
//				searchBtnString.click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("searchBtnFollowUpDetails_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("inputBox_searchBtn_underFollowUpDetails_610"))
				.sendKeys(testData01.get("Search BTn  Matching FollowUp Details"));
				break;
			} catch (Exception e) {
				if (k==1999) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    Thread.sleep(4000);
	    
//	    for (int j = 0; j < 200; j++) {
//			try {
//				if (javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("editBtn_UnderFollowUp_610")).isDisplayed()) {
//					Assert.assertTrue(true);
//					break;
//				}
//			} catch (Exception e) {
//				if (j==199) {
//					Assert.fail(e.getMessage());
//				}
//				// TODO: handle exception
//			}
//		}
	}

	@And("User_610 to verfiy the functionality of search box with not matching data should not be show no data in murabha")
	public void user_to_verfiy_the_functionality_of_search_box_with_not_matching_data_should_not_be_show_no_data_in_murabha() throws Throwable {
	    
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("inputBox_searchBtn_underFollowUpDetails_610")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("searchBtn_underFollowUpList_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("inputBox_searchBtn_underFollowUpDetails_610")).sendKeys("22222");
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    Thread.sleep(4000);
	    
	    for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("vaildate_theMisMatchingData_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	    
	    	}
	//------------- @AT_IJ_IA_01     Ijara App Data Check Insurance Info
	
	@And("User_610 click Insurance Info screen")
	public void user_click_insurance_info_screen() {
		
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("insuranceInfo_Screen_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 click view button")
	public void user_click_view_button() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("viewBtn_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_610 verify the Insurance Info screen get open")
	public void user_verify_the_insurance_info_screen_get_open() {
	    
		 for (int j = 0; j < 200; j++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_underFollowUpList_610")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	
	}
	
	//----------------------------  @AT_IJ_IA_02
	
	@And("User_610 verify the field Insurance year")
	public void user_verify_the_field_insurance_year() {
	   
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("insuranceYear_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
	}

	@And("User_610 verify the field Depreciation")
	public void user_verify_the_field_depreciation() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("depreciation_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
	}
	
	@And("User_610 verify the field Assert Price")
	public void user_verify_the_field_assert_price() {
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("assertPrice_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	 
	//------------------------@AT_IJ_IA_03
	
	@And("User_610 verify the Rate Per Price")
	public void user_verify_the_rate_per_price() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("ratePerAssert_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Minium Insurance Premium")
	public void user_verify_the_minium_insurance_premium() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("miniumInsurancePremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Base Insurance Premium")
	public void user_verify_the_base_insurance_premium() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("baseInsurancePremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	//--------------------@AT_IJ_IA_04
	
	@And("User_610 verify the VAT premium")
	public void user_verify_the_vat_premium() {
	   

		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("VATPremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_610 verify the Net Premium")
	public void user_verify_the_net_premium() {
	    

		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("NetPremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_610 verify the Back button")
	public void user_verify_the_back_button() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("viewBtn_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
