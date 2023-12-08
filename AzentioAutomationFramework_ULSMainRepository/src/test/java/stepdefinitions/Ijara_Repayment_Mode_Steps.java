package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_615;

public class Ijara_Repayment_Mode_Steps {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(configFileReader.getJSFilePath(), "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths repaymentModeJpaths = new JSPaths(configFileReader.getJSFilePath(), "Ijara_Repayment_Mode", "Ijara_LoginFieldName", "JSPath");
	JSPaths quotationTabJPaths = new JSPaths(configFileReader.getJSFilePath(), "Quotation_Info", "Ijara_LoginFieldName", "JSPath");
	ExcelData exelData = new ExcelData(configFileReader.getIjarahTestDataFilePath(), "ijara_LoginCredentials", "UserType");
	ExcelData excelData = new ExcelData(configFileReader.getIjarahTestDataFilePath(), "Ijara_Repayment_Mode", "Data Set ID");
	ExcelData excel = new ExcelData(configFileReader.getIjarahTestDataFilePath(), "Ijara_Quotation_Info", "Data Set ID");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	Map<String, String> testData;
	UserUtility_615 userUtility = new UserUtility_615();
	
	@And("user_615 select the module name")
	public void user_615_select_the_module_name() {
		for (int i = 0; i < 200; i++) {
			javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("moduleName")).click();
			break;
		}
		
	}
	@And("user_615 click the LOS module name")
	public void user_615_click_the_los_module_name() {
	    for (int i = 0; i < 2000; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("moduleNameDropdown")).click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
	    	
		}
	}
	@And("user_615 click inbox button")
	public void user_615_click_inbox_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("inboxButton")).click();
		    	break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user_615 click search icon")
    public void user_615_click_search_icon() {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("searchButton")).click();
		    	break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
	    	
		}
    }
	
	@And("user_615 enter the existing app data entry record")
	public void user_615_enter_the_existing_app_data_entry_record() {
		//System.out.println(testData.get("Reference Id"));
		for (int i = 0; i < 200; i++) {
			try {
		    	javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("inboxData")).sendKeys(testData.get("Reference Id"));
		    	break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
		}
	}
	
	@And("user_615 update test data set id for AT_IRM_001")
	public void user_615_update_test_data_set_id_for_at_irm001() {
	    testData = excelData.getTestdata("AT_IRM_001_D1");
	}
	
	@And("user_615 update test data set id for AT_IRM_002")
	public void user_615_update_test_data_set_id_for_at_irm002() {
	    testData = excelData.getTestdata("AT_IRM_002_D2");
	}


	@And("user_615 click entitle button")
	public void user_615_click_entitle_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("actionButton")).click();
		    	break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
		}
	}

	@And("user_615 click repayment mode section")
	public void user_615_click_repayment_mode_section() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("repaymentModeSection")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@And("user_615 click edit icon")
	public void user_615_click_edit_icon() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("editIcon")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@Then("user_615 verify the repayment mode field")
	public void user_615_verify_the_repayment_mode_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("repaymentModeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
	}

	@Then("user_615 verify the account holder name field")
	public void user_615_verify_the_account_holder_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountHolderNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Then("user_615 verify the account type field")
	public void user_615_verify_the_account_type_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountTypeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the account number field")
	public void user_615_verify_the_account_number_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountNumberField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the bank name field")
	public void user_615_verify_the_bank_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("bankNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the bank branch name field")
	public void user_615_verify_the_bank_branch_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("branchNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the ECS code field")
	public void user_615_verify_the_ecs_code_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("escCode")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify save button")
	public void user_615_verify_save_button() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("saveButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify help button")
	public void user_615_verify_help_button() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("helpButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("user_615 verify the repayment mode field is mandatory and editable")
	public void user_615_verify_the_repayment_mode_field_is_mandatory_and_editable() throws InterruptedException {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector(\"ion-label[ng-reflect-text='Repayment Mode.TOOLTIP']\").innerText";
				String repaymentMode = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(repaymentMode);
				Assert.assertTrue(repaymentMode.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Repayment Mode.TOOLTIP\"]+ion-select')").click();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int length=0;
		for (int i = 0; i <2000; i++) {
			try {
				String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
				length = Integer.parseInt(string);
				if (length!=0) {
					break;
				}
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		System.err.println(length);
		for (int i = 0; i < length; i++) {
			String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
			//System.out.println(jsPath);
			String radio=null;
			for (int j = 0; i <2000; i++) {
				try {
					radio = (String) javascriptHelper.executeScript(jsPath);
					if (!radio.isBlank()||!radio.isEmpty()) {
						break;
					}
					
				} catch (Exception e) {
					if (j==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			
			if (radio.trim().equalsIgnoreCase("Debit Card")) {
				String js1= "document.querySelectorAll('ion-radio')["+i+"]";
				System.out.println(js1);
				javascriptHelper.executeScriptWithWebElement(js1).click();
				break;
			}
		}
		}
		
		@Then("user_615 verify the account holder name field is mandatory")
		public void user_615_verify_the_account_holder_name_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(\'ion-label[ng-reflect-text=\"Account Holder Name.TOOLTIP\"]').innerText";
					String accountholdername = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(accountholdername);
					Assert.assertTrue(accountholdername.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_615 validate the account holder name field is editable")
		public void user_615_validate_the_account_holder_name_field_is_editable() {
			for (int i = 0; i <2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\\\"Account Holder Name.TOOLTIP\"]+ion-select')").click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int length=0;
			for (int i = 0; i <2000; i++) {
				try {
					String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
					length = Integer.parseInt(string);
					if (length!=0) {
						break;
					}
					
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			System.err.println(length);
			for (int i = 0; i < length; i++) {
				String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
				//System.out.println(jsPath);
				String radio=null;
				for (int j = 0; i <2000; i++) {
					try {
						radio = (String) javascriptHelper.executeScript(jsPath);
						if (!radio.isBlank()||!radio.isEmpty()) {
							break;
						}
						
					} catch (Exception e) {
						if (j==1999) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				
				if (radio.trim().equalsIgnoreCase("gowri")) {
					String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					System.out.println(js1);
					javascriptHelper.executeScriptWithWebElement(js1).click();
					break;
				}
			}
			
		}

		@Then("user_615 verify the account type field is mandatory")
		public void user_615_verify_the_account_type_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\"Account Type.TOOLTIP\"]).innerText).innerText";
					String accounttype = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(accounttype);
					Assert.assertTrue(accounttype.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		

		@Then("user_615 validate the account type field is editable")
		public void user_615_validate_the_account_type_field_is_editable() {
			for (int i = 0; i <2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\\\"Account Type.TOOLTIP\\\"]+ion-select')").click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int length=0;
			for (int i = 0; i <2000; i++) {
				try {
					String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
					length = Integer.parseInt(string);
					if (length!=0) {
						break;
					}
					
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			System.err.println(length);
			for (int i = 0; i < length; i++) {
				String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
				//System.out.println(jsPath);
				String radio=null;
				for (int j = 0; i <2000; i++) {
					try {
						radio = (String) javascriptHelper.executeScript(jsPath);
						if (!radio.isBlank()||!radio.isEmpty()) {
							break;
						}
						
					} catch (Exception e) {
						if (j==1999) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				
				if (radio.trim().equalsIgnoreCase("Current Account")) {
					String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					System.out.println(js1);
					javascriptHelper.executeScriptWithWebElement(js1).click();
					break;
				}
			}
		}

		@Then("user_615 verify the account number field is mandatory")
		public void user_615_verify_the_account_number_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"').innerText";
					String accountnumber = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(accountnumber);
					Assert.assertTrue(accountnumber.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_615 verify the account number field is editable")
		public void user_615_verify_the_account_number_field_is_editable() {
			for (int i = 0; i < 200; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountNumberInputField")).click();
					javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountNumberInputField")).sendKeys(testData.get("Account Number"));
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
				
			}
		}

		@Then("user_615 verify the bank name field is mandatory")
		public void user_615_verify_the_bank_name_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\"Bank Name.TOOLTIP\"').innerText";
					String bankname = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(bankname);
					Assert.assertTrue(bankname.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("user_615 click the account currency field")
		public void user_615_click_the_account_currency_field() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\\\"Account Currency.TOOLTIP\\\"').innerText";
					String accountnumber = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(accountnumber);
					Assert.assertTrue(accountnumber.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user_615 select the value from dropdown in account currency field")
		public void user_615_select_the_value_from_dropdown_in_account_currency_field() {
			for (int i = 0; i <2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Currency.TOOLTIP\"]+ion-select')").click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int length=0;
			for (int i = 0; i <2000; i++) {
				try {
					String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
					length = Integer.parseInt(string);
					if (length!=0) {
						break;
					}
					
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			System.err.println(length);
			for (int i = 0; i < length; i++) {
				String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
				//System.out.println(jsPath);
				String radio=null;
				for (int j = 0; i <2000; i++) {
					try {
						radio = (String) javascriptHelper.executeScript(jsPath);
						if (!radio.isBlank()||!radio.isEmpty()) {
							break;
						}
						
					} catch (Exception e) {
						if (j==1999) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				
				if (radio.trim().equalsIgnoreCase("CAD")) {
					String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					System.out.println(js1);
					javascriptHelper.executeScriptWithWebElement(js1).click();
					break;
				}
			}
		}

		@Then("user_615 verify the bank name field is editable")
		public void user_615_verify_the_bank_name_field_is_editable() {
			for (int i = 0; i <2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\\\"Bank Name.TOOLTIP\\\"]+ion-select')").click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int length=0;
			for (int i = 0; i <2000; i++) {
				try {
					String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
					length = Integer.parseInt(string);
					if (length!=0) {
						break;
					}
					
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			System.err.println(length);
			for (int i = 0; i < length; i++) {
				String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
				//System.out.println(jsPath);
				String radio=null;
				for (int j = 0; i <2000; i++) {
					try {
						radio = (String) javascriptHelper.executeScript(jsPath);
						if (!radio.isBlank()||!radio.isEmpty()) {
							break;
						}
						
					} catch (Exception e) {
						if (j==1999) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				
				if (radio.trim().equalsIgnoreCase("HDFC BANK")) {
					String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					System.out.println(js1);
					javascriptHelper.executeScriptWithWebElement(js1).click();
					break;
				}
			}
		}

		@Then("user_615 verify the branch name field is mandatory")
		public void user_615_verify_the_branch_name_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\"Bank Branch.TOOLTIP\"').innerText";
					String branchname = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(branchname);
					Assert.assertTrue(branchname.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_615 validate the branch name field is editable")
		public void user_615_validate_the_branch_name_field_is_editable() {
			for (int i = 0; i <2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\\\"Bank Branch.TOOLTIP\\\"]+ion-select')").click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int length=0;
			for (int i = 0; i <2000; i++) {
				try {
					String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
					length = Integer.parseInt(string);
					if (length!=0) {
						break;
					}
					
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			
			System.err.println(length);
			for (int i = 0; i < length; i++) {
				String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
				//System.out.println(jsPath);
				String radio=null;
				for (int j = 0; i <2000; i++) {
					try {
						radio = (String) javascriptHelper.executeScript(jsPath);
						if (!radio.isBlank()||!radio.isEmpty()) {
							break;
						}
						
					} catch (Exception e) {
						if (j==1999) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				
				if (radio.trim().equalsIgnoreCase("Vashi Branch")) {
					String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					System.out.println(js1);
					javascriptHelper.executeScriptWithWebElement(js1).click();
					break;
				}
			}
		}

		@Then("user_615 verify the code field is mandatory")
		public void user_615_verify_the_code_field_is_mandatory() {
			for (int i = 0; i <2000; i++) {
				try {
					String repayment ="document.querySelector(document.querySelector(\"document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"').innerText";
					String codefield = (String) javascriptHelper.executeScript("return "+repayment);
					System.out.println(codefield);
					Assert.assertTrue(codefield.contains("*"));
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_615 verify the code field is editable")
		public void user_615_verify_the_code_field_is_editable() {
			for (int i = 0; i < 200; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("codeInputField")).click();
					javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("codeInputField")).sendKeys(testData.get("Code Input"));
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
				
			}
		}

		@Then("user_615 click the save button under repayment mode screen")
		public void user_615_click_the_save_button_under_repayment_mode_screen() {
		   for (int i = 0; i < 200; i++) {
			   try {
				   javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("saveButton")).click();
			} catch (Exception e) {
				
			}
			
		}
		}

		@Then("user_615 validate the success message popup with close button")
		public void user_615_validate_the_success_message_popup_with_close_button() {
			for (int i = 0; i <200; i++) {
				try {
					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("successMessagePopup")).isDisplayed());
					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("closeButton")).isDisplayed());
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("user_615 click account number field")
		public void user_615_click_account_number_field() {
		    for (int i = 0; i < 200; i++) {
		    	try {
		    		javascriptHelper.executeScriptWithWebElement(repaymentModeJpaths.getElement("accountNumberInputField")).click(); 
		    		break;
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
		
		@And("user_615 click save button")
		public void user_615_click_save_button() throws InterruptedException {
		    for (int i = 0; i < 2000; i++) {
		    	try {
					javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("saveButton")).click();
					break;
				} catch (Exception e) {
					if (i==1999) {
						Assert.fail(e.getMessage());
					}
				}
				
			}
		}


		@Then("user_615 verify the error popup required field is mandatory")
		public void user_615_verify_the_error_popup_required_field_is_mandatory() {
		    
		}

		@Then("user_615 enter the negative numeric value in account number field")
		public void user_615_enter_the_negative_numeric_value_in_account_number_field() {
		    
		}

		@Then("user_615 verify the error popup special character not allowed")
		public void user_615_verify_the_error_popup_special_character_not_allowed() {
		    
		}

		@Then("user_615 enter the character value in account number numeric field")
		public void user_615_enter_the_character_value_in_account_number_numeric_field() {
		   
		}

		@Then("user_615 verify the error popup")
		public void user_615_verify_the_error_popup() {
		    
		}

		@Then("user_615 click code field")
		public void user_615_click_code_field() {
		    
		}

		@Then("user_615 enter the special characters in code field")
		public void user_615_enter_the_special_characters_in_code_field() {
		    
		}

		@Then("user_615 verify the validation message for invalid data entry")
		public void user_615_verify_the_validation_message_for_invalid_data_entry() {
		    
		}
		
		
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	


