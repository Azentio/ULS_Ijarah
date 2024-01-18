package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataCheck_EmploymentDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths employmentDetailsWebElements = new JSPaths(configFileReader.getJSFilePath(), "CustomerEmploymentJSPaths",
			"CustomerEmployments_Elements", "JSPaths");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	int incomeDetailsScreenLocation;

	@And("user_076 find the employment details screen location at app data check stage")
	public void user_076_find_the_employment_details_screen_location_at_app_data_check_stage() throws Throwable {
		String titleLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTitle = "";
		int premitiveTitleLength = 0;
		String titleText = "";
		boolean isLoopNeedToBreak = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(" i Value " + i);
				lengthOfTitle = javascriptHelper.executeScript("return " + titleLength).toString();
				premitiveTitleLength = Integer.parseInt(lengthOfTitle);
				System.out.println("Length of the query " + premitiveTitleLength);
				if (premitiveTitleLength >= 5) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= premitiveTitleLength; i++) {
			for (int j = 0; j <= 600; j++) {
				try {
					System.out.println("Premitive Title length " + premitiveTitleLength);
					titleText = javascriptHelper
							.executeScript("return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText")
							.toString();
					System.out.println("Title text " + titleText);
					System.out.println(
							"Query " + "return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText");
					if (titleText.equals("Income")) {
						incomeDetailsScreenLocation = i;
						isLoopNeedToBreak = true;
						break;
					} else {
						break;
					}
				} catch (Exception e) {
					if (i == 600) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isLoopNeedToBreak == true) {
				break;
			}

		}
		if (isLoopNeedToBreak == false) {
			throw new Throwable("Unable to find the income details location index");
		}
	}

	@And("user_076 click on eye icon in employment details at app data check stage")
	public void user_076_click_on_eye_icon_in_employment_details_at_app_data_check_stage() throws Throwable {
		String incomeDetailsEyeQuery = "document.querySelectorAll('table')[" + (incomeDetailsScreenLocation + 1)
				+ "].querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery));
				javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify primary employment field should have default value as yes in app data check stage")
	public void user_076_verify_primary_employment_field_should_have_default_value_as_yes_in_app_data_check_stage()
			throws Throwable {
		String primaryEmploymentStatusValue = "";
		for (int i = 0; i <= 300; i++) {
			try {
				primaryEmploymentStatusValue = javascriptHelper
						.executeScript(
								"return " + employmentDetailsWebElements.getElement("primary_employment_toggle_status"))
						.toString();
				if (primaryEmploymentStatusValue.length() > 0) {
					System.out.println("Primary Employment Status toggle value" + primaryEmploymentStatusValue);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
