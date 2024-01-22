package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_AppDataEntry_DocumentDetails {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths DocumentDetails_js = new JSPaths(excelPath, "DocumentDetails_js", "DocumentDetailElement", "JSPath");
	ExcelData DocumentDetails_TestData  = new ExcelData(excelTestDataPath,"Tawarruq_DocumentDetails","Dataset ID");




	@And("User_6047 Get the test data for test case ID AT_TW_AD_DOC_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_tw_ad_doc() {
		testData =  DocumentDetails_TestData.getTestdata("DS01_AT_TW_AD_DOC_01");
	}

	@And("User_6047 Get the test data for test case ID AT_TW_AD_DOC_02")
	public void user_6047_get_the_test_data_for_test_case_id_at_tw_ad_doc02() {
		testData =  DocumentDetails_TestData.getTestdata("DS01_AT_TW_AD_DOC_02");
	}
	@And("User_6047 Click the module name dropdown in ULS application")
	public void user_6047_Click_the_module_name_dropdown_in_ULS_application() throws Throwable {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {

			try {  moduleName = javascriptHelper
					.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
					.toString();
			System.out.println("Module Name "+moduleName);
			if ((!moduleName.isEmpty())) {
				break;
			}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_6047 Select the module name as LOS in ULS application")
	public void user_6047_Select_the_module_name_as_LOS_in_ULS_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isEmpty()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

		//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
						.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
						.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
						.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}

	}


	@And("User_6047 Search the  Ref Id Under Inbox")
	public void user_6047_user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No")); 
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}

	@And("User_6047 click the Document Details section")
	public void user_6047_click_the_document_details_section() {
		for (int i = 0; i < 200; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement("document.querySelector('button[class=\"btnNext ng-star-inserted\"]')").click();
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentDetails_module")));
      
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}


		}
	}

	@Then("User_6047 verify the Customer Name field")
	public void user_6047_verify_the_customer_name_field() {
		for (int i = 0; i <500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("customerName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Document Name field")
	public void user_6047_verify_the_document_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Required Stage field")
	public void user_6047_verify_the_required_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("requiredAtStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Staus field")
	public void user_6047_verify_the_document_staus_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentStatus")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Mandatory\\/optional field")
	public void user_6047_verify_the_mandatory_optional_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("mandatory/optional")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Category field")
	public void user_6047_verify_the_document_category_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentCategory")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Upload date field")
	public void user_6047_verify_the_upload_date_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("uploadDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Expected receipt date Stage field")
	public void user_6047_verify_the_expected_receipt_date_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("expectedReceiptDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Deferral Stage field")
	public void user_6047_verify_the_deferral_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("referralStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Def Approved By Stage field")
	public void user_6047_verify_the_def_approved_by_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("defApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}  

	}

	@Then("User_6047 verify the Change In Nature Approved By field")
	public void user_6047_verify_the_change_in_nature_approved_by_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("changeInNatureApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Form field")
	public void user_6047_verify_the_document_form_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentForm")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Quality field")
	public void user_6047_verify_the_document_quality_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Reference Number field")
	public void user_6047_verify_the_document_reference_number_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentReferrenceNumber")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Document Received By field")
	public void user_6047_verify_the_document_received_by_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentReceivedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Location Where Received field")
	public void user_6047_verify_the_location_where_received_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("locationWhereReceived")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Rack No field")
	public void user_6047_verify_the_rack_no_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("rackNo")));

				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("rackNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the  Shelf No field")
	public void user_6047_verify_the_shelf_no_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("shelfNo")));

				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("shelfNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Box No field")
	public void user_6047_verify_the_box_no_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("boxNo")));

				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("boxNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Date Of Expiry field")
	public void user_6047_verify_the_date_of_expiry_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("dateOfExpiry")));

				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("dateOfExpiry")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Lodgement Amount field")
	public void user_6047_verify_the_lodgement_amount_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollToElemet(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("ladgementAmount")));

				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("ladgementAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Remarks field")
	public void user_6047_verify_the_remarks_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollToElemet(
						javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("remark")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("remark")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	@And("User_6047 Give the input for Document Name")
	public void user_give_the_input_for_document_name() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentName")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Document Name").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Document Name")).trim())) {
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

	@Then("User_6047 Give the input for Required Stage")
	public void user_6047_give_the_input_for_required_stage() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("requiredAtStage")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Required At Stage").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Required At Stage")).trim())) {
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

	@Then("User_6047 Give the input for Document Staus")
	public void user_6047_give_the_input_for_document_staus() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentStatus")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Document Status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Document Status")).trim())) {
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

	@Then("User_6047 Give the input for Mandatory\\/optional")
	public void user_6047_give_the_input_for_mandatory_optional() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("mandatory/optional")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Mandatory/optional").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Mandatory/optional")).trim())) {
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

	@Then("User_6047 Give the input for Document Category")
	public void user_6047_give_the_input_for_document_category() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentCategory")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Document Category").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Document Category")).trim())) {
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
		}}

	@Then("User_6047 Give the input for Document Quality field")
	public void user_6047_give_the_input_for_document_quality_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Document Quality").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Document Quality")).trim())) {
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
		}}

	@Then("User_6047 Give the input for Remarks")
	public void user_6047_give_the_input_for_remarks() throws Throwable {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')"));
		//javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')").click();

		javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')").sendKeys("Remarks");

		//	for (int i = 0; i <= 10; i++) {
		//			try {
		//				//javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
		//				javascriptHelper.scrollIntoView(
		//			javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')"));
		//				//javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')").click();
		//				
		//				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[id=\"ion-textarea-0-lbl\"]+ion-textarea>div>textarea')").sendKeys("Remarks");
		//				break;
		//		} catch (Exception e) { 
		//			if (i == 9) {
		//				Assert.fail(e.getMessage());
		//				}
		//		}
		//		
		//		}

	}
	@Then("User_6047 click the Save Button")
	public void user_6047_click_the_save_button() {
		for (int i = 0; i <20; i++) {
			try {

				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button")));

				break;
			} catch (Exception e) {
				if (i==19) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the same record should get saved in Document details")
	public void user_6047_to_verify_the_same_record_should_get_saved_in_document_details() {
		String documentName= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentName")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(documentName.contains("AADHAAR"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String RequiredStage= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("requiredAtStage")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(RequiredStage.contains(" Commodity Purchase Maker"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String documentStatus= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentStatus")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(documentStatus.contains("Deferred"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}


		String MandatoryOptional= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("mandatory/optional")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(MandatoryOptional.contains("Optional"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}


		String DocumentCategory= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentCategory")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DocumentCategory.contains("KYC Document"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String DocumentQuality= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DocumentQuality.contains("Valid and Clear"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String remark= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("remark")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(remark.contains("Remarks"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}


	}
	@And("User_6047 to click the back button")
	public void user_6047_to_click_the_back_button() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")));
				//avascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 verify the functionality of back button")
	public void user_6047_verify_the_functionality_of_back_button() {

		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("AddButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 to verify the Document Name field should be mandatory,Dropdown")
	public void user_6047_to_verify_the_document_name_field_should_be_mandatory_text_box() {
		String DocumentNameMandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentName")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DocumentNameMandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String DocumentNameDropdown= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentName")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DocumentNameDropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 to verify the Completion Stage field should be mandatory")
	public void user_6047_to_verify_the_completion_stage_field_should_be_mandatory() {
		String CompletionStageMandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("repaymentMode_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(CompletionStageMandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 to verify the Status field should be mandatory,Editable,dropdown")
	public void user_6047_to_verify_the_status_field_should_be_mandatory_editable_dropdown() {
		String StatusFieldMandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentStatus")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(StatusFieldMandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String StatusFieldDropdown= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentStatus")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(StatusFieldDropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Quality field should be mandatory,Editable,dropdown")
	public void user_6047_to_verify_the_quality_field_should_be_mandatory_editable_dropdown() {
		String QualityMandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(QualityMandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Quality_Editable= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Quality_Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Quality_DropDown= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentQuality")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Quality_DropDown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Date field should be nonmandatory,Date")
	public void user_6047_to_verify_the_date_field_should_be_mandatory_date() {
		String Date_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("uploadDate")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Date_Mandy.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Date_Date= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("uploadDate_calender")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Date_Date.contains("pi pi-calendar"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Deferred stage field should be nonmandatory,Dropdown")
	public void user_6047_to_verify_the_deferred_stage_field_should_be_mandatory_text_box() {
		String DeferredStage_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("referralStage")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!DeferredStage_Mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String DeferredStage_Dropdown= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("referralStage")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DeferredStage_Dropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Location field should be nonmandatory,Dropdown")
	public void user_6047_to_verify_the_location_field_should_be_mandatory_text_box() {
		String Location_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("locationWhereReceived")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Location_Mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Location_Dropdown= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("locationWhereReceived")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Location_Dropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Rack Number field should be nonmandatory,Text box")
	public void user_6047_to_verify_the_rack_number_field_should_be_mandatory_text_box() {
		String RackNumber_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("rackNo_nonmandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(RackNumber_Mandy.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String RackNumber_Text= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("rackNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(RackNumber_Text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Shelf Number field should be nonmandatory,Text box")
	public void user_6047_to_verify_the_shelf_number_field_should_be_mandatory_text_box() {
		String ShelfNumber_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("shelfno_nonMandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(ShelfNumber_Mandy.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String ShelfNumber_Text= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("shelfNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(ShelfNumber_Text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Box Number field should be nonmandatory,Text box")
	public void user_6047_to_verify_the_box_number_field_should_be_mandatory_text_box() {
		String BoxNumber_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("boxNo_nonMandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(BoxNumber_Mandy.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String BoxNumberText= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("boxNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(BoxNumberText.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 to verify the Document with field should be nonmandatory,dropdown")
	public void user_6047_to_verify_the_document_with_field_should_be_mandatory_text_box() {
		String DocumentWith_Mandy= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentReceivedBy")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!DocumentWith_Mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String DocumentWith_Text= javascriptHelper.executeScriptWithWebElement(DocumentDetails_js.getElement("documentReceivedBy")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(DocumentWith_Text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
}
