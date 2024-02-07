package stepdefinitions;

import java.awt.Robot;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_AppDataEntry_AddressDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// Ijarah_CommonFieldName
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Mura_AddressDetails_js = new JSPaths(excelPath, "addressdetails_WebElements", "Ijarah_AddressDetailsFieldName", "JSPath");
	ExcelData AddressDetails_TestData  = new ExcelData(excelTestDataPath,"Mura_Entry_AddressDetails","Dataset ID");
	int sectionIndex;

	String recordStatus = "";

	@And("User_6047 Get the test data for test case ID AT_MU_AD_01")
	public void user_get_the_test_data_for_test_case_id_at_mu_ad01() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_MU_AD_01");
	}
	@And("User_6047 Get the test data for test case ID AT_MU_AD_03")
	public void user_get_the_test_data_for_test_case_id_at_mu_ad03() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_MU_AD_03");
	}
	@And("User_6047 Get the test data for test case ID AT_MU_AD_04")
	public void user_get_the_test_data_for_test_case_id_at_mu_ad04() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_MU_AD_04");
	}
	@And("User_6047 Get the test data for test case ID AT_MU_AD_05")
	public void user_get_the_test_data_for_test_case_id_at_mu_ad05() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_MU_AD_05");
	}
	@And("User_6047 Get the test data for test case ID AT_MU_AD_06")
	public void user_get_the_test_data_for_test_case_id_at_mu_ad06() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_MU_AD_06");
	}
	@And("User_6047 Search the Referencee Id under Inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("record_reference_number")); 
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		}
	@And("User_6047 click on add button of address details")

	public void user_6047_click_on_add_button_of_address_details() throws Throwable {
		// document.querySelectorAll('ion-title[class="pl-2 pr-2 ion-color
		// ion-color-dark md title-default hydrated"]').length
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 100; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}

			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Address Details").trim())) {
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
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}

		}

	}


	@Then("User_6047 Give the input for Address type in Address Details")
	public void user_give_the_input_for_address_type_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_type")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("address_type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("address_type")).trim())) {
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

	@Then("User_6047 Give the input for Address Status in Address Details")
	public void user_give_the_input_for_address_status() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_status")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("address_status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("address_status")).trim())) {
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

	@Then("User_6047 Give the input for Residential or Occupancy Status in Address Details")
	public void user_give_the_input_for_residential_or_occupancy_status_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("residential_or_ocupency_status")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("residential_or_occupansy_status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("residential_or_occupansy_status")).trim())) {
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



	@Then("User_6047 Give the input for Location Category in Address Details")
	public void user_give_the_input_for_location_category_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("location_category")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("location_category").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("location_category")).trim())) {
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

	@Then("User_6047 Give the input for Address line1 in Address Details")
	public void user_give_the_input_for_address_line1_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_line1"))
				//.sendKeys(testData.get("address_line_1"));
				.sendKeys(testData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Address line2 in Address Details")
	public void user_give_the_input_for_address_line2() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_line2"))
				//.sendKeys(testData.get("address_line_2"));
				.sendKeys(testData.get("address_line_2"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Country in Address Details")
	public void user_give_the_input_for_country_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("country")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("country").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("country")).trim())) {
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

	@Then("User_6047 Give the input for Province id in Address Details")
	public void user_give_the_input_for_province_id_in_Address_Details() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("province_id")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("province_id"))
						.getAttribute("aria-label").contains("*"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("provience_id").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("provience_id")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}	}

	@Then("User_6047 Give the input for Neighbourhood in Address Details")
	public void user_give_the_input_for_neighbourhood_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("neighbourhood_districtName")).sendKeys(testData.get("district_name"));
				//.sendKeys(testData.get("AddressLine2"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for City in Address Details")
	public void user_give_the_input_for_city_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("City")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("city").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("city")).trim())) {
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

	@Then("User_6047 Give the input for Zip Code in Address Details")
	public void user_give_the_input_for_zip_code_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("zip_code"));
				//.sendKeys(testData.get("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for PO BOX Number in Address Details")
	public void user_give_the_input_for_po_box_number_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("po_box_number")).sendKeys(testData.get("po_box_number"));
				//.sendKeys(testData.get("po_box_number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Mobile Number in Address Details")
	public void user_give_the_input_for_mobile_number_in_Address_Details() {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("mobile_number_primary")).sendKeys("9874563210");
				//.sendKeys(testData.get("mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Duration Of Stay in Address Details")
	public void user_give_the_input_for_duration_of_stay_in_Address_Details() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("duration_on_stay")));
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("duration_on_stay"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("duration_on_stay")).sendKeys(testData.get("duration_on_stay"));
				//.sendKeys(testData.get("duration_on_stay"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Latitude Details Of The Address in Address Details")
	public void user_give_the_input_for_latitude_details_of_the_address() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("latitude_details_of_the_address")).sendKeys(testData.get("latitude_details"));
		
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Longitude Details Of The Address in Address Details")
	public void user_give_the_input_for_longitude_details_of_the_address_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("longitude_details_of_the_address")).sendKeys(testData.get("longitude_details"));
			
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Land Mark in Address Details")
	public void user_give_the_input_for_land_mark_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landmark")).sendKeys(testData.get("land_mark"));
			
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Occupancy Date in Address Details")
	public void user_6047__give_the_input_for_occupancy_date_in_Address_Details() {
//		for (int i = 0; i <= 500; i++) {
//			try {
//				
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("occupency_date")));
//				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("occupency_date")).sendKeys(testData.get("occupancy_date"));
//				//.sendKeys(testData.get("occupancy_date"));
//				break;
//			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("occupency_date")));
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("occupency_date"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Landlord Name in Address Details")
	public void user_6047__give_the_input_for_landlord_name_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_name")).sendKeys(testData.get("land_lord_name"));
				//.sendKeys(testData.get("land_lord_name"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Landlord Mobile Number in Address Details")
	public void user_6047__give_the_input_for_landlord_mobile_number_in_Address_Details() {
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_mobile_number")).sendKeys("9874563210");
				//.sendKeys(testData.get("land_lord_mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Rent Amount in Address Details")
	public void user_6047__give_the_input_for_rent_amount_in_Address_Details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("rent_amount")).sendKeys(testData.get("rent_amount"));
				//.sendKeys(testData.get("rent_amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Frequency Of Rent in Address Details")
	public void user_6047__give_the_input_for_frequency_of_rent_in_Address_Details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("frequency_of_rent")).click();
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
			System.out.println("Map " + testData.get("frequency_of_rent").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("frequency_of_rent")).trim())) {
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
	@Then("User_6047 change the address details status active to inactive or inactive to active")

	public void user_change_the_address_details_status_to_active_to_inactive_or_inactive_to_active() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}


		for (int i = 0; i <= 100; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript(
								"return " + Mura_AddressDetails_js.getElement("addressdetails_status"))
						.toString();
			} catch (Exception e) {

			}
		}
	}

	@Then("User_6047 verify system should show the record status as active or inactive based on the toggle button")
	public void verify_system_should_show_the_record_status_as_active_or_inactive_based_on_the_toggle_button() throws Throwable {
		String status = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + ".querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText");
				status = javascriptHelper.executeScript(
						"return document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
								+ (i + 1) + "].querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText")
						.toString();
				System.out.println(status);
				if (!(status.isEmpty())) {
					System.out.println(status);
					//Assert.assertEquals("Active", status);
					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		//Assert.assertEquals(status, "Active");
		if (recordStatus.equals("false")) {
			softAssert.assertEquals(status, "In-active");
		} else if (recordStatus.equals("true")) {
			softAssert.assertEquals(status, "Active");
		}
}
	
	@Then("User_6047 give the character input to the numeric field")
	public void user_6047_give_the_character_input_to_the_numeric_field() {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_mobile_number")));
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_mobile_number")).sendKeys(testData.get("characterInput"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		   
			}
	@Then("User_6047 give the negative number to the numeric field")
	public void user_6047_give_the_negative_number_to_the_numeric_field() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("negativeNumber"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the special character to the numeric field")
	public void user_6047_give_the_special_character_to_the_numeric_field() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("special_character_input"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 validate invalid data in numeric field")
	public void user_6047_validate_invalid_data_in_numeric_field() {
		String CharacterValidation = "";
		for (int i = 0; i <= 100; i++) {
			try {
//             CharacterValidation = javascriptHelper
//						.executeScript("return "
//								+ Mura_AddressDetails_js.getElement("landlordMobileNumber_errorValidation"))
//						.toString();
				CharacterValidation = javascriptHelper.executeScript(
						"return document.querySelector('digital-form-error[ng-reflect-msg=\"Invalid_MOB\"]').innerText")
						.toString();
				System.out.println(CharacterValidation);
				if (!(CharacterValidation.isBlank())) {
					
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		Assert.assertEquals("Invalid Mobile Number".trim(), CharacterValidation.trim());
	}
	

	@Then("User_6047 validate the invalid data in numeric field of address detail")
	public void user_6047_validate_the_invalid_data_in_numeric_field_of_address_detail() {
		String CharacterValidation = "";
		for (int i = 0; i <= 100; i++) {
			try {
             CharacterValidation = javascriptHelper
						.executeScript("return document.querySelector('digital-form-error[ng-reflect-msg=\"VAL.ALPHANUMERIC.ALLOWED\"').innerText")
						.toString();
//			    CharacterValidation = javascriptHelper
//						.executeScript("return "
//								+ Mura_AddressDetails_js.getElement("ZIPCODE_error_validation"))
//						.toString();
				System.out.println(CharacterValidation);
				if (!(CharacterValidation.isBlank())) {
					
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		Assert.assertEquals("Only Alphanumeric characters are allowed".trim(), CharacterValidation.trim());
	}

	@Given("User_6047 click on edit button on created record of address details")
	public void user_6047_click_on_edit_button_on_created_record_of_address_details() throws Throwable {
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + "].querySelector('tbody button[icon=\"pi pi-pencil\"]')");
				javascriptHelper.JSEClick(	javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
								+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')"));
						//.click();
				isClicked = true;
				break;

			}
			if (isClicked == true)

			{
				break;
			}
		}

	}
	@Then("User_6047 to verify the same record should get saved in Address Details")
	public void user_6047__to_verify_the_same_record_should_get_saved_in_address_details() throws Throwable {
		//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")));
	Thread.sleep(3000);
		String AddressTypeData="Office ";
		String AddressType= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_type")).getAttribute("aria-label");
		
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(AddressType.contains(testData.get("address_type")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String AddressStatusData="Current";
		String AddressStatus= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_status")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressStatus.contains(testData.get("address_status")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ResidentalData="Commercial rent";
		String ResidentalText = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("residential_or_ocupency_status")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ResidentalText.contains(testData.get("residential_or_occupansy_status")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
	}
//		String LocationData="Urban";
//	   String LocationEdit= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("location_category")).getAttribute("aria-label");
//		System.out.println(LocationEdit);
//		for (int i = 0; i <2000; i++) {
//            try {
//                Assert.assertTrue(LocationEdit.contains(testData.get("location_category")));
//                break;
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
		String Addressline1Data="Address1";
		String Addressline1 = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("address_line1_Verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1.contains(testData.get("address_line_1")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String Addressline2Data="Address2";
		String Addressline2 = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("addressLine2_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline2.contains(testData.get("address_line_2")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String CountryData="INDIA";
		String Country= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("country")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Country.contains(testData.get("country")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
	}
		String ProvinceData="Maharastra";
		String Province= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("province_id")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Province.contains(testData.get("provience_id")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String neighbourhoodData="Thane";
		String neighbourhood = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("neighbourhood_districtName_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(neighbourhood.contains(testData.get("district_name")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String CityData="BHANDARA"; 
		String City = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("City")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(City.contains(testData.get("city")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ZipData="987456";
		String Zip = javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("zipcode_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Zip.contains(testData.get("zip_code")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String POData="974121";
		String PO= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("po_box_number_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(PO.contains(testData.get("po_box_number")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String MobileData="9874563210";
		String Mobile= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("mobile_number_Verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Mobile.contains(MobileData));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("latitude_details_of_the_address_verify")));
		String LatitudeData="101010";
		String Latitude= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("latitude_details_of_the_address_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Latitude.contains(testData.get("latitude_details")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String DurationData="20";
		String Duration= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Duration.contains(testData.get("duration_on_stay")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String longitudedetailsData="101010";
		String longitudedetails= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("longitude_details_of_the_address_Data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(longitudedetails.contains(testData.get("longitude_details")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landmark_data")));
		String landMarkData="test";
		String landMark= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landmark_data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(landMark.contains(testData.get("land_mark")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
//		String occupencydateData="2000-10-09";
//		String occupencydate= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("occupency_date_Data")).getAttribute("ng-reflect-value-variable");
//		for (int i = 0; i <2000; i++) {
//            try {
//                Assert.assertTrue(occupencydate.contains(testData.get("occupancy_date")));
//                break;
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_name_Data")));
		String landlordnameData="test";
		String landlordname= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_name_Data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(landlordname.contains(testData.get("land_lord_name")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String landlordmobilenumberData="9874563210";
		String landlordmobilenumber= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("landlord_mobile_number_Data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(landlordmobilenumber.contains(landlordmobilenumberData));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String rentamountData="10000";
		String rentamount= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("rent_amount_Data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(rentamount.contains(testData.get("rent_amount")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String frequencyOfRent_Data="Yearly";
		String frequencyOfRent= javascriptHelper.executeScriptWithWebElement(Mura_AddressDetails_js.getElement("frequency_of_rent")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			System.out.println(frequencyOfRent);
            try {
                Assert.assertTrue(frequencyOfRent.contains(testData.get("frequency_of_rent")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
	}
}
