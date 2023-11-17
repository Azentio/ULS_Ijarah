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
	
	@And("User_{int} click Living Expenses Screen in App Data Entery")
	public void user_click_living_expenses_screen_in_app_data_entery(Integer int1) throws Throwable {
		
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
	
	@And("User_{int} verify the system not allow user to do a modification with invalid data Spouse Salary")
	public void user_verify_the_system_not_allow_user_to_do_a_modification_with_invalid_data_spouse_salary(Integer int1) throws Throwable {

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
	
	@And("User_{int} save button and verify the success message in murabha")
	public void user_save_button_and_verify_the_success_message_in_murabha(Integer int1) {
	    
		
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
	
	
	@And("User_{int} click the Customer Financials Screen")
	public void user_click_the_customer_financials_screen(Integer int1) {
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

	@And("User_{int} click Edit button")
	public void user_click_edit_button(Integer int1) {
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

	@And("User_{int} click the add button under Customer Employment Details")
	public void user_click_the_add_button_under_customer_employment_details(Integer int1) throws Throwable {
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
	    Thread.sleep(5020);
	}

	@And("User_{int} select nature of employment")
	public void user_select_nature_of_employment(Integer int1) throws Throwable {
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

	@And("User_{int} select nature of period")
	public void user_select_nature_of_period(Integer int1) throws Throwable {
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

	@And("User_{int} enter employer name")
	public void user_enter_employer_name(Integer int1) throws Throwable {
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

	@And("User_{int} enter employee ID")
	public void user_enter_employee_id(Integer int1) throws Throwable {
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

	@And("User_{int} select the Data Of Joining")
	public void user_select_the_data_of_joining(Integer int1) throws Throwable {
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

	@And("User_{int} select Employment type")
	public void user_select_employment_type(Integer int1) throws Throwable {
		
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

	@And("User_{int} select Share Holder Percentage")
	public void user_select_share_holder_percentage(Integer int1) {
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

	@And("User_{int} enter the Total Experience")
	public void user_enter_the_total_experience(Integer int1) {
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

	@And("User_{int} scroll up and view customer employment")
	public void user_scroll_up_and_view_customer_employment(Integer int1) throws Throwable {
		
				
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

	@And("User_{int} verify the confirmation message")
	public void user_verify_the_confirmation_message(Integer int1) {
		
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
	
	@And("User_{int} blank validation message")
	public void user_blank_validation_message(Integer int1) {
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

	@And("User_{int} verify the enter special characters value proper validation message")
	public void user_verify_the_enter_special_characters_value_proper_validation_message(Integer int1) throws Throwable {
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
	
	@And("User_{int} verify the list view under Customer Employment Details")
	public void user_verify_the_list_view_under_customer_employment_details(Integer int1) {
	    
	}
	
	//------------  -@AT_MU_QA_01
	
	@And("User_{int} click Quatation Info screen")
	public void user_click_quatation_info_screen(Integer int1) {
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

	@And("User_{int} verify the field Insurance Company, Base Premium ,Vat on Base Premium")
	public void user_verify_the_field_insurance_company_base_premium_vat_on_base_premium(Integer int1) {
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

	@And("User_{int} verify the field Net Base Premium , Total Discount , Expiry Date , Quatatio Reference Number")
	public void user_verify_the_field_net_base_premium_total_discount_expiry_date_quatatio_reference_number(Integer int1) {
	    
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
	
	@And("User_{int} verify the field Insurance Company")
	public void user_verify_the_field_insurance_company(Integer int1) {
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

	@And("User_{int} verify the field Base Premium")
	public void user_verify_the_field_base_premium(Integer int1) {
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

	@And("User_{int} verify the field Vat On Base Premium")
	public void user_verify_the_field_vat_on_base_premium(Integer int1) {
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
	
	@And("User_{int} verify the field Net Base Premium")
	public void user_verify_the_field_net_base_premium(Integer int1) {
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

	@And("User_{int} verify the field Total Discount")
	public void user_verify_the_field_total_discount(Integer int1) {
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

	@And("User_{int} verify the field Expiry Date")
	public void user_verify_the_field_expiry_date(Integer int1) {
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
	
	@And("User_{int} verify the field Quatation Reference Number")
	public void user_verify_the_field_quatation_reference_number(Integer int1) {
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
	
	@And("User_{int} click search button and enter matching data")
	public void user_click_search_button_and_enter_matching_data(Integer int1) throws Throwable {		
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

	@And("User_{int} click search button and enter mismatching data")
	public void user_click_search_button_and_enter_mismatching_data(Integer int1) {
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

	@And("User_{int} verify the PDF button")
	public void user_verify_the_pdf_button(Integer int1) {
	    
	}
	
}
