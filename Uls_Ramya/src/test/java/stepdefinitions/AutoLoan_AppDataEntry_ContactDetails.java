package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
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
import stepdefinitions.IjaraLogin;

public class AutoLoan_AppDataEntry_ContactDetails {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Actions actions = new Actions(driver);
	Map<String, String> testData;
	//Map<String, String> testData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths ContactDetail_js = new JSPaths(excelPath, "AL_AppDataEn_ContactDetail", "ContactDeatils_FieldName", "JSPath");
	ExcelData ContactDetail_TestData  = new ExcelData(excelTestDataPath,"AL_AppDataEn_ContactDetail","Dataset ID");
	ExcelData AutoLoanExecutionExcel = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");

	@And("User_6047 Get the test data for test case ID AT_AL_CD_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_01() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_01");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_02")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_02() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_02");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_03")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_03() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_03");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_04")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_04() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_04");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_05")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_05() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_05");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_06")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_06() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_06");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_07")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_07() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_07");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_08")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_08() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_08");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_CD_09")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_cd_09() {
		testData =  ContactDetail_TestData.getTestdata("DS01_AT_AL_CD_09");
	}
	
	@And("User_6047 Search the Ref record\\(id) under inbox")
	public void user_6047_search_the_Ref_record_id_under_inbox() throws Throwable {
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
@And("User_6047 clict the Add button under the Contact details tab")
public void user_6047_clict_the_add_button_under_the_contact_details_tab() throws Throwable {
	Thread.sleep(2000);
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
	Thread.sleep(2000);
	for (int i = 0; i <500; i++) {
	try {
		for (int j = 0; j <Integer.parseInt(length); j++) {
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[ng-reflect-text=\"Add\"]')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				actions.scrollToElement(addButton).build().perform();
//				javascriptHelper.JSEClick(addButton);
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

@Then("User_6047 Verify the save button in contact detail screen")
public void user_6047_verify_the_save_button_in_contact_detail_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("save_button")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Back button in contact detail screen")
public void user_6047_verify_the_field_back_button_in_contact_detail_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("back_button")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 verify the field Phone Type in contact details")
public void user_verify_the_field_phone_type_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PhoneType")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Phone number in contact details")
public void user_verify_the_field_phone_number_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PhoneNumber")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field consent for phone contact in contact details")
public void user_6047_verify_the_field_consent_for_phone_contact_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("ConsentForPhoneContact")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Prefered contact method in contact details")
public void user_6047_verify_the_field_prefered_contact_method_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PreferedContactMethod")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Prefered Time for contact in contact details")
public void user_6047_verify_the_field_prefered_time_for_contact_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PreferedTimeForContact")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Email Type in contact details")
public void user_6047_verify_the_field_email_type_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("EmailType")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Email id in contact details")
public void user_6047_verify_the_field_email_id_in_contact_details() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("Email_Id")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 verify the field Phone Type should be dropdown,editable")
public void user_6047_verify_the_field_phone_type_should_be_dropdown_editable() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")));
	String PhoneType_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((PhoneType_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String PhoneType_dropdown= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(PhoneType_dropdown.equals("Select"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field Phone number should be number,editable")
public void user_verify_the_field_phone_number_should_be_number_editable() {
	String Phonenumber_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((Phonenumber_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String Phonenumber_number= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(Phonenumber_number.contains("text"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field consent for phone contact should be dropdown,editable in contact details")
public void user_6047_verify_the_field_consent_for_phone_contact_should_be_dropdown_editable_in_contact_details() {
	String consent_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("ConsentForPhoneContact")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((consent_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String consent_dropdown= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("ConsentForPhoneContact")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(consent_dropdown.equals("Select"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field Prefered contact method should be dropdown,editable")
public void user_6047_verify_the_field_prefered_contact_method_should_be_dropdown_editable() {
	String contactmethod_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PreferedContactMethod")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((contactmethod_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String contactmethod_dropdown= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PreferedContactMethod")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(contactmethod_dropdown.equals("Select"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field Prefered Time for contact  should be HH:MM format,editable in contact details")
public void user_6047_verify_the_field_prefered_time_for_contact_should_be_hh_mm_format_editable_in_contact_details() {
	String PreferedTimeforcontact_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PreferedTimeForContact")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((PreferedTimeforcontact_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String PreferedTimeforcontact_format= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PreferedTimeForContact")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(PreferedTimeforcontact_format.equals("text"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field Email Type should be dropdown,editable in contact details")
public void user_6047_verify_the_field_email_type_should_be_dropdown_editable_in_contact_details() {
	String EmailType_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("EmailType")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((EmailType_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String EmailType_dropdown= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("EmailType")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(EmailType_dropdown.equals("Select"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 verify the field Email id should be text,editable in contact details")
public void user_verify_the_field_email_id_should_be_text_editable_in_contact_details() {
	String EmailId_Edit = javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("Email_Id")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

	  try {
	      Assert.assertTrue((EmailId_Edit.equals("false")));
	      break;
	  } catch (Exception e) {
	      if (i==1999) {
	          Assert.fail(e.getMessage());
	      }
	  }
	}
	String EmailId_dropdown= javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("Email_Id")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
	    try {
	        Assert.assertTrue(EmailId_dropdown.equals("text"));
	        break;
	    } catch (Exception e) {
	        if (i==1999) {
	            Assert.fail(e.getMessage());
	      }
	    }
	}
}

@Then("User_6047 To verify System should allow user to add new record of contact deatails")
public void user_6047_to_verify_system_should_allow_user_to_add_new_record_of_contact_deatails() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")));
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
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
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("Map " + testData.get("Phone Type").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Phone Type")).trim())) {
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

@Then("User_6047 Click the back button of customer details")
public void user_6047_click_the_back_button_of_customer_details() {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("back_button"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
		}
}

@Then("User_6047 To verify the functionality of Back button")
public void user_6047_to_verify_the_functionality_of_back_button() {
	String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
	String listOfAddButton = "";
	String addButtonScreenName = "";
	boolean isAddButtonDisplayed = false;
	for (int i = 0; i <= 300; i++) {
		try {
			listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
			System.out.println("List of add button " + listOfAddButton);
			if (!(listOfAddButton.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
	for (int j = 0; j < premitiveListOfAddButton; j++) {
		for (int k = 0; k <= 300; k++) {
			try {
				addButtonScreenName = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
								+ j + "].textContent")
						.toString();
				System.out.println("Screen Name " + addButtonScreenName);
				if (!(addButtonScreenName.isBlank())) {
					System.out.println("Screen Name" + addButtonScreenName + " is Not null");
					if ((addButtonScreenName.trim()).equalsIgnoreCase(("Contact Details").trim())) {
						System.out.println("Inside nested loop");
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
								.isDisplayed();
						isAddButtonDisplayed = true;
						break;
					}
				}
			} catch (Exception e) {
				if (k == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (isAddButtonDisplayed == true) {
			break;
		}
	}
}

@Then("User_6047 Enter the negative numeric value in numeric field\\(phone number)")
public void user_6047enter_the_negative_numeric_value_in_numeric_field_phone_number() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber_input"))
			.sendKeys(testData.get("Negative_value"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the validation message for negative numeric value in numeric field")
public void user_6047_verify_the_validation_message_for_negative_numeric_value_in_numeric_field() 
	throws Throwable {
String negativevalueValidation = "";

for (int i = 0; i <= 300; i++) {
	try {
	negativevalueValidation = javascriptHelper
				.executeScript("return " + ContactDetail_js.getElement("phoneNumber_errorMsg"))
				.toString();
		System.out.println("validation msg " + negativevalueValidation);
		break;
	} catch (Exception e) {
		if (i == 300) {
			Assert.fail(e.getMessage());
		}
	}
}
Assert.assertEquals("Only Alphanumeric characters are allowed", negativevalueValidation);
}

@Then("User_6047 Enter the charecter value in numeric field\\(Prefered time for contact)")
public void user_6047_enter_the_charecter_value_in_numeric_field_prefered_time_for_contact() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PreferedTimeForContact_input"))
			.sendKeys(testData.get("Character_value"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the validation message for character value in numeric field")
public void user_6047_verify_the_validation_message_for_character_value_in_numeric_field() {
	String charactervalueValidation = "";

	for (int i = 0; i <= 300; i++) {
		try {
		charactervalueValidation = javascriptHelper
					.executeScript("return " + ContactDetail_js.getElement("preferedTime_errorMsg"))
					.toString();
			System.out.println("validation msg" + charactervalueValidation);
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Invalid time format (HH:MM)", charactervalueValidation);
}

@Then("User_6047 Enter the special character value in any field\\(phone number)")
public void user_6047_enter_the_special_character_value_in_any_field_phone_number() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PhoneNumber_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber_input"))
			.sendKeys(testData.get("Special_character"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the validation message for special character value in any field")
public void user_6047_6047_verify_the_validation_message_for_special_character_value_in_any_field() {
	String specialCharacterValidation = "";

	for (int i = 0; i <= 300; i++) {
		try {
		specialCharacterValidation = javascriptHelper
					.executeScript("return " + ContactDetail_js.getElement("phoneNumber_errorMsg"))
					.toString();
			System.out.println("validation msg " + specialCharacterValidation);
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Only Alphanumeric characters are allowed", specialCharacterValidation);
}


@Then("User_6047 give the input for Phone Type")
public void user_6047_give_the_input_for_phone_type() throws Throwable {
	Thread.sleep(700);
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneType")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
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
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("Map " + testData.get("Phone Type").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Phone Type")).trim())) {
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

@Then("User_6047 give the input for Phone number")
public void user_6047_give_the_input_for_phone_number() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PhoneNumber_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber_input"))
			.sendKeys(testData.get("Phone number"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}

}
@Then("User_6047 clict the edit button under the Contact details tab")
public void user_6047_clict_the_edit_button_under_the_contact_details_tab() throws Throwable {
	Thread.sleep(900);
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-pencil\"')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				javascriptHelper.JSEClick(addButton);
			//	addButton.click();
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

@Then("User_6047 Delete the phone number in contact detail")
public void user_6047_delete_the_phone_number_in_contact_detail() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js  .getElement("PhoneNumber_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
	
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 give the invalid input for Phone number")
public void user_6047_give_the_invalid_input_for_phone_number() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ContactDetail_js.getElement("PhoneNumber_input"))
			.sendKeys(testData.get("Negative_value"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 validate the invalid input popup")
public void user_6047_validate_the_invalid_input_popup() {
	String negativevalueValidation = "";

	for (int i = 0; i <= 300; i++) {
		try {
		negativevalueValidation = javascriptHelper
					.executeScript("return " + ContactDetail_js.getElement("phoneNumber_errorMsg"))
					.toString();
			System.out.println("validation msg " + negativevalueValidation);
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Only Alphanumeric characters are allowed", negativevalueValidation);
}

@Then("User_6047 To verify the search button in list view of contact details")
public void user_6047_to_verify_the_search_button_in_list_view_of_contact_details() {
	String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
	String listOfAddButton = "";
	String addButtonScreenName = "";
	boolean isAddButtonClicked = false;
	for (int i = 0; i <= 300; i++) {
		try {
			listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
			System.out.println("List of add button " + listOfAddButton);
			if (!(listOfAddButton.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
	for (int j = 0; j < premitiveListOfAddButton; j++) {
		for (int k = 0; k <= 300; k++) {
			try {
				addButtonScreenName = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
								+ j + "].textContent")
						.toString();
				System.out.println("Screen Name " + addButtonScreenName);
				if (!(addButtonScreenName.isBlank())) {
					System.out.println("Screen Name" + addButtonScreenName + " is Not null");
					if ((addButtonScreenName.trim()).equalsIgnoreCase(("Contact Details").trim())) {
						System.out.println("Inside nested loop");
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-search\"')[" + j + "]")
								.isDisplayed();
						isAddButtonClicked = true;
						break;
					}
				}
			} catch (Exception e) {
				if (k == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (isAddButtonClicked == true) {
			break;
		}
	}
}

@Then("User_6047 To verify the add button in list view of contact details")
public void user_6047_to_verify_the_add_button_in_list_view_of_contact_details() {
	String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
	String listOfAddButton = "";
	String addButtonScreenName = "";
	boolean isAddButtonClicked = false;
	for (int i = 0; i <= 300; i++) {
		try {
			listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
			System.out.println("List of add button " + listOfAddButton);
			if (!(listOfAddButton.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
	for (int j = 0; j < premitiveListOfAddButton; j++) {
		for (int k = 0; k <= 300; k++) {
			try {
				addButtonScreenName = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
								+ j + "].textContent")
						.toString();
				System.out.println("Screen Name " + addButtonScreenName);
				if (!(addButtonScreenName.isBlank())) {
					System.out.println("Screen Name" + addButtonScreenName + " is Not null");
					if ((addButtonScreenName.trim()).equalsIgnoreCase(("Contact Details").trim())) {
						System.out.println("Inside nested loop");
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
								.isDisplayed();
						isAddButtonClicked = true;
						break;
					}
				}
			} catch (Exception e) {
				if (k == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (isAddButtonClicked == true) {
			break;
		}
	}
}

@Then("User_6047 Click the export button in list view of contact details")
public void user_6047_click_the_export_button_in_list_view_of_contact_details() throws Throwable {
	Thread.sleep(700);
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('p-dropdown[ng-reflect-placeholder=\"Export\"] div[role=\"button\"]')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				javascriptHelper.JSEClick(addButton);
			//	addButton.click();
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


@Then("User_6047 To verify the fields in list view of contact details")
public void user_6047_to_verify_the_fields_in_list_view_of_contact_details() throws Throwable {
	Thread.sleep(700);
	String listViewRecordLabels="";
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
		
				listViewRecordLabels = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('thead[class=\"p-datatable-thead\"] tr').innerText")
						.toString();

				System.out.println(listViewRecordLabels);
				if (!(listViewRecordLabels.isEmpty())) {
					break;
				
			} 
		
			}
		}}

	catch (Exception e) {
		if (i==499) {
			Assert.fail(e.getMessage());
		}
	}
	}
	System.out.println("Field Name " + listViewRecordLabels);
	Assert.assertTrue(listViewRecordLabels.contains("Action"));
	Assert.assertTrue(listViewRecordLabels.contains("Phone Type"));
	Assert.assertTrue(listViewRecordLabels.contains("Phone Number"));
	Assert.assertTrue(listViewRecordLabels.contains("Email Type"));
	Assert.assertTrue(listViewRecordLabels.contains("Email Id"));
	Assert.assertTrue(listViewRecordLabels.contains("Status"));
}

@Then("User_6047 To verify the values in list view should be in read only mode")
public void user_6047_to_verify_the_values_in_list_view_should_be_in_read_only_mode() {
	String length =null;
	boolean status = false;
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
		
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
				.sendKeys("123456");
		
			}
		}


	} catch (Exception e) {
		if (i==499) {
			status = true;
		}
	}
	}
	System.out.println("status " + status);

	Assert.assertTrue(status);




}

@Then("User_6047 To search the matching data in list view of contact details")
public void user_6047_to_search_the_matching_data_in_list_view_of_contact_details() {
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-search\"]')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				javascriptHelper.JSEClick(addButton);
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('input')")
				.sendKeys(testData.get("Matching data"));
			//	addButton.click();
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

@Then("User_6047 To verify the matching result in list view of contact details")
public void user_6047_to_verify_the_matching_result_in_list_view_of_contact_details() {
	String searchResult = "";
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
						.getElement("list_view_search_result")).toString();
				System.out.println(searchResult);
			//	addButton.click();
				if (!(searchResult.isEmpty())) {
					break;
				}
			}
		}

		break;
	} catch (Exception e) {
		if (i==499) {
			Assert.fail(e.getMessage());
		}
	}
	}
	softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is not showing the matched result");
}

@Then("User_6047 To search the mismatching data in list view of contact details")
public void user_6047_to_search_the_mismatching_data_in_list_view_of_contact_details() {
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				//String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-search\"]')";
				//WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				//javascriptHelper.JSEClick(addButton);
				javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('input')").sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('input')")
				.sendKeys(testData.get("Mismatching data"));
			//	addButton.click();
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

@Then("User_6047 To verify the mismatching result in list view of contact details")
public void user_6047_to_verify_the_mismatching_result_in_list_view_of_contact_details() {
	String searchResult = "";
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
			if (titlename.trim().contains("Contact Details")) {
				System.out.println("condition true");
				searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
						.getElement("list_view_search_result")).toString();
				System.out.println(searchResult);
			//	addButton.click();
				if (!(searchResult.isEmpty())) {
					break;
				}
			}
		}

		break;
	} catch (Exception e) {
		if (i==499) {
			Assert.fail(e.getMessage());
		}
	}
	}
	softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is  showing the un matched result");
}
}