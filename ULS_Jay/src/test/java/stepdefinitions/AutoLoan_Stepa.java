package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_Stepa {
	
	WebDriver driver = BaseClass.driver;
	
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths al_ADEntry_CustomerDetails = new JSPaths(excelPath, "Al_ADEntry_CustomerDetails_610", "AutoloanADEntry_CustomerDetails", "JSPath");
	JSPaths al_ADEntryDocDetails_610 = new JSPaths(excelPath, "Al_ADEntryDocDetails_610", "AutoloanADEntry_DocumentsDetails", "JSPath");

	
	
	// ***********************************  Steps ********************************
	
	
	@And("User_610 Click Customer Details screen in Autoloan")
	public void user_610_610_click_customer_details_screen_in_autoloan() {
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerDetailsTab")).click();
				break;
				
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Back button field on Customer details screen")
	public void user_610_610_verify_the_back_button_field_on_customer_details_screen() {
		for (int i = 0; i < 600; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsBackBtn")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==599) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Save button field on Customer details screen")
	public void user_610_610_verify_the_save_button_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsSaveBtn")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}
	
	@And ("User_610 verify the Customer Type field on Customer details screen")
	public void user_610_610_verify_the_customer_type_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Applicant Type field on Customer details screen")
	public void user_610_610_verify_the_applicant_type_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("applicantTypeDropdown")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Salutation field on Customer details screen")
	public void user_610_610_verify_the_salutation_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("titleDropdown")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the First Name field on Customer details screen")
	public void user_610_610_verify_the_first_name_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("firstNameInput")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Middle Name field on Customer details screen")
	public void user_610_610_verify_the_middle_name_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("middleNameInput")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	    
	}

	@And("User_610 verify the Last Name field on Customer details screen")
	public void user_610_610_verify_the_last_name_field_on_customer_details_screen() {
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("lastNameInput")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (i==299) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
	}
		
		@And("User_610 verify the Fathers First Name field on Customer details screen")
		public void user_610_610_verify_the_fathers_first_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherFirstName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Fathers Middle Name field on Customer details screen")
		public void user_610_610_verify_the_fathers_middle_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherMiddleName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Fathers Last Name field on Customer details screen")
		public void user_610_610_verify_the_fathers_last_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherLastName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Spouse First Name field on Customer details screen")
		public void user_610_610_verify_the_spouse_first_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseFirstName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Spouse Middle Name field on Customer details screen")
		public void user_610_610_verify_the_spouse_middle_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseMiddleName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Spouse Last Name field on Customer details screen")
		public void user_610_610_verify_the_spouse_last_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseLastName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Data Of Birth field on Customer details screen")
		public void user_610_610_verify_the_data_of_birth_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("dobInput")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Gender field on Customer details screen")
		public void user_610_610_verify_the_gender_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("genderDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Education level field on Customer details screen")
		public void user_610_610_verify_the_education_level_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("educationLevelDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Marital Status field on Customer details screen")
		public void user_610_610_verify_the_marital_status_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("maritalStatusDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Nationality field on Customer details screen")
		public void user_610_610_verify_the_nationality_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("nationalityDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Category field on Customer details screen")
		public void user_610_610_verify_the_category_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("clientCategory")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Religion field on Customer details screen")
		public void user_610_610_verify_the_religion_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Religion")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Residential Status field on Customer details screen")
		public void user_610_610_verify_the_residential_status_field_on_customer_details_screen() {
			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("residentialStatusDropdown")));

			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("residentialStatusDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Language field on Customer details screen")
		public void user_610_610_verify_the_language_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("languageDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the No Of Department field on Customer details screen")
		public void user_610_610_verify_the_no_of_department_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("noOfDependsInput")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		
		@And("User_610 verify the No Of Children field on Customer details screen")
		public void user_610_610_verify_the_no_of_children_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("NoOfChildren")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		
		    
		}

		@And("User_610 verify the Spouse Status field on Customer details screen")
		public void user_610_610_verify_the_spouse_status_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseStatus")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Residential Status Label field on Customer details screen")
		public void user_610_610_verify_the_residential_status_label_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("residentialStatusDropdown")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Mother Maiden Name field on Customer details screen")
		public void user_610_610_verify_the_mother_maiden_name_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MotherMaidenName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Types Of Residence field on Customer details screen")
		public void user_610_610_verify_the_types_of_residence_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("TypesOfResidence")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Industry Segmentation field on Customer details screen")
		public void user_610_610_verify_the_industry_segmentation_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("IndustrySegmentation")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Is Income Consider field on Customer details screen")
		public void user_610_610_verify_the_is_income_consider_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("IsIncomeConsider")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Customer Profile field on Customer details screen")
		public void user_610_610_verify_the_customer_profile_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("CustomerProfile")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Relationship field on Customer details screen")
		public void user_610_610_verify_the_relationship_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Relationship")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the political Exposed field on Customer details screen")
		public void user_610_610_verify_the_political_exposed_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("PoliticalExposed")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Block List field on Customer details screen")
		public void user_610_610_verify_the_block_list_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("blocklistLabel")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		}

		@And("User_610 verify the Remark field on Customer details screen")
		public void user_610_610_verify_the_remark_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("remarksInput")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		}
		
		
		//--------------    @AT_Al_CD_02
		
		
		
		@And("User_610 verify the Phone Number field on Customer details screen")
		public void user_610_610_verify_the_phone_number_field_on_customer_details_screen() {
			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("PhoneNumber")));
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("PhoneNumber")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Mobile Number Primary field on Customer details screen")
		public void user_610_610_verify_the_mobile_number_primary_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MobileNumberPrimary")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Mobile Number Secondary field on Customer details screen")
		public void user_610_610_verify_the_mobile_number_secondary_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MobileNumberSecondary")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Emali field on Customer details screen")
		public void user_610_610_verify_the_emali_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Email_610")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Preferred Contact Method field on Customer details screen")
		public void user_610_610_verify_the_preferred_contact_method_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("PreferredContactMethod")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Preferred Time For Contract field on Customer details screen")
		public void user_610_610_verify_the_preferred_time_for_contract_field_on_customer_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("preferredTimeForContract")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}
		
	    
		//-----------------------------  @AT_Al_CD_03
		
		@And("User_610 verify the Customer Type field mandatory editable dropdown")
		public void user_610_610_verify_the_customer_type_field_mandatory_editable_dropdown() throws Throwable {
			
			Thread.sleep(2000);
			// ----------------validate mandatory field

			for (int i = 0; i < 500; i++) {
				try {
					String customerTyp = "document.querySelector('[id=\"indCorpFlag\"] ion-label').innerText";
					String customerType = (String) javascriptHelper.executeScript("return " + customerTyp);
					
					System.err.println("customerType:"+ customerType);
				
					Assert.assertEquals(true, customerType.contains("*"));
			//		Assert.assertTrue(!RemarkName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
			
			//-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Small Medium Enterprise(SME)")) {

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

		@And("User_610 verify the Applicant Type field mandatory editable textbox")
		public void user_610_610_verify_the_applicant_type_field_mandatory_editable_textbox() {
			
			// ----------------validate mandatory field
			
			for (int i = 0; i < 200; i++) {
				try {
					String applicatTyp = "document.querySelector('[id=\"guarCoapFlag\"] ion-label').innerText";
					String applicatType = (String) javascriptHelper.executeScript("return " + applicatTyp);
					
					System.err.println("applicatType:"+ applicatType);
				
					Assert.assertEquals(true, applicatType.contains("*"));
			//	Assert.assertTrue(!RemarkName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}	
		

			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("applicantTypeDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}			
						
             //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Authorized Signatory")) {

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

		@And("User_610 verify the KYC status field non-mandatory non-editable textbox")
		public void user_610_610_verify_the_kyc_status_field_non_mandatory_non_editable_textbox() {
			// ----------------validate non mandatory field

			for (int i = 0; i < 200; i++) {
							try {
								String Kyc = "document.querySelector('digital-text-box[ng-reflect-title-tool-tip=\"KYC Status.TOOLTIP\"]').innerText";
								String KYC = (String) javascriptHelper.executeScript("return " + Kyc);
								
								System.err.println("Kyc:"+ KYC);
							
						//		Assert.assertEquals(true, Kyc.contains("*"));
								Assert.assertTrue(!Kyc.contains("*"));
								break;
							} catch (Exception e) {
								if (i == 199) {
									Assert.fail(e.getMessage());
								}
							}
						}
			
			//non editable read only true
			
					
			String KycEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("getAttKyc"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + KycEditable);
			String assertKycEditable = "true";
			
			Assert.assertEquals(assertKycEditable, KycEditable);
											    
		            }

		@And("User_610 verify the salutation field mandatory editable dropdown")
		public void user_610_610_verify_the_salutation_field_mandatory_editable_dropdown() {
			// ----------------validate mandatory field

			for (int i = 0; i < 200; i++) {
							try {
								String salutation = "document.querySelector('[id=\"salutation\"] ion-label').innerText";
								String Salutation = (String) javascriptHelper.executeScript("return " + salutation);
								
								System.err.println("customerType:"+ Salutation);
							
								Assert.assertEquals(true, Salutation.contains("*"));
						//		Assert.assertTrue(!RemarkName.contains("*"));
								break;
							} catch (Exception e) {
								if (i == 199) {
									Assert.fail(e.getMessage());
								}
							}
						}
		
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("titleDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
						
          //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Mr")) {

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

		@And("User_610 verify the First name field mandatory editable textbox")
		public void user_610_610_verify_the_first_name_field_mandatory_editable_textbox() {
			// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
				try {
					String Firstname = "document.querySelector('[id=\\\"customerFirstName\\\"] ion-label').innerText";
					String Firstnam = (String) javascriptHelper.executeScript("return " + Firstname);
								
					System.err.println("customerType:"+ Firstnam);
							
					Assert.assertEquals(true, Firstnam.contains("*"));
			//		Assert.assertTrue(!RemarkName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}
			

		//type text
		
		String firstnametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("firstNameInput"))
				.getAttribute("type");
		System.err.println("first print  " + firstnametext);
		String assertfirstnametext = "text";
		Assert.assertEquals(assertfirstnametext, firstnametext);
		
		//editable
		
		
		String firstNameEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("firstNameInput"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + firstNameEditable);
		String assertfirstNameEditable = "false";
		
		Assert.assertEquals(assertfirstNameEditable, firstNameEditable);
	
		}
		
		//--------------------------  @AT_Al_CD_04
		
		
		@And("User_610 verify the Middle Name field non mandatory editable textbox")
		public void user_610_verify_the_middle_name_field_non_mandatory_editable_textbox() {
			
			// ----------------validate mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String Middlenam = "document.querySelector('[id=\\\"customerMiddleName\\\"] ion-label').innerText";
					String Middlename = (String) javascriptHelper.executeScript("return " + Middlenam);
								
					System.err.println("Middlename :"+ Middlename);
							
			//		Assert.assertEquals(true, Middlename.contains("*"));
					Assert.assertTrue(!Middlename.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String middlenametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("middleNameInput"))
					.getAttribute("type");
			System.err.println("first print  " + middlenametext);
			String assertmiddlenametext = "text";
			Assert.assertEquals(assertmiddlenametext, middlenametext);
			
			//editable
			
			
			String firstNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("firstNameInput"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + firstNameEditable);
			String assertfirstNameEditable = "false";
			
			Assert.assertEquals(assertfirstNameEditable, firstNameEditable);
			
		}

		@And("User_610 verify the Last Name field mandatory editable textbox")
		public void user_610_verify_the_last_name_field_mandatory_editable_textbox() {
			// ----------------validate mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String Lastnam = "document.querySelector('[id=\"customerLastName\"] ion-label').innerText";
					String Lastname = (String) javascriptHelper.executeScript("return " + Lastnam);
								
					System.err.println("Lastname :"+ Lastname);
							
					Assert.assertEquals(true, Lastname.contains("*"));
			//		Assert.assertTrue(!Middlename.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String lastnametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("lastNameInput"))
					.getAttribute("type");
			System.err.println("first print  " + lastnametext);
			String assertLastnametext = "text";
			Assert.assertEquals(assertLastnametext, lastnametext);
			
			//editable
			
			
			String lastNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("lastNameInput"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " +lastNameEditable);
			String assertlastNameEditable = "false";
			
			Assert.assertEquals(assertlastNameEditable, lastNameEditable);
		    
		}

		@And("User_610 verify the fathers First Name field mandatory editable textbox")
		public void user_610_verify_the_fathers_first_name_field_mandatory_editable_textbox() {
			// ----------------validate mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String fathersFirstNam = "document.querySelector('digital-text-box[id=\"extnChar1\"]').querySelector('ion-label').innerText";
					String fathersFirstName = (String) javascriptHelper.executeScript("return " + fathersFirstNam);
								
					System.err.println("fathersFirstName :"+ fathersFirstName);
							
					Assert.assertEquals(true, fathersFirstName.contains("*"));
			//		Assert.assertTrue(!Middlename.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String fathersFirstNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherFirstName"))
					.getAttribute("type");
			System.err.println("first print  " + fathersFirstNametext);
			String assertfathersFirstNametext = "text";
			Assert.assertEquals(assertfathersFirstNametext, fathersFirstNametext);
			
			//editable
			
			
			String fathersFirstNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherFirstName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + fathersFirstNameEditable);
			String assertfirstNameEditable = "false";
			
			Assert.assertEquals(assertfirstNameEditable, fathersFirstNameEditable);
		    
		}

		@And("User_610 verify the fathers Middle Name field non mandatory editable textbox")
		public void user_610_verify_the_fathers_middle_name_field_non_mandatory_editable_textbox() {
			// ----------------validate mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String fathersMiddleNam = "document.querySelector('digital-text-box[id=\"extnChar2\"]').querySelector('ion-input').innerText";
					String fathersMiddleName = (String) javascriptHelper.executeScript("return " + fathersMiddleNam);
								
					System.err.println("fathersMiddleName :"+ fathersMiddleName);
							
			//		Assert.assertEquals(true, fathersMiddleName.contains("*"));
					Assert.assertTrue(!fathersMiddleName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String FatherMiddleNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherMiddleName"))
					.getAttribute("type");
			System.err.println("first print  " + FatherMiddleNametext);
			String assertFatherMiddleNametext = "text";
			Assert.assertEquals(assertFatherMiddleNametext, FatherMiddleNametext);
			
			//editable
			
			
			String FatherMiddleNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherMiddleName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + FatherMiddleNameEditable);
			String assertFatherMiddleNameEditable = "false";
			
			Assert.assertEquals(assertFatherMiddleNameEditable, FatherMiddleNameEditable);
		    
		}

		@And("User_610 verify the fathers Last Name field mandatory editable textbox")
		public void user_610_verify_the_fathers_last_name_field_mandatory_editable_textbox() {
			// ----------------validate mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String fathersLastNam = "document.querySelector('digital-text-box[id=\"extnChar3\"]').innerText";
					String fathersLastName = (String) javascriptHelper.executeScript("return " + fathersLastNam);
								
					System.err.println("fathersLastName :"+ fathersLastName);
							
					Assert.assertEquals(true, fathersLastName.contains("*"));
			//		Assert.assertTrue(!Middlename.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String FatherLastNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherLastName"))
					.getAttribute("type");
			System.err.println("first print  " + FatherLastNametext);
			String assertFatherLastNametext = "text";
			Assert.assertEquals(assertFatherLastNametext, FatherLastNametext);
			
			//editable
			
			
			String FatherLastNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FatherLastName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + FatherLastNameEditable);
			String assertFatherLastNameEditable = "false";
			
			Assert.assertEquals(assertFatherLastNameEditable, FatherLastNameEditable);
		    
		}
		
		//----------------------  @AT_Al_CD_05
		
		
		@And("User_610 verify the Spouse first name field non mandatory editable textbox")
		public void user_610_verify_the_spouse_first_name_field_non_mandatory_editable_textbox() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String spouseLastNam = "document.querySelector('digital-text-box[id=\"extnChar4\"]').querySelector('ion-label').innerText";
					String spouseLastName = (String) javascriptHelper.executeScript("return " + spouseLastNam);
								
					System.err.println("spouseLastName :"+ spouseLastName);
							
			//		Assert.assertEquals(true, fathersLastName.contains("*"));
					Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String spouseLastNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseFirstName"))
					.getAttribute("type");
			System.err.println("first print  " + spouseLastNametext);
			String assertspouseLastNametext = "text";
			Assert.assertEquals(assertspouseLastNametext, spouseLastNametext);
			
			//editable
			
			
			String SpouseFirstNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseFirstName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + SpouseFirstNameEditable);
			String assertSpouseFirstNameEditable = "false";
			
			Assert.assertEquals(assertSpouseFirstNameEditable, SpouseFirstNameEditable);
		    
		}

		@And("User_610 verify the Spouse Middle Name non mandatory editable textbox")
		public void user_610_verify_the_spouse_middle_name_non_mandatory_editable_textbox() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String SpouseMiddleNam = "document.querySelector('digital-text-box[id=\"extnChar5\"]').querySelector('ion-label').innerText";
					String SpouseMiddleName = (String) javascriptHelper.executeScript("return " + SpouseMiddleNam);
								
					System.err.println("SpouseMiddleName :"+ SpouseMiddleName);
							
			//		Assert.assertEquals(true, fathersLastName.contains("*"));
					Assert.assertTrue(!SpouseMiddleName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String SpouseMiddletext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseMiddleName"))
					.getAttribute("type");
			System.err.println("first print  " + SpouseMiddletext);
			String assertSpouseMiddletext = "text";
			Assert.assertEquals(assertSpouseMiddletext, SpouseMiddletext);
			
			//editable
			
			
			String SpouseMiddleNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseMiddleName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + SpouseMiddleNameEditable);
			String assertSpouseMiddleNameEditable = "false";
			
			Assert.assertEquals(assertSpouseMiddleNameEditable, SpouseMiddleNameEditable);
		    
		}

		@And("User_610 verify the Spouse last Name non mandatory editable textbox")
		public void user_610_verify_the_spouse_last_name_non_mandatory_editable_textbox() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String spouseLastNam = "document.querySelector('digital-text-box[id=\"extnChar6\"]').querySelector('ion-label').innerText";
					String spouseLastName = (String) javascriptHelper.executeScript("return " + spouseLastNam);
								
					System.err.println("spouseLastName :"+ spouseLastName);
							
			//		Assert.assertEquals(true, fathersLastName.contains("*"));
					Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type text
			
			String SpouseLastNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseLastName"))
					.getAttribute("type");
			System.err.println("first print  " + SpouseLastNametext);
			String assertSpouseLastNametext = "text";
			Assert.assertEquals(assertSpouseLastNametext, SpouseLastNametext);
			
			//editable
			
			
			String SpouseLastNameEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseLastName"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + SpouseLastNameEditable);
			String assertSpouseLastNameEditable = "false";
			
			Assert.assertEquals(assertSpouseLastNameEditable, SpouseLastNameEditable);
		    
		}

		@And("User_610 verify the No of children field non mandatory editable number")
		public void user_610_verify_the_no_of_children_field_non_mandatory_editable_number() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String noOfChildre = "document.querySelector('digital-text-box[ng-reflect-title=\"No. Of Children\"]').querySelector('ion-label').innerText";
					String noOfChildren = (String) javascriptHelper.executeScript("return " + noOfChildre);
								
					System.err.println("noOfChildren :"+ noOfChildren);
							
			//		Assert.assertEquals(true, fathersLastName.contains("*"));
					Assert.assertTrue(!noOfChildren.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type number
			
			String noOfChildrentext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("NoOfChildren"))
					.getAttribute("type");
			System.err.println("first print  " + noOfChildrentext);
			String assertnoOfChildrentext = "number";
			Assert.assertEquals(assertnoOfChildrentext, noOfChildrentext);
			
			//editable
			
			
			String noOfChildrentextEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("NoOfChildren"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + noOfChildrentextEditable);
			String assertFatherLastNameEditable = "false";
			
			Assert.assertEquals(assertFatherLastNameEditable, noOfChildrentextEditable);
		    
		}

		@And("User_610 verify the spouse Status field non mandatory editable dropdown")
		public void user_610_verify_the_spouse_status_field_non_mandatory_editable_dropdown() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 200; i++) {
				try {
					String spouseStatus = "document.querySelector('ion-label[ng-reflect-text=\"Spouse Status.TOOLTIP\"]').innerText";
					String spouseStatu = (String) javascriptHelper.executeScript("return " + spouseStatus);
								
					System.err.println("spouseStatu :"+ spouseStatu);
							
			//		Assert.assertEquals(true, spouseStatu.contains("*"));
					Assert.assertTrue(!spouseStatu.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("SpouseStatus")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Not Working")) {

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
		
		//---------------------------------------  @AT_Al_CD_06
		
		@And("User_610 verify the Date of birth field mandatory editable calendar")
		public void user_610_verify_the_date_of_birth_field_mandatory_editable_calendar() throws Throwable {
			//mandatory
			Thread.sleep(2000);
			for (int i = 0; i < 200; i++) {
				try {
					String dateOfBirth = "document.querySelector('[id=\"dateBirthIncorp\"] label').innerText";
					String dateOfBirt = (String) javascriptHelper.executeScript("return " + dateOfBirth);
								
					System.err.println("dateOfBirt :"+ dateOfBirt);
							
					Assert.assertEquals(true, dateOfBirt.contains("*"));
			//		Assert.assertTrue(!noOfChildren.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
		    
			//type calender
			
			String dobCalenderDOB = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("dobCalender"))
					.getAttribute("ng-reflect-date-format");
			System.err.println("first print  " + dobCalenderDOB);
			String assertdobCalenderDOB = "dd-M-yy";
			Assert.assertEquals(assertdobCalenderDOB, dobCalenderDOB);
			
			//editable
			
			
			String dobCalenderEditable = javascriptHelper
					.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("dob"))
					.getAttribute("ng-reflect-readonly");
			System.err.println("first print  " + dobCalenderEditable);
			String dobCalenderEditableEditable = "false";
			
			Assert.assertEquals(dobCalenderEditableEditable, dobCalenderEditable);
		    
		}

		@And("User_610 verify the Gender mandatory editable dropdown")
		public void user_610_verify_the_gender_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String gender = "document.querySelector('[id=\"gender\"] ion-label').innerText";
					String gende = (String) javascriptHelper.executeScript("return " + gender);
								
					System.err.println("spouseLastName :"+ gende);
							
					Assert.assertEquals(true, gende.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("genderDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("MALE")) {

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

		@And("User_610 verify the Education level mandatory editable dropdown")
		public void user_610_verify_the_education_level_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String educationLevel = "document.querySelector('[id=\"qualificationType\"] ion-label').innerText";
					String educationLeve = (String) javascriptHelper.executeScript("return " + educationLevel);
								
					System.err.println("educationLevel :"+ educationLeve);
							
					Assert.assertEquals(true, educationLeve.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("educationLevelDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("UG")) {

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

		@And("User_610 verify the marital Status field mandatory editable dropdown")
		public void user_610_verify_the_marital_status_field_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String martialStatus = "document.querySelector('[id=\"maritalStatus\"] ion-label').innerText";
					String martialStatu = (String) javascriptHelper.executeScript("return " + martialStatus);
								
					System.err.println("martialStatu :"+ martialStatu);
							
					Assert.assertEquals(true, martialStatu.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("maritalStatusDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Single")) {

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

		@And("User_610 verify the Nationality field mandatory editable dropdown")
		public void user_610_verify_the_nationality_field_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String nationality = "document.querySelector('[id=\"nationalityId\"] ion-label').innerText";
					String nationalit = (String) javascriptHelper.executeScript("return " + nationality);
								
					System.err.println("nationalit :"+ nationalit);
							
					Assert.assertEquals(true, nationalit.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("nationalityDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Indian")) {

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
		
		//-----------------------------   @AT_Al_CD_07  
		
		
		
		
		@And("User_610 verify the Category field mandatory editable dropdown")
		public void user_610_verify_the_category_field_mandatory_editable_dropdown() throws Throwable {
			
			Thread.sleep(2000);
			for (int i = 0; i < 200; i++) {
				try {
					String category = "document.querySelector('digital-select-layout[id=\"ethnicType\"]').querySelector('ion-label').innerText";
					String categor = (String) javascriptHelper.executeScript("return " + category);
								
					System.err.println("category :"+ categor);
							
					Assert.assertEquals(true, categor.contains("*"));
			//		Assert.assertTrue(!noOfChildren.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Category")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("General")) {

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

		@And("User_610 verify the Religion mandatory editable dropdown")
		public void user_610_verify_the_religion_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String religion = "document.querySelector('ion-label[ng-reflect-text=\"LEAD_DETAILS.RELIGION.TOOLTIP\"]').innerText";
					String religio = (String) javascriptHelper.executeScript("return " + religion);
								
					System.err.println("religio :"+ religio);
							
					Assert.assertEquals(true, religio.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Religion")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("HINDU")) {

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

		@And("User_610 verify the Residential Status mandatory editable dropdown")
		public void user_610_verify_the_residential_status_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String residentialStatus = "document.querySelector('[id=\"residenceStatus\"] ion-label').innerText";
					String residentialStatu = (String) javascriptHelper.executeScript("return " + residentialStatus);
								
					System.err.println("educationLevel :"+ residentialStatu);
							
					Assert.assertEquals(true, residentialStatu.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("residentialStatusDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Resident")) {

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

		@And("User_610 verify the Language field mandatory editable dropdown")
		public void user_610_verify_the_language_field_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String language = "document.querySelector('[id=\"languageId\"] ion-label').innerText";
					String languag = (String) javascriptHelper.executeScript("return " + language);
								
					System.err.println("languag :"+ languag);
							
					Assert.assertEquals(true, languag.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("languageDropdown")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("English")) {

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

		@And("User_610 verify the No Of Dependents field mandatory editable textbox")
		public void user_610_verify_the_no_of_dependents_field_mandatory_editable_textbox() {
			for (int i = 0; i < 200; i++) {
				try {
					String noofDependents = "document.querySelector('[id=\"noOfDependents\"] ion-label').innerText";
					String noofDependent = (String) javascriptHelper.executeScript("return " + noofDependents);
								
					System.err.println("noofDependent :"+ noofDependent);
							
			//		Assert.assertEquals(true, educationLeve.contains("*"));
					Assert.assertTrue(!noofDependent.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			} 
			
		
		//type number
		
		String noofDepetmentNum = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("noOfDependsInput"))
				.getAttribute("type");
		System.err.println("first print  " + noofDepetmentNum);
		String assertnoofDepetmentNum = "number";
		Assert.assertEquals(assertnoofDepetmentNum, noofDepetmentNum);
		
		//editable
		
		
		String noofDepetmentEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("noOfDependsInput"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + noofDepetmentEditable);
		String assertnoofDepetmentEditable = "false";
		
		Assert.assertEquals(assertnoofDepetmentEditable, noofDepetmentEditable);
		
		
		}
		
		
		//-----------------------  @AT_Al_CD_08
		
		
		@And("User_610 verify the mothers maiden name field mandatory editable textbox")
		public void user_610_verify_the_mothers_maiden_name_field_mandatory_editable_textbox() throws Throwable {
			
			Thread.sleep(2000);
			for (int i = 0; i < 200; i++) {
				try {
					String motherMaidenName = "document.querySelector('digital-text-box[id=\"mothersName\"]').querySelector('ion-label').innerText";
					String motherMaidenNam = (String) javascriptHelper.executeScript("return " + motherMaidenName);
								
					System.err.println("motherMaidenName :"+ motherMaidenNam);
							
					Assert.assertEquals(true, motherMaidenNam.contains("*"));
			//		Assert.assertTrue(!noOfChildren.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
		
		//type text
		
		String mothersMaidennametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MotherMaidenName"))
				.getAttribute("type");
		System.err.println("first print  " + mothersMaidennametext);
		String assertmothersMaidennametext = "text";
		Assert.assertEquals(assertmothersMaidennametext, mothersMaidennametext);
		
		//editable
		
		
		String noofDepetmentEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MotherMaidenName"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + noofDepetmentEditable);
		String assertnoofDepetmentEditable = "false";
		
		Assert.assertEquals(assertnoofDepetmentEditable, noofDepetmentEditable);
		    
		}

		@And("User_610 verify the type of residence mandatory editable dropdown")
		public void user_610_verify_the_type_of_residence_mandatory_editable_dropdown() {
			
			for (int i = 0; i < 200; i++) {
				try {
					String residence = "document.querySelector('digital-select-layout[id=\"residenceType\"]').querySelector('ion-label').innerText";
					String residenc = (String) javascriptHelper.executeScript("return " + residence);
								
					System.err.println("residenc :"+ residenc);
							
					Assert.assertEquals(true, residenc.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("TypesOfResidence")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Commercial rent")) {

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

		@And("User_610 verify the industry segmentation mandatory editable dropdown")
		public void user_610_verify_the_industry_segmentation_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String industrySegmentation = "document.querySelector('digital-select-layout[id=\"clientCategory\"]').querySelector('ion-label').innerText";
					String industrySegmentatio = (String) javascriptHelper.executeScript("return " + industrySegmentation);
								
					System.err.println("industrySegmentation :"+ industrySegmentatio);
							
					Assert.assertEquals(true, industrySegmentatio.contains("*"));
			//		Assert.assertTrue(!spouseLastName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("IndustrySegmentation")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Accomodation")) {

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

		@And("User_610 verify the is income considered field non mandatory editable dropdown")
		public void user_610_verify_the_is_income_considered_field_non_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String incomeConsider = "document.querySelector('digital-select-layout[id=\"isIncomeConsidered\"]').querySelector('ion-label').innerText";
					String incomeConside = (String) javascriptHelper.executeScript("return " + incomeConsider);
								
					System.err.println("incomeConsider :"+ incomeConside);
							
			//		Assert.assertEquals(true, industrySegmentation.contains("*"));
					Assert.assertTrue(!incomeConside.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("IsIncomeConsider")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("YES")) {

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

		@And("User_610 verify the customer profile field non mandatory editable dropdown")
		public void user_610_verify_the_customer_profile_field_non_mandatory_editable_dropdown() {
		    
			for (int i = 0; i < 200; i++) {
				try {
					String customerProfile = "document.querySelector('digital-select-layout[id=\"dynamicCharField1\"]').querySelector('ion-label').innerText";
					String customerProfil = (String) javascriptHelper.executeScript("return " + customerProfile);
								
					System.err.println("customerProfil :"+ customerProfil);
							
			//		Assert.assertEquals(true, industrySegmentation.contains("*"));
					Assert.assertTrue(!customerProfil.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("CustomerProfile")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("BPO")) {

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
		
		//------------  @AT_Al_CD_09
		
		@And("User_610 verify the Relationship field mandatory editable dropdown")
		public void user_610_verify_the_relationship_field_mandatory_editable_dropdown() throws Throwable {
			Thread.sleep(2000);
			for (int i = 0; i < 200; i++) {
				try {
					String relationship = "document.querySelector('digital-select-layout[id=\"relationship\"]').querySelector('ion-label').innerText";
					String relationshi = (String) javascriptHelper.executeScript("return " + relationship);
								
					System.err.println("relationship :"+ relationshi);
							
					Assert.assertEquals(true, relationshi.contains("*"));
			//		Assert.assertTrue(!incomeConside.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Relationship")).click();
					break;
					
				} catch (Exception e) {
					if (i==499) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("BROTHER")) {

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

		@And("User_610 verify the Existing bank relationship field non mandatory editable toggle button")
		public void user_610_verify_the_existing_bank_relationship_field_non_mandatory_editable_toggle_button() {
			for (int i = 0; i < 200; i++) {
				try {
					String existingBankRelationship = "document.querySelector('[id=\"existingCustomerFlag\"]').innerText";
					String existingBankRelationshi = (String) javascriptHelper.executeScript("return " + existingBankRelationship);
								
					System.err.println("existingBankRelationship :"+ existingBankRelationshi);
							
			//		Assert.assertEquals(true, existingBankRelationshi.contains("*"));
					Assert.assertTrue(!existingBankRelationshi.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
		
		//type toggle button
		
			for (int i = 0; i<=500; i++) {
	         	try {
	         		if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("existingBankrelationshipToggle")).isDisplayed()) {
	             		Assert.assertTrue(true);
	         		}
	         		break;
				} catch (Exception e) {
					if(i==500) {
						Assert.fail(e.getMessage());
					}
				}

			}
		
		//editable
		
		
		String noofDepetmentEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("existingBankrelationship"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + noofDepetmentEditable);
		String assertnoofDepetmentEditable = "false";
		
		Assert.assertEquals(assertnoofDepetmentEditable, noofDepetmentEditable);
		    
		}

		@And("User_610 verify the Blacklisted field non mandatory editable toggle button")
		public void user_610_verify_the_blacklisted_field_non_mandatory_editable_toggle_button() {
			for (int i = 0; i < 200; i++) {
				try {
					String blacklisted = "document.querySelector('[id=\"isBlacklisted\"] ion-label').innerText";
					String blackliste = (String) javascriptHelper.executeScript("return " + blacklisted);
								
					System.err.println("blackliste :"+ blackliste);
							
			//		Assert.assertEquals(true, blackliste.contains("*"));
					Assert.assertTrue(!blackliste.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
		
			//type toggle button
			
			for (int i = 0; i<=500; i++) {
	         	try {
	         		if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("blocklistToggle")).isDisplayed()) {
	             		Assert.assertTrue(true);
	         		}
	         		break;
				} catch (Exception e) {
					if(i==500) {
						Assert.fail(e.getMessage());
					}
				}

			}
		
		//editable
		
		
		String blocklistLabeEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("blocklistLabe"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + blocklistLabeEditable);
		String assertblocklistLabeEditable = "false";
		
		Assert.assertEquals(assertblocklistLabeEditable, blocklistLabeEditable);
		    
		}

		@And("User_610 verify the politically exposed field non mandatory editable dropdown")
		public void user_610_verify_the_politically_exposed_field_non_mandatory_editable_dropdown() {
			for (int i = 0; i < 200; i++) {
				try {
					String politicallyExposed = "document.querySelector('digital-select-layout[id=\"isPoliticallyExposed\"]').querySelector('ion-select').innerText";
					String politicallyExpose = (String) javascriptHelper.executeScript("return " + politicallyExposed);
								
					System.err.println("politicallyExpose :"+ politicallyExpose);
							
			//		Assert.assertEquals(true, industrySegmentation.contains("*"));
					Assert.assertTrue(!politicallyExpose.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("PoliticalExposed")).isDisplayed();
					Assert.assertTrue(true);
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("YES")) {

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

		@And("User_610 verify the Remarks field non mandatory editable textbox")
		public void user_610_verify_the_remarks_field_non_mandatory_editable_textbox() {
			for (int i = 0; i < 200; i++) {
				try {
					String remarks = "document.querySelector('[id=\"remarks\"] ion-label').innerText";
					String remark = (String) javascriptHelper.executeScript("return " + remarks);
								
					System.err.println("remark :"+ remark);
							
					Assert.assertEquals(true, remark.contains("*"));
			//		Assert.assertTrue(!noOfChildren.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
			}  
			
		
//		//type text
		
		String remarksInputtext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("remarkText"))
				.getTagName();
		System.err.println("first print  " + remarksInputtext);
		String assertmothersMaidennametext = "textarea";
		Assert.assertEquals(assertmothersMaidennametext, remarksInputtext);
		
		//editable
		
		
		String remarkEditable = javascriptHelper
				.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("remarksInput"))
				.getAttribute("ng-reflect-readonly");
		System.err.println("first print  " + remarkEditable);
		String assertremarkEditable = "false";
		
		Assert.assertEquals(assertremarkEditable, remarkEditable);
		    
		}
		
		
		//------------------------------- @AT_Al_CD_11
		
		
		@And("User_610 verify the add button Autoloan")
		public void user_verify_the_add_button_autoloan() {
			for (int i = 0; i < 200; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("editBtn_UnderFollowUp_610")).click();
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
			
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("contactDetailsBackBtn")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
			
			
		}

		@And("User_610 verify the back button Autoloan")
		public void user_verify_the_back_button_autoloan() {
		    
		    
		}

		@And("User_610 verify the any mandatory field blank and save system should not allow user to save the record Autoloan")
		public void user_verify_the_any_mandatory_field_blank_and_save_system_should_not_allow_user_to_save_the_record_autoloan() {
		    
		    
		}

		@And("User_610 verfiy enter negative value system should not allow user to save the record Autoloan")
		public void user_verfiy_enter_negative_value_system_should_not_allow_user_to_save_the_record_autoloan() {
		    
		    
		}

		@And("User_610 verfiy enter character value in numeric field system should not allow user to save the record Autoloan")
		public void user_verfiy_enter_character_value_in_numeric_field_system_should_not_allow_user_to_save_the_record_autoloan() {
		    
		    
		}

		@And("User_610 verify enters only special characters value in any field system should not allow user to save the record Autoloan")
		public void user_verify_enters_only_special_characters_value_in_any_field_system_should_not_allow_user_to_save_the_record_autoloan() {
		    
		    
		}
		
		
		//--------------------   @AT_Al_DOC_01
		
		@And("User_610 Click Documents Details screen in Autoloan")
		public void user_click_documents_details_screen_in_autoloan() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("AutoLoanADEntry_DocumentsDetails")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		}

		@And("User_610 Click Add button under documents details AL")
		public void user_click_add_button_under_documents_details_al() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("AddBtn")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
				}
		
		//------------ @AT_Al_DOC_01
		
		@And("User_610 verify the Customer Name field in Al")
		public void user_verify_the_customer_name_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("CustomerName")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Name field in Al")
		public void user_verify_the_document_name_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Documentname")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Required At Stage field in Al")
		public void user_verify_the_required_at_stage_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("RequiredAtStage")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Status field in Al")
		public void user_verify_the_document_status_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentStatus")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Mandatory Optional field in Al")
		public void user_verify_the_mandatory_optional_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("MandatoryOptional")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Category field in Al")
		public void user_verify_the_document_category_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentCategory")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Upload Date field in Al")
		public void user_verify_the_upload_date_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("UploadDate")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Expected Date Of Receipt field in Al")
		public void user_verify_the_expected_date_of_receipt_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ExpectedDateOfReceipt")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Deferral Stage field in Al")
		public void user_verify_the_deferral_stage_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DeferralStage")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Def Approved By field in Al")
		public void user_verify_the_def_approved_by_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DefApprovedBy")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Change In Nature Approved By field in Al")
		public void user_verify_the_change_in_nature_approved_by_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ChangeInNatureApprovedBy")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document From field in Al")
		public void user_verify_the_document_from_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentFrom")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Quality field in Al")
		public void user_verify_the_document_quality_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentQuality")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Reference Number field in Al")
		public void user_verify_the_document_reference_number_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentReferenceNumber")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Approved By field in Al")
		public void user_verify_the_document_approved_by_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentApprovedBy")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Document Details Location Where Received field in Al")
		public void user_verify_the_document_details_location_where_received_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentDetailsLocationWhereReceived")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Rack No field in Al")
		public void user_verify_the_rack_no_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("RackNo")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Shelf No field in Al")
		public void user_verify_the_shelf_no_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ShelfNo")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Box No field in Al")
		public void user_verify_the_box_no_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("BoxNo")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Date Of Expiry field in Al")
		public void user_verify_the_date_of_expiry_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DateOfExpiry")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Lodgement Amount field in Al")
		public void user_verify_the_lodgement_amount_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("LodgementAmount")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}

		@And("User_610 verify the Remark field in Al")
		public void user_verify_the_remark_field_in_al() {
			for (int i = 0; i < 600; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
			}
		    
		}
		
		//----------------- @AT_Al_DOC_02
		
		@And("User_610 select document name in documents details screen")
		public void user_select_document_name_in_documents_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Documentname")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Pan Card")) {

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

		@And("User_610 select document status in documents details screen")
		public void user_select_document_status_in_documents_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentStatus")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Received")) {

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

		@And("User_610 select Mandatory optional in documents details screen")
		public void user_select_mandatory_optional_in_documents_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("MandatoryOptional")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Optional")) {

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

		@And("User_610 select document category in documents details screen")
		public void user_select_document_category_in_documents_details_screen() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentCategory")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Digital KYC Document")) {

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

		@And("User_610 select document quality in documents details screen")
		public void user_select_document_quality_in_documents_details_screen() throws Throwable {
			Thread.sleep(2000);
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentQuality")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Valid and Clear")) {

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

		@And("User_610 select remark in documents details screen")
		public void user_select_remark_in_documents_details_screen() throws Throwable {
			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark")));
			//javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark")).click();
			for (int i = 0; i < 600; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("RemarkText")).sendKeys("test");
					break;
					
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }Thread.sleep(3000);
		    
		}

		@And("User_610 click save and verify in documents details screen")
		public void user_click_save_and_verify_in_documents_details_screen() throws Throwable {
			
//		String scroll = "document.querySelectorAll('ion-card-content[ng-reflect-ng-switch=\"string\"]')[1]";
//		WebElement scroll1 = javascriptHelper.executeScriptWithWebElement(scroll);
//		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement("scroll1"));

		
		
			//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentsDetailsScroll")));
	//	    Thread.sleep(1000);
		    
//		    for (int b = 0; b < 300; b++) {
//				try {
//					javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("click_SaveButton_UnderFollowUp_610"))
//							.click();
//					break;
//				} catch (Exception e) {
//					if (b == 299) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
			
			javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));
			 Thread.sleep(2000);
			
			for (int i = 0; i<=500; i++) {
	         	try {
	         		if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
	             		Assert.assertTrue(true);
	         		}
	         		break;
				} catch (Exception e) {
					if(i==500) {
						Assert.fail(e.getMessage());
					}
				}

			}Thread.sleep(50000);
		}
		
		//--------------------- @AT_Al_DOC_03
		
		@And("User_610 verify the customer name field mandatory dropdown al")
		public void user_verify_the_customer_name_field_mandatory_dropdown_al() {
			// ----------------validate non mandatory field

			for (int i = 0; i < 200; i++) {
				try {
					String customerName = "document.querySelector('ion-label[ng-reflect-text=\"Customer Name.TOOLTIP\"]').innerText";
					String customerNam = (String) javascriptHelper.executeScript("return " + customerName);
					
					System.err.println("BoxNoName:"+ customerNam);
				
					Assert.assertTrue(!customerNam.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 199) {
						Assert.fail(e.getMessage());
					}
				}
						}
			
			// -------------------validate type should be dropdown  --- Select

			
			String DocumentNameFormat = javascriptHelper
					.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("CustomerName"))
					.getAttribute("ng-reflect-placeholder");
			System.err.println("first print  " + DocumentNameFormat);

			String assertDocumentNameFormat = "Select";
			Assert.assertEquals(assertDocumentNameFormat, DocumentNameFormat);

		    
		}

		@And("User_610 verify the  document name field mandatory dropdown al")
		public void user_verify_the_document_name_field_mandatory_dropdown_al() throws Throwable {
			Thread.sleep(500);
			// ----------------validate mandatory field

						for (int i = 0; i < 2000; i++) {
							try {
								String DocumentsName = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_NAME.TOOLTIP\"]').innerText";
								String DocumentsNameName2 = (String) javascriptHelper.executeScript("return " + DocumentsName);
								
								System.err.println("Documents:"+ DocumentsNameName2);
								Assert.assertTrue(DocumentsNameName2.contains("*"));
								break;
							} catch (Exception e) {
								if (i == 1999) {
									Assert.fail(e.getMessage());
								}
							}
									}
						
						// -------------------validate type should be dropdown  --- Select

						
						String DocumentNameFormat = javascriptHelper
								.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Documentname"))
								.getAttribute("ng-reflect-placeholder");
						System.err.println("first print  " + DocumentNameFormat);

						String assertDocumentNameFormat = "Select";
						Assert.assertEquals(assertDocumentNameFormat, DocumentNameFormat);
		    
		}

		@And("User_610 verify the required at stage field mandatory al")
		public void user_verify_the_required_at_stage_field_mandatory_al() {
			// ----------------validate non mandatory field

			for (int i = 0; i < 2000; i++) {
				try {
					String DocumentsName = "document.querySelector('ion-label[ng-reflect-text=\"REQUIRED_AT_STAGE.TOOLTIP\"').innerText";
					String DocumentsNameName2 = (String) javascriptHelper.executeScript("return " + DocumentsName);
					
					System.err.println("Documents:"+ DocumentsNameName2);
					Assert.assertTrue(!DocumentsNameName2.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		    
		}

		@And("User_610 verify the document status field mandatory editable dropdown al")
		public void user_verify_the_document_status_field_mandatory_editable_dropdown_al() {
			// ----------------validate mandatory field

			for (int i = 0; i < 2000; i++) {
				try {
					String DocumentStatus = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_STATUS.TOOLTIP\"').innerText";
					String DocumentStatusName = (String) javascriptHelper.executeScript("return " + DocumentStatus);
					
					System.err.println("DocumentStatus:"+ DocumentStatusName);
					Assert.assertTrue(DocumentStatusName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
			
			// -------------------validate type should be dropdown  --- Select

			
					String DocumentStatusFormat = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentStatus"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + DocumentStatusFormat);

					String assertDocumentStatusFormat = "Select";
					Assert.assertEquals(assertDocumentStatusFormat, DocumentStatusFormat);
		    
		}

		@And("User_610 verify the mandatory optional field mandatory editable dropdown al")
		public void user_verify_the_mandatory_optional_field_mandatory_editable_dropdown_al() {
			// ----------------validate mandatory field
			
			for (int i = 0; i < 2000; i++) {
				try {
					String mandatoryOptional = "document.querySelector('ion-label[ng-reflect-text=\"MANDATORY_OR_OPTIONAL.TOOLTIP\"').innerText";
					String mandatoryOptiona = (String) javascriptHelper.executeScript("return " + mandatoryOptional);
					
					System.err.println("mandatoryOptiona:"+ mandatoryOptiona);
					Assert.assertTrue(mandatoryOptiona.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
			
			// -------------------validate type should be dropdown  --- Select

			
					String mandatoryOptionaFormat = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("MandatoryOptional"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + mandatoryOptionaFormat);

					String assertmandatoryOptionaFormat = "Select";
					Assert.assertEquals(assertmandatoryOptionaFormat, mandatoryOptionaFormat);
		    
		}
		
		//--------------------- @AT_Al_DOC_04
		
		@And("User_610 verify the documents quality field mandatory al")
		public void user_verify_the_documents_quality_field_mandatory_al() throws Throwable {
			// ----------------validate mandatory field
			Thread.sleep(2000);
			for (int i = 0; i < 2000; i++) {
				try {
					String documentsQuality = "document.querySelector('ion-label[ng-reflect-text=\"Document Quality.TOOLTIP\"]').innerText";
					String documentsQualit = (String) javascriptHelper.executeScript("return " + documentsQuality);
					
					System.err.println("documentsQualit:"+ documentsQualit);
					Assert.assertTrue(documentsQualit.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		    
		}

		@And("User_610 verify the  deferred stage field non mandatory select al")
		public void user_verify_the_deferred_stage_field_non_mandatory_textbox_al() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 2000; i++) {
				try {
					String deferredStage = "document.querySelector('ion-label[ng-reflect-text=\"Deferral Stage.TOOLTIP\"').innerText";
					String deferredStag = (String) javascriptHelper.executeScript("return " + deferredStage);
					
					System.err.println("deferredStag:"+ deferredStag);
					Assert.assertTrue(!deferredStag.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
			
			// -------------------validate type should be dropdown  --- Select

			
			String deferredStageFormat = javascriptHelper
					.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DeferralStage"))
					.getAttribute("ng-reflect-placeholder");
			System.err.println("first print  " + deferredStageFormat);

			String assertdeferredStageFormat = "Select";
			Assert.assertEquals(assertdeferredStageFormat, deferredStageFormat);
			
		    
		}

		@And("User_610 verify the location where received field non mandatory select al")
		public void user_verify_the_location_where_received_field_non_mandatory_textbox_al() {
			// ----------------validate mandatory field
			for (int i = 0; i < 2000; i++) {
				try {
					String locationWhereReceived = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_DETAILS_LOCATION_WHER\"]').innerText";
					String locationWhereReceive = (String) javascriptHelper.executeScript("return " + locationWhereReceived);
					
					System.err.println("locationWhereReceive:"+ locationWhereReceive);
					Assert.assertTrue(!locationWhereReceive.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
			
			// -------------------validate type should be dropdown  --- Select

			
			String locationWhereReceivedFormat = javascriptHelper
					.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentDetailsLocationWhereReceived"))
					.getAttribute("ng-reflect-placeholder");
			System.err.println("first print  " + locationWhereReceivedFormat);

			String assertlocationWhereReceivedFormat = "Select";
			Assert.assertEquals(assertlocationWhereReceivedFormat, locationWhereReceivedFormat);
		    
		}

		@And("User_610 verify the rack number field non mandatory textbox al")
		public void user_verify_the_rack_number_field_non_mandatory_textbox_al() {
			// ----------------validate mandatory field
			for (int i = 0; i < 2000; i++) {
				try {
					String rackNumber = "document.querySelector('ion-label[ng-reflect-text=\"FORM.RACK_NUMBER.TOOLTIP\"]').innerText";
					String rackNumbe = (String) javascriptHelper.executeScript("return " + rackNumber);
					
					System.err.println("rackNumbe:"+ rackNumbe);
					Assert.assertTrue(!rackNumbe.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		    
			//type text
			
			String rackNumbertext = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("RackNo"))
					.getAttribute("type");
			System.err.println("first print  " + rackNumbertext);
			String assertrackNumbertext = "text";
			Assert.assertEquals(assertrackNumbertext, rackNumbertext);
			
		}

		@And("User_610 verify the shelf number field non mandatory textbox al")
		public void user_verify_the_shelf_number_field_non_mandatory_textbox_al() {
			// ----------------validate non mandatory field
			for (int i = 0; i < 2000; i++) {
				try {
					String shelfnumber = "document.querySelector('ion-label[ng-reflect-text=\"FORM.SHELF_NUMBER.TOOLTIP\"]').innerText";
					String shelfnumbe = (String) javascriptHelper.executeScript("return " + shelfnumber);
					
					System.err.println("shelfnumbe:"+ shelfnumbe);
					Assert.assertTrue(!shelfnumbe.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type text
		
				String shelfnumbertext = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ShelfNo"))
						.getAttribute("type");
				System.err.println("first print  " + shelfnumbertext);
				String assertshelfnumbertext = "text";
				Assert.assertEquals(assertshelfnumbertext, shelfnumbertext);
				
		}
		
		//-------------------------- @AT_Al_DOC_05
		
		@And("User_610 verify the  box number field non mandatory text al")
		public void user_verify_the_box_number_field_non_mandatory_text_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String boxnumber = "document.querySelector('ion-label[ng-reflect-text=\"FORM.BOX_NUMBER.TOOLTIP\"]').innerText";
					String boxnumbe = (String) javascriptHelper.executeScript("return " + boxnumber);
					
					System.err.println("boxnumbe:"+ boxnumbe);
					Assert.assertTrue(!boxnumbe.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type text
		
				String boxnumbertext = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("BoxNo"))
						.getAttribute("type");
				System.err.println("first print  " + boxnumbertext);
				String assertboxnumbertext = "text";
				Assert.assertEquals(assertboxnumbertext, boxnumbertext);
		    
		}

		@And("User_610 verify the document upload date field non mandatory date al")
		public void user_verify_the_document_upload_date_field_non_mandatory_date_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String uploaddate = "document.querySelector('digital-prime-date[id=\"uploadDate\"]').innerText";
					String uploaddat = (String) javascriptHelper.executeScript("return " + uploaddate);
					
					System.err.println("uploaddat:"+ uploaddat);
					Assert.assertTrue(!uploaddat.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type date
		
				String uploaddate = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("UploadDate"))
						.getTagName();
				System.err.println("first print  " + uploaddate);
				String assertuploaddate= "p-calendar";
				Assert.assertEquals(assertuploaddate, uploaddate);
		    
		}

		@And("User_610 verify the document category field mandatory select al")
		public void user_verify_the_document_category_field_mandatory_select_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String documentcategory = "document.querySelector('ion-label[ng-reflect-text=\"DOCUMENT_CATEGORY.TOOLTIP\"').innerText";
					String documentcategor = (String) javascriptHelper.executeScript("return " + documentcategory);
					
					System.err.println("documentcategor:"+ documentcategor);
					Assert.assertTrue(documentcategor.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
					 }
				      }
				
	// -------------------validate type should be dropdown  --- Select

			
			String documentcategoryFormat = javascriptHelper
					.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentCategory"))
					.getAttribute("ng-reflect-placeholder");
			System.err.println("first print  " + documentcategoryFormat);

			String assertdocumentcategoryFormat = "Select";
			Assert.assertEquals(assertdocumentcategoryFormat, documentcategoryFormat);
		}

		@And("User_610 verify the document form field non mandatory select al")
		public void user_verify_the_document_form_field_non_mandatory_select_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String DocumentFrom = "document.querySelector('ion-label[ng-reflect-text=\"Document Form.TOOLTIP\"]').innerText";
					String DocumentFro = (String) javascriptHelper.executeScript("return " + DocumentFrom);
					
					System.err.println("DocumentFro:"+ DocumentFro);
					Assert.assertTrue(!DocumentFro.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
				}
		        	}
                       }
		
		// -------------------validate type should be dropdown  --- Select

		
					String DocumentFromFormat = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentFrom"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + DocumentFromFormat);

					String assertDocumentFromFormat= "Select";
					Assert.assertEquals(assertDocumentFromFormat, DocumentFromFormat);
		
		}
		
		
		
		//------------------------- @AT_Al_DOC_06
		
		@And("User_610 verify the  expected date of receipt non mandatory date al")
		public void user_verify_the_expected_date_of_receipt_non_mandatory_date_al() throws Throwable {
			Thread.sleep(3000);
			for (int i = 0; i < 2000; i++) {
				try {
					String expecteddate = "document.querySelector('digital-prime-date[id=\"expectedDateOfReceipt\"]').innerText";
					String expecteddat = (String) javascriptHelper.executeScript("return " + expecteddate);
					
					System.err.println("expecteddat:"+ expecteddat);
					Assert.assertTrue(!expecteddat.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type date
		
				String expecteddate = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ExpectedDateOfReceipt"))
						.getTagName();
				System.err.println("first print  " + expecteddate);
				String assertexpecteddate= "p-calendar";
				Assert.assertEquals(assertexpecteddate, expecteddate);
		    
		}

		@And("User_610 verify the defferral approved by field non mandatory select al")
		public void user_verify_the_defferral_approved_by_field_non_mandatory_select_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String defferralapprovedby = "document.querySelector('ion-label[ng-reflect-text=\"DEF_APPROVED_BY.TOOLTIP\"').innerText";
					String defferralapprovedb = (String) javascriptHelper.executeScript("return " + defferralapprovedby);
					
					System.err.println("defferralapprovedb:"+ defferralapprovedb);
					Assert.assertTrue(!defferralapprovedb.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
				}
		        	}
                       }
		
		// -------------------validate type should be dropdown  --- Select

		
					String DefApprovedByFormat = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DefApprovedBy"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + DefApprovedByFormat);

					String assertDefApprovedByFormat= "Select";
					Assert.assertEquals(assertDefApprovedByFormat, DefApprovedByFormat);
		    
		}

		@And("User_610 verify the change in natural of approved by field non mandatory select al")
		public void user_verify_the_change_in_natural_of_approved_by_field_non_mandatory_select_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String changeinnaturalofapproved = "document.querySelector('ion-label[ng-reflect-text=\"Change In Nature Approved By.T\"]').innerText";
					String changeinnaturalofapprove = (String) javascriptHelper.executeScript("return " + changeinnaturalofapproved);
					
					System.err.println("changeinnaturalofapprove:"+ changeinnaturalofapprove);
					Assert.assertTrue(!changeinnaturalofapprove.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
				}
		        	}
                       }
		
		// -------------------validate type should be dropdown  --- Select

		
					String changeinnaturalofappr = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("ChangeInNatureApprovedBy"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + changeinnaturalofappr);

					String assertDocumentFromFormat= "Select";
					Assert.assertEquals(assertDocumentFromFormat, changeinnaturalofappr);
		    
		}

		@And("User_610 verify the document reference number field non mandatory text al")
		public void user_verify_the_document_reference_number_field_non_mandatory_text_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String documentreference = "document.querySelector('ion-label[ng-reflect-text=\"FORM.DOCUMENT_NUMBER.TOOLTIP\"]').innerText";
					String documentreferenc = (String) javascriptHelper.executeScript("return " + documentreference);
					
					System.err.println("documentreferenc:"+ documentreferenc);
					Assert.assertTrue(!documentreferenc.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type text
		
				String documentreferencetext = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentReferenceNumber"))
						.getAttribute("type");
				System.err.println("first print  " + documentreferencetext);
				String assertdocumentreferencetext = "text";
				Assert.assertEquals(assertdocumentreferencetext, documentreferencetext);

		    
		}

		@And("User_610 verify the  document received by field non mandatory select al")
		public void user_verify_the_document_received_by_field_non_mandatory_select_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String documentReceived = "document.querySelector('ion-label[ng-reflect-text=\"Change In Nature Approved By.T\"]').innerText";
					String documentReceive = (String) javascriptHelper.executeScript("return " + documentReceived);
					
					System.err.println("documentReceive:"+ documentReceive);
					Assert.assertTrue(!documentReceive.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
				}
		        	}
                       }
		
		// -------------------validate type should be dropdown  --- Select

		
					String documentreceivedbyselect = javascriptHelper
							.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentApprovedBy"))
							.getAttribute("ng-reflect-placeholder");
					System.err.println("first print  " + documentreceivedbyselect);

					String assertdocumentreceivedbyselect= "Select";
					Assert.assertEquals(assertdocumentreceivedbyselect, documentreceivedbyselect);
		    
		}

		@And("User_610 verify the remark date field mandatory text al")
		public void user_verify_the_remark_date_field_mandatory_text_al() {
			for (int i = 0; i < 2000; i++) {
				try {
					String remark = "document.querySelector('ion-label[ng-reflect-text=\"Remarks.TOOLTIP\"]').innerText";
					String remar = (String) javascriptHelper.executeScript("return " + remark);
					
					System.err.println("remar:"+ remar);
					Assert.assertTrue(remar.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
						}
		
		//type text
		
				String Remark = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark"))
						.getAttribute("type");
				System.err.println("first print  " + Remark);
				String assertRemark = "text";
				Assert.assertEquals(assertRemark, Remark);

		    
		}
		
		//---------------  @AT_Al_DOC_07  ---------
		
		@And("User_610 verify the blank field which is mandatory and should not allow user to save the record")
		public void user_verify_the_blank_field_which_is_mandatory_and_should_not_allow_user_to_save_the_record() throws Throwable {
			Thread.sleep(3000);
			
			
			
			for (int i = 0; i<=500; i++) {
	         	try {
	         		if (!javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("fillAllTheDetails_Popup_610")).isDisplayed()) {
	             		softAssert.fail();
	         		}
	         		break;
				} catch (Exception e) {
					if(i==500) {
						Assert.fail(e.getMessage());
					}
				}

			}
		    Thread.sleep(4000);
		}

		@And("User_610 verify the user enter numeric value in character field should not allow user to save the record")
		public void user_verify_the_user_enter_numeric_value_in_character_field_should_not_allow_user_to_save_the_record() throws Throwable {
			Thread.sleep(3000);
			String blank ="document.querySelector('digital-text-box[id=\"lodgmentAmt\"]').querySelector('ion-input').getAttribute('ng-reflect-model')";
			WebElement blankk =javascriptHelper.executeScriptWithWebElement(blank);
			
			
			
			
			for (int b = 0; b < 300; b++) {
				try {
					javascriptHelper.executeScriptWithWebElement("blankk").sendKeys("666");
					break;
				} catch (Exception e) {
					if (b == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			System.err.println("empty value : " + blankk);
		}

		@And("User_610 verify the user enter character value in numeric field should not allow user to save the record")
		public void user_verify_the_user_enter_character_value_in_numeric_field_should_not_allow_user_to_save_the_record() {
		    
		    
		}
		
		//---------------------- @AT_Al_DOC_08
		
		
		@And("User_610 verify the system should get open with already filled data")
		public void user_verify_the_system_should_get_open_with_already_filled_data() throws Throwable {
			Thread.sleep(2000);
			
			String Documentname = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Documentname"))
					.getAttribute("aria-label");		 
			System.err.println("Documentname :" + Documentname);
			
			for (int b = 0; b < 300; b++) {
				try {
					if (Documentname.isBlank()) {
						Assert.assertTrue(true);
						break;
					}
					} catch (Exception e) {
					if (b == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			String DocumentStatus = javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("DocumentStatus"))
					.getAttribute("aria-label");		 
			System.err.println("DocumentStatus :" + DocumentStatus);
			
			for (int b = 0; b < 300; b++) {
				try {
					if (DocumentStatus.isBlank()) {
						Assert.assertTrue(true);
						break;
					}
					} catch (Exception e) {
					if (b == 299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}

		@And("User_610 verify the System should allow user to modify the record")
		public void user_verify_the_system_should_allow_user_to_modify_the_record() {
			for (int i = 0; i < 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Documentname")).click();
					break;
					
				} catch (Exception e) {
					if (i==299) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
					} 
				      }
			
            //-------dropdown 
			
			
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
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
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

			//	System.out.println("Map " + testData.get("ID Type").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase("Pan Card")) {

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

		@And("User_610  verify the to do modification and same record should get saved")
		public void user_verify_the_to_do_modification_and_same_record_should_get_saved() {
		    
		    
		}

		@And("User_610 verify the any mandatory field blank and save system should not allow user to save the record al")
		public void user_verify_the_any_mandatory_field_blank_and_save_system_should_not_allow_user_to_save_the_record_al() throws Throwable {
			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark")));
			//javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("Remark")).click();
			for (int i = 0; i < 600; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(al_ADEntryDocDetails_610.getElement("RemarkText")).clear();
					break;
					
				} catch (Exception e) {
					if (i==599) {
						Assert.fail(e.getMessage());
					}
						} 
				      }Thread.sleep(3000);
		    
//			 String scroll = "document.querySelectorAll('ion-card-content[ng-reflect-ng-switch=\"string\"]')[1]";
//			 WebElement scroll1 = javascriptHelper.executeScriptWithWebElement(scroll);
			 for (int i = 0; i < 600; i++) {
					try {
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-text=\"Go Back\"]')"));
						break;
					} catch (Exception e) {
						if (i==599) {
							Assert.fail(e.getMessage());
						}
							} 
					      }
			 javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-icon=\"pi pi-save\"]')"));
			 Thread.sleep(2000);
		}

		@And("User_610 verify the  system should not allow user to do a modification with invalid data")
		public void user_verify_the_system_should_not_allow_user_to_do_a_modification_with_invalid_data() {
		    
		    
		}

		@And("User_610 verify the save button and back button")
		public void user_verify_the_save_button_and_back_button() {
		    
		    
		}
}