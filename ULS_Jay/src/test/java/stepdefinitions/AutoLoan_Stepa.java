package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	JSPaths al_ADEntry_CustomerDetails = new JSPaths(excelPath, "Al_ADEntry_CustomerDetails_610", "AutoloanADEntry_CustomerDetails", "JSPath");
	
	
	
	
	
	// ***********************************  Steps ********************************
	
	
	@And("User_610 Click Customer Details screen in Autoloan")
	public void user_click_customer_details_screen_in_autoloan() {
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
	public void user_verify_the_back_button_field_on_customer_details_screen() {
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
	public void user_verify_the_save_button_field_on_customer_details_screen() {
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
	public void user_verify_the_customer_type_field_on_customer_details_screen() {
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
	public void user_verify_the_applicant_type_field_on_customer_details_screen() {
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
	public void user_verify_the_salutation_field_on_customer_details_screen() {
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
	public void user_verify_the_first_name_field_on_customer_details_screen() {
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
	public void user_verify_the_middle_name_field_on_customer_details_screen() {
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
	public void user_verify_the_last_name_field_on_customer_details_screen() {
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
		public void user_verify_the_fathers_first_name_field_on_customer_details_screen() {
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
		public void user_verify_the_fathers_middle_name_field_on_customer_details_screen() {
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
		public void user_verify_the_fathers_last_name_field_on_customer_details_screen() {
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
		public void user_verify_the_spouse_first_name_field_on_customer_details_screen() {
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
		public void user_verify_the_spouse_middle_name_field_on_customer_details_screen() {
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
		public void user_verify_the_spouse_last_name_field_on_customer_details_screen() {
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
		public void user_verify_the_data_of_birth_field_on_customer_details_screen() {
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
		public void user_verify_the_gender_field_on_customer_details_screen() {
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
		public void user_verify_the_education_level_field_on_customer_details_screen() {
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
		public void user_verify_the_marital_status_field_on_customer_details_screen() {
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
		public void user_verify_the_nationality_field_on_customer_details_screen() {
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
		public void user_verify_the_category_field_on_customer_details_screen() {
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
		public void user_verify_the_religion_field_on_customer_details_screen() {
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
		public void user_verify_the_residential_status_field_on_customer_details_screen() {
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
		public void user_verify_the_language_field_on_customer_details_screen() {
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
		public void user_verify_the_no_of_department_field_on_customer_details_screen() {
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
		public void user_verify_the_no_of_children_field_on_customer_details_screen() {
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
		public void user_verify_the_spouse_status_field_on_customer_details_screen() {
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
		public void user_verify_the_residential_status_label_field_on_customer_details_screen() {
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
		public void user_verify_the_mother_maiden_name_field_on_customer_details_screen() {
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
		public void user_verify_the_types_of_residence_field_on_customer_details_screen() {
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
		public void user_verify_the_industry_segmentation_field_on_customer_details_screen() {
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
		public void user_verify_the_is_income_consider_field_on_customer_details_screen() {
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
		public void user_verify_the_customer_profile_field_on_customer_details_screen() {
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
		public void user_verify_the_relationship_field_on_customer_details_screen() {
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
		public void user_verify_the_political_exposed_field_on_customer_details_screen() {
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
		public void user_verify_the_block_list_field_on_customer_details_screen() {
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
		public void user_verify_the_remark_field_on_customer_details_screen() {
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
		public void user_verify_the_phone_number_field_on_customer_details_screen() {
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
		public void user_verify_the_mobile_number_primary_field_on_customer_details_screen() {
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
		public void user_verify_the_mobile_number_secondary_field_on_customer_details_screen() {
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
		public void user_verify_the_emali_field_on_customer_details_screen() {
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
		public void user_verify_the_preferred_contact_method_field_on_customer_details_screen() {
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
		public void user_verify_the_preferred_time_for_contract_field_on_customer_details_screen() {
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
		public void user_verify_the_customer_type_field_mandatory_editable_dropdown() throws Throwable {
			
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
		public void user_verify_the_applicant_type_field_mandatory_editable_textbox() {
			
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
		    
		}

		@And("User_610 verify the KYC status field non-mandatory non-editable textbox")
		public void user_verify_the_kyc_status_field_non_mandatory_non_editable_textbox() {
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
		    
		}

		@And("User_610 verify the salutation field mandatory editable dropdown")
		public void user_verify_the_salutation_field_mandatory_editable_dropdown() {
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
		    
		}

		@And("User_610 verify the First name field mandatory editable textbox")
		public void user_verify_the_first_name_field_mandatory_editable_textbox() {
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
		    
		}

	
	
}
