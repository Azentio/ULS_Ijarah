package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class murabha_Steps {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;

	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
	JSPaths murabhaContractSinging = new JSPaths(excelPath, "Murabha_ContractSinging", "Murabha_ContractSinging", "JSPath");
	JSPaths murabha_PurchasOrder = new JSPaths(excelPath, "Murabha_PurchasOrder", "Murabha_ContractSinging", "JSPath");
	JSPaths murabha_UnderWriter_CustomerFin = new JSPaths(excelPath, "Murabha_UnderWriter_CustomerFin", "Murabha_UnderWriter", "JSPath");
	JSPaths mur_AdditionalCustomerInfo_610 = new JSPaths(excelPath, "Mur_AdditionalCustomerInfo_610", "Murabha_AdditionalCustomerInfo", "JSPath");
	JSPaths al_ADEntry_CustomerDetails = new JSPaths(excelPath, "Al_ADEntry_CustomerDetails_610", "AutoloanADEntry_CustomerDetails", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");

	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(path, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	Map<String, String> testData;
	
	ExcelData morabha_AppDataEntry = new ExcelData(path, "Morabha_AppDataEntry", "DataSet ID");
	Map<String, String> testData01;
	
	ExcelData mura_ADEntery_CustomerEMPdet = new ExcelData(path, "Mura_ADEntery_CustomerEMPdet", "DataSet ID");
	Map<String, String> testData02;
	
	//----------Murabha app data entery Customer Employement Det
	
			@And("User_610 get the test data set id for DS_AT_MU_EMPD_07")
			public void get_the_test_data_set_id_for_DS_AT_MU_EMPD_07() {
				testData02 = mura_ADEntery_CustomerEMPdet.getTestdata("DS_AT_MU_EMPD_07");
			}
			
	//----------Murabha app data entery Customer Employement Det
			
			@And("User_610 get the test data set id for DS_AT_MU_EMPD_08")
			public void get_the_test_data_set_id_for_DS_AT_MU_EMPD_08() {
				testData02 = mura_ADEntery_CustomerEMPdet.getTestdata("DS_AT_MU_EMPD_08");
			}
			
      
			
    
	
	//-------------------***************************************************-------------------------------------
	
	@And("User_610 click Living Expenses Screen in App Data Entery")
	public void user_610_click_living_expenses_screen_in_app_data_entery() throws Throwable {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("livingExpenses_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
       //Thread.sleep(4000);
	}
	
	@And("User_610 verify the system not allow user to do a modification with invalid data Spouse Salary")
	public void user_610_verify_the_system_not_allow_user_to_do_a_modification_with_invalid_data_spouse_salary() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).sendKeys("55");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(4000);	
		//validate 
		
		String SpouseSalary = javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).getAttribute("aria-valuenow");
		
		System.err.println("first print  " + SpouseSalary);
		System.err.println("first print  " + SpouseSalary);
		String assertSpouseSalary = "55";
		Assert.assertEquals(assertSpouseSalary, SpouseSalary);
		
		
	 
	}
	
	@And("User_610 save button and verify the success message in murabha")
	public void user_610_save_button_and_verify_the_success_message_in_murabha() {
	    
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("murabha_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
			
		}
		
	}
	
	//----------------------  @AT_MU_EMPD_07 murabha App Data Entery Employement Details   
	
	
	@And("User_610 click the Customer Financials Screen")
	public void user_610_click_the_customer_financials_screen() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("customerFinancials_Screen_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 click Edit button")
	public void user_610_click_edit_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("editBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	 	    
	}

	@And("User_610 click the add button under Customer Employment Details")
	public void user_610_click_the_add_button_under_customer_employment_details() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("addBtn_Under_customerEmployementDetails")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    Thread.sleep(3000);
	}

	@And("User_610 select nature of employment")
	public void user_610_select_nature_of_employment() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("natureOfEmployement_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
				// ----------dropdown-------

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
					
					System.out.println("Map " + testData02.get("NatureOfEmployement").trim());
					
					if ((dropdownString.trim())
							.equalsIgnoreCase((testData02.get("NatureOfEmployement")).trim())) {
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

	@And("User_610 select nature of period")
	public void user_610_select_nature_of_period() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employmentPeriod_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
				
		// ----------dropdown-------

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
					
					System.out.println("Map " + testData02.get("EmployementPeriod").trim());
					
					if ((dropdownString.trim())
							.equalsIgnoreCase((testData02.get("EmployementPeriod")).trim())) {
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

	@And("User_610 enter employer name")
	public void user_610_enter_employer_name() throws Throwable {
		Thread.sleep(500);
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employerName_610")).
				sendKeys(testData02.get("EmployerName"));;
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
			    
	}

	@And("User_610 enter employee ID")
	public void user_610_enter_employee_id() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employeID_610"))
				.sendKeys(testData02.get("EmployeeID"));;
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		    
	}

	@And("User_610 select the Data Of Joining")
	public void user_610_select_the_data_of_joining() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("dateOfJoining_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		Thread.sleep(1000);
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("selectTodayDateIn_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 select Employment type")
	public void user_610_select_employment_type() throws Throwable {
		
		//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employementType_61")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employementType_61")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}Thread.sleep(2000);
		}
		
				// ----------dropdown-------

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
					
					System.out.println("Map " + testData02.get("EmploymentType").trim());
					
					if ((dropdownString.trim())
							.equalsIgnoreCase((testData02.get("EmploymentType")).trim())) {
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

	@And("User_610 select Share Holder Percentage")
	public void user_610_select_share_holder_percentage() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("shareHolderPercentage_610")));
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("shareHolderPercentage_610"))
				.sendKeys(testData02.get("ShareHolderPercentage"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 enter the Total Experience")
	public void user_610_enter_the_total_experience() {
	//	WebElement totalExp1 = javascriptHelper.executeScriptWithWebElement("document.querySelector('[id=\"totalExperience\"] ion-label')");
//		WebElement totalEx = javascriptHelper.executeScriptWithWebElement("document.querySelector('[id=\"totalExperience\"]')");
		
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement("document.querySelector('[id=\"managerName\"]').firstChild.firstChild"));
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 500; i++) {
			try {
			//	javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("totalExperience_610")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("totalExperience_610")).sendKeys(testData02.get("TotalExperience"));
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 scroll up and view customer employment")
	public void user_610_scroll_up_and_view_customer_employment() throws Throwable {
		
				
		 for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("backBtn_Index_UnderCustomerDetails_610")));
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    	}

	@And("User_610 verify the confirmation message")
	public void user_610_verify_the_confirmation_message() {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("saveBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("successMsg_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	//-----------  @AT_MU_EMPD_08
	
	@And("User_610 blank validation message")
	public void user_610_blank_validation_message() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("saveBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("fillAllTheDetailsPopup_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
}

	@And("User_610 verify the enter special characters value proper validation message")
	public void user_610_verify_the_enter_special_characters_value_proper_validation_message() throws Throwable {
	    Thread.sleep(2000);
	    
	    for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("click_EmployerName_610")).click();
				break;
			} catch (Exception e) {
				if (i == 399) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("employerName_610")).sendKeys(testData02.get("EmployerNameSpecialChar"));
				break;
			} catch (Exception e) {
				if (i == 399) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 500; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("onlyAlphaNumericCharterPopup_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
	//------------------ @AT_MU_EMPD_09
	
	@And("User_610 verify the list view under Customer Employment Details")
	public void user_610_verify_the_list_view_under_customer_employment_details() {
	    
	}
	
	//------------  -@AT_MU_QA_01
	
	@And("User_610 click Quatation Info screen")
	public void user_610_click_quatation_info_screen() {
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("Quotation Info")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the field Insurance Company, Base Premium ,Vat on Base Premium")
	public void user_610_verify_the_field_insurance_company_base_premium_vat_on_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("InsuranceCompanyBpId")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("BasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("VatOnBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the field Net Base Premium , Total Discount , Expiry Date , Quatatio Reference Number")
	public void user_610_verify_the_field_net_base_premium_total_discount_expiry_date_quatatio_reference_number() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("NetBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("totalDiscountAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("ExpiryDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("QuoteReferenceNo")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	//---------------------- @AT_MU_QA_02
	
	@And("User_610 verify the field Insurance Company")
	public void user_610_verify_the_field_insurance_company() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("InsuranceCompanyBpId")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the field Base Premium")
	public void user_610_verify_the_field_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("BasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the field Vat On Base Premium")
	public void user_610_verify_the_field_vat_on_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("VatOnBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	
	//-----------------@AT_MU_QA_03
	
	@And("User_610 verify the field Net Base Premium")
	public void user_610_verify_the_field_net_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("NetBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the field Total Discount")
	public void user_610_verify_the_field_total_discount() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("totalDiscountAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the field Expiry Date")
	public void user_610_verify_the_field_expiry_date() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("ExpiryDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//-------------------@AT_MU_QA_04
	
	@And("User_610 verify the field Quatation Reference Number")
	public void user_610_verify_the_field_quatation_reference_number() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("QuoteReferenceNo")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("User_610 click search button and enter matching data")
	public void user_610_click_search_button_and_enter_matching_data() throws Throwable {		
		//---webelement
//		Thread.sleep(2000);		
//		String jsPath = "document.querySelectorAll('button[icon=\"pi pi-search\"]')[0]";
		
		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("searchBTn_610_Mu")).click();
//				javascriptHelper.executeScriptWithWebElement(jsPath).click();
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("enter_searchBtn_610_Mu")).sendKeys("1200");
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("View Button")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		}

	@And("User_610 click search button and enter mismatching data")
	public void user_610_click_search_button_and_enter_mismatching_data() {
		for (int i = 0; i < 600; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("enter_searchBtn_610_Mu")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("searchBTn_610_Mu")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("enter_searchBtn_610_Mu")).sendKeys("00");
				break;
			} catch (Exception e) {
				if (i == 599) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("misMatching_Data_610_Mu")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("User_610 verify the PDF button")
	public void user_610_verify_the_pdf_button() {
	    
	}
	
	
	//------------------Feature: Murabha Contract Singing    @AT_MU_CS_06
	
	@And("User_610 click Contract Singing Screen in Murabha")
	public void user_610_click_contract_singing_screen_in_murabha() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabhaContractSinging.getElement("Mu_ContractSingingScreen")).click();
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Contract Singing Authority field under Contract Singing Screen in Murabha")
	public void user_610_verify_the_contract_singing_authority_field_under_contract_singing_screen_in_murabha() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabhaContractSinging.getElement("ContractSingingAuthority")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Offered Amount field under Contract Singing Screen in Murabha")
	public void user_610_verify_the_offered_amount_field_under_contract_singing_screen_in_murabha() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabhaContractSinging.getElement("OfferedAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Contract Singin Date field under Contract Singing Screen in Murabha")
	public void user_610_verify_the_contract_singin_date_field_under_contract_singing_screen_in_murabha() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabhaContractSinging.getElement("ContractSingingDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Contract Validity field under Contract Singing Screen in Murabha")
	public void user_610_verify_the_contract_validity_field_under_contract_singing_screen_in_murabha() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabhaContractSinging.getElement("ContractValidity")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	//--------------------- Feature: Murabha Contract Singing   @AT_MU_CS_06
	
	
	@And("User_610 click the purchase order screen")
	public void user_610_click_the_purchase_order_screen() throws Throwable {
		Thread.sleep(1000);
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("PurchaseOrder_CheckerScreen_610")).click();
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Po Reference Number field")
	public void user_610_verify_the_po_reference_number_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("PoReferenceNumber_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Purchas Order Date field")
	public void user_610_verify_the_purchas_order_date_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("PurchasOrderDate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Estimated Purchas Due Date field")
	public void user_610_verify_the_estimated_purchas_due_date_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("EstimatedPurchasDueDate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Assert Avaliablity field")
	public void user_610_verify_the_assert_avaliablity_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("AssertAvaliablity_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Receiver Name field")
	public void user_610_verify_the_receiver_name_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("ReceiverName_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Discount Percentage field")
	public void user_610_verify_the_discount_percentage_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("DiscountPercentage_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Istemara Fees field")
	public void user_610_verify_the_istemara_fees_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("IstemaraFees_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Assert Price With Vat field")
	public void user_610_verify_the_assert_price_with_vat_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("AssertPriceWithVat_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Net Amount Payable To Dealer field")
	public void user_610_verify_the_net_amount_payable_to_dealer_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("NetAmountPayableToDealer_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Assert ID field")
	public void user_610_verify_the_assert_id_field() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_PurchasOrder.getElement("AssertID_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	//-------------------------Feature: Murabha Under Writer  Customer Financial Screen   @AT_MU_UNW_006_05     ---------------------------------  
	
	
	@And("User_610 click customer financial screen")
	public void user_610_click_customer_financial_screen() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("CustomerFinancialScreen_610")).click();
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 click financial commitments tab in customer financial screen")
	public void user_610_click_financial_commitments_tab_in_customer_financial_screen() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("viewBtn_FinancialCommitment_UnderCustomerFinancial_610")).click();
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Financial Type field in financila commitments tab")
	public void user_610_verify_the_financial_type_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("financialType_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the financial Institution field in financila commitments tab")
	public void user_610_verify_the_financial_institution_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("financialInstitution_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Sanction Amount field in financila commitments tab")
	public void user_610_verify_the_sanction_amount_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("sanctionAmount_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Interst Rate field in financila commitments tab")
	public void user_610_verify_the_interst_rate_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("interstRate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Current Principal Balance field in financila commitments tab")
	public void user_610_verify_the_current_principal_balance_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("currentprincipalBalance_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Tenure Month field in financila commitments tab")
	public void user_610_verify_the_tenure_month_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("TenureMonths_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Maturrity Date field in financila commitments tab")
	public void user_610_verify_the_maturrity_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("maturrityDate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Installment Amount field in financila commitments tab")
	public void user_610_verify_the_installment_amount_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("installmentAmount_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Amount Considered field in financila commitments tab")
	public void user_610_verify_the_amount_considered_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("amountConsidered_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the currency field in financila commitments tab")
	public void user_610_verify_the_currency_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("currency_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Next Due date field in financila commitments tab")
	public void user_610_verify_the_next_due_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("nextDuedate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Close Date field in financila commitments tab")
	public void user_610_verify_the_close_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("closeDate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Collateral Type field in financila commitments tab")
	public void user_610_verify_the_collateral_type_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("collateralType_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the frequency field in financila commitments tab")
	public void user_610_verify_the_frequency_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("frequency_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the last Payment Amount field in financila commitments tab")
	public void user_610_verify_the_last_payment_amount_field_in_financila_commitments_tab() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("lastPaymentDate_610")));
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("lastPaymentDate_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the productName field in financila commitments tab")
	public void user_610_verify_the_product_name_field_in_financila_commitments_tab() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("productName")));
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("productName")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the facilityStatus field in financila commitments tab")
	public void user_610_verify_the_facility_status_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("facilityStatus_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the remaining Tenure field in financila commitments tab")
	public void user_610_verify_the_remaining_tenure_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("remainingTenure_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Sement Date field in financila commitments tab")
	public void user_610_verify_the_sement_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("sementDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the NPA Classification field in financila commitments tab")
	public void user_610_verify_the_npa_classification_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(murabha_UnderWriter_CustomerFin.getElement("NPAClassification_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	//--------------------------------------- #Customer Identification Tab    @AT_MU_UNW_006_06
	
	
	@And("User_610 click Additional Customer Info screen")
	public void user_610_click_additional_customer_info_screen() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("AdditionalCustomerInfoScreen_610")).click();
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 click Customer Identification tab in Additional Customer Info screen")
	public void user_610_click_customer_identification_tab_in_additional_customer_info_screen() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("CustomerIdentification_UnderadditionalCust_610")).click();
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Id Type field in financila commitments tab")
	public void user_610_verify_the_id_type_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("IdType")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Id Number field in financila commitments tab")
	public void user_610_verify_the_id_number_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("IdNumber")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Issue Date field in financila commitments tab")
	public void user_610_verify_the_issue_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("Issuuedate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Expiry Date field in financila commitments tab")
	public void user_610_verify_the_expiry_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("ExpiryDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Issue Authority field in financila commitments tab")
	public void user_610_verify_the_issue_authority_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("IssueAuthority")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Country Of Issuse field in financila commitments tab")
	public void user_610_verify_the_country_of_issuse_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("CountryOfIssuse")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

//-----------------------------------   #Address Details Tab   @AT_MU_UNW_006_07
	
	@And("User_610 click Adress Details tab in Additional Customer Info screen")
	public void user_610_click_adress_details_tab_in_additional_customer_info_screen() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("AdderssDetailsTab_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Address Type field in financila commitments tab")
	public void user_610_verify_the_address_type_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("address_type")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Address Status field in financila commitments tab")
	public void user_610_verify_the_address_status_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("address_status")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Residential Or Ocupency Status field in financila commitments tab")
	public void user_610_verify_the_residential_or_ocupency_status_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("residential_or_ocupency_status")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Communication Address field in financila commitments tab")
	public void user_610_verify_the_communication_address_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("communication_address_toggle")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Location category field in financila commitments tab")
	public void user_610_verify_the_location_category_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("location_category")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Adderss Line1 field in financila commitments tab")
	public void user_610_verify_the_adderss_line1_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("address_line1")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Adderss Line2 field in financila commitments tab")
	public void user_610_verify_the_adderss_line2_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("address_line2")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Country field in financila commitments tab")
	public void user_610_verify_the_country_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("country")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Province Id field in financila commitments tab")
	public void user_610_verify_the_province_id_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("province_id")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the City field in financila commitments tab")
	public void user_610_verify_the_city_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("city")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the District Name field in financila commitments tab")
	public void user_610_verify_the_district_name_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("district_name")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Zip Code field in financila commitments tab")
	public void user_610_verify_the_zip_code_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("zip_code")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Po Box Number field in financila commitments tab")
	public void user_610_verify_the_po_box_number_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("po_box_number")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Mobile Number field in financila commitments tab")
	public void user_610_verify_the_mobile_number_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("mobile_number_primary")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Duration Of Stay in financila commitments tab")
	public void user_610_verify_the_duration_of_stay_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("duration_on_stay")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Latitude Details Of The Address field in financila commitments tab")
	public void user_610_verify_the_latitude_details_of_the_address_field_in_financila_commitments_tab() {
	    
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("latitude_details_of_the_address")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the Longitude Details Of The Adress field in financila commitments tab")
	public void user_610_verify_the_longitude_details_of_the_adress_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("longitude_details_of_the_address")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Landmark field in financila commitments tab")
	public void user_610_verify_the_landmark_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("landmark")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Occupency Date field in financila commitments tab")
	public void user_610_verify_the_occupency_date_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("occupency_date")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Landlord Name field in financila commitments tab")
	public void user_610_verify_the_landlord_name_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("landlord_name")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Landlord Mobile Number field in financila commitments tab")
	public void user_610_verify_the_landlord_mobile_number_field_in_financila_commitments_tab() {
	    
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("landlord_mobile_number")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the Rent Amount field in financila commitments tab")
	public void user_610_verify_the_rent_amount_field_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("rent_amount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Frequency of Rent in financila commitments tab")
	public void user_610_verify_the_frequency_of_rent_in_financila_commitments_tab() {
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("frequency_of_rent")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_610 verify the Status field in financila commitments tab")
	public void user_610_verify_the_status_field_in_financila_commitments_tab() {
	    
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(mur_AdditionalCustomerInfo_610.getElement("CountryOfIssuse")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (k == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//---------------- @AT_MU_ADE_CD_01
	
	@And("User_610 Click Documents Details screen")
	public void user_click_documents_details_screen() {
	    
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("murabha_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	//  --------------         @AT_MU_ADE_CD_03           ---------------------
	 
	
	@And("User_610 verify the First Name Arabic field mandatory editable textbox")
	public void user_verify_the_first_name_arabic_field_mandatory_editable_textbox() {
		for (int i = 0; i < 200; i++) {
			try {
				String FirstNameArabic = "document.querySelector('digital-text-box[id=\"customerFirstNameInOtherLang\"]').innerText";
				String FirstNameArabi = (String) javascriptHelper.executeScript("return " + FirstNameArabic);
							
				System.err.println("FirstNameArabi:"+ FirstNameArabi);
						
				Assert.assertEquals(true, FirstNameArabi.contains("*"));
		//		Assert.assertTrue(!RemarkName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type text
	
	String FirstNameArabictext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FirstNameArabic"))
			.getAttribute("type");                                                        
	System.err.println("FirstNameArabictext  " + FirstNameArabictext);
	String assertFirstNameArabictext = "text";
	Assert.assertEquals(assertFirstNameArabictext, FirstNameArabictext);
	
	//editable
	
	
	String FirstNameArabicEditable = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FirstNameArabicEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("FirstNameArabicEditable  " + FirstNameArabicEditable);
	String assertFirstNameArabicEditable = "false";
	
	Assert.assertEquals(assertFirstNameArabicEditable, FirstNameArabicEditable);
	    
	}

	@And("User_610 verify the middle Name Arabic field non mandatory editable textbox")
	public void user_verify_the_middle_name_arabic_field_non_mandatory_editable_textbox() {
		for (int i = 0; i < 200; i++) {
			try {
				String middleNameArabic = "document.querySelector('digital-text-box[id=\"customerMiddleNameInOtherLang\"]').innerText";
				String middleNameArabi = (String) javascriptHelper.executeScript("return " + middleNameArabic);
							
				System.err.println("middleNameArabi:"+ middleNameArabi);
						
		//		Assert.assertEquals(true, Firstnam.contains("*"));
				Assert.assertTrue(!middleNameArabi.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type text
	
	String MiddleNameArabictext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MiddleNameArabic"))
			.getAttribute("type");
	System.err.println("first print  " + MiddleNameArabictext);
	String assertMiddleNameArabictext = "text";
	Assert.assertEquals(assertMiddleNameArabictext, MiddleNameArabictext);
	
	//editable
	
	
	String MiddleNameArabicEditable = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("MiddleNameArabicEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("first print  " + MiddleNameArabicEditable);
	String assertMiddleNameArabicEditable = "false";
	
	Assert.assertEquals(assertMiddleNameArabicEditable, MiddleNameArabicEditable);
	    
	}

	@And("User_610 verify the Last Name Arabic field mandatory editable textbox")
	public void user_verify_the_last_name_arabic_field_mandatory_editable_textbox() {
		for (int i = 0; i < 200; i++) {
			try {
				String LastNameArabic = "document.querySelector('digital-text-box[id=\"customerLastNameInOtherLang\"]').innerText";
				String LastNameArabi = (String) javascriptHelper.executeScript("return " + LastNameArabic);
							
				System.err.println("LastNameArabi:"+ LastNameArabi);
						
				Assert.assertEquals(true, LastNameArabi.contains("*"));
		//		Assert.assertTrue(!RemarkName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type text
	
	String LastNameArabictext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("LastNameArabic"))
			.getAttribute("type");
	System.err.println("first print  " + LastNameArabictext);
	String assertLastNameArabic = "text";
	Assert.assertEquals(assertLastNameArabic, LastNameArabictext);
	
	//editable
	
	
	String LastNameArabicEditable = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("LastNameArabicEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("first print  " + LastNameArabicEditable);
	String assertLastNameArabicEditable = "false";
	
	Assert.assertEquals(assertLastNameArabicEditable, LastNameArabicEditable);
	    
	}

	@And("User_610 verify the Family Name Arabic field non mandatory editable textbox")
	public void user_verify_the_family_name_arabic_field_non_mandatory_editable_textbox() {
		for (int i = 0; i < 200; i++) {
			try {
				String FamilyNameArabic = "document.querySelector('digital-text-box[id=\"customerNameInOtherLang\"]').innerText";
				String FamilyNameArabi = (String) javascriptHelper.executeScript("return " + FamilyNameArabic);
							
				System.err.println("FamilyNameArabi:"+ FamilyNameArabi);
						
		//		Assert.assertEquals(true, Firstnam.contains("*"));
				Assert.assertTrue(!FamilyNameArabi.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type text
	
	String FamilyNameArabic = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FamilyNameArabic"))
			.getAttribute("type");
	System.err.println("first print  " + FamilyNameArabic);
	String assertFamilyNameArabic = "text";
	Assert.assertEquals(assertFamilyNameArabic, FamilyNameArabic);
	
	//editable
	
	
	String FamilyNameArabicEdi = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FamilyNameArabicEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("first print  " + FamilyNameArabicEdi);
	String assertFamilyNameArabicEdi = "false";
	
	Assert.assertEquals(assertFamilyNameArabicEdi, FamilyNameArabicEdi);
	    
	}
	
	//-----------------------            @AT_MU_ADE_CD_04                     ------------------------ 
	
	@And("User_610 verify the Family Name field non mandatory editable text")
	public void user_verify_the_family_name_field_non_mandatory_editable_text() {
		for (int i = 0; i < 200; i++) {
			try {
				String FamilyName = "document.querySelector('digital-text-box[id=\"customerThirdName\"]').innerText";
				String FamilyNam = (String) javascriptHelper.executeScript("return " + FamilyName);
							
				System.err.println("FamilyNam:"+ FamilyNam);
						
		//		Assert.assertEquals(true, Firstnam.contains("*"));
				Assert.assertTrue(!FamilyNam.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type text
	
	String FamilyNametext = javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FamilyName"))
			.getAttribute("type");
	System.err.println("FamilyNametext  " + FamilyNametext);
	String assertFamilyNametext = "text";
	Assert.assertEquals(assertFamilyNametext, FamilyNametext);
	
	//editable
	
	
	String FamilyNameEdi = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("FamilyNameEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("FamilyNameEdi  " + FamilyNameEdi);
	String assertFamilyNameEdi = "false";
	
	Assert.assertEquals(assertFamilyNameEdi, FamilyNameEdi);
	    
	}

	@And("User_610 verify the Age field non mandatory non editable text")
	public void user_verify_the_age_field_non_mandatory_non_editable_text() {
		for (int i = 0; i < 200; i++) {
			try {
				String Age = "document.querySelector('digital-text-box[id=\"customerNameInOtherLang\"]').innerText";
				String Agee = (String) javascriptHelper.executeScript("return " + Age);
							
				System.err.println("Agee:"+ Agee);
						
		//		Assert.assertEquals(true, Firstnam.contains("*"));
				Assert.assertTrue(!Agee.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	//type number
	
	String AgeNum= javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("Age"))
			.getAttribute("type");
	System.err.println("first print  " + AgeNum);
	String assertAgeNum = "number";
	Assert.assertEquals(assertAgeNum, AgeNum);
	
	//editable
	
	
	String AgeEdi = javascriptHelper
			.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("AgeEdi"))
			.getAttribute("ng-reflect-readonly");
	System.err.println("first print  " + AgeEdi);
	String assertAgeEdi = "true";
	
	Assert.assertEquals(assertAgeEdi, AgeEdi);
	    
	}
	
	//------------------------  @AT_MU_ADE_CD_08  --------------------
	
	@And("User_610 verify the Prefered Time For Contact field HH MM format Editable")
	public void user_verify_the_prefered_time_for_contact_field_hh_mm_format_editable() {
	    
	    
	}

	@And("User_610 verify the Add button should allow create new record")
	public void user_verify_the_add_button_should_allow_create_new_record() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("AddBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerTypeLabel")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
	            	}
		         		}
		
	}

	@And("User_610 verify the Back button should navigate to previous screen")
	public void user_verify_the_back_button_should_navigate_to_previous_screen() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("customerDetailsBackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(al_ADEntry_CustomerDetails.getElement("AddBtn")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
	            	}
		         		}
	    
	}

	@And("User_610 verify the impact when user keep any mandatory field blank")
	public void user_verify_the_impact_when_user_keep_any_mandatory_field_blank() {
		
	    
	}

	@And("User_610 verify the  impact when user enters negative numeric value")
	public void user_verify_the_impact_when_user_enters_negative_numeric_value() {
	    
	    
	}

	@And("User_610 verify the  impact when user enters character in numeric value")
	public void user_verify_the_impact_when_user_enters_character_in_numeric_value() {
	    
	    
	}

	@And("User_610 verify the impact when user enters only special characters value")
	public void user_verify_the_impact_when_user_enters_only_special_characters_value() {
	    
	    
	}
	
}
