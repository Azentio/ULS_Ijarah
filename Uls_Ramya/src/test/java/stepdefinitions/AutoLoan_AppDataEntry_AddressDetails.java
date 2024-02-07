package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_AppDataEntry_AddressDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	//Map<String, String> testData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths AddressDetails_js = new JSPaths(excelPath, "addressdetails_WebElements", "Ijarah_AddressDetailsFieldName", "JSPath");
	ExcelData AddressDetails_TestData  = new ExcelData(excelTestDataPath,"AutoL_AppDataEn_AddressDetail","Dataset ID");
	Robot robot;
	int sectionIndex;
	int indexOfListView = 0;

	
	@And("User_6047 Get the test data for test case ID AT_AU_AD_01" )
	public void user_6047_get_the_test_data_for_test_case_id_at_au_ad01() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_AU_AD_01");
	}
	@And("User_6047 Get the test data for test case ID AT_AU_AD_09" )
	public void user_6047_get_the_test_data_for_test_case_id_at_au_ad09() {
		testData =  AddressDetails_TestData.getTestdata("DS01_AT_AU_AD_09");
	}
	
	@And("User_6047 Search the Ref Id under Inbox")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				//.sendKeys(testData.get("Ref No")); 
				.sendKeys("5231");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
	@And("User_6047 click on additional customer info tab")
	public void user_6047_click_on_additional_customer_info_tab() {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javascriptHelper
//						.executeScriptWithWebElement(AddressDetails_js.getElement("additonal_customer_info"))
//						.click();
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		String lengthOfTheSegmentButton = "";
		boolean isClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				lengthOfTheSegmentButton = javascriptHelper.executeScript(
						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
						.toString();
				if ((!lengthOfTheSegmentButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveSegmentLength = Integer.parseInt(lengthOfTheSegmentButton);
		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[14].innerText
		String segmentLabelName = "";
		for (int i = 0; i < premitiveSegmentLength; i++) {
			try {
				for (int j = 0; j <= 200; j++) {
					segmentLabelName = javascriptHelper.executeScript(
							"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
									+ "].innerText")
							.toString();
					System.out.println("Segment Label Name " + segmentLabelName);
					if (segmentLabelName.equalsIgnoreCase("Additional Customer Info")) {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
										+ "]")
								.click();
						indexOfListView=i;
						isClicked = true;
						break;

					} else if (!(segmentLabelName.equalsIgnoreCase("Additional Customer Info"))) {
						isClicked = false;
						break;
					}
				}

			} catch (Exception e) {
			}
			if (isClicked == true) {
				break;
			}
		} 
	}




	
	@And("User_6047 Click edit icon")
	public void user_click_edit_icon_() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Edit_button")).click();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@And("User_6047 clict the Add button under the Address detail")
	public void user_6047_clict_the_add_button_under_the_address_detail() {
//		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
//
//				String lengthOfTheLabel = "";
//
//				boolean isAddButttonClicked = false;
//
//				String labelName = "";
//
//				System.out.println("");
//
//				for (int i = 0; i <= 300; i++) {
//
//					try {
//
//						if (i > 200) {
//
//							System.out.println("Query " + labelLength);
//
//							lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
//
//							if (!(lengthOfTheLabel.isBlank())) {
//
//								break;
//
//							}
//
//						}
//
//					} catch (Exception e) {
//
//						if (i == 300) {
//
//							Assert.fail(e.getMessage());
//
//						}
//
//					}
//
//				}
//
//				int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
//
//				System.out.println("Length of the label " + premitiveLabelLength);
//		 
//				for (int i = 0; i < premitiveLabelLength; i++) {
//
//					for (int j = 0; j <= 300; j++) {
//
//						try {
//
//							labelName = javascriptHelper.executeScript(
//
//									"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
//
//											+ i + "].innerText")
//
//									.toString();
//
//							System.out.println("label Name is " + labelName);
//
//							if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {
//		 
//								System.out.println("Label Name " + labelName);
//
//								if (i > 250) {
//
//									javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
//
//											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
//
//								}
//		 
//								clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
//
//										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
//
//								clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
//
//										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
//
//								isAddButttonClicked = true;
//		 
//								break;
//
//							} else {
//
//								isAddButttonClicked = false;
//
//								break;
//
//							}
//
//						} catch (Exception e) {
//
//							if (j == 300) {
//
//								Assert.fail(e.getMessage());
//
//							}
//
//						}
//
//					}
//
//					if (isAddButttonClicked == true) {
//
//						break;
//
//					}
//
//				}
		
		String length =null;

				for (int i = 0; i <500; i++) {

					try {

					    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();

					    System.out.println(length);

						if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {

							break;

						}

					} catch (Exception e) {

						if (i==499) {

							Assert.fail(e.getMessage());

						}

					}

				}

				for (int i = 0; i <500; i++) {

				try {

					for (int j = 0; j <Integer.parseInt(length); j++) {

						String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";

						String titlename = javascriptHelper.executeScript(title).toString();

						System.out.println(titlename);

						if (titlename.trim().contains("Address Details")) {

							System.out.println("condition true");

							String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button')";

							WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);

//							System.out.println(jspath);

					//	javascriptHelper.scrollIntoView(addButton);
							javascriptHelper.JSEClick(addButton);
							//addButton.click();

							break;

						}

					}

					break;

				} catch (Exception e) {

					if (i==499) {

						Assert.fail(e.getMessage());

					}

				}

			}
	}
	@And("User_6047 verify back button should visible in address details screen")
	public void user_6047_verify_back_button_should_visible_in_address_details_screen() throws Throwable {
		Thread.sleep(3000);
		if (javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")).isDisplayed()) {
			SoftAssert.fail("Check back button");
		}
		
	}

	@And("User_6047 verify save button should visible in address details screen")
	public void user_6047_verify_save_button_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button")).isDisplayed()) {
			SoftAssert.fail("Check save button Field");
		}
		
	}
	@Then("User_6047 verify Address type should visible in address details screen")
	public void user_6047_verify_address_type_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("Address_Type")).isDisplayed()) {
			SoftAssert.fail("Check Address Type Field");
		}
		
	}
	    
	    
	@Then("User_6047 verify Address Status should visible in address details screen")
	public void user_6047_verify_6047_address_status_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).isDisplayed()) {
			SoftAssert.fail("Check Address Status Field");
		}
	    
	}

	@Then("User_6047 verify Residential or Occupancy Status should visible in address details screen")
	public void user_6047_verify_residential_or_occupancy_status_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).isDisplayed()) {
			SoftAssert.fail("Check residential or ocupency status Field");
		}
	    
	}

	@Then("User_6047 verify Communication Address should visible in address details screen")
	public void user_6047_verify_6047_communication_address_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("communication_address_toggle")).isDisplayed()) {
			SoftAssert.fail("Check communication address toggle Field");
		}
	    
	}

	@Then("User_6047 verify Location Category should visible in address details screen")
	public void user_6047_verify_location_category_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")).isDisplayed()) {
			SoftAssert.fail("Check location category Field");
		}
	    
	}

	@Then("User_6047 verify Address line1 should visible in address details screen")
	public void user_6047_verify_address_line1_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1")).isDisplayed()) {
			SoftAssert.fail("Check address_line1 Field");
		}
	    
	}

	@Then("User_6047 verify Address line2 should visible in address details screen")
	public void user_6047_verify_address_line2_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line2")).isDisplayed()) {
			SoftAssert.fail("Check address_line2 Field");
		}
	    
	}

	@Then("User_6047 verify Country should visible in address details screen")
	public void user_6047_verify_country_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).isDisplayed()) {
			SoftAssert.fail("Check country AddressDetails Field");
		}
	    
	    
	}

	@Then("User_6047 verify Province id  should visible in address details screen")
	public void user_6047_verify_province_id_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).isDisplayed()) {
			SoftAssert.fail("Check province id Field");
		}
	    
	}

	@Then("User_6047 verify Neighbourhood should visible in address details screen")
	public void user_6047_verify_neighbourhood_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("neighbourhood_districtName")).isDisplayed()) {
			SoftAssert.fail("Check neighbourhood Field");
		}		    
	}

	@Then("User_6047 verify City should visible in address details screen")
	public void user_6047_verify_city_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("City")).isDisplayed()) {
			SoftAssert.fail("Check city Field");
		}
	    
	} 

	@Then("User_6047 verify Zip Code should visible in address details screen")
	public void user_6047_verify_zip_code_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).isDisplayed()) {
			SoftAssert.fail("Check zip code Field");
		}
	    
	}

	@Then("User_6047 verify PO BOX Number should visible in address details screen")
	public void user_6047_verify_po_box_number_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("po_box_number")).isDisplayed()) {
			SoftAssert.fail("Check po box number Field");
		}
	    
	}

	@Then("User_6047 verify Mobile Number should visible in address details screen")
	public void user_6047_verify_mobile_number_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("mobile_number_primary")).isDisplayed()) {
			SoftAssert.fail("Check mobile_number_primary Field");
		}
	    
	}

	@Then("User_6047 verify Duration Of Stay should visible in address details screen")
	public void user_6047_verify_duration_of_stay_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay")).isDisplayed()) {
			SoftAssert.fail("Check duration_on_stay Field");
		}
	    
	}

	@Then("User_6047 verify Latitude Details Of The Address  should visible in address details screen")
	public void verify_latitude_details_of_the_address_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address")).isDisplayed()) {
			SoftAssert.fail("Check latitude_details_of_the_address Field");
		}
	    
	}

	@Then("User_6047 verify Longitude Details Of The Address should visible in address details screen")
	public void user_6047_verify_longitude_details_of_the_address_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address")).isDisplayed()) {
			SoftAssert.fail("Check longitude_details_of_the_address Field");
		}
	    
	    
	}

	@Then("User_6047 verify Land Mark should visible in address details screen")
	public void user_6047_verify_land_mark_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark")).isDisplayed()) {
			SoftAssert.fail("Check landmark Field");
		}
	    
	}

	@Then("User_6047 verify Occupancy Date should visible in address details screen")
	public void user_6047_verify_occupancy_date_should_visible_in_address_details_screen() {
		if (!javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date")).isDisplayed()) {
			SoftAssert.fail("Check occupency_date Field");
		}		    
	}

	@Then("User_6047 verify Landlord Name  should visible in address details screen")
	public void user_6047_verify_landlord_name_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name")).isDisplayed()) {
			SoftAssert.fail("Check landlord_name Field");
		} 
	    
	}

	@Then("User_6047 verify Landlord Mobile Number should visible in address details screen")
	public void user_6047_verify_landlord_mobile_number_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number")).isDisplayed()) {
			SoftAssert.fail("Check landlord Mobile Number Field");
		} 		    
	}

	@Then("User_6047 verify Rent Amount should visible in address details screen")
	public void user_6047_verify_rent_amount_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("rent_amount")).isDisplayed()) {
			SoftAssert.fail("Check Rent Amount Field");
		}    
	}

	@Then("User_6047 verify Frequency Of Rent should visible in address details screen")
	public void user_6047_verify_frequency_of_rent_should_visible_in_address_details_screen() {
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("frequency_of_rent")).isDisplayed()) {
			SoftAssert.fail("Check Frequency Of Rent Field");
		}
	    
	}
	@Then("User_6047 Give the input for Address type")
	public void user_6047_give_the_input_for_address_type() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")).click();
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
			System.out.println("Map " + testData.get("Address Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Address Type")).trim())) {
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

	@Then("User_6047 Give the input for Address Status")
	public void user_6047_give_the_input_for_address_status() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).click();
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
			System.out.println("Map " + testData.get("Address status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Address status")).trim())) {
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

	@Then("User_6047 Give the input for Residential or Occupancy Status")
	public void user_6047_give_the_input_for_residential_or_occupancy_status() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).click();
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
			System.out.println("Map " + testData.get("residential_or_ocupency_status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("residential_or_ocupency_status")).trim())) {
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



	@Then("User_6047 Give the input for Location Category")
	public void user_6047_give_the_input_for_location_category() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")).click();
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

	@Then("User_6047 Give the input for Address line1")
	public void user_6047_give_the_input_for_address_line1() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1"))
				//.sendKeys("Address1");
				.sendKeys(testData.get("AddressLine1"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Address line2")
	public void user_6047_give_the_input_for_address_line2() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line2"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("AddressLine2"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Country")
	public void user_6047_give_the_input_for_country() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).click();
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

	@Then("User_6047 Give the input for Province id")
	public void user_6047_give_the_input_for_province_id() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).click();
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
			System.out.println("Map " + testData.get("provience_id").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("provience_id")).trim())) {
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

	@Then("User_6047 Give the input for Neighbourhood")
	public void user_6047_give_the_input_for_neighbourhood() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("neighbourhood")).click();
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
			System.out.println("Map " + testData.get("district_name").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("district_name")).trim())) {
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

	@Then("User_6047 Give the input for City")
	public void user_6047_give_the_input_for_city() {
		for (int i = 0; i <= 500; i++) {
			try {
				//javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("city"))
				//.sendKeys("BHANDARA");
				//.sendKeys(testData.get("city"));
			
	
				
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"City.TOOLTIP\"]+ion-input>input')")
				.sendKeys(testData.get("city"));
		
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Zip Code")
	public void user_6047_give_the_input_for_zip_code() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code"))
				
				.sendKeys(testData.get("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for PO BOX Number")
	public void user_6047_give_the_input_for_po_box_number() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("po_box_number"))
				
				.sendKeys(testData.get("po_box_number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Mobile Number")
	public void user_6047_give_the_input_for_mobile_number() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("mobile_number_primary"))
		
				.sendKeys(testData.get("MobileNumber"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Duration Of Stay")
	public void user_6047_give_the_input_for_duration_of_stay() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay"))

				.sendKeys(testData.get("duration_on_stay"));
				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Latitude Details Of The Address")
	public void user_6047_give_the_input_for_latitude_details_of_the_address() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address"))
		
				.sendKeys(testData.get("latitude_details"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Longitude Details Of The Address")
	public void user_6047_give_the_input_for_longitude_details_of_the_address() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address")));
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address"))
			
				.sendKeys(testData.get("longitude_details"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Land Mark")
	public void user_6047_give_the_input_for_land_mark() {
		for (int i = 0; i <= 500; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark"))
				
				.sendKeys(testData.get("land_mark"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Occupancy Date")
	public void user_6047_give_the_input_for_occupancy_date() {
//		for (int i = 0; i <= 500; i++) {
//			try {
//				
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date")));
//				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date"))
//				//.sendKeys("10-Sep-2000");
//				.sendKeys(testData.get("occupancy_date"));
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
						.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date")));
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date"))
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

	@Then("User_6047 Give the input for Landlord Name")
	public void user_6047_give_the_input_for_landlord_name() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name"))
				//.sendKeys("test");
				.sendKeys(testData.get("land_lord_name"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Landlord Mobile Number")
	public void user_6047_give_the_input_for_landlord_mobile_number() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number"))
				//.sendKeys("9632587415");
				.sendKeys(testData.get("land_lord_mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Rent Amount")
	public void user_6047_give_the_input_for_rent_amount() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("rent_amount"))
				//.sendKeys("10000");
				.sendKeys(testData.get("rent_amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the input for Frequency Of Rent")
	public void user_6047_give_the_input_for_frequency_of_rent() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("frequency_of_rent")).click();
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

	@Then("User_6047 to verify the same record should get saved Address Details")
	public void user_6047_to_verify_the_same_record_should_get_saved_address_details() throws Throwable {
		//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")));
	Thread.sleep(3000);
		//String AddressTypeData="Office ";
		String AddressType= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")).getAttribute("aria-label");
		
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(AddressType.contains(testData.get("Address Type")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String AddressStatusData="Current";
		String AddressStatus= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressStatus.contains(testData.get("Address status")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ResidentalData="Commercial rent";
		String ResidentalText = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ResidentalText.contains(testData.get("residential_or_ocupency_status")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
	}
//		String LocationData="Urban";
//	   String LocationEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")).getAttribute("aria-label");
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
		String Addressline1 = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1_Verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1.contains(testData.get("AddressLine1")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String Addressline2Data="Address2";
		String Addressline2 = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("addressLine2_verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline2.contains(testData.get("AddressLine2")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String CountryData="INDIA";
		String Country= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).getAttribute("aria-label");
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
		String Province= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).getAttribute("aria-label");
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
		String neighbourhood = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("neighbourhood")).getAttribute("aria-label");
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
		String City = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("city_verify")).getAttribute("ng-reflect-model");
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
		String Zip = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zipcode_verify")).getAttribute("ng-reflect-model");
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
		String PO= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("po_box_number_verify")).getAttribute("ng-reflect-model");
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
		String MobileData="9632587410";
		String Mobile= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("mobile_number_Verify")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Mobile.contains(testData.get("MobileNumber")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address_verify")));
		String LatitudeData="101010";
		String Latitude= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address_verify")).getAttribute("ng-reflect-model");
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
		String Duration= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("ng-reflect-model");
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
		String longitudedetails= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address_Data")).getAttribute("ng-reflect-model");
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
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark_data")));
		String landMarkData="test";
		String landMark= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark_data")).getAttribute("ng-reflect-model");
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
//		String occupencydate= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date_Data")).getAttribute("ng-reflect-value-variable");
//		for (int i = 0; i <2000; i++) {
//            try {
//                Assert.assertTrue(occupencydate.contains(occupencydateData));
//                break;
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name_Data")));
		String landlordnameData="test";
		String landlordname= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name_Data")).getAttribute("ng-reflect-model");
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
		String landlordmobilenumberData="9632587415";
		String landlordmobilenumber= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number_Data")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(landlordmobilenumber.contains(testData.get("land_lord_mobile_number")));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
            }
		String rentamountData="10000";
		String rentamount= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("rent_amount_Data")).getAttribute("ng-reflect-model");
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
		String frequencyOfRent= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("frequency_of_rent")).getAttribute("aria-label");
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
	@Then("User_6047 verify Address type should be mandatory,editable,dropdown")
	public void user_6047_verify_address_type_should_be_mandatory_editable_dropdown() throws Throwable {
		
		Thread.sleep(3000);
		String AddressTypeText = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressTypeText.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
		}
		String AddressEdit = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());                                   
                }
            }
        }
		String AddressTypedropdown = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressTypedropdown.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Address Status should be mandatory,editable,dropdown")
	public void user_6047_verify_address_status_should_be_mandatory_editable_dropdown() {
		String AddressStatusMandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressStatusMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String AddressStatusdisplay = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressStatusdisplay.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String AddressStatusdropdown = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_status")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressStatusdropdown.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	    
	    
	}

	@Then("User_6047 verify Residential or occupancy status should be mandatory,editable,dropdown")
	public void user_6047_verify_residential_or_occupancy_status_should_be_mandatory_editable_dropdown() {
		String ResidentalText = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ResidentalText.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Residentialdisplay = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Residentialdisplay.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Residentialdropdown = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("residential_or_ocupency_status")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Residentialdropdown.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Communication address should be a toggle button,editable")
	public void user_6047_verify_communication_address_should_be_a_toggle_button_editable() {
		String Communicationdropdown = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("communication_address_toggle")).getAttribute("role");

		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(Communicationdropdown.contains("switch"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
      }
		String Communicationdisplay = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("communication_address_toggle")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Communicationdisplay.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Location Category should be editable,dropdown")
	public void user_6047_verify_location_category_should_be_editable_dropdown() throws Throwable {
	//	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")));
Thread.sleep(500);
		String LocationEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LocationEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	    
		String Location = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("location_category")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Location.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	   
	}

	@Then("User_6047 verify Address line1 should be mandatory,editable,text box")
	public void user_6047_verify_address_line1_should_be_mandatory_editable_text_box() {
		String Addressline1mandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1mandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Addressline1Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1_Verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Addressline1text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line1_Verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		
	}

	@Then("User_6047 verify Address line2 should be mandatory,editable,text box")
	public void user_6047_verify_address_line2_should_be_mandatory_editable_text_box() {
		String Addressline2Mandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_line2_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline2Mandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Addressline2Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("addressLine2_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline2Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Addressline2text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("addressLine2_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline2text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Country should be mandatory,editable,text box")
	public void user_6047_verify_country_should_be_mandatory_editable_text_box() {
		String CountryMandy= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(CountryMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String CountryEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(CountryEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String country_text = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("country")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(country_text.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Province Id should be mandatory,editable,dropdown")
	public void user_6047_verify_province_id_should_be_editable_dropdown() throws Throwable {
		Thread.sleep(3000);
		String ProvinceMandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ProvinceMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ProvinceEdit = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ProvinceEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ProvinceDropDown = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("province_id")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ProvinceDropDown.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Neighbourhood should be mandatory,editable,text box")
	public void user_6047_verify_neighbourhood_should_be_mandatory_editable_text_box() {
		String neighbourhoodMandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("district_name_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(neighbourhoodMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String neighbourhoodEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("neighbourhood_districtName_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(neighbourhoodEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String NeighbourhoodText = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("neighbourhood_districtName_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(NeighbourhoodText.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify City should be mandatory,editable,text box")
	public void user_6047_verify_city_should_be_mandatory_editable_text_box() {
		String CityMandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("city_mandatory")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(CityMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String City1Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("City")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(City1Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String City_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("City")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(City_Text.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Zip code should be mandatory,editable,text box")
	public void user_6047_verify_zip_code_should_be_mandatory_editable_text_box() {
		String ZipMandy = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ZipMandy.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ZipEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zipcode_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ZipEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String ZipText= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zipcode_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ZipText.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify PO Box Number should be editable,text box")
	public void user_6047_verify_po_box_number_should_be_editable_text_box() {
		String POEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("po_box_number_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(POEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String PO_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("po_box_number_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(PO_Text.contains("number"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Mobile number should be editable,text box")
	public void user_6047_verify_mobile_number_should_be_editable_text_box() {
		String MobileEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("mobile_number_Verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(MobileEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Mobile_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("mobile_number_Verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Mobile_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Duration Of Stay should be editable,text box")
	public void user_6047_verify_duration_of_stay_should_be_editable_text_box() {
		String DurationEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(DurationEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Duration_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Duration_Text.contains("number"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Latitude Details Of The Address should be editable,text box")
	public void user_6047_verify_latitude_details_of_the_address_should_be_editable_text_box() {
		String LatitudeEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LatitudeEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Latitude_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("latitude_details_of_the_address_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Latitude_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	    
	 
	}
	@Then("User_6047 verify Longitude Details Of The Address should be editable,text box")
	public void user_6047_verify_longitude_details_of_the_address_should_be_editable_text_box() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address_Data")));
		String Longitude_Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address_Data")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Longitude_Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Longitude_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("longitude_details_of_the_address_Data")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Longitude_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Land Mark should be editable,text box")
	public void user_6047_verify_land_mark_should_be_editable_text_box() {
		String LandMark_Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark_data")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandMark_Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String LandMark_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landmark_data")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandMark_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Occupancy Date should be  mandatory,editable,text box")
	public void user_6047_verify_occupancy_date_should_be_editable_text_box() {
		String OccupancyDate_Mandy= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date_Data")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(OccupancyDate_Mandy.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String OccupancyDate_Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date_Data")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(OccupancyDate_Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String OccupancyDate_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("occupency_date_calender")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(OccupancyDate_Text.contains("pi pi-calendar"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Landlord Name should be editable,text box")
	public void user_6047_verify_landlord_name_should_be_editable_text_box() {
		String LandlordNameEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name_Data")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandlordNameEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String LandlordName_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_name_Data")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandlordName_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Landlord Mobile Number should be editable,text box")
	public void user_6047_verify_landlord_mobile_number_should_be_editable_text_box() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number_Data")));
		String LandlordMobileNumberEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number_Data")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandlordMobileNumberEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String LandlordMobileNumberEdit_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("landlord_mobile_number_Data")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(LandlordMobileNumberEdit_Text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Rent Amount should be editable,text box")
	public void user_6047_verify_rent_amount_should_be_editable_text_box() {
		String RentAmount_Edit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(RentAmount_Edit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String RentAmountEdit_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("duration_on_stay_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(RentAmountEdit_Text.contains("number"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify Frequency Of Rent should be editable,dropdown")
	public void user_6047_verify_frequency_of_rent_should_be_editable_text_box() {
		String DurationEdit= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("frequency_of_rent")).getAttribute("ng-reflect-is-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(DurationEdit.contains("false"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		String Duration_Text= javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("frequency_of_rent")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Duration_Text.contains("Select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	@And("User_6047 clict the edit button under the Address detail")
	public void user_6047_clict_the_edit_button_under_the_address_detail() {
//		String sectionLength = "";
//		boolean isClicked = false;
//		for (int i = 0; i <= 200; i++) {
//			try {
//				sectionLength = javascriptHelper.executeScript(
//						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
//						.toString();
//				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
//					break;
//				}
//			} catch (Exception e) {
//
//			}
//		}
//		int premitiveSectionLength = Integer.parseInt(sectionLength);
//		for (int i = 1; i <= premitiveSectionLength; i++) {
//			String sectionName = javascriptHelper.executeScript(
//					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
//							+ i + "].innerText")
//					.toString();
//			System.out.println("Section Name " + sectionName + " i value " + i);
//			if (sectionName.equals("Address Details")) {
//				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
//						+ (i + 1) + "].querySelector('tbody button[icon=\"pi pi-pencil\"]')");
//				
////				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
////						"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
////						+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')"));
//				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
//								+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')"));
//				
//				javascriptHelper.executeScriptWithWebElement(
//						"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
//								+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')")
//						.click();
//				isClicked = true;
//				break;
//
//			}
//			if (isClicked == true)
//
//			{
//				break;
//			}
//		}
		
		String length =null;

		for (int i = 0; i <500; i++) {

			try {

			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();

			    System.out.println(length);

				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {

					break;

				}

			} catch (Exception e) {

				if (i==499) {

					Assert.fail(e.getMessage());

				}

			}

		}

		for (int i = 0; i <500; i++) {

		try {

			for (int j = 0; j <Integer.parseInt(length); j++) {

				String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";

				String titlename = javascriptHelper.executeScript(title).toString();

				System.out.println(titlename);

				if (titlename.trim().contains("Address Details")) {

					System.out.println("condition true");

				//	String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button')";
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-pencil\"]')";
					WebElement editButton = javascriptHelper.executeScriptWithWebElement(jspath);

//					System.out.println(jspath);

				//javascriptHelper.scrollIntoView(editButton);
					javascriptHelper.JSEClick(editButton);
				//editButton.click();

					break;

				}

			}

			break;

		} catch (Exception e) {

			if (i==499) {

				Assert.fail(e.getMessage());

			}

		}

	}

	}


	@Then("User_6047 give the character input in numeric field")
	public void user_6047_give_the_character_input_in_numeric_field() {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("characterInput"));
				//.sendKeys("data");

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		   
			}

	@Then("User_6047 validate the invalid data in numeric field")
	public void user_6047_validate_the_invalid_data_in_numeric_field() {
		String CharacterValidation = "";
		for (int i = 0; i <= 100; i++) {
			try {
             CharacterValidation = javascriptHelper
						.executeScript("return "
								+ AddressDetails_js.getElement("zipcode_error_validation"))
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
		
		Assert.assertEquals("Enter Valid Zipcode".trim(), CharacterValidation.trim());
	}

	@Then("User_6047 give the negative number in numeric field")
	public void user_6047_give_the_negative_number_in_numeric_field() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("negative_numeric"));
				//.sendKeys("-123");

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the special character in numeric field")
	public void user_6047_give_the_special_character_in_numeric_field() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(testData.get("special_character_input"));
				//.sendKeys("@#$%^");

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


//javascriptHelper
//.executeScriptWithWebElement(
//		("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')"))
//.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

//document.querySelectorAll('digital-text-box[ng-reflect-title="CUSTOMERDETAILS_MOBILE_NUMBER_"]+div digital-form-error ion-badge')[1].innerText


@And("User_6047 verify the add botton in address details list view")
public void user_6047_verify_the_add_botton_in_address_details_list_view() {

	String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";

			String lengthOfTheLabel = "";

			boolean isAddButtonPresent = false;

			String labelName = "";

			System.out.println("");

			for (int i = 0; i <= 300; i++) {

				try {

					if (i > 200) {

						System.out.println("Query " + labelLength);

						lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();

						if (!(lengthOfTheLabel.isBlank())) {

							break;

						}

					}

				} catch (Exception e) {

					if (i == 300) {

						Assert.fail(e.getMessage());

					}

				}

			}

			int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);

			System.out.println("Length of the label " + premitiveLabelLength);
	 
			for (int i = 0; i < premitiveLabelLength; i++) {

				for (int j = 0; j <= 300; j++) {

					try {

						labelName = javascriptHelper.executeScript(

								"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

										+ i + "].innerText")

								.toString();

						System.out.println("label Name is " + labelName);

						if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {
	 
							System.out.println("Label Name " + labelName);

							if (i > 250) {

								javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(

										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
 

							}
	 
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));

							javascriptHelper.executeScriptWithWebElement(

									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]").isDisplayed();

							isAddButtonPresent = true;
	 
							break;

						} else {

							isAddButtonPresent = false;

							break;

						}

					} catch (Exception e) {

						if (j == 300) {

							Assert.fail(e.getMessage());

						}

					}

				}

				if (isAddButtonPresent == true) {

					break;

				}

			}

}

@Then("User_6047 verify the Edit botton in address details list view")
public void user_6047_verify_the_edit_botton_in_address_details_list_view() {
	String sectionLength = "";
	boolean editButtonispresent = false;
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
				"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
						+ i + "].innerText")
				.toString();
		System.out.println("Section Name " + sectionName + " i value " + i);
		if (sectionName.equals("Address Details")) {
			System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
					+ (i + 1) + "].querySelector('tbody button[icon=\"pi pi-pencil\"]')");
			javascriptHelper.executeScriptWithWebElement(
					"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
							+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')")
					.isDisplayed();
			editButtonispresent = true;
			
			break;

		}
		if (editButtonispresent == true)
		{
			System.out.println("Edit button is present");
			break;
		}
	}

}

@Then("User_6047 verify the search botton in address details list view")
public void user_6047_verify_the_search_botton_in_address_details_list_view() {
	String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";

	String lengthOfTheLabel = "";

	boolean iSearchButtonPresent = false;

	String labelName = "";

	System.out.println("");

	for (int i = 0; i <= 300; i++) {

		try {

			if (i > 200) {

				System.out.println("Query " + labelLength);

				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();

				if (!(lengthOfTheLabel.isBlank())) {

					break;

				}

			}

		} catch (Exception e) {

			if (i == 300) {

				Assert.fail(e.getMessage());

			}

		}

	}

	int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);

	System.out.println("Length of the label " + premitiveLabelLength);

	for (int i = 0; i < premitiveLabelLength; i++) {

		for (int j = 0; j <= 300; j++) {

			try {

				labelName = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

								+ i + "].innerText")

						.toString();

				System.out.println("label Name is " + labelName);

				if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {

					System.out.println("Label Name " + labelName);

					if (i > 250) {

						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')[" + i + "]"));


					}

					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')[" + i + "]"));

					javascriptHelper.executeScriptWithWebElement(

							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')[" + i + "]").isDisplayed();

					iSearchButtonPresent = true;

					break;

				} else {

					iSearchButtonPresent = false;
				
					break;

				}

			} catch (Exception e) {

				if (j == 300) {

					Assert.fail(e.getMessage());
					System.out.println("Search Button is not Present");
				}

			}

		}

		if (iSearchButtonPresent == true) {
			System.out.println("Search Button is Present");
			break;

		}

	}

}

@Then("User_6047 verify the Export to PDF,XLS in address details list view")
public void user_6047_verify_the_export_to_pdf_in_address_details_list_view() {
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
		int sectionIndex = i;
		if (sectionName.equals("Address Details")) {

			for (int l = 0; l <= 100; l++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
									+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
							.click();
					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isClicked == true) {
				break;
			}
		}
		if (isClicked == true) {
			break;
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("pdf_download")).isDisplayed();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("xls_download")).isDisplayed();
			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

}



@Then("User_6047 verify list view fields are shown in address details list view")
public void user_6047_verify_list_view_fields_are_shown_in_address_details_list_view() {
	String fieldName = "";
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
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
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
			// document.querySelectorAll('thead[class="p-datatable-thead"]')[3].innerText
			System.out.println(
					"document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1) + "].innerText");
			for (int l = 0; l <= 20; l++) {
				try {
					fieldName = javascriptHelper.executeScript(
							"return document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1)
									+ "].innerText")
							.toString();
					System.out.println(fieldName);
					if (!(fieldName.isBlank())) {

						System.out.println("l loop got breaked ");
						break;
					}
				} catch (Exception e) {
					if (l == 20) {
						Assert.fail(e.getMessage());
					}
				}
			}

			if (!(fieldName.isEmpty())) {
				System.out.println(fieldName);

				isClicked = true;
				break;
			}

		}
		if (isClicked == true)

		{
			break;
		}
	}
	System.out.println("Field Name " + fieldName);
	Assert.assertTrue(fieldName.contains("Address Type"));
	Assert.assertTrue(fieldName.contains("Country"));
	Assert.assertTrue(fieldName.contains("Occupancy Status"));
	Assert.assertTrue(fieldName.contains("Occupance Since"));
	Assert.assertTrue(fieldName.contains("Contact Address"));
	Assert.assertTrue(fieldName.contains("Status"));
}
@Then("User_6047 To verify Values in List view should be non editable")

public void user_6047_to_verify_values_in_list_view_should_be_non_editable() {

	boolean statusOfListViewRecord = false;
	String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
	String listViewName = "";
	String noOfListView = "";

	boolean isIndexFound = false;
	for (int i = 0; i <= 300; i++) {
		try {
			noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
			if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	System.out.println("No Of List view " + noOfListView);
	int premitivListViews = Integer.parseInt(noOfListView);
	for (int i = 0; i < premitivListViews; i++) {
		for (int j = 0; j <= 300; j++) {
			try {
				listViewName = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
						+ i + "].innerText").toString();
				if (listViewName.contains("Address Details")) {

					//indexOfListView = i;

					isIndexFound = true;
					break;
				} else {

					isIndexFound = false;
					break;
				}
			} catch (Exception e) {
				if (j == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		if (isIndexFound == true) {
			break;
		}

	}

	for (int i = 0; i <= 50; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(
					"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
							+ indexOfListView + "].querySelector('p-tag')")
					.click();
			if (i > 40) {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('p-tag')")
						.sendKeys(Keys.PAGE_DOWN);
			}
		} catch (Exception e) {
			if (i == 50) {
				statusOfListViewRecord = true;
			}
		}
	}
	System.out.println(statusOfListViewRecord);
	Assert.assertTrue(statusOfListViewRecord);

}


@And("User_6047 To verify the Add button allow user to create new record of Address details")
public void user_6047_to_verify_the_add_button_allow_user_to_create_new_record_of_address_details() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("address_type")).click();
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
		System.out.println("Map " + testData.get("Address Type").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Address Type")).trim())) {
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

@And("User_6047 To verify if user click the edit button System should redirect user to edit page")
public void user_6047_to_verify_if_user_click_the_edit_button_system_should_redirect_user_to_edit_page() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys("987456");
			//.sendKeys(testData.get("zip_code"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zipcode_verify")).getAttribute("ng-reflect-model");
        	System.out.println(text);
            Assert.assertTrue(text.contains("987456"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
	
}
@And("User_6047 click the Search button under Address details tab and search the matching data in listview")
public void user_6047_click_the_search_button_under_address_details_tab_and_search_the_matching_data_in_listview() {
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
		 int sectionIndex = i;
		System.out.println("Section Name " + sectionName + " i value " + i);
		sectionIndex = i;
		if (sectionName.equals("Address Details")) {

			for (int l = 0; l <= 100; l++) {
				try {
//					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
//							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')["
//									+ i  + "]"));
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')["
									+ i  + "]")
							.click();

					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isClicked == true) {
				break;
			}

		}
		if (isClicked == true) {
			System.out.println(i + " Got breaked");
			break;
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			System.out.println("address details search text "
					+ iJarah_CommonElements.getElement("search_box_search_text"));

			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							iJarah_CommonElements.getElement("search_box_search_text"))
					.sendKeys("Address1");
			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	//for (int i = 0; i <= 10; i++) {
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
	//}

}

@And("User_6047 check the match result data in Address details list view")
public void user_6047_check_the_match_result_data_in_address_details_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 100; i++) {
		try {
			searchResult = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
							+ (sectionIndex + 1)
							+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
					.toString();
			if ((searchResult.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

	Assert.assertTrue(!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));
	for (int i = 0; i <= 200; i++) {
		try {
			driver.findElement(By.xpath("//html")).click();
			break;
		} catch (Exception e) {
			if (i == 200) {
				Assert.fail(e.getMessage());
			}
		}
	}
}


@And("User_6047 click the Search button under Address details tab and search the mismatching data in listview")
public void user_6047_click_the_search_button_under_address_details_tab_and_search_the_mismatching_data_in_listview() {
	
	for (int i = 0; i <= 100; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(
					AddressDetails_js.getElement("address_details__record_search_input")).clear();
			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
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
		  sectionIndex = i;
		System.out.println("Section Name " + sectionName + " i value " + i);
		sectionIndex = i;
		if (sectionName.equals("Address Details")) {

			for (int l = 0; l <= 100; l++) {
				try {
//					javascriptHelper.executeScriptWithWebElement(
//							"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
//									+ (i + 1) + "].querySelector('button[icon=\"pi pi-search\"]')")
//							.click();
//					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
//							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')["
//									+ i  + "]"));
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('button[ng-reflect-text=\"Search\"]')["
									+ i  + "]")
						
							.click();

					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isClicked == true) {
				break;
			}

		}
		if (isClicked == true) {
			System.out.println(i + " Got breaked");
			break;
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			System.out.println("address details search text "
					+ iJarah_CommonElements.getElement("search_box_search_text"));

			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							iJarah_CommonElements.getElement("search_box_search_text"))
					.sendKeys("mismatch data");
			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
}

@And("User_6047 check the mismatch result in Address details list view")
public void user_6047_check_the_mismatch_result_in_address_details_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 100; i++) {
		try {
			searchResult = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
							+ (sectionIndex + 1)
							+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
					.toString();
			if ((searchResult.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

	Assert.assertTrue((searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));
	for (int i = 0; i <= 200; i++) {
		try {
			driver.findElement(By.xpath("//html")).click();
			break;
		} catch (Exception e) {
			if (i == 200) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 verify the functionality of back button in address details")
public void user_6047_verify_the_functionality_of_back_button_in_address_details() throws InterruptedException {
Thread.sleep(3000);
	if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("Backbutton_fun_verify")).isDisplayed()) {
		SoftAssert.fail("Check communication address toggle Field");
	}
	
}
@And("User_6047 To delete the data in zip code")
public void user_to_delete_the_data_in_zip_code() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).click();
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	 
}

@Then("User_6047 To verify system should show the proper validation message for blank field")
public void user_6047_to_verify_system_should_show_the_proper_validation_message_for_blank_field() {
	
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("PleaseFillDetails_Popup")).getText();
        	System.out.println(text);
            Assert.assertTrue(text.contains("Please fill all the details"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("User_6047 To verify the save and back botton in addressDetails screen")
public void user_6047_to_verify_the_save_and_back_botton_in_address_details_screen() throws Throwable {
	Thread.sleep(3000);
	if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("back_button")).isDisplayed()) {
		SoftAssert.fail("Check back button");
		
		if (javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("save_button")).isDisplayed()) {
			SoftAssert.fail("Check save button");
		}
		
	}
}

@Then("User_6047 To modify with valid data in Modification of Address details screen")
public void user_6047_to_modify_with_valid_data_in_modification_of_address_details_screen() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys("987456");
			//.sendKeys(testData.get("zip_code"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify same record should get saved in Modification of Address details screen")
public void user_6047_to_verify_same_record_should_get_saved_in_address_details() {
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zipcode_verify")).getAttribute("ng-reflect-model");
        	System.out.println(text);
            Assert.assertTrue(text.contains("987456"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("User_6047 To modify with invalid data in Modification of Address details screen")
public void user_6047_to_modify_with_invalid_data_in_modification_of_address_details_screen() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("zip_code")).sendKeys("data");

			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify system should not allow modification with invalid data")
public void user_6047_to_verify_system_should_not_allow_modification_with_invalid_data() {
	String CharacterValidation = "";
	for (int i = 0; i <= 100; i++) {
		try {
         CharacterValidation = javascriptHelper
					.executeScript("return "
							+ AddressDetails_js.getElement("zipcode_error_validation"))
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
	
	Assert.assertEquals("Enter Valid Zipcode".trim(), CharacterValidation.trim());
}

@Then("User_6047 To click the back button in Modification of Address details screen")
public void user_6047_to_click_the_back_button_in_modification_of_address_details_screen() {
	for (int i = 0; i <= 1000; i++) {
		try {
//			javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("back_button"))
//			.sendKeys(Keys.PAGE_UP);
			javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("back_button")));
			//javascriptHelper.executeScriptWithWebElement(AddressDetails_js.getElement("back_button")).click();
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the functionality of back button in  Modification of Address details screen")
public void user_6047_verify_the_functionality_of_back_button_in_modification_of_address_details_screen() {
	String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";

	String lengthOfTheLabel = "";

	boolean isAddButtonPresent = false;

	String labelName = "";

	System.out.println("");

	for (int i = 0; i <= 300; i++) {

		try {

			if (i > 200) {

				System.out.println("Query " + labelLength);

				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();

				if (!(lengthOfTheLabel.isBlank())) {

					break;

				}

			}

		} catch (Exception e) {

			if (i == 300) {

				Assert.fail(e.getMessage());

			}

		}

	}

	int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);

	System.out.println("Length of the label " + premitiveLabelLength);

	for (int i = 0; i < premitiveLabelLength; i++) {

		for (int j = 0; j <= 300; j++) {

			try {

				labelName = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

								+ i + "].innerText")

						.toString();

				System.out.println("label Name is " + labelName);

				if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {

					System.out.println("Label Name " + labelName);

					if (i > 250) {

						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));


					}

					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

							"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));

					javascriptHelper.executeScriptWithWebElement(

							"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]").isDisplayed();

					isAddButtonPresent = true;

					break;

				} else {

					isAddButtonPresent = false;

					break;

				}

			} catch (Exception e) {

				if (j == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		if (isAddButtonPresent == true) {

			break;

		}

	}

}
}

