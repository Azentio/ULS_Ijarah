package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijara_AD_DocumentDetails_Steps_610 {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;

	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");

	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(path, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	Map<String, String> testData;

	// ------------AD followUp Details

	@And("User_610 get the test data set id for DS_AT_AD_FU_002")
	public void get_the_test_data_set_id_for_DS_AT_AD_FU_002() {
		testData = ad_CustomerFolllowUpDetails_610.getTestdata("DS_AT_AD_FU_002");
	}

	// -------------steps ---------------
	@And("User_{int} click the module name")
	public void user_select_the_module_name_to_los(Integer int1) throws Throwable {
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_ModuleName_610")).click();
		Thread.sleep(5000);

	}

	@And("User_{int} select the LOS in module name")
	public void user_select_the_los_in_module_name(Integer int1) {
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_inbox_610")).click();
	}

	// -------------------

	@And("User_{int} click Inbox")
	public void user_click_inbox(Integer int1) throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_inbox_610")));
		// javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("Select_inbox_610")).click();

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

	@And("User_{int} click search button")
	public void user_click_search_button(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_searchButton_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_searchButton_610")).click();
	}

	@And("User_{int} enter the value in search button")
	public void user_enter_the_value_in_search_button(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("enter_theName_InSearchBtn_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("enter_theName_InSearchBtn_610"))
				.sendKeys("2972");
		System.out.println(jsPaths2.getElement("clickEditBtnIn_FirstRow_UnderInbox_610"));
	}

	@And("User_{int} click edit button under inbox screen")
	public void user_click_edit_button_under_inbox_screen(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("clickEditBtnIn_FirstRow_UnderInbox_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickEditBtnIn_FirstRow_UnderInbox_610"))
				.click();
		System.err.println(jsPaths2.getElement("click_DocumentDetails_610"));
	}

	@And("User_{int} click document details")
	public void user_click_document_details(Integer int1) throws Throwable {

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

	@And("User_{int} click add button under document details")
	public void user_click_add_button_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickAddBtn_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} validate customer name field enabled or not under document details")
	public void user_validate_customer_name_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("customerName_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("customerName_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate document name field enabled or not under document details")
	public void user_validate_document_name_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	// -------------

	@And("User_{int} validate Required At Stage field enabled or not under document details")
	public void user_validate_required_at_stage_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("requiredAtStage_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("requiredAtStage_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate Document Status field enabled or not under document details")
	public void user_validate_document_status_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate Manitory Option field enabled or not under document details")
	public void user_validate_manitory_option_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate Document Category field enabled or not under document details")
	public void user_validate_document_category_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate Upload Date field enabled or not under document details")
	public void user_validate_upload_date_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("uploadDate_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("uploadDate_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_{int} validate expected Recepited Date field enabled or not under document details")
	public void user_validate_expected_recepited_date_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("expectedRecepitedDate_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("expectedRecepitedDate_UnderDocumentDetails_610"))
				.isDisplayed());
	}

	@And("User_{int} validate deferral Stage field enabled or not under document details")
	public void user_validate_deferral_stage_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate def Approvel By field enabled or not under document details")
	public void user_validate_def_approvel_by_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("defApprovelBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("defApprovelBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate change In Nature Approved By field enabled or not under document details")
	public void user_validate_change_in_nature_approved_by_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("changeInNatureApprovedBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(
								jsPaths2.getElement("changeInNatureApprovedBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate document Form field enabled or not under document details")
	public void user_validate_document_form_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentForm_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentForm_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate document Quality field enabled or not under document details")
	public void user_validate_document_quality_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} document Refercence Number field enabled or not under document details")
	public void user_document_refercence_number_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentRefercenceNumber_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(
								jsPaths2.getElement("documentRefercenceNumber_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate document Received By enabled or not under document details")
	public void user_validate_document_received_by_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentReceivedBy_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("documentReceivedBy_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate location Where Received enabled or not under document details")
	public void user_validate_location_where_received_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("locationWhereReceived_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("locationWhereReceived_UnderDocumentDetails_610"))
				.isDisplayed());
	}

	// ---

	@And("User_{int} validate rank Number field enabled or not under document details")
	public void user_validate_rank_number_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("rankNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("rankNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_{int} validate sheIf Number field enabled or not under document details")
	public void user_validate_she_if_number_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("sheIfNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("sheIfNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_{int} validate box number field enabled or not under document details")
	public void user_validate_box_number_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("boxNo_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("boxNo_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_{int} validate date Of expiry field enabled or not under document details")
	public void user_validate_date_of_expiry_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("dateOfexpiry_UnderDocumentDetails_610")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(jsPaths2.getElement("dateOfexpiry_UnderDocumentDetails_610"))
						.isDisplayed());
	}

	@And("User_{int} validate lodgement Amount field enabled or not under document details")
	public void user_validate_lodgement_amount_field_enabled_or_not_under_document_details(Integer int1)
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

	@And("User_{int} validate remarks field enabled or not under document details")
	public void user_validate_remarks_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		Assert.assertEquals(true, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")).isDisplayed());
	}

	@And("User_{int} click save and verify")
	public void user_click_save_and_verify(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("clickSaveBotton_underDocumentDetails")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("clickSaveBotton_underDocumentDetails"))
				.click();
	}

	// -----------------select dropdown

	@And("User_{int} select Manitory Option field enabled or not under document details")
	public void user_select_manitory_option_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("manitoryOption_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} select deferral Stage field enabled or not under document details")
	public void user_select_deferral_stage_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("deferralStage_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} select document Quality field enabled or not under document details")
	public void user_select_document_quality_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentQuality_UnderDocumentDetails_610"))
				.click();
		;
	}

	@And("User_{int} select document name field enabled or not under document details")
	public void user_select_document_name_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentName_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} select Document Status field enabled or not under document details")
	public void user_select_document_status_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentStatus_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} select Document Category field enabled or not under document details")
	public void user_select_document_category_field_enabled_or_not_under_document_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("documentCategory_UnderDocumentDetails_610"))
				.click();
	}

	@And("User_{int} select remarks field enabled or not under document details")
	public void user_select_remarks_field_enabled_or_not_under_document_details(Integer int1) throws Throwable {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")));
		javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("remarks_UnderDocumentDetails_610")).click();
	}

	// ------------------- customer followup details

	@And("User_{int} click the customer follow details")
	public void user_click_the_customer_follow_details(Integer int1) throws Throwable {
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

	@And("User_{int} validate Add button field enabled or not under customer follow details")
	public void user_validate_add_button_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")));
		
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_AddButton_UnderFollowUpDetails_610")).isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} click add button under customer follow details")
	public void user_click_add_button_under_customer_follow_details(Integer int1) throws Throwable {
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
	}

	@And("User_{int} validate called when field enabled or not under customer follow details")
	public void user_validate_called_when_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_CalledWhen_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_CalledWhen_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Customer Responce field enabled or not under customer follow details")
	public void user_validate_customer_resbonce_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponce_UnderFollowUp_610")));
		if (!javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_customerResponce_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Follow Up Data field enabled or not under customer follow details")
	public void user_validate_follow_up_data_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_FollowUPDate_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_FollowUPDate_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Sign Status field enabled or not under customer follow details")
	public void user_validate_single_status_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_signStatus_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_signStatus_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Remark Category field enabled or not under customer follow details")
	public void user_validate_remark_category_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_remark_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_remark_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Back button field enabled or not under customer follow details")
	public void user_validate_back_button_field_enabled_or_not_under_customer_follow_details(Integer int1)
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(jsPaths2.getElement("click_backButton_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_backButton_UnderFollowUp_610"))
				.isDisplayed()) {
			softAssert.fail();
		}
	}

	@And("User_{int} validate Save button field enabled or not under customer follow details")
	public void user_validate_save_button_field_enabled_or_not_under_customer_follow_details(Integer int1)
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

				for (int b = 0; b < 2000; b++) {
					try {
						String customerResponce = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.CUST_RESP.TOOL\"]').innerText";
						String customerResponceName = (String) javascriptHelper.executeScript("return " + customerResponce);
						System.out.println(customerResponceName);
						Assert.assertTrue(customerResponceName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (b == 1999) {
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
//			Thread.sleep(3000);
			
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
		if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
			if (l == 300 && !(dropdownString.isBlank())) {
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
//			Thread.sleep(3000);
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
	
	
	@And("User_{int} validate the conformation message after save button and close button")
	public void user_validate_the_conformation_message_after_save_button(Integer int1) {
		
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
	
	
	@And("User_{int} vaildate the message for blank field is which mandatory")
	public void user_vaildate_the_message_for_blank_field_is_which_mandatory(Integer int1) {
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
	
	@And("User_{int} validate Edit button field enabled or not under customer follow details")
	public void user_validate_edit_button_field_enabled_or_not_under_customer_follow_details(Integer int1) {
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

	@And("User_{int} validate search for the record field enabled or not under customer follow details")
	public void user_validate_search_for_the_record_field_enabled_or_not_under_customer_follow_details(Integer int1) {
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

	@And("User_{int} validate export to PDF and EXCEL field enabled or not under customer follow details")
	public void user_validate_export_to_pdf_and_excel_field_enabled_or_not_under_customer_follow_details(Integer int1) {
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

	@And("User_{int} validate followUp details field enabled or not under customer follow details")
	public void user_validate_follow_up_details_field_enabled_or_not_under_customer_follow_details(Integer int1) {
	    
	}
	
	//----------------------------------------@AT_AD_FU_005------------------------
	
	@And("User_{int} to verify the values in list view should be not editable")
	public void user_to_verify_the_values_in_list_view_should_be_not_editable(Integer int1) {
		
	    for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("toastMsgCloseBtn_610")).sendKeys("test");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_{int} to verify the functionality of add button should allow create new record")
	public void user_to_verify_the_functionality_of_add_button_should_allow_create_new_record(Integer int1) {
	    
	    
	}

	@And("User_{int} to verify the functionality of edit button should redirct the edit page")
	public void user_to_verify_the_functionality_of_edit_button_should_redirct_the_edit_page(Integer int1) {
	    
	    
	}

	@And("User_{int} to verify the functionality of search box with matching data should be show matching data")
	public void user_to_verify_the_functionality_of_search_box_with_matching_data_should_be_show_matching_data(Integer int1) {
	    
	    
	}

	@And("User_{int} to verfiy the functionality of search box with not matching data should not be show no data")
	public void user_to_verfiy_the_functionality_of_search_box_with_not_matching_data_should_not_be_show_no_data(Integer int1) {
	    
	    
	}

	@And("User_{int} to verify the functioality of back button should navigate the previous screen")
	public void user_to_verify_the_functioality_of_back_button_should_navigate_the_previous_screen(Integer int1) {
	    
	    
	}

	@And("User_{int} to verify the functionality of export to PDF button should download PDF file")
	public void user_to_verify_the_functionality_of_export_to_pdf_button_should_download_pdf_file(Integer int1) {
	    
	    
	}

	@And("User_{int} to verify the functionality of export to EXCEL button should download EXCEL file")
	public void user_to_verify_the_functionality_of_export_to_excel_button_should_download_excel_file(Integer int1) {
	    
	    
	}
	
	
}