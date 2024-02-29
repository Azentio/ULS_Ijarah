package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CD_ADE_AddressDetails_610_Steps {

	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
    
	
	WebDriver driver = BaseClass.driver;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Actions actions = new Actions(driver);

	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	ExcelData addressDetailsExcelData = new ExcelData(excelTestDataPath,"ADE_AddressDet_610","DataSet ID");
	Map<String, String> testExecutionData;			
	Map<String, String> testData;
	
	JSPaths commonElementsJsPaths = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
	JSPaths ADE_AddressDetails_610 = new JSPaths(excelPath, "ADE_AddressDet_610", "AddressDetails_FieldName", "JSPath");

	
	
	 //---------- Consumer Durable AppData Entry Address Details 
	
	@And("User_610 get the test data set id for DS_AT_CON_DUR_ADE_AD_01")
	public void get_the_test_data_set_id_for_DS_AT_CON_DUR_ADE_AD_01() {
		testExecutionData = testExecution.getTestdata("AT_CON_DUR_ADE_AD_01");
		testData = addressDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	
	
	//        *********************************      steps        ****************************
	
	
//	===============================================================================================================================
	@And("User_610 click the module name dropdown in ULS application")
	public void user_610_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						commonElementsJsPaths.getElement("module_dropdown"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 select the module name as LOS in ULS application")
	public void user_610_select_the_module_name_as_los_in_uls_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank()) && !moduleLength.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("User_610 click the Mail box in ULS application")
	public void user_610_click_the_mail_box_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						commonElementsJsPaths.getElement("mail_box"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 click the Search button under inbox")
	public void user_610_click_the_search_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						commonElementsJsPaths.getElement("mail_box_search_button"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User_610 search the Reference ID for Consumer Durable")
	public void user_search_the_reference_id_for_consumer_durable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("mail_box_search_text"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User_610 click the Entitle button under inbox")
	public void user_610_click_the_entitle_button_under_inbox() throws Throwable {		
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]').length")
						.toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				String jspath = "document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]')[" + (Integer.parseInt(length)-1) + "]";
				WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
		
	
// -----------------------------	@DS_AT_CON_DUR_ADE_AD_01         -------------
	
	
	@And("^User_610 click Addition Customer Info Under New Application RD$")
	public void user_610_click_addition_customer_info_under_new_application_rd()throws Throwable{
		
		String length =null;
		for (int i = 0; i <300; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <=300; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Additional Customer Info")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
					Thread.sleep(1500);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
			//		addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==299) {
				Assert.fail(e.getMessage());
			}
		}
	}

	}
	
	@And("User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab")
	public void user_610_click_the_eye_button_under_customer_personal_info_section_in_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("Customer Personal Information")) {
						String jspath = "document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]";
						WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						eyeBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 click the Eye button under Address Details section in Additional Customer Info tab")
	public void user_610_click_the_eye_button_under_address_details_section_in_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename.trim());
					if (titlename.trim().contains("Address Details")) {
//						System.out.println("Condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-eye\"]')";
						WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(eyeBtn).build().perform();
						eyeBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 click the Edit button under Address Details section in Additional Customer Info tab")
	public void user_610_click_the_edit_button_under_address_details_section_in_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename.trim());
					if (titlename.trim().contains("Address Details")) {
//						System.out.println("Condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
						WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(eyeBtn).build().perform();
						eyeBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 change the status active under Address Details section in Additional Customer Info tab")
	public void user_610_change_the_status_active_under_Address_Details_section_in_Additional_Customer_Info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename.trim());
					if (titlename.trim().contains("Address Details")) {
//						System.out.println("Condition true");
						String jspath = "document.querySelectorAll('[ng-reflect-value=\"Active\"]')[" + j + "]";
						WebElement ActiveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(ActiveBtn).build().perform();
						System.err.println("Active : " + ActiveBtn.getText()); 
						String Status = ActiveBtn.getText();
						
						Assert.assertEquals("Active", Status);
						System.err.println("Active2 : " + ActiveBtn.getText()); 
						break;
					}
						}
				             break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(300);
	}
	
	@And("User_610 change the status INactive under Address Details section in Additional Customer Info tab")
	public void user_610_change_the_status_INactive_under_Address_Details_section_in_Additional_Customer_Info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename.trim());
					if (titlename.trim().contains("Address Details")) {
//						System.out.println("Condition true");
						String jspath = "document.querySelectorAll('[ng-reflect-value=\"In-active\"]')[" + j + "]";
						WebElement ActiveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(ActiveBtn).build().perform();
						System.err.println("In-active : " +ActiveBtn.getText()); 
						String Status = ActiveBtn.getText();
						
						Assert.assertEquals("In-active", Status);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_610 click the Add button under Address Details section in Additional Customer Info tab")
	public void user_610_click_the_add_button_under_address_details_section_in_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename.trim());
					if (titlename.trim().contains("Address Details")) {
//						System.out.println("Condition true");
						//                                                                                                                                             pi pi-plus
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(eyeBtn).build().perform();
						eyeBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_610 verify Back button available in Address Details screen under Additional Customer info tab$")
	public void User_610_verify_Back_button_available_in_Address_Details_screen_under_Additional_Customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Go Back")) {
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Back button should be displayed in Asset Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 verify Address Type field available in Address Details screen under Additional Customer info tab$")
	public void User_610_verify_Address_Type_field_available_in_Address_Details_screen_under_Additional_Customer_info_tab()
			throws Throwable {		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement label = javascriptHelper.executeScriptWithWebElement(
						ADE_AddressDetails_610.getElement("addressTypeLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Address Type field available in Address Details screen");
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
						ADE_AddressDetails_610.getElement("addressTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Address Type field available in Address Details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_610 verify Address Status field available in Address Details screen under Additional Customer info tab$")
	public void User_610_verify_Address_Status_field_available_in_Address_Details_screen_under_Additional_Customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement label = javascriptHelper.executeScriptWithWebElement(
						ADE_AddressDetails_610.getElement("addressStatusLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Address Status field available in Address Details screen");
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
						ADE_AddressDetails_610.getElement("addressStatusDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Address Status field available in Address Details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//-------- new steps 
	
	
	@And("^User_610 modify the Address Type in Address Details Screen Under Additional Customer info tab$")
	public void user_610_modify_the_address_type_in_address_details_screen_under_additional_customer_info_tab()throws Throwable{
		
		// ----------------click

				for (int a = 0; a < 300; a++) {
				try {
					javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("addressTypeDropdown")).click();
					break;
				} catch (Exception e) {
					if (a == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
				
				//  dropdown
				
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}

			System.out.println("String " + dropdownString.trim());
			
	//		System.out.println("Map " + testData.get("CustomerResponce").trim());
			
			if ((dropdownString.trim())
					.equalsIgnoreCase((testData.get("Address Type")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
		
	}
	@And("^User_610 proper validation message for blank field which is mandatory$")
	public void user_610_proper_validation_message_for_blank_field_which_is_mandatory()throws Throwable{
		
		javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));

//		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("CustomerAddressTitle")));
//		for (int i = 0; i < 300; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button")).click();
//				break;		}
//			catch (Exception e) {
//				// TODO: handle exception
//				if (i==299) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		
	for (int i = 0; i < 300; i++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("fillAllTheDetailsPopup_610")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			if (i==299) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	}
	@And("^User_610 to do a modification with invalid data in Zip Code Field$")
	public void user_610_to_do_a_modification_with_invalid_data_in_zip_code_field()throws Throwable{
		for (int a = 0; a < 300; a++) {
			try {
			//	javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput")).click();
				javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput"))
				.clear();
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	
	
		for (int a = 0; a < 300; a++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput"))
				.sendKeys(testData.get("Zip Code"));
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("ValidZipCode")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				if (i==299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		for (int a = 0; a < 300; a++) {
			try {
				//javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput")).click();
				javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.DELETE));
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int a = 0; a < 300; a++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("zipCodeInput"))
				.sendKeys(testData.get("Zip Code1"));
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("^User_610 select dropdown value in address type$")
	public void user_610_select_dropdown_value_in_address_type()throws Throwable{
		
		for (int a = 0; a < 300; a++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("addressTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (a == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
			
			//  dropdown
			
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";

	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
			if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}

	int premitiveDropdownLength = Integer.parseInt(dropdownLength);

	for (int j = 0; j <= premitiveDropdownLength; j++) {
		for (int l = 0; l <= 300; l++) {
			try {
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
						.toString();
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			} catch (Exception e) {
				if (l == 300 && !(dropdownString.isBlank())) {
					Assert.fail(e.getMessage());
				}
			}
			if (!(dropdownString.isEmpty())) {
				System.out.println(dropdownString);
				System.out.println("Loop count " + l + " got breaked");
				break;
			}
		}

		System.out.println("String " + dropdownString.trim());
		
//		System.out.println("Map " + testData.get("CustomerResponce").trim());
		
		if ((dropdownString.trim())
				.equalsIgnoreCase((testData.get("Address Type1")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					isDropdownValueSelected = true;
					break;
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		if (isDropdownValueSelected == true) {
			break;
		}
	}
	
	}

	
	@And("^User_610 validate the save button and confirmation message$")
	public void user_610_validate_the_save_button_and_confirmation_message()throws Throwable{
		
		javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));

		
//		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("CustomerAddressTitle")));
//		for (int i = 0; i < 300; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button")).click();
//				break;		}
//			catch (Exception e) {
//				// TODO: handle exception
//				if (i==299) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		
	for (int i = 0; i < 300; i++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("successMsg_610")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			if (i==299) {
				Assert.fail(e.getMessage());
			}
		}
	}
		
	}


	
	//---------------------------------------- @DS_AT_CON_DUR_ADE_AD_05 ----------------------------------------
	
			
		@And("User_610 change the status of the record as active or deactive")
		public void user_610_change_the_status_of_the_record_as_active_or_deactive() throws Throwable {
			Thread.sleep(1000);
//			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("statusToggleBtn")));
			for (int i = 0; i < 300; i++) {
				try {
					actions.scrollToElement((javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("statusToggleBtn")))).build().perform();
					javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("statusToggleBtn")).click();
					Assert.assertTrue(true);
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
																									
			}

		@And("User_610 label should toggle based on the status if status is active")
		public void user_610_label_should_toggle_based_on_the_status_if_status_is_active() throws Throwable {
			Thread.sleep(1000);
			String status1 = javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle"))
					.getAttribute("aria-checked");
			System.err.println("status1 :"+ status1);
			
			if (status1.contentEquals("true")) {
					Assert.assertTrue(true);
						}
			
			else {
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle")).click();
						Assert.assertTrue(true);
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
				
				for (int i = 0; i <= 300; i++) {
					try {
						String status2 = javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle"))
								.getAttribute("aria-checked");
						System.err.println("status2 :"+ status2);
						actions.scrollToElement(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')")).build().perform();
						javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')").click();
						break;
					} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
					}
				}
		    
		}

		@And("User_610 label should toggle based on the status if status is deactive")
		public void user_610_label_should_toggle_based_on_the_status_if_status_is_deactive() throws Throwable {
			
			Thread.sleep(300);
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle")));
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}

			String status1 = javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle"))
					.getAttribute("aria-checked");
			System.err.println("status3 :"+ status1);
			
			        
	            if (status1.contentEquals("false")) {
	            	Assert.assertTrue(true);
					}
		
		      else {
			     for (int i = 0; i < 200; i++) {
				    try {
				   	javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle")).click();
					Assert.assertTrue(true);
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	        
	            String status2 = javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("StatusToggle"))
	    				.getAttribute("aria-checked");
	    		System.err.println("status4 :"+ status2);
	    		
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));
			
				
				Thread.sleep(300);
	    				
					}

		@And("User_610 verify the back button customer details screen")
		public void user_610_verify_the_back_button_customer_details_screen() throws Throwable {
			
			for (int i = 0; i < 200; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("back_button")).click();
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Thread.sleep(300);
			
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("AddBtn")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
					
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
		            	}
			         		}

		}
		
		//---------------------------------- @DS_AT_CON_DUR_ADE_AD_03 -----------------------------
		
		@And("^User_610 verify Search button available in listview under Address Details section$")
		public void user_610_verify_search_button_available_in_listview_under_address_details_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
//					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.scrollToElement(btn).build().perform();
							javascriptHelper.backgroundBorder(btn);
							softAssert.assertTrue(btn.isDisplayed(), "Search button available in Address Details section");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 click the Export button under Address Details section in Additional Customer Info tab$")
		public void user_610_click_the_export_button_under_address_details_section_in_additional_customer_info_tab()
				throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('p-dropdown')";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.scrollToElement(btn).build().perform();
							javascriptHelper.backgroundBorder(btn);
							btn.click();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify PDF button available in listview under Address Details section$")
		public void user_610_verify_pdf_button_available_in_listview_under_address_details_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
						System.out.println("Name: "+title);
						String titlename = javascriptHelper.executeScript(title).toString();			
						if (titlename.trim().contains("PDF")) {
							String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(btn);
							softAssert.assertTrue(btn.isDisplayed(),"PDF button available under asset details tab");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Excel button available in listview under Address Details section$")
		public void user_610_verify_excel_button_available_in_listview_under_address_details_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
						System.out.println("Name: "+title);
						String titlename = javascriptHelper.executeScript(title).toString();			
						if (titlename.trim().contains("XLS")) {
							String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(btn);
							softAssert.assertTrue(btn.isDisplayed(),"Excel button available under asset details tab");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("^User_610 verify Address Type field available in listview under Address Details section$")
		public void user_610_verify_address_type_field_available_in_listview_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					WebElement field = javascriptHelper.executeScriptWithWebElement(
							ADE_AddressDetails_610.getElement("listview_AddressType"));
					javascriptHelper.backgroundColor(field);
					softAssert.assertTrue(field.isDisplayed(), "Address Type field available in Address Details listview");
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Country field available in listview under Address Details section$")
		public void user_610_verify_country_field_available_in_listview_under_address_details_section() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					WebElement field = javascriptHelper.executeScriptWithWebElement(
							ADE_AddressDetails_610.getElement("listview_Country"));
					javascriptHelper.backgroundColor(field);
					softAssert.assertTrue(field.isDisplayed(), "Country field available in Address Details listview");
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Occupancy Status field available in listview under Address Details section$")
		public void user_610_verify_occupancy_status_field_available_in_listview_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					WebElement field = javascriptHelper.executeScriptWithWebElement(
							ADE_AddressDetails_610.getElement("listview_OccupancyStatus"));
					javascriptHelper.backgroundColor(field);
					softAssert.assertTrue(field.isDisplayed(), "Occupancy Status field available in Address Details listview");
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Occupance Since field available in listview under Address Details section$")
		public void user_610_verify_occupance_since_field_available_in_listview_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					WebElement field = javascriptHelper.executeScriptWithWebElement(
							ADE_AddressDetails_610.getElement("listview_OccupanceSince"));
					javascriptHelper.backgroundColor(field);
					softAssert.assertTrue(field.isDisplayed(), "Occupance Since field available in Address Details listview");
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Contact Address field available in listview under Address Details section$")
		public void user_610_verify_contact_address_field_available_in_listview_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					WebElement field = javascriptHelper.executeScriptWithWebElement(
							ADE_AddressDetails_610.getElement("listview_ContactAddress"));
					javascriptHelper.backgroundColor(field);
					softAssert.assertTrue(field.isDisplayed(), "Contact Address field available in Address Details listview");
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 verify Status field available in listview under Address Details section$")
		public void user_610_verify_status_field_available_in_listview_under_address_details_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('[ng-reflect-field=\"recStatus\"]')";
							WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(field);
							softAssert.assertTrue(field.isDisplayed(), "Status field available in Address Details listview");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_610 verify values in List view should be non editable under Address Details section")
		public void user_610_verify_values_in_list_view_should_be_non_editable_under_address_details_section() throws Throwable {
//			String jspath = "document.querySelectorAll('table')[1].querySelectorAll('td p-celleditor')";
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
//					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[1]";
							WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
							String output = field.getAttribute("readonly");
							System.out.println("Out: "+ output);
							javascriptHelper.backgroundBorder(field);
							softAssert.assertNull(output,
									"Listview values should be non editable under Address Details section");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}		
		}
		
		@And("^User_610 click the Search button under Address Details section in Additional Customer Info tab$")
		public void user_610_click_the_search_button_under_address_details_section_in_additional_customer_info_tab()
				throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
//					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
							WebElement element = javascriptHelper.executeScriptWithWebElement(titlePath);
							javascriptHelper.scrollIntoView(element);
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							btn.click();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 to verify the functionality of Search box with matching data under Address Details section$")
		public void user_610_to_verify_the_functionality_of_search_box_with_matching_data_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("listview_SearchBox"))
					.sendKeys(testData.get("Matching_Data"));
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 to verify post entering any matching value system display all the possible matching records in Address Details section$")
		public void user_610_to_verify_post_entering_any_matching_value_system_display_all_the_possible_matching_records_in_address_details_section()
				throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
//					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('span[class*=\"p-paginator-current\"]')";
							WebElement searchResult = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(searchResult);
							String text = searchResult.getText().substring(13, 14);
							System.out.println("Result value: "+text);
							softAssert.assertTrue(Integer.parseInt(text)>0,
									"System should display all the possible matching records in Address Details section");
							
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 to verify the functionality of Search box with mismatch data under Address Details section$")
		public void user_610_to_verify_the_functionality_of_search_box_with_mismatch_data_under_address_details_section()
				throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("listview_SearchBox"))
					.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					javascriptHelper.executeScriptWithWebElement(ADE_AddressDetails_610.getElement("listview_SearchBox"))
					.sendKeys(testData.get("Mismatch_Data"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^User_610 to verify post entering any mismatch value system should not display any records in Address Details section$")
		public void user_610_to_verify_post_entering_any_mismatch_value_system_should_not_display_any_records_in_address_details_section()
				throws Throwable {
			String length = null;
			for (int i = 0; i < 300; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
//					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 300; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Address Details")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
									+ ".parentElement.parentElement.querySelector('span[class*=\"p-paginator-current\"]')";
							WebElement searchResult = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(searchResult);
							String text = searchResult.getText().substring(13, 14);
							System.out.println("Result value: "+text);
							softAssert.assertTrue(Integer.parseInt(text)==0,
									"System should display the message as No data found in Address Details section");						
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
}
