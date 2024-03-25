package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class ConsumerDurable_AppDataEntry_FacilityDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	// Ijarah_CommonFieldName	
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	JSPaths FacilityDetails_js = new JSPaths(excelPath, "AppDataEn_FacilityDetails", "AppDataEntryElements", "JSPath");
	ExcelData CD_FacilityDetails_testdata  = new ExcelData(excelTestDataPath,"ConDurable_ADE_FacilityDetail","Dataset ID");
	//ExcelData AddressDetails_TestData  = new ExcelData(excelTestDataPath,"AutoL_AppDataEn_AddressDetail","Dataset ID");
	ExcelData ConsumerDurableExecution = new ExcelData(excelTestDataPath, "ConsumerDurableExecution", "TestCase ID");
	Map<String, String> executionData;
	
	@And("User_6047 Get the test data for test case ID AT_CD_ADE_FC_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_ade_fc_01() {
		executionData = ConsumerDurableExecution.getTestdata("AT_CD_ADE_FC_01");
		testData =  CD_FacilityDetails_testdata.getTestdata(executionData.get("dataSet_ID"));
	}
	@And("User_6047 Search the referen Id under inbox")
	public void user_6047_search_the_referen_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));

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
	}
}
	@And("User_6047 Click Add button under the Facilityinfo screen")
	public void user_6047_click_add_button_under_the_facilityinfo_screen() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("AddButton_under_FacilityInfo")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 Click the Facility info screen tab in ConsumerDurable")
	public void user_6047_click_the_facility_info_screen_tab_in_consumerDurable() {
		//Thread.sleep(1500);
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
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
			//		addButton.click();
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
	@Then("User_6047 To verify the Classification field under the Facilityinfo screen")
	public void user_6047_to_verify_the_classification_field_under_the_facilityinfo_screen() {
		WebElement Classification = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Classification.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Product field under the Facilityinfo screen")
	public void user_6047_to_verify_the_product_field_under_the_facilityinfo_screen() {
		WebElement Product = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Product.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Scheme field under the Facilityinfo screen")
	public void user_6047_to_verify_the_scheme_field_under_the_facilityinfo_screen() {
		WebElement Scheme = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Scheme.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Program Code field under the Facilityinfo screen")
	public void user_6047_to_verify_the_program_code_field_under_the_facilityinfo_screen() {
		WebElement ProgramCode = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ProgrameCode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ProgramCode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Facility type field under the Facilityinfo screen")
	public void user_6047_to_verify_the_facility_type_field_under_the_facilityinfo_screen() {
		WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Pricing Indicator field under the Facilityinfo screen")
	public void user_6047_to_verify_the_pricing_indicator_field_under_the_facilityinfo_screen() {
		WebElement PricingIndicator = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the serving branch field under the Facilityinfo screen")
	public void user_6047_to_verify_the_serving_branch_field_under_the_facilityinfo_screen() {
		WebElement ServicingBranch = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ServicingBranch"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ServicingBranch.isDisplayed());
		
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Request Amount under the Facilityinfo screen")
	public void user_6047_to_verify_the_request_amount_under_the_facilityinfo_screen() {
		WebElement RequestedAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Currency field under the Facilityinfo screen")
	public void user_6047_to_verify_the_currency_field_under_the_facilityinfo_screen() {
		WebElement Currency = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Currency"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Currency.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Loan Tenure under the Facilityinfo screen")
	public void user_6047_to_verify_the_loan_tenure_under_the_facilityinfo_screen() {
		WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the Declared Down payment amount under the Facilityinfo screen")
	public void user_6047_to_verify_the_declared_down_payment_amount_under_the_facilityinfo_screen() {
		WebElement DeclaredDownPaymentAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("DeclaredDownPaymentAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownPaymentAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the status under the Facilityinfo screen")
	public void user_6047_to_verify_the_status_under_the_facilityinfo_screen() {
		WebElement status = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("status_ToggleButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(status.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

@Then("User_6047 To verify the save button under the Facilityinfo screen")
public void user_6047_to_verify_the_save_button_under_the_facilityinfo_screen() {
	for (int i = 0; i <= 150; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("SaveButton")).isDisplayed();
			break;
		} catch (Exception e) { 
			if (i == 150) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the back button field under the Facilityinfo screen")
public void user_6047_to_verify_the_back_button_field_under_the_facilityinfo_screen() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("SaveButton")));
	WebElement SaveButton = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("SaveButton"));
	for (int i = 0; i <= 200; i++) {
		try {
			Assert.assertTrue(SaveButton.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 200) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

}