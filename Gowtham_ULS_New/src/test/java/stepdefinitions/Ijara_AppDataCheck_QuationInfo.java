package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijara_AppDataCheck_QuationInfo {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths IjaraAppDataCheckQuationInfo = new JSPaths(excelPath, "IjaraAppDataCheckQuationInfo", "FieldName", "JSPath");
	
	ExcelData IjaraAppDataCheckQuationInfoexelData = new ExcelData(excelTestDataPath, "IjaraAppDataCheckQuationInfo", "Data Set ID");
	Map<String, String> testData;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	
	
	
	
	@Given("User_607 Click Quotation Info Page")
	public void user_607_click_quotation_info_page() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("Quotation Info")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Click View button in Quotation Info page")
	public void user_607_click_view_button_in_quotation_info_page() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("View Button")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check GoBack button in Quotation Details page")
	public void user_607_check_go_back_button_in_quotation_details_page() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("View Button")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Check Insurance Company BpId Field")
	public void user_607_check_insurance_company_bp_id_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("InsuranceCompanyBpId")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check Base Premium Amount Field")
	public void user_607_check_base_premium_amount_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("BasePremiumAmount")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check Vat On Base Premium Amount Field")
	public void user_607_check_vat_on_base_premium_amount_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("VatOnBasePremiumAmount")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check Net Base Premium Amount Field")
	public void user_607_check_net_base_premium_amount_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("NetBasePremiumAmount")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check total Discount Amount Field")
	public void user_607_check_total_discount_amount_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("totalDiscountAmount")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check Expiry Date Field")
	public void user_607_check_expiry_date_field() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("ExpiryDate")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check Quote Reference No")
	public void user_607_check_quote_reference_no() {
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("QuoteReferenceNo")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check back button navigate to the previous screen")
	public void user_607_check_back_button_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("GoBack Button")).click();;
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		for (int i = 0; i < 700; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(IjaraAppDataCheckQuationInfo.getElement("View Button")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		
	}
	
	
	
	
}
