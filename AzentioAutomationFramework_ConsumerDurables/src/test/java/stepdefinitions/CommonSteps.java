package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataprovider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CommonSteps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths commonElements = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	IjaraLogin login = new IjaraLogin();

	@Given("^navigate to ULS URL$")
	public void navigate_to_uls_url() throws Throwable {
		System.out.println("URL " + configFileReader.getURL());
		driver.get(configFileReader.getURL());
	}

	@And("^login with valid underwritter user credntials for cnsumer durables$")
	public void login_with_valid_underwritter_user_credntials_for_cnsumer_durables() throws Throwable {
		login.loginWithIjaraApplication("userType_076_03");
	}

	@And("click on mail box")
	public void click_on_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					System.out.println(commonElements.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search box upon click on the mail box")
	public void click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("mail_box_search_button"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search text box upon click the search button")
	public void click_on_search_text_box_upon_click_the_search_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("search the consumer durables data entry record reference number in search text box")
	public void search_the_record_reference_number_in_search_text_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 100; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getDataEntryReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("select the consumer durables data entry record form mail box")
	public void select_the_record_form_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 100; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getDataEntryReferenceNumber())) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]"));
						break;
					}
				} catch (Exception e) {

				}
			}
		}

		Thread.sleep(5000);
	}

	@And("^user_076 click on submit button in application details at data entry stage$")
	public void user_076_click_on_submit_button_in_application_details_at_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("submit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter the submit remark for application details record at data entry stage$")
	public void user_076_enter_the_submit_remark_for_application_details_record_at_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("alert_ok")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on alert submit button in application details screen at data entry stage$")
	public void user_076_click_on_alert_submit_button_in_application_details_screen_at_data_entry_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("alert_submit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
