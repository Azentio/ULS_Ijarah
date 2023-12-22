package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarraq_CommodityMaker_Step {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths commoditymakerJsPaths = new JSPaths(excelPath, "Tawarraq_CMA", "CMA_FieldName", "JSPath");
	//JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	//ExcelData documentdetailsExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	//ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData commoditymakerExcelData  = new ExcelData(excelTestDataPath,"Tawarraq_comPurchaseMaker","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_TW_CSM_12_01$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_12_01() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_12_01_D1");
    }
	@And("^User get the test data for test case AT_TW_CSM_12_02$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_12_02() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_12_02_D1");
    }
	@And("^User get the test data for test case AT_TW_CSM_13_01$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_13_01() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_13_01_D1");
    }
	@And("^User get the test data for test case AT_TW_CSM_13_02$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_13_02() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_13_02_D1");
    }
	@And("^User get the test data for test case AT_TW_CSM_14$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_14() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_14_D1");
    }
	@And("^User get the test data for test case AT_TW_CSM_15$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_15() throws Throwable {
		testData = commoditymakerExcelData.getTestdata("AT_TW_CSM_15_D1");
    }
	
	
	
	@And("Click on eye icon of existing record in Additional customer info tab")
	public void click_on_eye_icon_of_existing_record_in_additional_customer_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commoditymakerJsPaths.getElement("ViewButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}

	@And("Click on eye icon in Customer identification existing record")
	public void click_on_eye_icon_in_customer_identification_existing_record() {
		Actions action = new Actions(driver);
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
				if (titlename.trim().contains("Customer Identification")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					action.scrollToElement(addButton);
//					addButton.click();
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

	@And("Validate ID Type field is displayed in Commodity maker_Identification section")
	public void validate_id_type_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Id_Type_value")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Id_Type_value")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate ID Number field is displayed in Commodity maker_Identification section")
	public void validate_id_number_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Id_Number_value")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Id_Number_value")).isDisplayed());
	    
	}

	@And("Validate Issue date field is displayed in Commodity maker_Identification section")
	public void validate_issue_date_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Issue_Date_Attribute")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Issue_Date_Attribute")).isDisplayed());
	    
	}

	@And("Validate Expiry date field is displayed in Commodity maker_Identification section")
	public void validate_expiry_date_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Expiry_Date_attribute")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Expiry_Date_attribute")).isDisplayed());
	    
	}

	@And("Validate Issuing authority field is displayed in Commodity maker_Identification section")
	public void validate_issuing_authority_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IssuingAuthority_attribute")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IssuingAuthority_attribute")).isDisplayed());
	    
	}

	@And("Validate Country of Issue field is displayed in Commodity maker_Identification section")
	public void validate_country_of_issue_field_is_displayed_in_commodity_maker_identification_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CountryOfIssue_Attribute")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CountryOfIssue_Attribute")).isDisplayed());
	    
	}

	@And("Click on Back icon in Commodity maker_Identification section")
	public void click_on_back_icon_in_commodity_maker_identification_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commoditymakerJsPaths.getElement("BackButton_navigate")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on eye icon in Address details existing record")
	public void click_on_eye_icon_in_address_details_existing_record() {
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
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					addButton.click();
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

	@And("Validate Address Type field is displayed in Commodity maker_Address details section")
	public void validate_address_type_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_type")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_type")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Address Status field is displayed in Commodity maker_Address details section")
	public void validate_address_status_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_status")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_status")).isDisplayed());
	    
	}

	@And("Validate Residential or Occupancy status field is displayed in Commodity maker_Address details section")
	public void validate_residential_or_occupancy_status_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("residential_or_ocupency_status")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("residential_or_ocupency_status")).isDisplayed());
	    
	}

	@And("Validate Location category field is displayed in Commodity maker_Address details section")
	public void validate_location_category_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("location_category")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("location_category")).isDisplayed());
	    
	}

	@And("Validate Address Line1 field is displayed in Commodity maker_Address details section")
	public void validate_address_line1_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_line1")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_line1")).isDisplayed());
	    
	}

	@And("Validate Address Line2 field is displayed in Commodity maker_Address details section")
	public void validate_address_line2_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_line2")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("address_line2")).isDisplayed());
	    
	}

	@And("Validate Country field is displayed in Commodity maker_Address details section")
	public void validate_country_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("country")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("country")).isDisplayed());
	    
	}

	@And("Validate Province id Type field is displayed in Commodity maker_Address details section")
	public void validate_province_id_type_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("province_id")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("province_id")).isDisplayed());
	    
	}

	@And("Validate neighbourhood district name field is displayed in Commodity maker_Address details section")
	public void validate_neighbourhood_district_name_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("district_name")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("district_name")).isDisplayed());
	    
	}

	@And("Validate City field is displayed in Commodity maker_Address details section")
	public void validate_city_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("city")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("city")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("city")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Zipcode field is displayed in Commodity maker_Address details section")
	public void validate_zipcode_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("zip_code")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("zip_code")).isDisplayed());
	    
	}

	@And("Validate Po Box number field is displayed in Commodity maker_Address details section")
	public void validate_po_box_number_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("po_box_number")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("po_box_number")).isDisplayed());
	    
	}

	@And("Validate Mobile number field is displayed in Commodity maker_Address details section")
	public void validate_mobile_number_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("mobile_number_primary")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("mobile_number_primary")).isDisplayed());
	    
	}

	@And("Validate Duration of stay field is displayed in Commodity maker_Address details section")
	public void validate_duration_of_stay_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("duration_on_stay")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("duration_on_stay")).isDisplayed());
	    
	}

	@And("Validate Latitude details of the address field is displayed in Commodity maker_Address details section")
	public void validate_latitude_details_of_the_address_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("latitude_details_of_the_address")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("latitude_details_of_the_address")).isDisplayed());
	    
	}

	@And("Validate Land mark field is displayed in Commodity maker_Address details section")
	public void validate_land_mark_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landmark")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landmark")).isDisplayed());
	    
	}

	@And("Validate Occupancy date field is displayed in Commodity maker_Address details section")
	public void validate_occupancy_date_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("occupency_date")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("occupency_date")).isDisplayed());
	    
	}

	@And("Validate Landlord name field is displayed in Commodity maker_Address details section")
	public void validate_landlord_name_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landlord_name")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landlord_name")).isDisplayed());
	    
	}

	@And("Validate Landlord Mobile number field is displayed in Commodity maker_Address details section")
	public void validate_landlord_mobile_number_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landlord_mobile_number")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("landlord_mobile_number")).isDisplayed());
	    
	}

	@And("Validate Rent Amount field is displayed in Commodity maker_Address details section")
	public void validate_rent_amount_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("rent_amount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("rent_amount")).isDisplayed());
	    
	}

	@And("Validate Frequency of rent field is displayed in Commodity maker_Address details section")
	public void validate_frequency_of_rent_field_is_displayed_in_commodity_maker_address_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("frequency_of_rent")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("frequency_of_rent")).isDisplayed());
	    
	}
	@And("Click on eye icon in Contact details existing record")
	public void click_on_eye_icon_in_contact_details_existing_record() {
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
				if (titlename.trim().contains("Contact Details")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					addButton.click();
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

	@And("Validate Phone Type field is displayed in Commodity maker_Contact details section")
	public void validate_phone_type_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("phone_type_dropdown")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("phone_type_dropdown")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate Phone Number field is displayed in Commodity maker_Contact details section")
	public void validate_phone_number_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("phone_number_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("phone_number_input")).isDisplayed());
	    
	}

	@And("Validate Consent for Phone Contact field is displayed in Commodity maker_Contact details section")
	public void validate_consent_for_phone_contact_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("consent_for_phone_contact_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("consent_for_phone_contact_dropdown")).isDisplayed());
	    
	}

	@And("Validate Prefered phone contact Type field is displayed in Commodity maker_Contact details section")
	public void validate_prefered_phone_contact_type_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("prefered_phone_contact_type_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("prefered_phone_contact_type_dropdown")).isDisplayed());
	    
	}

	@And("Validate Prefered time for contact field is displayed in Commodity maker_Contact details section")
	public void validate_prefered_time_for_contact_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("prefered_time_for_contact_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("prefered_time_for_contact_input")).isDisplayed());
	    
	}

	@And("Validate Email type Type field is displayed in Commodity maker_Contact details section")
	public void validate_email_type_type_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("email_type_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("email_type_dropdown")).isDisplayed());
	    
	}

	@And("Validate Email ID Type field is displayed in Commodity maker_Contact details section")
	public void validate_email_id_type_field_is_displayed_in_commodity_maker_contact_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("email_input_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("email_input_input")).isDisplayed());
	    
	}

	@And("Click on eye icon in Reference list view existing record")
	public void click_on_eye_icon_in_reference_list_view_existing_record() {
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
				if (titlename.trim().contains("References List View")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					addButton.click();
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

	@And("Validate Relationship Type field is displayed in Commodity maker_Customer reference section")
	public void validate_relationship_type_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("RelationshipType")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("RelationshipType")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Salutation field is displayed in Commodity maker_Customer reference section")
	public void validate_salutation_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Salutation")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Salutation")).isDisplayed());
	    
	}

	@And("Validate First name field is displayed in Commodity maker_Customer reference section")
	public void validate_first_name_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("FirstName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("FirstName")).isDisplayed());
	    
	}

	@And("Validate Middle name field is displayed in Commodity maker_Customer reference section")
	public void validate_middle_name_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("MiddleName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("MiddleName")).isDisplayed());
	    
	}

	@And("Validate Last name field is displayed in Commodity maker_Customer reference section")
	public void validate_last_name_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LastName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LastName")).isDisplayed());
	    
	}

	@And("Validate Customer full name field is displayed in Commodity maker_Customer reference section")
	public void validate_customer_full_name_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CustomerFullName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CustomerFullName")).isDisplayed());
	    
	}

	@And("Validate Identification Type field is displayed in Commodity maker_Customer reference section")
	public void validate_identification_type_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IdentificationType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IdentificationType")).isDisplayed());
	    
	}

	@And("Validate Identification number field is displayed in Commodity maker_Customer reference section")
	public void validate_identification_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IdentificationNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IdentificationNumber")).isDisplayed());
	    
	}

	@And("Validate Residence address field is displayed in Commodity maker_Customer reference section")
	public void validate_residence_address_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ResidenceAddress")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ResidenceAddress")).isDisplayed());
	    
	}

	@And("Validate Office address field is displayed in Commodity maker_Customer reference section")
	public void validate_office_address_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("OfficeAddress")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("OfficeAddress")).isDisplayed());
	    
	}

	@And("Validate Contact number field is displayed in Commodity maker_Customer reference section")
	public void validate_contact_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ContactNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ContactNumber")).isDisplayed());
	    
	}

	@And("Validate Office phone number field is displayed in Commodity maker_Customer reference section")
	public void validate_office_phone_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("OfficePhoneNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("OfficePhoneNumber")).isDisplayed());
	    
	}

	@And("Validate Primary mobile number field is displayed in Commodity maker_Customer reference section")
	public void validate_primary_mobile_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("PrimaryMobileNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("PrimaryMobileNumber")).isDisplayed());
	    
	}

	@And("Validate Alternative mobile number field is displayed in Commodity maker_Customer reference section")
	public void validate_alternative_mobile_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("AlternativeMobileNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("AlternativeMobileNumber")).isDisplayed());
	    
	}

	@And("Validate Email id field is displayed in Commodity maker_Customer reference section")
	public void validate_email_id_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("EmailID")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("EmailID")).isDisplayed());
	    
	}

	@And("Validate No of Years known field is displayed in Commodity maker_Customer reference section")
	public void validate_no_of_years_known_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("NoOfYearsKnown")));
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("NoOfYearsKnown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("NoOfYearsKnown")).isDisplayed());
	    
	}

	@And("Validate CIF Number field is displayed in Commodity maker_Customer reference section")
	public void validate_cif_number_field_is_displayed_in_commodity_maker_customer_reference_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CIFNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CIFNumber")).isDisplayed());
	    
	}
	@And("Navigate to Customr Financials tab")
	public void navigate_to_customr_financials_tab() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")&&length.equalsIgnoreCase("1")) {
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
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Customer Financials")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
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

	@And("Click on eye icon of existing record in Customer financials tab")
	public void click_on_eye_icon_of_existing_record_in_customer_financials_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commoditymakerJsPaths.getElement("customerFinancialsTabEyeBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on eye icon in Employment list existing record")
	public void click_on_eye_icon_in_employment_list_existing_record() {
		Actions action = new Actions(driver);
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
				if (titlename.trim().contains("Customer Employment List")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					action.scrollToElement(addButton);
//					addButton.click();
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

	@And("Validate Nature of Employment field is displayed in Commodity maker_Employment section")
	public void validate_nature_of_employment_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Nature of Employment Dropdown")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Nature of Employment Dropdown")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Employment Period field is displayed in Commodity maker_Employment section")
	public void validate_employment_period_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Employment Period Dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Employment Period Dropdown")).isDisplayed());
	    
	}

	@And("Validate Employer Name field is displayed in Commodity maker_Employment section")
	public void validate_employer_name_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerName")).isDisplayed());
	    
	}

	@And("Validate Employer Name if others field is displayed in Commodity maker_Employment section")
	public void validate_employer_name_if_others_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerNameOthersInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerNameOthersInput")).isDisplayed());
	    
	}

	@And("Validate Employee ID field is displayed in Commodity maker_Employment section")
	public void validate_employee_id_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employeeIDInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employeeIDInput")).isDisplayed());
	    
	}

	@And("Validate Date of Joining field is displayed in Commodity maker_Employment section")
	public void validate_date_of_joining_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("dateOfJoining")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("dateOfJoining")).isDisplayed());
	    
	}

	@And("Validate Employment End date field is displayed in Commodity maker_Employment section")
	public void validate_employment_end_date_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employmentEndDate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employmentEndDate")).isDisplayed());
	    
	}

	@And("Validate Department field is displayed in Commodity maker_Employment section")
	public void validate_department_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("departmentDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("departmentDropdown")).isDisplayed());
	    
	}

	@And("Validate Designation field is displayed in Commodity maker_Employment section")
	public void validate_designation_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("designationDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("designationDropdown")).isDisplayed());
	    
	}

	@And("Validate Employment type field is displayed in Commodity maker_Employment section")
	public void validate_employment_type_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employmentTypeDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employmentTypeDropdown")).isDisplayed());
	    
	}

	@And("Validate Direct manager contact number extension field is displayed in Commodity maker_Employment section")
	public void validate_direct_manager_contact_number_extension_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerContactNbrInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerContactNbrInput")).isDisplayed());
	    
	}

	@And("Validate Direct manager telephone field is displayed in Commodity maker_Employment section")
	public void validate_direct_manager_telephone_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerTelephoneInput")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerTelephoneInput")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerTelephoneInput")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate Income paymode field is displayed in Commodity maker_Employment section")
	public void validate_income_paymode_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("incomePaymodeDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("incomePaymodeDropdown")).isDisplayed());
	    
	}

	@And("Validate Employer phone extension field is displayed in Commodity maker_Employment section")
	public void validate_employer_phone_extension_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerPhoneExInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerPhoneExInput")).isDisplayed());
	    
	}

	@And("Validate Employer phone number field is displayed in Commodity maker_Employment section")
	public void validate_employer_phone_number_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerPhoneNbrInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerPhoneNbrInput")).isDisplayed());
	    
	}

	@And("Validate State field is displayed in Commodity maker_Employment section")
	public void validate_state_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("stateDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("stateDropdown")).isDisplayed());
	    
	}

	@And("Validate Pincode field is displayed in Commodity maker_Employment section")
	public void validate_pincode_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("pincodeInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("pincodeInput")).isDisplayed());
	    
	}

	@And("Validate Total Experience field is displayed in Commodity maker_Employment section")
	public void validate_total_experience_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalExperienceInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalExperienceInput")).isDisplayed());
	    
	}

	@And("Validate Experience at current employment field is displayed in Commodity maker_Employment section")
	public void validate_experience_at_current_employment_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("experienceAtCurrentEmploymentInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("experienceAtCurrentEmploymentInput")).isDisplayed());
	    
	}

	@And("Validate Direct Manager name field is displayed in Commodity maker_Employment section")
	public void validate_direct_manager_name_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerNameInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("directManagerNameInput")).isDisplayed());
	    
	}

	@And("Validate Employer city code field is displayed in Commodity maker_Employment section")
	public void validate_employer_city_code_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerCityCodeInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employerCityCodeInput")).isDisplayed());
	    
	}

	@And("Validate Retirement Age field is displayed in Commodity maker_Employment section")
	public void validate_retirement_age_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("retirementAgeInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("retirementAgeInput")).isDisplayed());
	    
	}

	@And("Validate Remarks field is displayed in Commodity maker_Employment section")
	public void validate_remarks_field_is_displayed_in_commodity_maker_employment_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remarksTextarea")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remarksTextarea")).isDisplayed());
	    
	}
	@And("Click on eye icon in Income existing record")
	public void click_on_eye_icon_in_income_existing_record() {
		Actions action = new Actions(driver);
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
				if (titlename.trim().contains("Income")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					action.scrollToElement(addButton);
//					addButton.click();
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

	@And("Validate Employment type field is displayed in Commodity maker_Income section")
	public void validate_employment_type_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employementTypeInput")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("employementTypeInput")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Lumpsum Amount field is displayed in Commodity maker_Income section")
	public void validate_lumpsum_amount_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lumpsumAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lumpsumAmtInput")).isDisplayed());
	    
	}

	@And("Validate Pension Amount field is displayed in Commodity maker_Income section")
	public void validate_pension_amount_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("pensionAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("pensionAmtInput")).isDisplayed());
	    
	}

	@And("Validate Income field is displayed in Commodity maker_Income section")
	public void validate_income_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("incomeDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("incomeDropdown")).isDisplayed());
	    
	}

	@And("Validate Frequency field is displayed in Commodity maker_Income section")
	public void validate_frequency_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("frequencyDropdown")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Amount field is displayed in Commodity maker_Income section")
	public void validate_amount_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountLabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountLabel")).isDisplayed());
	    
	}

	@And("Validate Defined percentage field is displayed in Commodity maker_Income section")
	public void validate_defined_percentage_field_is_displayed_in_commodity_maker_income_section()throws IOException  {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("defined%_Label")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("defined%_Label")).isDisplayed());
	    
	}

	@And("Validate Adjusted percentage field is displayed in Commodity maker_Income section")
	public void validate_adjusted_percentage_field_is_displayed_in_commodity_maker_income_section()throws IOException  {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("adjusted%_Label")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("adjusted%_Label")).isDisplayed());
	    
	}

	@And("Validate Amount considered field is displayed in Commodity maker_Income section")
	public void validate_amount_considered_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountConsideredLabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountConsideredLabel")).isDisplayed());
	    
	}

	@And("Validate Action field is displayed in Commodity maker_Income section")
	public void validate_action_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("actionLabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("actionLabel")).isDisplayed());
	    
	}

	@And("Validate Total Income field is displayed in Commodity maker_Income section")
	public void validate_total_income_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalIncomeInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalIncomeInput")).isDisplayed());
	    
	}

	@And("Validate Total Income considered is displayed in Commodity maker_Income section")
	public void validate_total_income_considered_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalIncomeConsideredInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalIncomeConsideredInput")).isDisplayed());
	    
	}

	@And("Validate Salary credited to bakn  field is displayed in Commodity maker_Income section")
	public void validate_salary_credited_to_bakn_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("salaryCreditedToBankDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("salaryCreditedToBankDropdown")).isDisplayed());
	    
	}

	@And("Validate Bank name  field is displayed in Commodity maker_Income section")
	public void validate_bank_name_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("bankNameDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("bankNameDropdown")).isDisplayed());
	    
	}

	@And("Validate Branch name field is displayed in Commodity maker_Income section")
	public void validate_branch_name_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("branchNameDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("branchNameDropdown")).isDisplayed());
	    
	}

	@And("Validate Deduction field is displayed in Commodity maker_Income section")
	public void validate_deduction_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionDropdown")).isDisplayed());
	    
	}

	@And("Validate Deduction frequency field is displayed in Commodity maker_Income section")
	public void validate_deduction_frequency_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionFrequencyDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionFrequencyDropdown")).isDisplayed());
	    
	}

	@And("Validate Deduction amt field is displayed in Commodity maker_Income section")
	public void validate_deduction_amt_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionAmtInput")).isDisplayed());
	    
	}

	@And("Validate Deduction def percentage field is displayed in Commodity maker_Income section")
	public void validate_deduction_def_percentage_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionDef%_Input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionDef%_Input")).isDisplayed());
	    
	}

	@And("Validate Deduction adj percentage field is displayed in Commodity maker_Income section")
	public void validate_deduction_adj_percentage_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionAdj%_Input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionAdj%_Input")).isDisplayed());
	    
	}

	@And("Validate Deduction considered field is displayed in Commodity maker_Income section")
	public void validate_deduction_considered_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionConsideredInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionConsideredInput")).isDisplayed());
	    
	}

	@And("Validate Deduction action field is displayed in Commodity maker_Income section")
	public void validate_deduction_action_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionActionLabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("deductionActionLabel")).isDisplayed());
	    
	}

	@And("Validate Total deduction field is displayed in Commodity maker_Income section")
	public void validate_total_deduction_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalDeductionInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalDeductionInput")).isDisplayed());
	    
	}

	@And("Validate Total deduction considered field is displayed in Commodity maker_Income section")
	public void validate_total_deduction_considered_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalDeductionConsideredInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("totalDeductionConsideredInput")).isDisplayed());
	    
	}

	@And("Validate Currency field is displayed in Commodity maker_Income section")
	public void validate_currency_field_is_displayed_in_commodity_maker_income_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currencyDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currencyDropdown")).isDisplayed());
	    
	}

	@And("Click on eye icon in Financial commitments existing record")
	public void click_on_eye_icon_in_financial_commitments_existing_record() {
		Actions action = new Actions(driver);
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
				if (titlename.trim().contains("Financial Commitments")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[icon=\"pi pi-eye\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
//					action.scrollToElement(addButton);
//					addButton.click();
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

	@And("Validate Finance type field is displayed in Commodity maker_Customer Debt details section")
	public void validate_finance_type_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("financeTypeDropdown")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("financeTypeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Finance Institution field is displayed in Commodity maker_Customer Debt details section")
	public void validate_finance_institution_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("financialInstitutionlabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("financialInstitutionlabel")).isDisplayed());
	    
	}

	@And("Validate Account number field is displayed in Commodity maker_Customer Debt details section")
	public void validate_account_number_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("accountNumberInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("accountNumberInput")).isDisplayed());
	    
	}

	@And("Validate Sanction date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_sanction_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("sanctionDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("sanctionDateField")).isDisplayed());
	    
	}

	@And("Validate Sanction amount field is displayed in Commodity maker_Customer Debt details section")
	public void validate_sanction_amount_field_is_displayed_in_commodity_maker_customer_debt_details_section()throws IOException  {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("sanctionAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("sanctionAmtInput")).isDisplayed());
	    
	}

	@And("Validate Interest rate field is displayed in Commodity maker_Customer Debt details section")
	public void validate_interest_rate_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("interestRateInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("interestRateInput")).isDisplayed());
	    
	}

	@And("Validate Current principle balance field is displayed in Commodity maker_Customer Debt details section")
	public void validate_current_principle_balance_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currentPrincipalBalanceInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currentPrincipalBalanceInput")).isDisplayed());
	    
	}

	@And("Validate Tenure month field is displayed in Commodity maker_Customer Debt details section")
	public void validate_tenure_month_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("tenureMonthInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("tenureMonthInput")).isDisplayed());
	    
	}

	@And("Validate Maturity date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_maturity_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("maturityDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("maturityDateField")).isDisplayed());
	    
	}

	@And("Validate Installment amount field is displayed in Commodity maker_Customer Debt details section")
	public void validate_installment_amount_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("installmentAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("installmentAmtInput")).isDisplayed());
	    
	}

	@And("Validate Amount considered field is displayed in Commodity maker_Customer Debt details section")
	public void validate_amount_considered_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountConsideredInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("amountConsideredInput")).isDisplayed());
	    
	}

	

	@And("Validate Currency field is displayed in Commodity maker_Customer Debt details section")
	public void validate_currency_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currencyLabelCFDept")));
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currencyDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("currencyLabelCFDept")).isDisplayed());
	    
	}

	@And("Validate Remarks field is displayed in Commodity maker_Customer Debt details section")
	public void validate_remarks_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remarksInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remarksInput")).isDisplayed());
	    
	}

	@And("Validate Next due date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_next_due_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("nextDueDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("nextDueDateField")).isDisplayed());
	    
	}

	@And("Validate Collateral type field is displayed in Commodity maker_Customer Debt details section")
	public void validate_collateral_type_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("collateralTypedDropDown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("collateralTypedDropDown")).isDisplayed());
	    
	}

	@And("Validate Closed date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_closed_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("closeDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("closeDateField")).isDisplayed());
	    
	}

	@And("Validate Frequency field is displayed in Commodity maker_Customer Debt details section")
	public void validate_frequency_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("frequencyLabelCFDept")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("frequencyLabelCFDept")).isDisplayed());
	    
	}

	@And("Validate Last payment amount field is displayed in Commodity maker_Customer Debt details section")
	public void validate_last_payment_amount_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lastPaymentAmtInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lastPaymentAmtInput")).isDisplayed());
	    
	}

	@And("Validate Last payment date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_last_payment_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lastPaymentDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("lastPaymentDateField")).isDisplayed());
	    
	}

	@And("Validate Product name field is displayed in Commodity maker_Customer Debt details section")
	public void validate_product_name_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("productNameInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("productNameInput")).isDisplayed());
	    
	}

	@And("Validate Last 24 cycle field is displayed in Commodity maker_Customer Debt details section")
	public void validate_last_cycle_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("last24CycleInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("last24CycleInput")).isDisplayed());
	    
	}

	@And("Validate Facility status field is displayed in Commodity maker_Customer Debt details section")
	public void validate_facility_status_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("facilityStatusDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("facilityStatusDropdown")).isDisplayed());
	    
	}

	@And("Validate Remaining tenure field is displayed in Commodity maker_Customer Debt details section")
	public void validate_remaining_tenure_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remainingTenureInput")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("remainingTenureInput")).isDisplayed());
	    
	}

	@And("Validate Disbursement date field is displayed in Commodity maker_Customer Debt details section")
	public void validate_disbursement_date_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("disbursementDateField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("disbursementDateField")).isDisplayed());
	    
	}

	@And("Validate Request for balance takeover field is displayed in Commodity maker_Customer Debt details section")
	public void validate_request_for_balance_takeover_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("reqForBalanceTakeoverDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("reqForBalanceTakeoverDropdown")).isDisplayed());
	    
	}

	@And("Validate NPA Classification field is displayed in Commodity maker_Customer Debt details section")
	public void validate_npa_classification_field_is_displayed_in_commodity_maker_customer_debt_details_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("NPAClassificationDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("NPAClassificationDropdown")).isDisplayed());
	    
	}
	@And("Navigate to Living Expense section")
	public void navigate_to_living_expense_section() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")&&length.equalsIgnoreCase("1")) {
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
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Living Expenses")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
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

	@And("Click on eye icon of existing record in Living expenses tab")
	public void click_on_eye_icon_of_existing_record_in_living_expenses_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commoditymakerJsPaths.getElement("customerFinancialsTabEyeBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate Customer name field is displayed in Commodity maker_Living Expense section")
	public void validate_customer_name_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CustomerName")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("CustomerName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
	    
	}

	@And("Validate Total Living expense field is displayed in Commodity maker_Living Expense section")
	public void validate_total_living_expense_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("TotalLivingExpense")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("TotalLivingExpense")).isDisplayed());
	    
	}

	@And("Validate Accredited Costs field is displayed in Commodity maker_Living Expense section")
	public void validate_accredited_costs_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("AccereditedCost")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("AccereditedCost")).isDisplayed());
	    
	}

	@And("Validate Is spouse employed field is displayed in Commodity maker_Living Expense section")
	public void validate_is_spouse_employed_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IsSpouseEmployed")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("IsSpouseEmployed")).isDisplayed());
	    
	}

	@And("Validate Spouse Salary field is displayed in Commodity maker_Living Expense section")
	public void validate_spouse_salary_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("SpouseSalary")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("SpouseSalary")).isDisplayed());
	    
	}

	@And("Validate Living Allowance field is displayed in Commodity maker_Living Expense section")
	public void validate_living_allowance_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LivingAllowance")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LivingAllowance")).isDisplayed());
	    
	}

	@And("Validate Expected cost of living field is displayed in Commodity maker_Living Expense section")
	public void validate_expected_cost_of_living_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ExpectedCostOfLiving")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ExpectedCostOfLiving")).isDisplayed());
	    
	}

	@And("Validate Minimum living cost1 field is displayed in Commodity maker_Living Expense section")
	public void validate_minimum_living_cost1_field_is_displayed_in_commodity_maker_living_expense_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("MinimumLivingCost1")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("MinimumLivingCost1")).isDisplayed());
	    
	}

	@And("Navigate to Facility Info section")
	public void navigate_to_facility_info_section() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")&&length.equalsIgnoreCase("1")) {
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
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Facility Info")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
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

	@And("Click on eye icon of existing record in Facility info tab")
	public void click_on_eye_icon_of_existing_record_in_facility_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commoditymakerJsPaths.getElement("customerFinancialsTabEyeBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate Classification field is displayed in Commodity maker_Facility info section")
	public void validate_classification_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Classification")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Classification")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Product field is displayed in Commodity maker_Facility info section")
	public void validate_product_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Product")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Product")).isDisplayed());
	    
	}

	@And("Validate Scheme field is displayed in Commodity maker_Facility info section")
	public void validate_scheme_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Scheme")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Scheme")).isDisplayed());
	    
	}

	@And("Validate Program code field is displayed in Commodity maker_Facility info section")
	public void validate_program_code_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ProgramCode")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ProgramCode")).isDisplayed());
	    
	}

	@And("Validate Facility type field is displayed in Commodity maker_Facility info section")
	public void validate_facility_type_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("FacilityType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("FacilityType")).isDisplayed());
	    
	}

	@And("Validate Servicing branch field is displayed in Commodity maker_Facility info section")
	public void validate_servicing_branch_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ServicingBranch")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("ServicingBranch")).isDisplayed());
	    
	}

	@And("Validate Pricing or interest indicator field is displayed in Commodity maker_Facility info section")
	public void validate_pricing_or_interest_indicator_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("PricingInterestIndicator")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("PricingInterestIndicator")).isDisplayed());
	    
	}

	@And("Validate Requested amount field is displayed in Commodity maker_Facility info section")
	public void validate_requested_amount_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("RequestedAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("RequestedAmount")).isDisplayed());
	    
	}

	@And("Validate Currency field is displayed in Commodity maker_Facility info section")
	public void validate_currency_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Currency")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("Currency")).isDisplayed());
	    
	}

	@And("Validate Loan tenure field is displayed in Commodity maker_Facility info section")
	public void validate_loan_tenure_field_is_displayed_in_commodity_maker_facility_info_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LoanTenure")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("LoanTenure")).isDisplayed());
	    
	}
	@And("User search the Ref id under inbox for Tawarraq_Commodity maker")
	public void user_search_the_ref_id_under_inbox_for_tawarraq_commodity_maker() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commoditymakerJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}
	@And("Navigate to Additional customer info tab in Tawarraq_Commodity maker")
	public void navigate_to_additional_customer_info_tab_in_tawarraq_commodity_maker() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")&&length.equalsIgnoreCase("1")) {
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
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Additional Customer Info")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					addButton.click();
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

}
