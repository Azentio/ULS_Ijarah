package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class PersonalLoan_Step {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	String excelPath = configFileReader.getJSFilePath();
	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	                                                            //AL_ADE_CustDetValues_610_
	JSPaths al_ADEntry_CustomerDetails = new JSPaths(excelPath, "Al_ADEntry_CustomerDetails_610",
			"AutoloanADEntry_CustomerDetails", "JSPath");
	JSPaths al_ADEntryDocDetails_610 = new JSPaths(excelPath, "Al_ADEntryDocDetails_610",
			"AutoloanADEntry_DocumentsDetails", "JSPath");
	JSPaths PL_NewApp_CustomerDetails = new JSPaths(excelPath, "PL_NewApp_CustomerDetails_610",
			"PL_NewApp_CustomerDetails_FieldName", "JSPath");

	String path = configFileReader.getAutoLoanTestDataFilePath();
	ExcelData pL_NewApp_CustomerDetails_610 = new ExcelData(path, "PL_NewApp_CustomerDetails_610", "DataSet ID");
	ExcelData aL_ADE_CustDetValues_610_ = new ExcelData(path, "AL_ADE_CustDetValues_610_", "DataSet ID");
	Map<String, String> testData;

	// ----------Personal Loan New App Customer Details data

	@And("User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001")
	public void get_the_test_data_set_id_for_DS_AT_PL_NEWAPP_CD_001() {
		testData = pL_NewApp_CustomerDetails_610.getTestdata("DS_AT_PL_NEWAPP_CD_001");
	}

	// ---------------- steps -----------------------

	// ------------------- @AT_PL_NEWAPP_CD_01

	@And("User_610 verify the add button")
	public void user_610_verify_the_add_button() {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("AddBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1999) {

				}
				// TODO: handle exception
			}
		}

	}
	/*

	@And("^User_610 verify the customer type field$")
	public void user_610_verify_the_customer_type_field() throws Throwable {
		Thread.sleep(500);
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("customerType"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 verify the Cif Id field$")
	public void user_610_verify_the_cif_id_field() throws Throwable {
		Thread.sleep(500);
		for (int i = 0; i < 3000; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CifID"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 2999) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CifIDText"))
						.sendKeys(testData.get("Cif Id"));
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 To select Customer type as Individual Type$")
	public void user_610_to_select_customer_type_as_individual_type() throws Throwable {
		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("customerTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		// -------dropdown

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

			// System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Customer Type").trim())) {

//			if ((dropdownString.trim())
//					.equalsIgnoreCase("Individual Customer")) {

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

	@And("^User_610 verify the Application number field$")
	public void user_610_verify_the_application_number_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper
						.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("ApplicationNumber"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("ApplicationNumberTex"))
						.sendKeys(testData.get("Application Number"));
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		Thread.sleep(3000);
	}

	@And("^User_610 verify the customer name field$")
	public void user_610_verify_the_customer_name_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper
						.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CustomerNameDropdown"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CustomerNametext"))
						.sendKeys(testData.get("Customer Name"));
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 verify the Id type field$")
	public void user_610_verify_the_id_type_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDType"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		// -------dropdown

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

			// System.out.println("Map " + testData.get("ID Type").trim());

//			if ((dropdownString.trim())
//					.equalsIgnoreCase(testData.get("Customer Type").trim())) {

			if ((dropdownString.trim()).equalsIgnoreCase("AADHAR CARD")) {

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

	@And("^User_610 verify the Id number field$")
	public void user_610_verify_the_id_number_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDNumber"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDNumberTex"))
						.sendKeys(testData.get("Id Number"));
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 verify the mobile number field$")
	public void user_610_verify_the_mobile_number_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("MobileNumber"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

	}

	@And("^User_610 verify the Date of birth field$")
	public void user_610_verify_the_date_of_birth_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("DOB"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("DOBInput"))
						.sendKeys(testData.get("Dob"));
//				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("DOBInput")).
//				sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("HighLights"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1999) {

				}
				// TODO: handle exception
			}
		}
		Thread.sleep(5000);
	}

	@And("^User_610 verify the email field$")
	public void user_610_verify_the_email_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("EmailID"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("EmailIDTex"))
						.sendKeys(testData.get("Email"));
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 verify the search field$")
	public void user_610_verify_the_search_field() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("search"));

		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("search"))
						.isDisplayed()) {
					// javascriptHelper.backgroundColor(label);
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	@And("^User_610 verify the clear field$")
	public void user_610_verify_the_clear_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("clear"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("clear")).click();
				break;
			} catch (Exception e) {
				if (i == 1999) {

				}
				// TODO: handle exception
			}
		}

		Thread.sleep(3000);

		if (driver.getPageSource().contains(" Mobile Number")) {
			Assert.assertEquals(driver.getPageSource().contains(" Mobile Number"), false);
		} else {
			Assert.assertTrue(true);
			System.out.println("mobile number missing");
		}

	}

	@And("^User_610 verify the create new reqest field$")
	public void user_610_verify_the_create_new_reqest_field() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper
						.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("customerTypeDropdown"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}

	// ------------------------- @AT_PL_NEWAPP_CD_02

	@And("User_610 click search button Pl")
	public void user_610_click_search_button_pl() throws Throwable {
		Thread.sleep(5000);

		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("search")).click();
				break;
			} catch (Exception e) {
				if (i == 1999) {

				}
				// TODO: handle exception
			}
		}
		Thread.sleep(500);
	}

	// --------------------- @AT_PL_NEWAPP_CD_02
	 
	 */
/*
	@And("User_610 verify the field customer type mandatory select")
	public void user_610_verify_the_field_customer_type_mandatory_select() throws Throwable {
		Thread.sleep(500);
		for (int i = 0; i < 2000; i++) {
			try {
				String customer = "document.querySelector('ion-label[ng-reflect-text=\"Customer Type.TOOLTIP\"]').innerText";
				String customertype = (String) javascriptHelper.executeScript("return " + customer);

				System.err.println("customertype:" + customertype);

				Assert.assertTrue(customertype.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// -----------------select format

		String customertypeFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("customerTypeDropdown"))
				.getAttribute("ng-reflect-placeholder");

		System.err.println("customertypeFormat:  " + customertypeFormat);

		String assertProductSelectFormat = "Select";

		Assert.assertEquals(assertProductSelectFormat, customertypeFormat);

	}
/*
	@And("User_610 verify the field Cif Id editable numberic text")
	public void user_610_verify_the_field_cif_id_editable_numberic_text() {
		// -----------------select format

		String CifIdFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CifIDTextBox")).getAttribute("type");

		System.err.println("CifIdFormat:  " + CifIdFormat);

		String assertCifIdFormat = "number";

		Assert.assertEquals(assertCifIdFormat, CifIdFormat);

		// ---------field should be editable

		String CifIdEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CifIDTextBox"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + CifIdEditable);

		String assertCifIdEditable = "false";
		Assert.assertEquals(assertCifIdEditable, CifIdEditable);

	}*/
/*
	@And("User_610 verify the field Id type select")
	public void user_610_verify_the_field_id_type_select() {

		// -----------------select format

		String IdTypeFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDTypeSelect"))
				.getAttribute("ng-reflect-placeholder");

		System.err.println("IdTypeFormat:  " + IdTypeFormat);

		String assertIdTypeFormat = "Select";

		Assert.assertEquals(assertIdTypeFormat, IdTypeFormat);
	}

	@And("User_610 verify the field Id Number text editable")
	public void user_610_verify_the_field_id_number_text_editable() {
		// -----------------text format

		String IdNumberFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDNumberText")).getAttribute("type");

		System.err.println("IdNumberFormat:  " + IdNumberFormat);

		String assertIdNumberFormat = "text";

		Assert.assertEquals(assertIdNumberFormat, IdNumberFormat);

		// ---------field should be editable

		String IDNumberTextEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDNumberText"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + IDNumberTextEditable);

		String assertIDNumberTextEditable = "false";
		Assert.assertEquals(assertIDNumberTextEditable, IDNumberTextEditable);

	}

	@And("User_610 verify the field Application Number  non mandatory editable text")
	public void user_610_verify_the_field_application_number_non_mandatory_editable_text() {
		for (int i = 0; i < 2000; i++) {
			try {
				String ApplicationNumber = "document.querySelector('digital-text-box[ng-reflect-title=\"Application Number\"]').innerText";
				String ApplicationNumbe = (String) javascriptHelper.executeScript("return " + ApplicationNumber);

				System.err.println("ApplicationNumbe:" + ApplicationNumbe);

				Assert.assertTrue(!ApplicationNumbe.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// ---------field should be editable

		String ApplicationNumberTextEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("ApplicationNumberText"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + ApplicationNumberTextEditable);

		String assertApplicationNumberTextEditable = "false";
		Assert.assertEquals(assertApplicationNumberTextEditable, ApplicationNumberTextEditable);

	}

	// ----------------------------- @AT_PL_NEWAPP_CD_03

	@And("User_610 verify the field customer name editable text")
	public void user_610_verify_the_field_customer_name_editable_text() {
		// ---------field should be editable

		String CustomerNameEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CustomerNameDropdown"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + CustomerNameEditable);

		String assertCustomerNameEditable = "false";
		Assert.assertEquals(assertCustomerNameEditable, CustomerNameEditable);

		// -----------------text format

		String CustomerNameFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CustomerNameDropdown"))
				.getAttribute("type");

		System.err.println("CustomerNameFormat:  " + CustomerNameFormat);

		String assertCustomerNameFormat = "text";

		Assert.assertEquals(assertCustomerNameFormat, CustomerNameFormat);

	}

	@And("User_610 verify the field mobile number non mandatory text editable")
	public void user_610_verify_the_field_mobile_number_non_mandatory_text_editable() {
		// ---------field should be editable

		String MobileNumberTextEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("MobileNumberText"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + MobileNumberTextEditable);

		String assertMobileNumberTextEditable = "false";
		Assert.assertEquals(assertMobileNumberTextEditable, MobileNumberTextEditable);

		// -----------------text format

		String MobileNumberTextFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("IDNumberText")).getAttribute("type");

		System.err.println("MobileNumberTextFormat:  " + MobileNumberTextFormat);

		String assertMobileNumberTextFormat = "text";

		Assert.assertEquals(assertMobileNumberTextFormat, MobileNumberTextFormat);

		// --------non mandatory

		for (int i = 0; i < 2000; i++) {
			try {
				String mobilenumber = "document.querySelector('digital-text-box[ng-reflect-title=\"Mobile Number\"]').innerText";
				String mobilenumbe = (String) javascriptHelper.executeScript("return " + mobilenumber);

				System.err.println("mobilenumbe:" + mobilenumbe);

				Assert.assertTrue(!mobilenumbe.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_610 verify the field data of birth non mandatory date editable")
	public void user_610_verify_the_field_data_of_birth_non_mandatory_date_editable() {

		// -----------------date format

		String DOBInputFormat = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("DOBCalendar")).getTagName();

		System.err.println("DOBInputFormat:  " + DOBInputFormat);

		String assertDOBInputFormat = "p-calendar";

		Assert.assertEquals(assertDOBInputFormat, DOBInputFormat);

		for (int i = 0; i < 2000; i++) {
			try {
				String Dob = "document.querySelector('digital-prime-date[ng-reflect-title=\"Date of Birth\"]').innerText";
				String Dobb = (String) javascriptHelper.executeScript("return " + Dob);

				System.err.println("Dobb:" + Dobb);

				Assert.assertTrue(!Dobb.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the field email non mandatory editable")
	public void user_610_verify_the_field_email_non_mandatory_editable() {
		// ---------field should be editable

		String assertEmailIDTextEditable = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("EmailIDText"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + assertEmailIDTextEditable);

		String assertassertEmailIDTextEditable = "false";
		Assert.assertEquals(assertassertEmailIDTextEditable, assertEmailIDTextEditable);

		// -----------------text format

		String EmailIDText = javascriptHelper
				.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("EmailIDText")).getAttribute("type");

		System.err.println("EmailIDText:  " + EmailIDText);

		String assertEmailIDText = "text";

		Assert.assertEquals(assertEmailIDText, EmailIDText);

		// ---

		for (int i = 0; i < 2000; i++) {
			try {
				String email = "document.querySelector('digital-text-box[ng-reflect-title=\"Email ID\"]').innerText";
				String emaill = (String) javascriptHelper.executeScript("return " + email);

				System.err.println("emaill:" + emaill);

				Assert.assertTrue(!emaill.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the functionality of create new request button")
	public void user_610_verify_the_functionality_of_create_new_request_button() throws Throwable {
		Thread.sleep(500);
		// WebElement createNewReq =
		// javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CreateNewRequest"));

		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_NewApp_CustomerDetails.getElement("CreateNewRequest"))
						.click();
				// javascriptHelper.JSEClick(createNewReq);
				break;
			} catch (Exception e) {
				if (i == 1999) {

				}
				// TODO: handle exception
			}
		}

		Thread.sleep(500);

		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper
						.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		Thread.sleep(5000);
	}
*/
	// ----------------------------- @AT_PL_NEWAPP_CD_14---
/*
	@And("^User_610 modifiy the customer type in on Customer details screen$")
	public void user_610_modifiy_the_customer_type_in_on_customer_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown")));
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsSaveBtn")));

		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		// -------dropdown

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

			// System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Customer Type Select").trim())) {

//			if ((dropdownString.trim())
//					.equalsIgnoreCase("Individual Customer")) {

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

	@And("^User_610 verify the system not allow user to do modification with invalid data$")
	public void user_610_verify_the_system_not_allow_user_to_do_modification_with_invalid_data() throws Throwable {

	}

	@And("^User_610 System should show the proper validation message for blank field which is mandatory$")
	public void user_610_system_should_show_the_proper_validation_message_for_blank_field_which_is_mandatory()
			throws Throwable {
		Thread.sleep(5000);
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsSaveBtn")));
		// js click
		javascriptHelper.JSEClick(javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));
		Thread.sleep(2000);

		for (int i = 0; i < 3000; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("fillAllTheDetailsPopup_610"))
						.isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
				if (i == 2999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 allow user to do a modification with valid data and same record should saved in system$")
	public void user_610_allow_user_to_do_a_modification_with_valid_data_and_same_record_should_saved_in_system()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}

		// -------dropdown

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

			// System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Customer Type").trim())) {

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

		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsSaveBtn")));

		// js click
		javascriptHelper.JSEClick(javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));
		Thread.sleep(2000);

		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}

		}
		Thread.sleep(500);
	}
	*/

}
