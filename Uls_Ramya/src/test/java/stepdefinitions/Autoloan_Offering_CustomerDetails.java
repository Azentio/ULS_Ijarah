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
		testData = AL_OFF_CustomerDetails_TestData.getTestdata("DS01_AT_AL_OFF_CD_001");
	}
	@And("User_6047 Click the Customer Details screen")
	public void user_6047_click_customer_details_() {
		for (int i = 0; i < 200; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(
//						AL_CustomerDetailsElements.getElement("customer_details_tab")).click();
				javascriptHelper                    

				.executeScriptWithWebElement(

				
				"document.querySelector(\"#seg3\")").click();
			
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}
	@And("User_6047 search thee Ref Id Under Inbox")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				//.sendKeys(testData.get("Ref No")); 
				.sendKeys("4006");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
@Then("User_6047 verify the Personal Details")
public void user_6047_verify_the_personal_details() throws Throwable {
Thread.sleep(3000);
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
	javascriptHelper.scrollIntoView(javascriptHelper
	.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ContactDetail_title")));
//	javascriptHelper.JSEClick(javascriptHelper
//			.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ContactDetail_title")));
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
	javascriptHelper.scrollIntoView(javascriptHelper
	.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype")));
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
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("no_of_dependents_input"))
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
	javascriptHelper.scrollIntoView(javascriptHelper
	.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("initiateVideoKYC")));
	for (int i = 0; i < 200; i++) {
		
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("initiateVideoKYC"))
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
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Backbutton_customerdet"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 verify the field Phone number")
public void user_6047_verify_the_field_phone_number() {
	javascriptHelper.scrollIntoView(javascriptHelper
			.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PhoneNumber")));
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PhoneNumber"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Mobile number\\(Primary)")
public void user_6047_verify_the_field_mobile_number_primary() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MobileNumber(primary)"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Mobile number\\(Secondary)")
public void user_6047_verify_the_field_mobile_number_secondary() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MobileNumber(secondary)"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Email")
public void user_6047_verify_the_field_email() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Email"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Preferred contact method")
public void user_6047_verify_the_field_preferred_contact_method() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PreferedContactMethod"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Preferred Time for contact")
public void user_6047_verify_the_field_preferred_time_for_contact() {
	for (int i = 0; i < 200; i++) {
		try {
			Assert.assertTrue(javascriptHelper
					.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PreferedTimeForContact"))
					.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@And("User_6047 click Edit Button")
public void user_6047_click_edit_button() {
	for (int i = 0; i <= 1000; i++) {
		try {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Eye_Button")));
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Eye_Button")).click();
			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}	    
}
@Then("User_6047 verify the data in Customer Type")
public void user_6047_verify_the_data_in_customer_type() throws Throwable {
	Thread.sleep(600);
	String CustomerType = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype"))
			.getAttribute("aria-label");

	  String CustomerType1 =  (CustomerType.substring(0, CustomerType.indexOf(","))).trim();
	  System.err.println(CustomerType1);
    String CustomerTypeValue="Individual Customer";
	for (int i = 0; i <2000; i++) {
        try {

            Assert.assertEquals(CustomerType1, CustomerTypeValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
    
}

@Then("User_6047 verify the data in Applicant Type")
public void user_6047_verify_the_data_in_applicant_type() {
	
	String ApplicantType = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype"))
			.getAttribute("aria-label");
	 String ApplicantType1 =  (ApplicantType.substring(0, ApplicantType.indexOf(","))).trim();
	  System.err.println(ApplicantType1);
	
    String ApplicantTypeValue="Primary Applicant";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ApplicantType1, ApplicantTypeValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Salutation")
public void user_6047_verify_the_data_in_salutation() {
	String Salutation = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion"))
			.getAttribute("aria-label");
	String Salutation1 = (Salutation.substring(0, Salutation.indexOf(","))).trim();
	  System.err.println(Salutation1);
    String SalutationValue="Miss";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(SalutationValue, Salutation1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in First Name")
public void user_6047_verify_the_data_in_first_name() {
	String FirstName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstName"))
			.getAttribute("ng-reflect-model");

	
    String FirstNameValue="PRERNA";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FirstName, FirstNameValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Last Name")
public void user_6047_verify_the_data_in_last_name() {
	String LastName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastName"))
			.getAttribute("ng-reflect-model");
	
    String LastNameValue="AGARWAL";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(LastNameValue, LastName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Father First Name")
public void user_6047_verify_the_data_in_father_first_name() {
	String FatherFirstName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstName"))
			.getAttribute("ng-reflect-model");
    String FatherFirstNameValue="AMAN";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FatherFirstNameValue, FatherFirstName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Father Last Name")
public void user_6047_verify_the_data_in_father_last_name() {
	String FatherLastName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastName"))
			.getAttribute("ng-reflect-model");
	
    String FatherLastNameValue="KAPOOR";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FatherLastNameValue, FatherLastName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Date Of Birth")
public void user_6047_verify_the_data_in_date_of_birth() {
	String DateOfBirth = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("DOB"))
			.getAttribute("ng-reflect-default-value");
	
    String DateOfBirthValue="1997-05-07";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(DateOfBirthValue, DateOfBirth);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Gender")
public void user_6047_verify_the_data_in_gender() {
	String Gender = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField"))
			.getAttribute("aria-label");
	String Gender1 = Gender.substring(0, Gender.indexOf(",")).trim();
	  System.err.println(Gender1);
    String GenderValue="FEMALE";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(GenderValue, Gender1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Marital Status")
public void user_6047_verify_the_data_in_marital_status() {
	String MaritalStatus = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus"))
			.getAttribute("aria-label");
	String MaritalStatus1 =  MaritalStatus.substring(0, MaritalStatus.indexOf(",")).trim();
	  System.err.println(MaritalStatus1);
    String MaritalStatusValue="Single";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(MaritalStatusValue, MaritalStatus1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Nationality")
public void user_6047_verify_the_data_in_nationality() {
	String Nationality = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality"))
			.getAttribute("aria-label");
	String Nationality1 = Nationality.substring(0, Nationality.indexOf(",")).trim();
	  System.err.println(Nationality1);
    String NationalityValue="Indian";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(NationalityValue, Nationality1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Category")
public void user_6047_verify_the_data_in_category() {
	String Category = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category"))
			.getAttribute("aria-label");
	String Category1 = Category.substring(0, Category.indexOf(",")).trim();
	  System.err.println(Category1);
    String CategoryValue="General";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(CategoryValue, Category1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Religion")
public void user_6047_verify_the_data_in_religion() {
	String Religion = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion"))
			.getAttribute("aria-label");
	String Religion1 = Religion.substring(0, Religion.indexOf(",")).trim();
	  System.err.println(Religion1);
    String ReligionValue="HINDU";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ReligionValue, Religion1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Residential Status")
public void user_6047_verify_the_data_in_residential_status() {
	String ResidentialStatus = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ResidentialStatus"))
			.getAttribute("aria-label");
	String ResidentialStatus1 =  ResidentialStatus.substring(0, ResidentialStatus.indexOf(",")).trim();
	  System.err.println(ResidentialStatus1);
    String ResidentialStatusValue="Resident";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ResidentialStatusValue, ResidentialStatus1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Language")
public void user_6047_verify_the_data_in_language() {
	String Language = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages"))
			.getAttribute("aria-label");
	String Language1 =  Language.substring(0, Language.indexOf(",")).trim();
	  System.err.println(Language1);
    String LanguageValue="English";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(LanguageValue, Language1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Mothers Maiden Name")
public void user_6047_verify_the_data_in_mothers_maiden_name() {
	String MothersMaidenName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenName"))
			.getAttribute("ng-reflect-model");

	
    String MothersMaidenNameValue="AMRITA";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(MothersMaidenNameValue, MothersMaidenName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Type Of Residence")
public void user_6047_verify_the_data_in_type_of_residence() {
	String Residence = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence"))
			.getAttribute("aria-label");
	String Residence1 =Residence.substring(0, Residence.indexOf(",")).trim();
	  System.err.println(Residence1);
    String ResidenceValue="Rental";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ResidenceValue, Residence1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Is Income Considered")
public void user_6047_verify_the_data_in_is_income_considered() {
	String Income = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered"))
			.getAttribute("aria-label");
	String Income1 = Income.substring(0, Income.indexOf(",")).trim();
	  System.err.println(Income1);
    String IncomeValue="YES";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(IncomeValue, Income1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Remarks")
public void user_6047_verify_the_data_in_remarks() {
	String Remarks = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("remarkData"))
			.getAttribute("ng-reflect-model");
    String RemarksValue="okay";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(RemarksValue, Remarks);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Phone number")
public void user_6047_verify_the_data_in_phone_number() {
	String Phonenumber = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PhoneNumber"))
			.getAttribute("ng-reflect-model");
	//String Phonenumber1 = (String) javascriptHelper.executeScript("return "+Phonenumber);	
    String PhonenumberValue="9717780057";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(PhonenumberValue, Phonenumber);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Mobile number\\(Primary)")
public void user_6047_verify_the_data_in_mobile_number_primary() {
	String MobilenumberPrimary = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MobileNumber(primary)"))
			.getAttribute("ng-reflect-model");
    String MobilenumberPrimaryValue="9717780057";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(MobilenumberPrimaryValue, MobilenumberPrimary);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Email")
public void user_6047_verify_the_data_in_email() {
	String Email = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Email"))
			.getAttribute("ng-reflect-model");
	
    String EmailValue="rsa032020@gmail.com";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(EmailValue, Email);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 verify the data in Preferred contact method")
public void user_6047_verify_the_data_in_preferred_contact_method() {
	String Preferredcontactmethod = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("PreferedContactMethod"))
			.getAttribute("aria-label");
	String Preferredcontactmethod1 = Preferredcontactmethod.substring(0, Preferredcontactmethod.indexOf(",")).trim();
	  System.err.println(Preferredcontactmethod1);
    String PreferredcontactmethodValue="Mobile";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(PreferredcontactmethodValue, Preferredcontactmethod1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}
@Then("User_6047 verify the field Customer Type should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_customer_type_should_be_display_only_dropdown_mandatory_data() {
	String CustomerType = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype"))
			.getAttribute("aria-label");

	  String CustomerType1 =  (CustomerType.substring(0, CustomerType.indexOf(","))).trim();
	  System.err.println(CustomerType1);
    String CustomerTypeValue="Individual Customer";
	for (int i = 0; i <2000; i++) {
        try {

            Assert.assertEquals(CustomerType1, CustomerTypeValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Customertype")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}

	
}

@Then("User_6047 verify the field Applicant Type should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_applicant_type_should_be_display_only_dropdown_mandatory_data() {
	String ApplicantType = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype"))
			.getAttribute("aria-label");
	 String ApplicantType1 =  (ApplicantType.substring(0, ApplicantType.indexOf(","))).trim();
	  System.err.println(ApplicantType1);
	
    String ApplicantTypeValue="Primary Applicant";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ApplicantType1, ApplicantTypeValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Applicationtype")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field KYC status should be non editable,textbox,nonmandatory,data")
public void user_6047_verify_the_field_kyc_status_should_be_non_editable_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("KYC_Status")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("KYC_Status")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue((mandatory.equals("false")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("KYC_Status")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Salutation should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_salutation_should_be_display_only_dropdown_mandatory_data() {
	String Salutation = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion"))
			.getAttribute("aria-label");
	String Salutation1 = (Salutation.substring(0, Salutation.indexOf(","))).trim();
	  System.err.println(Salutation1);
    String SalutationValue="Miss";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(SalutationValue, Salutation1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Salutataion")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field First Name should be display only,textbox,mandatory,data")
public void user_6047_verify_the_field_first_name_should_be_display_only_textbox_mandatory_data() {
	String FirstName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstName"))
			.getAttribute("ng-reflect-model");

	
    String FirstNameValue="PRERNA";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FirstName, FirstNameValue);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("FirstNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Middle Name should be display only,textbox,nonmandatory,data")
public void user_6047_verify_the_field_middle_name_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MiddleNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MiddleNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textBox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("MiddleNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textBox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Last Name should be display only,textbox,mandatory,data")
public void user_6047_verify_the_field_last_name_should_be_display_only_textbox_mandatory_data() {
	String LastName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastName"))
			.getAttribute("ng-reflect-model");
	
    String LastNameValue="AGARWAL";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(LastNameValue, LastName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("LastNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.equals("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father First Name should be display only,textbox,mandatory,data")
public void user_6047_verify_the_field_father_first_name_should_be_display_only_textbox_mandatory_data() {
	String FatherFirstName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstName"))
			.getAttribute("ng-reflect-model");
    String FatherFirstNameValue="AMAN";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FatherFirstNameValue, FatherFirstName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sFirstNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.equals("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father Middle Name should be display only,textbox,nonmandatory,data")
public void user_6047_verify_the_field_father_middle_name_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sMiddleNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sMiddleNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nonmandatory.equals("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'sMiddleNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.equals("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Father Last Name should be display only,textbox,mandatory,data")
public void user_6047_verify_the_field_father_last_name_should_be_display_only_textbox_mandatory_data() {
	String FatherLastName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastName"))
			.getAttribute("ng-reflect-model");
	
    String FatherLastNameValue="KAPOOR";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(FatherLastNameValue, FatherLastName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textBox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("Father'slastNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textBox.equals("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse First Name should be display only,textbox,Nonmandatory,data")
public void user_6047_verify_the_field_spouse_first_name_should_be_display_only_textbox_nonmandatory_data() throws Throwable {
	Thread.sleep(600);
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sFirstNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sFirstNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nonmandatory.contains("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textBox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sFirstNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textBox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Middle Name should be display only,textbox,Nonmandatory,data")
public void user_6047_verify_the_field_spouse_middle_name_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sMiddleNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sMiddleNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nonmandatory.contains("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textBox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sMiddleNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textBox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Last Name should be display only,textbox,Nonmandatory,data")
public void user_6047_verify_the_field_spouse_last_name_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sLastNameVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sLastNameVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nonmandatory.contains("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textBox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouse'sLastNameVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textBox.contains("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field No Of Children should be display only,number,Nonmandatory,data")
public void user_6047_verify_the_field_no_of_children_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("NoOfChildVerification")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("NoOfChildVerification")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nonmandatory.equals("false"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String number= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("NoOfChildVerification")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( number.equals("number"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Spouse Status should be display only,dropdown,Nonmandatory,data")
public void user_6047_verify_the_field_spouse_status_should_be_display_only_dropdown_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouseStatus")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouseStatus")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(!(nonmandatory.contains("*")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("spouseStatus")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Date Of Birth should be display only,calendar,mandatory,data")
public void user_6047_verify_the_field_date_of_birth_should_be_display_only_calendar_mandatory_data() {
	String DateOfBirth = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("DOB"))
			.getAttribute("ng-reflect-default-value");
	
    String DateOfBirthValue="1997-05-07";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(DateOfBirthValue, DateOfBirth);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("DOB")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("DOB")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String calender= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("DOBcalendar")).getAttribute("ng-reflect-icon");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( calender.contains("pi pi-calendar"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Gender should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_gender_should_be_display_only_dropdown_mandatory_data() {
	String Gender = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField"))
			.getAttribute("aria-label");
	String Gender1 = Gender.substring(0, Gender.indexOf(",")).trim();
	  System.err.println(Gender1);
    String GenderValue="FEMALE";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(GenderValue, Gender1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("genderField")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Marital Status should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_marital_status_should_be_display_only_dropdown_mandatory_data() {
	String MaritalStatus = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus"))
			.getAttribute("aria-label");
	String MaritalStatus1 =  MaritalStatus.substring(0, MaritalStatus.indexOf(",")).trim();
	  System.err.println(MaritalStatus1);
    String MaritalStatusValue="Single";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(MaritalStatusValue, MaritalStatus1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("maritailStatus")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Education Level Name should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_education_level_name_should_be_display_only_dropdown_mandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("EducationLevel")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("EducationLevel")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("EducationLevel")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Nationality should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_nationality_should_be_display_only_dropdown_mandatory_data() {
	String Nationality = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality"))
			.getAttribute("aria-label");
	String Nationality1 = Nationality.substring(0, Nationality.indexOf(",")).trim();
	  System.err.println(Nationality1);
    String NationalityValue="Indian";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(NationalityValue, Nationality1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("nationality")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Category should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_category_should_be_display_only_dropdown_mandatory_data() throws Throwable {
	Thread.sleep(1000);
	String Category = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category"))
			.getAttribute("aria-label");
	String Category1 = Category.substring(0, Category.indexOf(",")).trim();
	  System.err.println(Category1);
    String CategoryValue="General";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(CategoryValue, Category1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("category")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Religion should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_religion_should_be_display_only_dropdown_mandatory_data() {
	String Religion = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion"))
			.getAttribute("aria-label");
	String Religion1 = Religion.substring(0, Religion.indexOf(",")).trim();
	  System.err.println(Religion1);
    String ReligionValue="HINDU";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ReligionValue, Religion1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("religion")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.equals("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Residential Status should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_residential_status_should_be_display_only_dropdown_mandatory_data() {
	String ResidentialStatus = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("ResidentialStatus"))
			.getAttribute("aria-label");
	String ResidentialStatus1 =  ResidentialStatus.substring(0, ResidentialStatus.indexOf(",")).trim();
	  System.err.println(ResidentialStatus1);
    String ResidentialStatusValue="Resident";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ResidentialStatusValue, ResidentialStatus1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("residentialStatus")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("residentialStatus")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("residentialStatus")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Language should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_language_should_be_display_only_dropdown_mandatory_data() {
	String Language = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages"))
			.getAttribute("aria-label");
	String Language1 =  Language.substring(0, Language.indexOf(",")).trim();
	  System.err.println(Language1);
    String LanguageValue="English";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(LanguageValue, Language1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("languages")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field No Of Dependents should be display only,textbox,Nonmandatory,data")
public void user_6047_verify_the_field_no_of_dependents_should_be_display_only_textbox_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("no_of_dependents")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("no_of_dependents")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue((nonmandatory.contains("false")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("no_of_dependents")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.contains("number"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Mothers Maiden Name should be display only,textbox,mandatory,data")
public void user_6047_verify_the_field_mothers_maiden_name_should_be_display_only_textbox_mandatory_data() {
	String MothersMaidenName = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenName"))
			.getAttribute("ng-reflect-model");

	
    String MothersMaidenNameValue="AMRITA";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(MothersMaidenNameValue, MothersMaidenName);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenNameVerify")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenNameVerify")).getAttribute("ng-reflect-required");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.equals("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String textbox= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("mother'sMaidenNameVerify")).getAttribute("ng-reflect-input-type");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( textbox.equals("text"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Type Of Residence should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_type_of_residence_should_be_display_only_dropdown_mandatory_data() {
	String Residence = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence"))
			.getAttribute("aria-label");
	String Residence1 =Residence.substring(0, Residence.indexOf(",")).trim();
	  System.err.println(Residence1);
    String ResidenceValue="Rental";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(ResidenceValue, Residence1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("typeOfResidence")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Industry Segmentation should be display only,dropdown,mandatory,data")
public void user_6047_verify_the_field_industry_segmentation_should_be_display_only_dropdown_mandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("industrySegmentation")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String mandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("industrySegmentation")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(mandatory.contains("*"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("industrySegmentation")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Is Income Considered should be display only,dropdown,Nonmandatory,data")
public void user_6047_verify_the_field_is_income_considered_should_be_display_only_dropdown_nonmandatory_data() {
	String Income = javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered"))
			.getAttribute("aria-label");
	String Income1 = Income.substring(0, Income.indexOf(",")).trim();
	  System.err.println(Income1);
    String IncomeValue="YES";
	for (int i = 0; i <2000; i++) {
        try {
          
            Assert.assertEquals(IncomeValue, Income1);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(!(nonmandatory.contains("*")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("isIncomeConsidered")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Customer Profile should be display only,dropdown,Nonmandatory,data")
public void user_6047_verify_the_field_customer_profile_should_be_display_only_dropdown_nonmandatory_data() {
	String displayOnly= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("customerProfile")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( displayOnly.equals("true"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String nonmandatory= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("customerProfile")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(!(nonmandatory.contains("*")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String dropdown= javascriptHelper.executeScriptWithWebElement(AL_CustomerDetailsElements.getElement("customerProfile")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
		try {
			Assert.assertTrue( dropdown.contains("Select"));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
}
