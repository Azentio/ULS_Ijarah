package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ijara_DataCheck_EmploymentDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert SoftAssert = new SoftAssert();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData;
	
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	ExcelData EmpDetailsTestData  = new ExcelData(excelTestDataPath,"EmpDetailsTestData"," Dataset ID");

	ExcelData EmpDetailsCom_firmTestData  = new ExcelData(excelTestDataPath,"EmpDetailsCom_firmTestData","Dataset ID");

	JSPaths EmpDetailElements = new JSPaths(excelPath, "EmpDetailElements", "EmploymentDetailsElements", "JSPath");
	
	

	@Given("User_6047 get the test data for test case ID AT_EDC_01")
	public void get_the_test_data_for_test_case_id_at_edc_01() {
		testData =  EmpDetailsTestData.getTestdata("DS01_AT_EDC_01");
	}
	@And("User_6047 get the test data for test case ID AT_EDC_04")
	public void get_the_test_data_for_test_case_id_at_edc_04() {
		testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_04");

	}


	@And("User_6047 click the Mail box in ULS application")
	public void user_click_the_mail_box_in_uls_application() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@And("User_6047 click the Search button under inbox")
	public void user_click_the_search_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	@And("User_6047 search the Ref id under inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
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
	@And("User_6047 click the Entitle button under inbox")
	public void user_click_the_entitle_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxEntitleBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	@And("User_6047 click On the Action button below Customer Employment List")
	public void user_6047_click_on_the_action_button_below_customer_employment_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBotton")).click();
				Thread.sleep(7000);
				break;
				
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}
	@And("user click the Action button for the business")
	public void user_click_the_action_button_for_the_business() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBottonUnderCusFin")).click();
			
				break;
				
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	
	@And("user verify the Primary Employment below the Employment Details")
	public void user_verify_the_primary_employment_below_the_employment_details() throws InterruptedException {
		Thread.sleep(5000);
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).isDisplayed()) {
			SoftAssert.fail("Check Primary Employment Field");
		}
	    
	}
//		WebElement PrimaryEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment"));
//		for (int i = 0; i <= 2000; i++) {
//			try {
//				Assert.assertTrue(PrimaryEmployment.isDisplayed());
//				break;
//			} catch (Exception e) {
//				if (i == 2000) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}


	@And("user verify the Employment Period below the Employment Details")

	public void user_verify_the_employment_period_below_the_employment_details() {
		WebElement EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmploymentPeriod.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user verify the Nature of Employment below the Employment Details")
	public void user_verify_the_nature_of_employment_below_the_employment_details() {
		WebElement NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(NatureOfEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user verify the Company Type below the Employment Details")
	public void user_verify_the_company_type_below_the_employment_details() {
		WebElement CompanyType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(CompanyType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Profession below the Employment Details")
	public void user_verify_the_profession_below_the_employment_details() {
		WebElement Profession = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Profession.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Profession Type below the Employment Details")
	public void user_verify_the_profession_type_below_the_employment_details() {
		WebElement ProfessionType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ProfessionType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Statutory Authority below the Employment Details")
	public void user_verify_the_statutory_authority_below_the_employment_details() {
		WebElement StatutoryAuthority = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(StatutoryAuthority.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employer Name  below the Employment Details")
	public void user_verify_the_employer_name_below_the_employment_details() {
		WebElement EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployerName.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employer Name If \\(Others) below the Employment Details")
	public void user_verify_the_employer_name_if_others_below_the_employment_details() {
		WebElement EmployerNameIf = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployerNameIf.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employee Id below the Employment Details")
	public void user_verify_the_employee_id_below_the_employment_details() {
		WebElement EmployeeId = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployeeId.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Date Of Joining below the Employment Details")
	public void user_verify_the_date_of_joining_below_the_employment_details() {
		WebElement DateOfJoining = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DateOfJoining.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employment End Date below the Employment Details")
	public void user_verify_the_employment_end_date_below_the_employment_details() {
		WebElement EmploymentEndDate = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmploymentEndDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Department below the Employment Details")
	public void user_verify_the_department_below_the_employment_details() {
		WebElement Department = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Department.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Designation below the Employment Details")
	public void user_verify_the_designation_below_the_employment_details() {
		WebElement Designation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Designation.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employment Type below the Employment Details")
	public void user_verify_the_employment_type_below_the_employment_details() {
		WebElement EmploymentType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmploymentType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Direct Manager Contact Number Extension below the Employment Details")
	public void user_verify_the_direct_manager_contact_number_below_the_employment_details() {
		WebElement DirectManagerContactNumberExtension = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DirectManagerContactNumberExtension.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Direct Manager Phone Number below the Employment Details")
	public void user_verify_the_extension_below_the_employment_details() {
		WebElement DirectManagerPhoneNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DirectManagerPhoneNumber.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Income Paymode below the Employment Details")
	public void user_verify_the_direct_manager_phone_number_below_the_employment_details() {
		WebElement IncomePaymode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(IncomePaymode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify Employer Phone Extension below the Employment Details")
	public void user_verify_employer_phone_extension_below_the_employment_details() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")));
		WebElement EmployerPhoneExtension = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployerPhoneExtension.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employer Phone Number below the Employment Details")
	public void user_verify_the_employer_phone_number_below_the_employment_details() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber")));
		WebElement EmployerPhoneNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployerPhoneNumber.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user verify the State below the Employment Details")
	public void user_verify_the__below_the_employment_details() {
		WebElement State = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(State.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the City below the Employment Details")
	public void user_verify_the_city_below_the_employment_details() {
		WebElement City = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("City"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(City.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	

	@And("user verify the Pin code below the Employment Details")
	public void user_verify_the_pin_code_below_the_employment_details() {
		WebElement PinCode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(PinCode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Sector below the Employment Details")
	public void user_verify_the_sector_below_the_employment_details() {
		WebElement Sector = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Sector"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Sector.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Industry Sub Sector below the Employment Details")
	public void user_verify_the_industry_sub_sector_below_the_employment_details() {
		WebElement IndustrySubSector = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IndustrySubSector"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(IndustrySubSector.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the No Of Partners  below the Employment Details")
	public void user_verify_the_no_of_partners_below_the_employment_details() {
		WebElement NumberOfPartners = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(NumberOfPartners.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Nature OF Business below the Employment Details")
	public void user_verify_the_nature_of_business_below_the_employment_details() {
		WebElement NatureOfBusiness = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(NatureOfBusiness.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Registered Business Name below the Employment Details")
	public void user_verify_the_registered_business_name_below_the_employment_details() {
		WebElement RegisteredBusinessName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RegisteredBusinessName.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Registered Business Numbe below the Employment Details")
	public void user_verify_the_registered_business_numbe_below_the_employment_details() {
		WebElement RegisteredBusinessNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RegisteredBusinessNumber.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Business Registration Date below the Employment Details")
	public void user_verify_the_business_registration_date_below_the_employment_details() {
		WebElement BusinessRegisterationDate = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(BusinessRegisterationDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Office Premises Type below the Employment Details")
	public void user_verify_the_office_premises_type_below_the_employment_details() {
		WebElement OficessPremisesType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(OficessPremisesType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Share Holder Percentage below the Employment Details")
	public void user_verify_the_share_holder_percentage_below_the_employment_details() {
		WebElement ShareHolderPercentage = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ShareHolderPercentage.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the No Of Employees below the Employment Details")
	public void user_verify_the_no_of_employees_below_the_employment_details() {
		WebElement NoOfEmployees = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(NoOfEmployees.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Total Experience below the Employment Details")
	public void user_verify_the_total_experience_years_below_the_employment_details() {
		WebElement TotalExperience = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(TotalExperience.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Experience At Current Employment below the Employment Details")
	public void user_verify_the_experience_at_current_employment_below_the_employment_details() {
		WebElement ExperienceAtCurrentEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ExperienceAtCurrentEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Direct Manager below the Employment Details")
	public void user_verify_the_direct_manager_below_the_employment_details() {
		WebElement DirectManager = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DirectManager.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Employer City Code below the Employment Details")
	public void user_verify_the_employer_city_code_below_the_employment_details() {
		WebElement EmployerCityCode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(EmployerCityCode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Retirement Age below the Employment Details")
	public void user_verify_the_retirement_age_years_below_the_employment_details() {
		WebElement RetirementAge = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RetirementAge.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user verify the Remarks below the Employment Details")
	public void user_verify_the_remarks_below_the_employment_details() {
		WebElement Remarks = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Remarks.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user validate the Employment Period Validation below  the Employment Details")
	public void user_validate_the_employment_period_validation_the_employment_details() {
		String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(EmploymentPeriod.contains("Current"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Nature Of Employment Validation below  the Employment Details")
	public void user_validate_the_nature_of_employment_validation_the_employment_details() {
		String NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(NatureOfEmployment.contains("Business"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Employer Name If Validation below  the Employment Details")
	public void user_validate_the_employer_name_if_validation_the_employment_details() {
		String EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(EmployerName.contains("Test"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Employee Id Validation below the Employment Details")
	public void user_validate_the_employee_id_validation_the_employment_details() {
		String EmployeeId = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(EmployeeId.contains("0288"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Date Of Joining Validation below the Employment Details")
	public void user_validate_the_date_of_joining_validation_the_employment_details() {
		String DateOfJoiningValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(DateOfJoiningValidation.contains("31"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Employment Type Validation below  the Employment Details")
	public void user_validate_the_employment_type_validation_the_employment_details() {
		String EmploymentTypeValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("aria-label");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(EmploymentTypeValidation.contains("PERMANENT"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }}

	@And("user validate the Share HOlder Percentage Validation below  the Employment Details")
	public void user_validate_the_share_h_older_percentage_validation_the_employment_details() {
		String ShareHOlderPercentage = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(ShareHOlderPercentage.contains("5"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Total Experience Validation below the Employment Details")
	public void user_validate_the_total_experience_validation_the_employment_details() {
		String TotalExperienceValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(TotalExperienceValidation.contains("2"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@And("user validate the Retirement Age Validation below the Employment Details")
	public void user_validate_the_retirement_age_validation_the_employment_details() {
		String RetirementAge = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAgeValidation")).getAttribute("ng-reflect-model");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(RetirementAge.contains("60"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	@And("user verify the back button below the Employment Details")
	public void user_verify_the_back_button_below_the_employment_details() {
		
    WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");

					for (int i = 0; i <= 1000; i++) {

						try {

							javascriptHelper.scrollIntoView(pageTop);

							break;

						} catch (Exception e) {

							if (i == 1000) {

								Assert.fail(e.getMessage());

							}

						}

					}


					for (int i = 0; i <= 1000; i++) {

						try {

							javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BackButton")).click();

							break;

						} catch (Exception e) {

							if (i == 1000) {

								Assert.fail(e.getMessage());

							}

						}

					}

				}
	
	@And("user verify the primary Employment Default Vale As Yes below the Employment Details")
	public void user_verify_the_primary_employment_default_vale_as_yes_below_the_employment_details() {
		String PrimaryEmploymentDefaultValueCheck = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmploymentDefaultValueCheck")).getAttribute("value");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(PrimaryEmploymentDefaultValueCheck.contains("on"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	    
	}

	

	@And("user click the Action button for the Company\\/Firm")
	public void user_click_the_action_button_for_the_company_firm() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Company/firm")).click();
			
				break;
				
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("user verify the Nature of Employment below the Employment Details in CF")
	public void user_verify_the_nature_of_employment_below_the_employment_details_in_cf() {
       if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
    	   SoftAssert.fail("Check Nature of Employment Field");
			}
		  
	}

	@And("user verify the Company Type below the Employment Details in CF")
	public void user_verify_the_company_type_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).isDisplayed()) {
			SoftAssert.fail("Check Company Type Field");
		}
	  
	}

	@And("user verify the Profession below the Employment Details in CF")
	public void user_verify_the_profession_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).isDisplayed()) {
			SoftAssert.fail("Check the Profession Field");
		}
	  
	}

	@And("user verify the Profession Type below the Employment Details in CF")
	public void user_verify_the_profession_type_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).isDisplayed()) {
			SoftAssert.fail("Check the Profession Type Field");
		}
	}

	@And("user verify the Statutory Authority below the Employment Details in CF")
	public void user_verify_the_statutory_authority_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).isDisplayed()) {
			SoftAssert.fail("Check the Statutory Authority Field");
		}
	}

	@And("user verify the Employment End Date below the Employment Details in CF")
	public void user_verify_the_employment_end_date_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
			SoftAssert.fail("Check the Employment End Date Field");
		}
	}

	@And("user verify Employer Phone Extension below the Employment Details in CF")
	public void user_verify_employer_phone_extension_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Extension Field");
		}
	}

	@And("user verify the No Of Partners  below the Employment Details in CF")
	public void user_verify_the_no_of_partners_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).isDisplayed()) {
			SoftAssert.fail("Check the No Of Partners Field");
		}
	}

	@And("user verify the Nature OF Business below the Employment Details in CF")
	public void user_verify_the_nature_of_business_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).isDisplayed()) {
			SoftAssert.fail("Check the Nature OF Business Field");
		}
	}

	@And("user verify the Registered Business Name below the Employment Details in CF")
	public void user_verify_the_registered_business_name_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).isDisplayed()) {
			SoftAssert.fail("Check the Registered Business Name Field");
		}
	}

	@And("user verify the Registered Business Numbe below the Employment Details in CF")
	public void user_verify_the_registered_business_numbe_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Registered Business Numbe Field");
		}
	}

	@And("user verify the Business Registration Date below the Employment Details in CF")
	public void user_verify_the_business_registration_date_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).isDisplayed()) {
			SoftAssert.fail("Check the Business Registration Date Field");
		}
	}

	@And("user verify the Office Premises Type below the Employment Details in CF")
	public void user_verify_the_office_premises_type_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).isDisplayed()) {
			SoftAssert.fail("Check the Office Premises Type Field");
		}
	}

	@And("user verify the Share Holder Percentage below the Employment Details in CF")
	public void user_verify_the_share_holder_percentage_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage")).isDisplayed()) {
			SoftAssert.fail("Check the Share Holder Percentage Field");
		}
	}

	@And("user verify the No Of Employees below the Employment Details in CF")
	public void user_verify_the_no_of_employees_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).isDisplayed()) {
			SoftAssert.fail("Check the No Of Employees Field");
		}
	}

	@And("user verify the Remarks below the Employment Details in CF")
	public void user_verify_the_remarks_below_the_employment_details_in_cf() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
			SoftAssert.fail("Check the Remarks Field");
		}
	}

	@Given("User_6047 Get the test data for test case ID AT_EDC_05")
	public void Get_the_test_data_for_test_case_id_at_edc_05() {
	  testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_05");
	}

	@And("user click the Action button for the Pensioner")
	public void user_click_the_action_button_for_the_pensioner() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Pensioner")).click();
			
				break;
				
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("user verify the Employment Period in Pensioner below the Employment Details")
	public void user_verify_the_employment_period_in_pensioner_below_the_employment_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod")));
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod")).isDisplayed()) {
			SoftAssert.fail("Check the Employment Period Field");
		}
	}

	@And("user verify the Nature of Employment in Pensioner below the Employment Details")
	public void user_verify_the_nature_of_employment_in_pensioner_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
			SoftAssert.fail("Check Nature of Employment Field");
		}
	}

	@And("user verify the Employer Name in Pensioner below the Emp Details")
	public void user_verify_the_employment_name_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).isDisplayed()) {
			SoftAssert.fail("Check Employer Name Field");
		}
	}

	@And("user verify the Employer Name If in Pensioner below the Emp Details")
	public void user_verify_the_employment_name_if_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).isDisplayed()) {
			SoftAssert.fail("Check Employer Name If Field");
		}
	}

	@And("user verify the Employee Id in Pensioner below the Emp Details")
	public void user_verify_the_employee_id_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).isDisplayed()) {
			SoftAssert.fail("Check Employee Id Field");
		}
	
	}

	@And("user verify the Date Of Joining in Pensioner below the Emp Details")
	public void user_verify_the_date_of_joining_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).isDisplayed()) {
			SoftAssert.fail("Check Date Of Joining Field");
		}
	
	}

	@And("user verify the Employment End Date in Pensioner below the Emp Details")
	public void user_verify_the_employment_end_date_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
			SoftAssert.fail("Check Employment End Date Field");
		}
	}

	@And("user verify the Department in Pensioner below the Emp Details")
	public void user_verify_the_department_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).isDisplayed()) {
			SoftAssert.fail("Check Department Field");
		}
	}

	@And("user verify the Designation in Pensioner below the Emp Details")
	public void user_verify_the_designation_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).isDisplayed()) {
			SoftAssert.fail("Check Designation Field");
		}
	}

	@And("user verify the Employment Type in Pensioner below the Emp Details")
	public void user_verify_the_employment_type_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).isDisplayed()) {
			SoftAssert.fail("Check The Employment Type Field");
		}
	}

	@And("user verify the Direct Manager Contact Number Extension in Pensioner below the Emp Details")
	public void user_verify_the_direct_manager_contact_number_extension_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
		}
	}

	@And("user verify the Direct Manager Phone Number in Pensioner below the Emp Details")
	public void user_verify_the_direct_manager_phone_number_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Phone Number Field");
		}
	}

	@And("user verify the Income Paymode in Pensioner below the Emp Details")
	public void user_verify_the_income_paymode_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
			SoftAssert.fail("Check Income Paymode Field");
		}
	}

	@And("user verify Employer Phone Extension in Pensioner below the Emp Details")
	public void user_verify_employer_phone_extension_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Extension Field");
		}
	}

	@And("user verify the Employer Phone Number in Pensioner below the Emp Details")
	public void user_verify_the_employer_phone_number_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Number Field");
		}
	}

	@And("user verify the State in Pensioner below the Emp Details")
	public void user_verify_the_state_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State")).isDisplayed()) {
			SoftAssert.fail("Check the State Field");
		}
	}

	@And("user verify the Pin code in Pensioner below the Emp Details")
	public void user_verify_the_pin_code_in_pensioner_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode")).isDisplayed()) {
			SoftAssert.fail("Check Pin code Field");
		}
	}

	@And("user verify the Total Experience in Pensioner below the Emp Details")
	public void user_verify_the_total_experience_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).isDisplayed()) {
			SoftAssert.fail("Check the Total Experience Field");
		}
	}

	@And("user verify the Experience At Current Employment in Pensioner below the Emp Details")
	public void user_verify_the_experience_at_current_employment_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment")).isDisplayed()) {
			SoftAssert.fail("Check the Experience At Current Employment Field");
		}
	}

	@And("user verify the Direct Manager in Pensioner below the Emp Details")
	public void user_verify_the_direct_manager_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Field");
		}
	}

	@And("user verify the Employer City Code in Pensioner below the Emp Details")
	public void user_verify_the_employer_city_code_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode")).isDisplayed()) {
			SoftAssert.fail("Check the Employer City Code Field");
		}
	}

	@And("user verify the Retirement Age in Pensioner below the Emp Details")
	public void user_verify_the_retirement_age_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge")).isDisplayed()) {
			SoftAssert.fail("Check the Retirement Age Field");
		}
	}

	@And("user verify the Remarks in Pensioner below the Emp Details")
	public void user_verify_the_remarks_in_pensioner_below_the_emp_details() {
		if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
			SoftAssert.fail("Check the Remarks Field");
		}
	}
    
	
	@Then("User_6047 Get the test data for test case ID AT_EDC_09")
	public void get_the_test_data_for_test_case_id_at_edc_09() {
		  testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_09");
	}
 	@Given("user click the Action button for the Self-employed")
		public void user_click_the_action_button_for_the_self_employed() {
     		for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Self-employed")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		}
 	@Then("user verify the Nature of Employment in Self-employed below the Employment Details")
	public void user_verify_the_nature_of_employment_in_self_employed_below_the_employment_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")));
		 if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
				SoftAssert.fail("Check Nature of Employment Field");
			}
	}

	@Then("user verify the Company Type in Self-employed below the Employment Details")
	public void user_verify_the_company_type_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).isDisplayed()) {
			SoftAssert.fail("Check Company Type Field");
		}
	}

	@Then("user verify the Profession in Self-employedbelow the Employment Details")
	public void user_verify_the_profession_in_self_employedbelow_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).isDisplayed()) {
			SoftAssert.fail("Check the Profession Field");
		}
	}

	@Then("user verify the Profession Type in Self-employed below the Employment Details")
	public void user_verify_the_profession_type_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).isDisplayed()) {
			SoftAssert.fail("Check the Profession Type Field");
		}
	}

	@Then("user verify the Statutory Authority in Self-employed below the Employment Details")
	public void user_verify_the_statutory_authority_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).isDisplayed()) {
			SoftAssert.fail("Check the Statutory Authority Field");
		}
	}

	@Then("user verify the Employment End Date in Self-employed below the Employment Details")
	public void user_verify_the_employment_end_date_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
			SoftAssert.fail("Check the Employment End Date Field");
		}
	}

	@Then("user verify the Income Paymode in Self-employed below the Employment Details")
	public void user_verify_the_income_paymode_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
			SoftAssert.fail("Check Income Paymode Field");
		}
	}

	@Then("user verify Employer Phone Extension in Self-employed below the Employment Details")
	public void user_verify_employer_phone_extension_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Extension Field");
		}
	}

	@Then("user verify the No Of Partners in Self-employed  below the Employment Details")
	public void user_verify_the_no_of_partners_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).isDisplayed()) {
			SoftAssert.fail("Check the No Of Partners Field");
		}
	}

	@Then("user verify the Nature OF Business in Self-employed below the Employment Details")
	public void user_verify_the_nature_of_business_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).isDisplayed()) {
			SoftAssert.fail("Check the Nature OF Business Field");
		}
	}

	@Then("user verify the Registered Business Name in Self-employed Name below the Employment Details")
	public void user_verify_the_registered_business_in_self_employed_name_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).isDisplayed()) {
			SoftAssert.fail("Check the Registered Business Name Field");
		}
	}

	@Then("user verify the Registered Business Number in Self-employed below the Employment Details")
	public void user_verify_the_registered_business_number_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Registered Business Numbe Field");
		}
	}

	@Then("user verify the Business Registration Date in Self-employed below the Employment Details")
	public void user_verify_the_business_registration_date_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).isDisplayed()) {
			SoftAssert.fail("Check the Business Registration Date Field");
		}
	}

	@Then("user verify the Office Premises Type in Self-employed below the Employment Details")
	public void user_verify_the_office_premises_type_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).isDisplayed()) {
			SoftAssert.fail("Check the Office Premises Type Field");
		}
	}

	@Then("user verify the Share Holder Percentage in Self-employed below the Employment Details")
	public void user_verify_the_share_holder_percentage_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage")).isDisplayed()) {
			SoftAssert.fail("Check the Share Holder Percentage Field");
		}
	}

	@Then("user verify the No Of Employees in Self-employed below the Employment Details")
	public void user_verify_the_no_of_employees_in_self_employed_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).isDisplayed()) {
			SoftAssert.fail("Check the No Of Employees Field");
		}
	}

	
	@Then("user verify the Remarks in Self-employed below the Emp Details")
	public void user_verify_the_remarks_in_self_employed_below_the_emp_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
			SoftAssert.fail("Check the Remarks Field");
		}
	}

	@Then("User_6047 Get the test data for test case ID AT_EDC_07")
	public void user_get_the_test_data_for_test_case_id_at_edc() {
		 testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_07");
	}
	@And("User_6047 click the Action button for the Salaried")
	public void user_6047_click_the_action_button_for_the_salaried() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Salaried")).click();
			
				break;
				
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Nature of Employment in Salaried below the Employment Details")
	public void user_6047_verify_the_nature_of_employment_in_self_employed_below_the_employment_details() {
		  if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
				SoftAssert.fail("Check Nature of Employment Field");
			}
		  
	}

	@Then("User_6047 verify the Employer Name in Salaried below the Employment Details")
	public void user_6047_verify_the_employer_name_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).isDisplayed()) {
			SoftAssert.fail("Check Employer Name Field");
		}
	}

	@Then("User_6047 verify the Employer Name If \\(Others) in Salaried below the Employment Details")
	public void user_6047_verify_the_employer_name_if_others_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).isDisplayed()) {
			SoftAssert.fail("Check Employer Name If Field");
		}
	}

	@Then("User_6047 verify the Employee Id in Salaried below the Employment Details")
	public void user_6047_verify_the_employee_id_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).isDisplayed()) {
			SoftAssert.fail("Check Employee Id Field");
		}
	}

	@Then("User_6047 verify the Date Of Joining in Salaried below the Employment Details")
	public void user_6047_verify_the_date_of_joining_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).isDisplayed()) {
			SoftAssert.fail("Check Date Of Joining Field");
		}
	}
	@Then("User_6047 verify the Employment End Date in Salaried below the Employment Details")
	public void user_6047_verify_the_employment_end_date_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
			SoftAssert.fail("Check Employment End Date Field");
		}
	}

	@Then("User_6047 verify the Department in Salaried below the Employment Details")
	public void user_6047_verify_the_department_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).isDisplayed()) {
			SoftAssert.fail("Check Department Field");
		}
	}

	@Then("User_6047 verify the Designation in Salaried below the Employment Details")
	public void user_6047_verify_the_designation_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).isDisplayed()) {
			SoftAssert.fail("Check Designation Field");
		}
	}

	@Then("User_6047 verify the Employment Type in Salaried below the Employment Details")
	public void user_6047_verify_the_employment_type_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).isDisplayed()) {
			SoftAssert.fail("Check The Employment Type Field");
		}
	}

	@Then("User_6047 verify the Direct Manager Contact Number Extension in Salaried below the Employment Details")
	public void user_6047_verify_the_direct_manager_contact_number_extension_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
		}
	}

	@Then("User_6047 verify the Direct Manager Phone Number in Salaried below the Employment Details")
	public void user_6047_verify_the_direct_manager_phone_number_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Phone Number Field");
		}
	}

	@Then("User_6047 verify the Income Paymode in Salaried below the Employment Details")
	public void user_6047_verify_the_income_paymode_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
			SoftAssert.fail("Check Income Paymode Field");
		}
	}

	@Then("User_6047 verify Employer Phone Extension in Salaried below the Employment Details")
	public void user_6047_verify_employer_phone_extension_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Extension Field");
		}
	}

	@Then("User_6047 verify the Employer Phone Number in Salaried below the Employment Details")
	public void user_6047_verify_the_employer_phone_number_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber")).isDisplayed()) {
			SoftAssert.fail("Check the Employer Phone Number Field");
		}
	}

	@Then("User_6047 verify the State in Salaried below the Employment Details")
	public void user_6047_verify_the_state_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State")).isDisplayed()) {
			SoftAssert.fail("Check the State Field");
		}
	}

	@Then("User_6047 verify the Pin code in Salaried below the Employment Details")
	public void user_6047_verify_the_pin_code_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode")).isDisplayed()) {
			SoftAssert.fail("Check Pin code Field");
		}
	}

	@Then("User_6047 verify the Total Experience in Salaried below the Employment Details")
	public void user_6047_verify_the_total_experience_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).isDisplayed()) {
			SoftAssert.fail("Check the Total Experience Field");
		}
	}

	@Then("User_6047 verify the Experience At Current Employment in Salaried below the Employment Details")
	public void user_6047_verify_the_experience_at_current_employment_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment")).isDisplayed()) {
			SoftAssert.fail("Check the Experience At Current Employment Field");
		}
	}

	@Then("User_6047 verify the Direct Manager in Salaried below the Employment Details")
	public void user_6047_verify_the_direct_manager_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
			SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
		}
	}

	@Then("User_6047 verify the Employer City Code in Salaried below the Employment Details")
	public void user_6047_verify_the_employer_city_code_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode")).isDisplayed()) {
			SoftAssert.fail("Check the Employer City Code Field");
		}
	}

	@Then("User_6047 verify the Retirement Age in Salaried below the Employment Details")
	public void user_6047_verify_the_retirement_age_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge")).isDisplayed()) {
			SoftAssert.fail("Check the Retirement Age Field");
		}
	}

	@Then("User_6047 verify the Remarks in Salaried below the Employment Details")
	public void user_6047_verify_the_remarks_below_the_employment_details() {
		if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
			SoftAssert.fail("Check the Remarks Field");
		}
	}

	@Then("User_6047 To check the Primary Employment field should be Toggle")
public void user_to_check_the_primary_employment_field_should_be_toggle() {
String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("role");

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmploymentPeriod.contains("switch")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Primary Employment field should be Non-Mandatory")
public void user_to_check_the_primary_employment_field_should_be_non_mandatory() {
String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue(!(EmploymentPeriod.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Primary Employment field should be display only")
public void user_to_check_the_primary_employment_field_should_be_display_only() {
String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("ng-reflect-is-disabled");

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmploymentPeriod.contains("true")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}




@Then("User_6047 To check the Employment Period field should be Drop Down")
public void user_to_check_the_employment_period_field_should_be_drop_down() {
String EmploymentPeriod= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-haspopup");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmploymentPeriod.contains("listbox"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}



@Then("User_6047 To check the Employment Period field should be Mandatory")
public void user_to_check_the_employment_period_field_should_be_mandatory() {
String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmploymentPeriod.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Employment Period field should be display only")
public void user_to_check_the_employment_period_field_should_be_display_only() {
String EmploymentPeriod= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-disabled");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmploymentPeriod.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Nature of employment field should be Drop Down")
public void user_to_check_the_nature_of_employment_field_should_be_drop_down() {
String NatureOfEmployment= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-haspopup");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(NatureOfEmployment.contains("listbox"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Nature of employment field should be Mandatory")
public void user_to_check_the_nature_of_employment_field_should_be_mandatory() {
String NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((NatureOfEmployment.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Nature of employment field should be display only")
public void user_to_check_the_nature_of_employment_field_should_be_display_only() {
String NatureOfEmployment= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-disabled");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(NatureOfEmployment.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Employer Name field should be Drop Down")
public void user_to_check_the_employer_name_field_should_be_drop_down() {
String EmployerName= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName_Check")).getAttribute("aria-haspopup");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmployerName.contains("listbox"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}
//tdw
@Then("User_6047 To check the Employer Name field should be Non-Mandatory")
public void user_to_check_the_employer_name_field_should_be_non_mandatory() {
String EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue(!(EmployerName.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Employer Name field should be display only")
public void user_to_check_the_employer_name_field_should_be_display_only() {
String EmployerName= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName_Check")).getAttribute("aria-disabled");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmployerName.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Employer Name if field should be textbox")
public void user_to_check_the_employer_name_if_field_should_be_textbox() {
String EmployerNameIf_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmployerNameIf_textBox.contains("text")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}
//tdw
@Then("User_6047 To check the Employer Name if field should be Mandatory")
public void user_to_check_the_employer_name_if_field_should_be_mandatory() {
String EmployerNameIf = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmployerNameIf.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Employer Name if field should be display only")
public void user_to_check_the_employer_name_if_field_should_be_display_only() {
String EmployerNameIf= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmployerNameIf.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}


@Then("User_6047 To check the Employee ID field should be textbox")
public void user_to_check_the_employee_id_field_should_be_textbox() {
String EmployeeId_text = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmployeeId_text.contains("text")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Employee ID field should be Mandatory")
public void user_to_check_the_employee_id_field_should_be_mandatory() {
String EmployeeID = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).getText();

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((EmployeeID.contains("*")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Employee ID field should be display only")
public void user_to_check_the_employee_id_field_should_be_display_only() {
	String EmployeeID= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployeeID.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Date of Joining field should be date")
public void user_to_check_the_date_of_joining_field_should_be_date() {
String DateOfJoining_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-model");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(DateOfJoining_As_Date.contains("Tue Jan 31 2023 05:30:00 GMT+0"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Date of Joining should be Mandatory")
public void user_to_check_the_date_of_joining_should_be_mandatory() {
String DateofJoining_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).getAttribute("ng-reflect-required");

for (int i = 0; i <2000; i++) {

  try {
      Assert.assertTrue((DateofJoining_As_Mandy.contains("true")));
      break;
  } catch (Exception e) {
      if (i==1999) {
          Assert.fail(e.getMessage());
      }
  }
}
}

@Then("User_6047 To check the Date of Joining should be display only")
public void user_to_check_the_date_of_joining_should_be_display_only() {
String DateofJoining_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(DateofJoining_As_displayOnly.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Employment End date field should be date")
public void user_to_check_the_employment_end_date_field_should_be_date() {
String EmploymentEndDate_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-date-format");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmploymentEndDate_As_Date.contains("dd-M-yy"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Employment End date should be Non-Mandatory")
public void user_to_check_the_employment_end_date_should_be_non_mandatory() {
 String EmploymentEndDate_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(EmploymentEndDate_As_Mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employment End date should be display only")
public void user_to_check_the_employment_end_date_should_be_display_only() {
String EmploymentEndDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
    try {
        Assert.assertTrue(EmploymentEndDate_As_displayOnly.contains("true"));
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}

@Then("User_6047 To check the Department field should be Drop Down")
public void user_to_check_the_department_field_should_be_drop_down() {
String Department_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department_Check")).getAttribute("aria-haspopup");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(Department_DropDown.contains("listbox"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Department field should be Non-Mandatory")
public void user_to_check_the_department_field_should_be_non_mandatory() {
String Department_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(Department_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Department field should be display only")
public void user_to_check_the_department_field_should_be_display_only() {
String Department_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department_Check")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(Department_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Designation field should be Drop Down")
public void user_to_check_the_designation_field_should_be_drop_down() {
String Designation_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation_Check")).getAttribute("ng-reflect-placeholder");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(Designation_DropDown.contains("Select"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Designation field should be Non-Mandatory")
public void user_to_check_the_designation_field_should_be_non_mandatory() {
String Designation_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(Designation_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Designation field should be display only")
public void user_to_check_the_designation_field_should_be_display_only() {
String Designation_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation_Check")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(Designation_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employment Type field should be Drop Down")
public void user_to_check_the_employment_type_field_should_be_drop_down() {
String EmploymentType_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("ng-reflect-placeholder");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(EmploymentType_DropDown.contains("Select"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employment Type field should be Mandatory")
public void user_to_check_the_employment_type_field_should_be_mandatory() {
String EmploymentType_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((EmploymentType_As_Mandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employment Type field should be display only")
public void user_to_check_the_employment_type_field_should_be_display_only() {
String EmploymentType_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(EmploymentType_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Contact No field should be textbox")
public void user_to_check_the_direct_manager_contact_no_field_should_be_textbox() {
String DirectManagerContactNo = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumExten_Check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((DirectManagerContactNo.contains("num")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Contact No field should be Non-Mandatory")
public void user_to_check_the_direct_manager_contact_no_field_should_be_non_mandatory() {
String DirectManagerContactNo = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(DirectManagerContactNo.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Contact No field should be display only")
public void user_to_check_the_direct_manager_contact_no_field_should_be_display_only() {
String DirectManagerContactNo= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumExten_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(DirectManagerContactNo.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Phone No field should be textbox")
public void user_to_check_the_direct_manager_phone_no_field_should_be_textbox() {
String DirectManagerPhoneNo_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNum_check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((DirectManagerPhoneNo_textBox.contains("text")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Phone No field should be Non-Mandatory")
public void user_to_check_the_direct_manager_phone_no_field_should_be_non_mandatory() {
String DirectManagerPhoneNo_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(DirectManagerPhoneNo_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager Phone No field should be display only")
public void user_to_check_the_direct_manager_phone_no_field_should_be_display_only() {
String DirectManagerPhoneNo_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNum_check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(DirectManagerPhoneNo_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager field should be textbox")
public void user_to_check_the_direct_manager_field_should_be_textbox() {
String DirectManager_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager_Check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((DirectManager_textBox.contains("text")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager field should be Non-Mandatory")
public void user_to_check_the_direct_manager_field_should_be_non_mandatory() {
String DirectManager_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(DirectManager_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Direct Manager field should be display only")
public void user_to_check_the_direct_manager_field_should_be_display_only() {
String DirectManager_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(DirectManager_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Number field should be textbox")
public void user_to_check_the_employer_phone_number_field_should_be_textbox() {
String EmployerPhNum_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNum_Check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((EmployerPhNum_textBox.contains("text")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Number field should be Non-Mandatory")
public void user_to_check_the_employer_phone_number_field_should_be_non_mandatory() {
String EmployerPhNum_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(EmployerPhNum_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Number field should be display only")
public void user_to_check_the_employer_phone_number_field_should_be_display_only() {
String EmployerPhNum_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNum_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(EmployerPhNum_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer City Code field should be textbox")
public void user_to_check_the_employer_city_code_field_should_be_textbox() {
String EmployerCityCode_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode_Check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((EmployerCityCode_textBox.contains("text")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer City Code field should be Non-Mandatory")
public void user_to_check_the_employer_city_code_field_should_be_non_mandatory() {
String EmployerCityCode_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(EmployerCityCode_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer City Code field should be display only")
public void user_to_check_the_employer_city_code_field_should_be_display_only() {
String EmployerCityCode_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(EmployerCityCode_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Extension field should be textbox")
public void user_to_check_the_employer_phone_extension_field_should_be_textbox() {
String EmployerPhExt_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((EmployerPhExt_textBox.contains("number")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Extension field should be Non-Mandatory")
public void user_to_check_the_employer_phone_extension_field_should_be_non_mandatory() {
String EmployerPhExt_NonMandy  = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).getAttribute("ng-reflect-required");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((EmployerPhExt_NonMandy.contains("false")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Employer Phone Extension field should be display only")
public void user_to_check_the_employer_phone_extension_field_should_be_display_only() {
String EmployerPhExt_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(EmployerPhExt_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Total Experience field should be Field should be dropdown")
public void user_to_check_the_total_experience_field_should_be_field_should_be_dropdown() {
String TotalExpe_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-type");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((TotalExpe_textBox.contains("num")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Total Experience field should be Non-Mandatory")
public void user_to_check_the_total_experience_field_should_be_non_mandatory() {
String TotalExpe_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(TotalExpe_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Total Experience field should be display only")
public void user_to_check_the_total_experience_field_should_be_display_only() {
String TotalExpe_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(TotalExpe_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Income Paymode field should be Field should be dropdown")
public void user_to_check_the_income_paymode_field_should_be_field_should_be_dropdown() {
String IncomePaymode_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode_Check")).getAttribute("ng-reflect-placeholder");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(IncomePaymode_DropDown.contains("Select"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Income Paymode field should be Non-Mandatory")
public void user_to_check_the_income_paymode_field_should_be_non_mandatory() {
String IncomePaymode_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(IncomePaymode_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Income Paymode field should be display only")
public void user_to_check_the_income_paymode_field_should_be_display_only() {
String IncomePaymode_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode_Check")).getAttribute("ng-reflect-is-disabled");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(IncomePaymode_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}
}

@Then("User_6047 To check the Remarks field should be Field should be Text box,Non-Mandatory and display only")
public void user_to_check_the_remarks_field_should_be_field_should_be_text_box_non_mandatory_and_display_only() {
String Remark_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getAttribute("ng-reflect-show-text-area-box");

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue((Remark_textBox.contains("true")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}

String Remark_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getText();

for (int i = 0; i <2000; i++) {

try {
Assert.assertTrue(!(Remark_nonMandy.contains("*")));
break;
} catch (Exception e) {
if (i==1999) {
  Assert.fail(e.getMessage());
}
}
}
String Remark_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remark_Check")).getAttribute("ng-reflect-readonly");
for (int i = 0; i <2000; i++) {
try {
Assert.assertTrue(Remark_As_displayOnly.contains("true"));
break;
} catch (Exception e) {
if (i==1999) {
    Assert.fail(e.getMessage());
}
}
}



}
@And("User_6047 click the Customer Financials tab")
public void user_6047_click_the_customer_financials_tab() throws Throwable {
//	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsTab")));
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("customerFinancialsTab")).click();
			Thread.sleep(3000);
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}






@Then("User_6047 To check the Primary Employment field should be Toggle,Non-Mandatory,display only")
public void user_to_check_the_primary_employment_field_should_be_toggle_non_mandatory_display_only() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")));
	String PrimaryEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("role");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((PrimaryEmployment.contains("switch")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String PrimaryEmp = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((PrimaryEmp.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String PrimaryEmp_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(PrimaryEmp_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the company type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_company_type_field_should_be_text_box_non_mandatory_display_only() {
	String companyType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType_Input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((companyType.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String companyType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(companyType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String companyType_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType_Input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((companyType_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the profession type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_profession_type_field_should_be_text_box_non_mandatory_display_only() {
	String professionType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType_Input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((professionType.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String professionType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(professionType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String professionType_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType_Input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((professionType_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the Nature of Employment field should be Drop Down,Mandatory,display only")
public void user_to_check_the_nature_of_employment_field_should_be_drop_down_mandatory_display_only() {
	String NatureOfEmp_As_DD= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-haspopup");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfEmp_As_DD.contains("listbox"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
	String NatureOfEmp_mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((NatureOfEmp_mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NatureOfEmp_dispOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfEmp_dispOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Profession field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_profession_field_should_be_text_box_non_mandatory_display_only() {
	String profession = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession_input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((profession.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String profession_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(profession_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String profession_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession_input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((profession_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the Statutory authority field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_statutory_authority_field_should_be_text_box_non_mandatory_display_only() {
	String StatutoryAuthority_As_TextBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority_input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((StatutoryAuthority_As_TextBox.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String StatutoryAuthority_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(StatutoryAuthority_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      
}}
	String StatutoryAuthority_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority_input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((StatutoryAuthority_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	}

@Then("User_6047 To check the Employment end date field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_employment_end_date_field_should_be_text_box_non_mandatory_display_only() {
	String EmploymentEndDate_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentEndDate_As_Date.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String EmploymentEndDate_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(EmploymentEndDate_As_Mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmploymentEndDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentEndDate_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employer Phone extension field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_employer_phone_extension_field_should_be_text_box_non_mandatory_display_only() {
	String EmployerPhExt_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_textBox.contains("number")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmployerPhExt_NonMandy  = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).getAttribute("ng-reflect-required");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_NonMandy.contains("false")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmployerPhExt_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployerPhExt_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the no of partners field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_no_of_partners_field_should_be_text_box_non_mandatory_display_only() {
	String noOfPartners_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(noOfPartners_As_textBox.contains("num"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String noOfPartners_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(noOfPartners_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String noOfPartners_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(noOfPartners_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Nature of business field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_nature_of_business_field_should_be_text_box_non_mandatory_display_only() {
	String NatureOfBusiness_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness_Input")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfBusiness_As_textBox.contains("Sel"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String NatureOfBusiness_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(NatureOfBusiness_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NatureOfBusiness_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness_Input")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfBusiness_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Registered business name field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_registered_business_name_field_should_be_text_box_non_mandatory_display_only() {

		String RegisteredBusinessName_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName_Input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RegisteredBusinessName_As_textBox.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String RegisteredBusinessName_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).getText();

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue(!(RegisteredBusinessName_As_NonMandy.contains("*")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String RegisteredBusinessName_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName_Input")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RegisteredBusinessName_As_displayOnly.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
}

@Then("User_6047 To check the Registered business number field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_registered_business_number_field_should_be_text_box_non_mandatory_display_only() {
	String RegisteredBusinessNumber_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(RegisteredBusinessNumber_As_textBox.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String RegisteredBusinessNumber_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(RegisteredBusinessNumber_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String RegisteredBusinessNumber_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(RegisteredBusinessNumber_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Business registration date field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_business_registration_date_field_should_be_text_box_non_mandatory_display_only() {
	String BusinessRegDate_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(BusinessRegDate_As_textBox.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String BusinessRegDate_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(BusinessRegDate_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String BusinessRegDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(BusinessRegDate_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Office premises type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_office_premises_type_field_should_be_text_box_non_mandatory_display_only() {
	String OfficepremisesType_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OfficessPremisesType_Input")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(OfficepremisesType_As_textBox.contains("Select"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String OfficepremisesType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(OfficepremisesType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String OfficepremisesType_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OfficessPremisesType_Input")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(OfficepremisesType_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Shareholder percentage field should be TextBox,Mandatory,display only")
public void user_to_check_the_shareholder_percentage_field_should_be_text_box_mandatory_display_only() {
	String ShareholderPercentage_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ShareholderPercentage_As_textBox.contains("num"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String ShareholderPercentage_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentage")).getAttribute("ng-reflect-required");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((ShareholderPercentage_As_Mandy.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String ShareholderPercentage_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ShareholderPercentage_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the No of Employes field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_no_of_employes_field_should_be_text_box_non_mandatory_display_only() {
	String NoOfEmployes_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).getAttribute("ng-reflect-show-text-box");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NoOfEmployes_As_textBox.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String NoOfEmployes_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(NoOfEmployes_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NoOfEmployes_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NoOfEmployes_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Remarks field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_remarks_field_should_be_text_box_non_mandatory_display_only() {
	String Remark_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getAttribute("ng-reflect-show-text-area-box");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((Remark_textBox.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
   
	String Remark_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(Remark_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String Remark_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remark_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Remark_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
}
int view = 0;

@Then("User_6047 click the Search button under customer employment and check the matching data in listview")
public void user_click_the_search_button_under_customer_employment_and_check_the_matching_data_in_listview() throws Throwable {

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

//				for (int i = 0; i <= 300; i++) {

//					try {

//						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));

//						break;

//					} catch (Exception e) {

//						if (i == 300) {

//							Assert.fail(e.getMessage());

//						}

//					}

//				}

				for ( view = 0; view < premitiveListOfAddButton; view++) {

					for (int k = 0; k <= 300; k++) {

						try {

							addButtonScreenName = javascriptHelper.executeScript(

									"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

											+ view + "].textContent")

									.toString();

							System.out.println("Screen Name " + addButtonScreenName);

							if (!(addButtonScreenName.isBlank())) {

								System.out.println("Screen Name" + addButtonScreenName + " is Not null");

								if ((addButtonScreenName.trim()).contains(("Customer Employment List").trim())) {

									System.out.println("Inside nested loop");

									//System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");

//									javascriptHelper

//									.executeScriptWithWebElement(

//											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")

//											.click();

									javascriptHelper.JSEClick(javascriptHelper

											.executeScriptWithWebElement(

											"document.querySelectorAll('button[ng-reflect-icon=\"pi pi-search\"]')[" + view + "]"));

											
								javascriptHelper                    

									.executeScriptWithWebElement(

									"document.querySelector('span[class=\"p-input-icon-left ng-star-inserted\"] input')")

									.sendKeys("business");

									isAddButtonClicked = true;

									System.out.println("clicked ");
									break;

								}

							}

						} catch (Exception e) {

							if (k == 300) {

								//Assert.fail(e.getMessage());

							}

						}

	 

					}

					if (isAddButtonClicked == true) {

						break;

					}

				}

			}

		
@Then("User_6047 check the result data")
public void user_check_the_result_data() throws Throwable{
	
		
	//document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')[0].querySelector('span[class="p-paginator-current ng-star-inserted"]').innerText

	//Showing 0 to 0 of 0 entries

			String searchResult = "";

	 

			for (int i = 0; i <= 300; i++) {

				try {

					if (i > 200) {

						searchResult = javascriptHelper.executeScript(

								"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["

										+ view

										+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

								.toString();

						break;

					}

	 

				} catch (Exception e) {

	 

					if (i == 300) {

						Assert.fail(e.getMessage());

					}

	 

				}

			}

			System.out.println(searchResult);

	 

			SoftAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");

		}

@Then("User_6047 click the Search button under customer employment and check the mismatch data in listview")
public void user_click_the_search_button_under_customer_employment_and_check_the_mismatch_data_in_listview() {
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

//	for (int i = 0; i <= 300; i++) {

//		try {

//			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));

//			break;

//		} catch (Exception e) {

//			if (i == 300) {

//				Assert.fail(e.getMessage());

//			}

//		}

//	}

	for ( view = 0; view < premitiveListOfAddButton; view++) {

		for (int k = 0; k <= 300; k++) {

			try {

				addButtonScreenName = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

								+ view + "].textContent")

						.toString();

				System.out.println("Screen Name " + addButtonScreenName);

				if (!(addButtonScreenName.isBlank())) {

					System.out.println("Screen Name" + addButtonScreenName + " is Not null");

					if ((addButtonScreenName.trim()).contains(("Customer Employment List").trim())) {

						System.out.println("Inside nested loop");

						//System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");

//						javascriptHelper

//						.executeScriptWithWebElement(

//								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")

//								.click();

						javascriptHelper.JSEClick(javascriptHelper

								.executeScriptWithWebElement(

								"document.querySelectorAll('button[ng-reflect-icon=\"pi pi-search\"]')[" + view + "]"));

								
					javascriptHelper                    

						.executeScriptWithWebElement(

						"document.querySelector('span[class=\"p-input-icon-left ng-star-inserted\"] input')")

						.sendKeys("dataa");
					
					Thread.sleep(3000);

						isAddButtonClicked = true;

						System.out.println("clicked ");
						break;

					}

				}

			} catch (Exception e) {

				if (k == 300) {

					//Assert.fail(e.getMessage());

				}

			}



		}

		if (isAddButtonClicked == true) {

			break;

		}

	}

}

@Then("User_6047 check the result")
public void user_check_the_result() {
	
	String searchResult = "";

	 

	for (int i = 0; i <= 300; i++) {

		try {

			if (i > 200) {

				searchResult = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["

								+ view

								+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

						.toString();

				break;

			}



		} catch (Exception e) {



			if (i == 300) {

				Assert.fail(e.getMessage());

			}



		}

	}

	System.out.println(searchResult);



	SoftAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");

}
@And("User_6047 click the back button")
public void user_click_the_back_button() {
	for (int i = 0; i <= 300; i++) {
		try {
			//javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BackButton")));

			javascriptHelper.JSEClick(javascriptHelper

					.executeScriptWithWebElement(

					"document.querySelector('button[icon=\"pi pi-arrow-left\"]')"));
		
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
}






}
