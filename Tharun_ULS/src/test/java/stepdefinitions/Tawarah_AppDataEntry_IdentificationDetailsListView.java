package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import helper.JavascriptHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarah_AppDataEntry_IdentificationDetailsListView {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	JSPaths MubAppDaEnIdendificationDetail = new JSPaths(excelPath, "MurabAppDataEntryLivingExpenses", "FieldName", "JSPath");
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	
	@Given("user click on the Additional Customer info")
	public void user_click_on_the_additional_customer_info() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MubAppDaEnIdendificationDetail.getElement("additonal_customer_info"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user click on Add Button below the Additional Customer info")
	public void user_click_on_add_button_below_the_additional_customer_info() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MubAppDaEnIdendificationDetail.getElement("AddButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	@Then("User to verify the Values in list view should be in read only mode in customer details")
	public void user_to_verify_the_values_in_list_view_should_be_in_read_only_mode_in_customer_details() {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
						.sendKeys("123456");
			} catch (Exception e) {
				if (i == 20) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status);
 
	}
	

	@Then("user to verify the Id type should be in display only")
	public void user_to_verify_the_id_type_should_be_in_display_only() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnIdendificationDetail.getElement("Company Type")).isDisplayed()) {
			Assert.fail();
		}
	}

	@Then("user to verify the Id number should be in display only")
	public void user_to_verify_the_id_number_should_be_in_display_only() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user to verify the Id issue date should be in display only")
	public void user_to_verify_the_id_issue_date_should_be_in_display_only() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user to verify the Id expiry date should be in display only")
	public void user_to_verify_the_id_expiry_date_should_be_in_display_only() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user to verify the Id status should be in display only")
	public void user_to_verify_the_id_status_should_be_in_display_only() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
