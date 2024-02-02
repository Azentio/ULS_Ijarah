package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataCheck_AssetDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;

	IjaraLogin ijarahLogin = new IjaraLogin();
	ConfigFileReader configFileReader = new ConfigFileReader();
	String jsPathExcelfile = configFileReader.getJSFilePath();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJsElements = new JSPaths(jsPathExcelfile, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths assetDetailsWebElements = new JSPaths(jsPathExcelfile, "assetDetails_WebElements",
			"Ijarah_AssetDetailsFieldName", "JSPath");

	@And("^login with valid app data check stage credentials for ijarah$")
	public void login_with_valid_app_data_check_stage_credentials_for_ijarah() throws Throwable {
		ijarahLogin.loginWithIjaraApplication("userType11");
	}

	@And("^login with valid app data check stage credentials for murabaha$")
	public void login_with_valid_app_data_check_stage_credentials_for_murabaha() throws Throwable {
		ijarahLogin.loginWithIjaraApplication("userType12");
	}

	@And("^user_076 search ijarah app data check record reference number in mail box$")
	public void user_076_search_ijarah_app_data_check_record_reference_number_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJsElements.getElement("mail_box_search_text"));
				System.out.println(
						"Record reference Number " + configFileReader.getIjarahDataCheckRecordReferenceNumber());
				searchTextBox.sendKeys(configFileReader.getIjarahDataCheckRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 select the ijarah app data check record reference number from mail box$")
	public void user_076_select_the_ijarah_app_data_check_record_reference_number_from_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 150; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getIjarahDataCheckRecordReferenceNumber())) {
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
	}

	@And("^user_076 search Murabaha app data check record reference number in mail box$")
	public void user_076_search_Murabaha_app_data_check_record_reference_number_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJsElements.getElement("mail_box_search_text"));
				System.out.println(
						"Record reference Number " + configFileReader.getMurabahaDataCheckRecordReferenceNumber());
				searchTextBox.sendKeys(configFileReader.getMurabahaDataCheckRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 select the Murabaha app data check record reference number from mail box$")
	public void user_076_select_the_Murabaha_app_data_check_record_reference_number_from_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 150; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getMurabahaDataCheckRecordReferenceNumber())) {
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
	}

	@And("^user_076 click on asset details tab at app data check stage$")
	public void user_076_click_on_asset_details_tab_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(assetDetailsWebElements.getElement("asset_details_tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}

			}
		}
	}

	@And("^user_076 click on view button in asset details list view at app data check stage$")
	public void user_076_click_on_view_button_in_asset_details_list_view_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsWebElements.getElement("asset_details_view_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}

			}
		}
	}

	@Then("^user_076 verify asset details screen should have asset details section at app data check stage$")
	public void user_076_verify_asset_details_screen_should_have_asset_details_section_at_app_data_check_stage()
			throws Throwable {
		boolean sectionVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
				sectionVerification = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsWebElements.getElement("asset_details_section_vierification"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		softAssert.assertTrue(sectionVerification, "asset details section is not visible hence failed");
	}

	@Then("^user_076 verify asset details screen should have dealer details section at app data check stage$")
	public void user_076_verify_asset_details_screen_should_have_dealer_details_section_at_app_data_check_stage()
			throws Throwable {
		boolean sectionVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Web Element JS path "
						+ assetDetailsWebElements.getElement("dealer_details_section_validation"));
				sectionVerification = javascriptHelper.executeScriptWithWebElement(
						assetDetailsWebElements.getElement("dealer_details_section_validation")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		softAssert.assertTrue(sectionVerification, "dealer details section is not visible hence failed");
	}

	@Then("^user_076 verify asset details screen should have Registration details section at app data check stage$")
	public void user_076_verify_asset_details_screen_should_have_Registration_details_section_at_app_data_check_stage()
			throws Throwable {
		boolean sectionVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(assetDetailsWebElements.getElement("registration_details_section_validation"));
				sectionVerification = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsWebElements.getElement("registration_details_section_validation"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		softAssert.assertTrue(sectionVerification, "Registration details section is not visible hence failed");
	}

	@Then("^user_076 verify asset details screen should have Asset Price and Down Payment details section at app data check stage$")
	public void user_076_verify_asset_details_screen_should_have_Asset_Price_and_Down_Payment_details_section_at_app_data_check_stage()
			throws Throwable {
		boolean sectionVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						assetDetailsWebElements.getElement("asset_price_downpayment_section_verification")));
				sectionVerification = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsWebElements.getElement("asset_price_downpayment_section_verification"))
						.isDisplayed();
				System.out.println("is aset price downpayment section is visible " + sectionVerification);
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		softAssert.assertTrue(sectionVerification,
				"asset price downpayment details section is not visible hence failed");
	}

	@Then("^user_076 verify asset details screen field should be read only mode at app data check stage$")
	public void user_076_verify_asset_details_screen_field_should_be_read_only_mode_at_app_data_check_stage()
			throws Throwable {
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}

	}

	@And("^user_076 click on back button in asset details at app data check stage$")
	public void user_076_click_on_back_button_in_asset_details_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						"document.querySelector('ion-title[class=\"pl-0 ion-color ion-color-dark md title-default hydrated\"]')"));
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(commonJsElements.getElement("back_button")));
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(commonJsElements.getElement("back_button")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify back button is working as expected in asset details at app data check stage$")
	public void user_076_verify_back_button_is_working_as_expected_in_asset_details_at_app_data_check_stage()
			throws Throwable {
		boolean isBackButtonIsWorking = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isBackButtonIsWorking = javascriptHelper
						.executeScriptWithWebElement(assetDetailsWebElements.getElement("asset_details_view_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}

			}
		}
		softAssert.assertTrue(isBackButtonIsWorking, "Back button is not working hence failed");
	}

	@Then("^user_076 invoke soft assert in asset details at app data check stage$")
	public void user_076_invoke_soft_assert_in_asset_details_at_app_data_check_stage() throws Throwable {
		softAssert.assertAll();
	}
}
