package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataprovider.ConfigFileReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CommonSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths commonJSPaths = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	IjaraLogin ijaraLogin = new IjaraLogin();

	@Given("navigate to uls url")
	public void navigate_to_uls_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	}

	@And("login with valid credentials for new application stage")
	public void login_with_valid_credentials_for_new_application_stage() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}

	@And("click on module dropdown in IJRARAH")
	public void click_on_module_dropdown_in_ijrarah() throws Throwable {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleName = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
						.toString();
				System.out.println("Module Name " + moduleName);
				if ((!moduleName.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on LOS option in module dropdown")
	public void click_on_los_option_in_module_dropdown() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isEmpty()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}

	}

	@And("click on mail box")
	public void click_on_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					System.out.println(commonJSPaths.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search box upon click on the mail box")
	public void click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button"))
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
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
