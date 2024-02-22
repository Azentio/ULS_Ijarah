package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Underwritter_Steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths applicationDetailsElements = new JSPaths(configFileReader.getJSPathFilePath(),
			"newApp_AppllicationDetailsJS", "Ijarah_NewApp_fieldName", "JSPath");
	JSPaths commonJSPaths = new JSPaths(configFileReader.getJSPathFilePath(), "CommonElements", "CommonFieldName",
			"JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String toastMessage = "";
	ExcelData credntialsExcelTestData = new ExcelData(configFileReader.getTestDataFilePath(), "LoginCredentials",
			"UserType");
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 click on application details tab at underwritter stage$")
	public void user_076_click_on_application_details_tab_at_underwritter_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("Underwritter_AppDetails_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on return button in underwritter stage$")
	public void user_076_click_on_return_button_in_underwritter_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("return_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on return stage dropdown in underwritter stage$")
	public void user_076_click_on_return_stage_dropdown_in_underwritter_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("return_Stage_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 select the data entry stage in return dropdown$")
	public void user_076_select_the_data_entry_stage_in_return_dropdown() throws Throwable {
		int noOfReturStage = 0;
		int stagePosition = 0;
		for (int i = 0; i <= 300; i++) {
			try {
				String dropdownLengthString = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("return_dropdown_length")).toString();
				if (Integer.parseInt(dropdownLengthString) > 4 && Integer.parseInt(dropdownLengthString) != 0) {
					noOfReturStage = Integer.parseInt(dropdownLengthString);
					System.out.println("No of option in return dropdown " + noOfReturStage);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isStageSelected = false;
		for (int i = 0; i < noOfReturStage; i++) {

			for (int j = 0; j <= 150; j++) {
				try {
					String dropdownText = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-label[class=\"sc-ion-select-popover-ios sc-ion-label-ios-h sc-ion-label-ios-s ios hydrated\"]')["
							+ i + "].innerText").toString();

					System.out.println("Dropdown Text " + dropdownText);
					System.out.println(
							"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
									+ i + "].value");
					if ((dropdownText.trim()).equalsIgnoreCase("APPDATAENT".trim())) {
						stagePosition = i;
						System.out.println("inside stage equalance IF condition ");
						System.out.println("Stage position is " + i);
						System.out.println("Stage position is from main variable " + stagePosition);
						isStageSelected = true;
						break;
					} else {
						break;
					}

				} catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isStageSelected == true) {
				break;
			} else if ((i == noOfReturStage) && (isStageSelected == false)) {
				Assert.fail("Dropdown text is not visible hence failed");
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println("Stage position " + stagePosition);
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
								+ stagePosition + "]")
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter the return remark while return the under writter record$")
	public void user_076_enter_the_return_remark_while_return_the_under_writter_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("alert_ok")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on alert return button$")
	public void user_076_click_on_alert_return_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("alert_return_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify consumer durables record got returned to app data entry stage$")
	public void user_076_verify_consumer_durables_record_got_returned_to_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (toastMessage.length() > 0) {
					System.out.println(toastMessage);
					break;
				}

			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toastMessage.contains("APPDATAENT"),
				"Record is not returned to data entry stage hence failed");

	}

	@And("^user_076 extract the app data entry user ID in underwritter stage$")
	public void user_076_extract_the_app_data_entry_user_id_in_underwritter_stage() throws Throwable {
		String subStringUserID = toastMessage.substring(87).replace(".", " ");
		String finalUserID = subStringUserID.trim();

		System.out.println("Final User ID " + finalUserID);
		credntialsExcelTestData.updateTestData("userType02", "UserName", finalUserID);
	}

	@And("^user_076 invoke soft assert in application details screen at under writter stage$")
	public void user_076_invoke_soft_assert_in_application_details_screen_at_under_writter_stage() throws Throwable {
		softAssert.assertAll();
	}

}
