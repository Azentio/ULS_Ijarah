package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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

public class Autoloan_Offering_CustomerDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths AL_CustomerDetailsElements = new JSPaths(excelPath, "AL_OFF_CustomerDetail",
			"CustomerDetailsElements", "JSPath");
	ExcelData AL_OFF_CustomerDetails_TestData = new ExcelData(excelTestDataPath, "AL_OF_CustomerDetail",
			"Dataset ID");
	//JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	
	@And("User_6047 Get the test data for test case ID AT_AL_OFF_CD_01")
	public void user_get_the_test_data_for_test_case_id_at_al_off_cd_01() {
		testData = AL_OFF_CustomerDetails_TestData.getTestdata("DS01_AT_AL_OFF_CD_01");
	}


@Then("User_6047 verify the Personal Details")
public void user_6047_verify_the_personal_details() {

	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PersonalDetail_title"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}}


@Then("User_6047 verify the Contact Details")
public void user_6047_verify_the_contact_details() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ContactDetail_title"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Customer Type")
public void user_6047_verify_the_field_customer_type() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Applicant Type")
public void user_6047_verify_the_field_applicant_type() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field KYC status")
public void user_6047_verify_the_field_kyc_status() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("KYC_Status"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Salutation")
public void user_6047_verify_the_field_salutation() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field First Name")
public void user_6047_verify_the_field_first_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Middle Name")
public void user_6047_verify_the_field_middle_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MiddleName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Last Name")
public void user_6047_verify_the_field_last_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father First Name")
public void user_6047_verify_the_field_father_first_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father Middle Name")
public void user_6047_verify_the_field_father_middle_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sMiddleName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father Last Name")
public void user_6047_verify_the_field_father_last_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse First Name")
public void user_6047_verify_the_field_spouse_first_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sFirstName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Middle Name")
public void user_6047_verify_the_field_spouse_middle_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sMiddleName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Last Name")
public void user_6047_verify_the_field_spouse_last_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sLastName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field No Of Children")
public void user_6047_verify_the_field_no_of_children() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("NoOfChild"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Status")
public void user_6047_verify_the_field_spouse_status() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouseStatus"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Date Of Birth")
public void user_6047_verify_the_field_date_of_birth() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("dateOfBirthInput"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Gender")
public void user_6047_verify_the_field_gender() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Marital Status")
public void user_6047_verify_the_field_marital_status() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Education Level")
public void user_6047_verify_the_field_education_level() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("EducationLevel"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Nationality")
public void user_6047_verify_the_field_nationality() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Category")
public void user_6047_verify_the_field_category() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Religion")
public void user_6047_verify_the_field_religion() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Residential Status")
public void user_6047_verify_the_field_residential_status() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("residentialStatus"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Language")
public void user_verify_the_field_language() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field No Of Dependents")
public void user_verify_the_field_no_of_dependents() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PersonalDetail_title"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Mothers Maiden Name")
public void user_verify_the_field_mothers_maiden_name() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenName"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Type Of Residence")
public void user_verify_the_field_type_of_residence() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Industry Segmentation")
public void user_verify_the_field_industry_segmentation() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("industrySegmentation"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Is Income Considered")
public void user_verify_the_field_is_income_considered() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Customer Profile")
public void user_verify_the_field_customer_profile() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("customerProfile"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Relationship")
public void user_verify_the_field_relationship() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("relationShip"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Existing Bank Relationship")
public void user_verify_the_field_existing_bank_relationship() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ExistingBankRelationship"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Blacklisted")
public void user_verify_the_field_blacklisted() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("blacklisted"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Remarks")
public void user_verify_the_field_remarks() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("remarks"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Initiate Video KYC button")
public void user_verify_the_field_initiate_video_kyc_button() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PersonalDetail_title"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Back button")
public void user_verify_the_field_back_button() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PersonalDetail_title"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
}
