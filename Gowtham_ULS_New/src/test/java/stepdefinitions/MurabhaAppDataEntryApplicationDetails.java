package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class MurabhaAppDataEntryApplicationDetails {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths TawaAppDataEntryIncomeDetails = new JSPaths(excelPath, "TawaAppDataEntryIncomeDetails", "FieldName", "JSPath");
	JSPaths New_Application = new JSPaths(excelPath, "New_Application", "FieldName", "JSPath");
	JSPaths MurApDataEntryAppDetails = new JSPaths(excelPath, "MurApDataEntryAppDetails", "FieldName", "JSPath");
	ExcelData New_ApplicationexelData = new ExcelData(excelTestDataPath, "New_Application", "Data Set ID");
	Map<String, String> testData;
	ExcelData Customer_Search = new ExcelData(excelTestDataPath, "Customer_Search", "Data Set ID");
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	@Given("user_607 click on Application Details info tab")
	public void user_click_on_application_details_info_tab() {
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
				if (titlename.trim().contains("Application Details")) {
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
	
	@Given("User_607 Search in the search Field Murabha AppDataEntry Application Details")
	public void user_search_in_the_search_field_murabha_app_data_entry_application_details() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaAppDataEntryIncomeDetails.getElement("searchInInbox")).sendKeys("4793",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("user_607 Check Save button field is visible or not")
	public void user_check_save_button_field_is_visible_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Savebutton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user_607 Check Submit field is visible or not")
	public void user_check_submit_field_is_visible_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("submitbuton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Check Eligibility check field is visible or not")
	public void user_check_eligibility_check_field_is_visible_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Eligibility Check")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user_607 Check Status field is visible or not")
	public void user_check_status_field_is_visible_or_not() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Status")));
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Status")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user_607 Check View summary field is visible or not")
	public void user_check_view_summary_field_is_visible_or_not() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("View Summary")));
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("View Summary")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user_607 Check Back field is visible or not")
	public void user_check_back_field_is_visible_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("BackButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@Given("User_607 delete Declared Net Monthly Income value")
	public void user_607_check_declared_net_monthly_income_should_be_editable() {
	    
		for (int i = 0; i < 700; i++) {
			try {
			//	javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper.executeScriptWithWebElement(New_Application.getElement("DeclaredNetMonthlyIncome"))));
				javascriptHelper.executeScriptWithWebElement(New_Application.getElement("DeclaredNetMonthlyIncome")).sendKeys(Keys.DELETE);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		
	}
	
	@Given("User_607 Click search in the list view and search record Murabha AppDataEntry Application Details screen")
	public void user_click_search_in_the_list_view_murabha_app_data_entry_application_details_screen() {
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
				if (titlename.trim().contains("Application Details")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[ng-reflect-icon=\"pi pi-search\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
			//		javascriptHelper.JSEClick(addButton);
					addButton.click();
					javascriptHelper.executeScriptWithWebElement("document.querySelector('input[mode=\"ios\"]')").sendKeys(RecordNo,Keys.ENTER);
					break;
				}
			}
			Thread.sleep(2000);
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}
	
	
	@Given("user_607 Click submit button in Murabha AppDataEntry Application Details screen")
	public void user_click_submit_button_in_murabha_app_data_entry_application_details_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("submitbuton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Verify Action confirmation popup should be visible or not")
	public void user_verify_action_confirmation_popup_should_be_visible_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				String string = javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Action confirmation")).getText();
				Assert.assertTrue(string.equalsIgnoreCase("Action confirmation"));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Close the Action confirmation popup")
	public void user_close_the_action_confirmation_popup() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Action confirmation close")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}
	String StatusToggle = null;
	@Given("user_607 Click status toggle button in Murabha AppDataEntry Application Details screen")
	public void user_click_status_toggle_button_in_murabha_app_data_entry_application_details_screen() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Status")));
		String attribute = javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Status toggle")).getAttribute("aria-checked");
		if (attribute.equalsIgnoreCase("true")) {
			StatusToggle = "Off";
		}
		else {
			StatusToggle = "On";
		}
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Status toggle")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}
	
	@Given("user_607 Scroll to save button")
	public void user_scroll_to_save_button() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("submitbuton")));
	}
	String RecordNo = null;
	@Given("User_607 Get the saved record number from the popup")
	public void user_get_the_saved_record_number_from_the_popup() throws Throwable {
		Thread.sleep(1000);
		String RecordNo1 = null;
		for (int i = 0; i < 700; i++) {
			try {
				RecordNo1 = javascriptHelper.executeScriptWithWebElement("document.querySelector('div[aria-label*=\"Success\"]')").getText();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		RecordNo = RecordNo1.substring(32, 36);
	    System.out.println(RecordNo);
	}

	
	@Given("user_607 verify the status should be changed or not")
	public void user_verify_the_status_should_be_changed() {
	   String status = javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Verify Status")).getText();
	   if (StatusToggle.equalsIgnoreCase("On")) {
		Assert.assertTrue(status.equalsIgnoreCase("Active"));
	}
	   else {
		   Assert.assertTrue(status.equalsIgnoreCase("In-active"));
	}
	    
	}
	
	@Given("user_607 click view summery button")
	public void user_click_view_summery_button() {
		for (int i = 0; i < 700; i++) {
			try {
		//		javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("View Summary")).click();
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("View Summary")));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Verify Transaction summary screen open or not")
	public void user_verify_transaction_summary_screen_open_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				String string = javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Action confirmation")).getText();
				Assert.assertTrue(string.equalsIgnoreCase("Transaction summary"));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Close Transaction summary screen")
	public void user_close_transaction_summary_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Action confirmation close")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}
	
	@Given("user_607 Check verify the functionality of Back button")
	public void user_check_verify_the_functionality_of_back_button() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("BackButton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	
	@Given("User_607 Click Return button in Murabha AppDataEntry Application Details")
	public void user_click_return_button_in_murabha_app_data_entry_application_details() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Return button")));
			//	javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Return button")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	
	@Given("user_607 Verify Return screen open or not")
	public void user_verify_return_screen_open_or_not() {
		for (int i = 0; i < 700; i++) {
			try {
				String string = javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Return Popup")).getText();
				Assert.assertTrue(string.equalsIgnoreCase("Return"));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@Given("user_607 Close Return screen")
	public void user_close_return_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurApDataEntryAppDetails.getElement("Action confirmation close")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
