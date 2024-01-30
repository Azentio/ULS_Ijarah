package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;


public class Murabha_Repayment extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	//JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	Map<String, String> addressDetailsTestData = new HashMap<>();

	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";

	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");

	Map<String, String> AssetDetailsTestData = new HashMap<>();
	ExcelData Repayment_destData = new ExcelData(excelTestDataPath, "murabha_repayment",
			"Dataset ID");
	

	JSPaths Repayment_JS = new JSPaths(excelPath, "Repayment", "Ijara_LoginFieldName", "JSPath");

	@And("User get the test data for test case AT_MU_RM_001")
	public void user_get_the_test_data_for_test_case_at_mu_rm() {
		testData =  Repayment_destData.getTestdata("DS01_AT_MU_RM_001");
	}
	
	@And("User search the Ref Id under inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("record_reference_number"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}
	@And("User_7180 click repayment mode section")
	public void user_7180_click_repayment_mode_section() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("repaymentModeSection")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

@Given("User_7180 click view button")
public void user_click_view_button() {
	for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("viewButton")).click();
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
    	
    	
	}
}

@Then("user_7180 verify help button")
public void user_verify_help_button() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("helpButton")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("user_7180 verify the repayment mode field")
public void user_7180_verify_the_repayment_mode_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("repaymentModeField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
}

@Then("user_7180 verify the account holder name field")
public void user_7180_verify_the_account_holder_name_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
}

@Then("user_7180 verify the account type field")
public void user_7180_verify_the_account_type_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountTypeField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("user_7180 verify the account number field")
public void user_7180_verify_the_account_number_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountNumberField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("user_7180 verify the bank name field")
public void user_7180_verify_the_bank_name_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("bankNameField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("user_7180 verify the bank branch name field")
public void user_7180_verify_the_bank_branch_name_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("branchNameField")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("user_7180 verify the ECS code field")
public void user_7180_verify_the_ecs_code_field() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("escCode")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("user_7180 verify the repayment mode field data and check the value is displayed only or not")
public void user_7180_verify_the_repayment_mode_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("repaymentModeField_attribute")).getAttribute("aria-label");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("repaymentModeField_attribute")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("Cheque"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
	}	    
}


@Then("user_7180 verify the account holder name field data and check the value is displayed only or not")
public void user_7180_verify_the_account_holder_name_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("aria-label");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("Robert John"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    

}

@Then("user_7180 verify the account type field data and check the value is displayed only or not")
public void user_7180_verify_the_account_type_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountTypeField_attribute")).getAttribute("aria-label");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("Current Account"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
        
    }		    
}

@Then("user_7180 verify the account number field data and check the value is displayed only or not")
public void user_7180_verify_the_account_number_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountNumberField_attribute")).getAttribute("ng-reflect-model");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("03445987766555"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    
}

@Then("user_7180 verify the bank name field data and check the value is displayed only or not")
public void user_7180_verify_the_bank_name_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("bankNameField_attribute")).getAttribute("aria-label");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains(" HDFC BANK"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    
}

@Then("user_7180 verify the bank branch name field data and check the value is displayed only or not")
public void user_7180_verify_the_bank_branch_name_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("branchNameField_attribute")).getAttribute("aria-label");
	String RepaymentMode= javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("Bandra Branch"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    
}

@Then("user_7180 verify the ECS code field data and check the value is displayed only or not")
public void user_7180_verify_the_ecs_code_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("escCode_attribute")).getAttribute("ng-reflect-model");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("HDFC9865"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
            
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    
}

@Then("user_7180 verify the account currency field data and check the value is displayed only or not")
public void user_7180_verify_the_account_currency_field_data_and_check_the_value_is_displayed_only_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountcurrency_attribute")).getAttribute("aria-label");
	String RepaymentMode = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("accountHolderNameField_attribute")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("USD"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
        try {
        	Assert.assertTrue(RepaymentMode.contains("true"));
        	break;
        }
        catch(Exception e) {
        	 Assert.fail(e.getMessage());
        }
    }		    
}
@Then("user_7180 verify the status bar whether it is disable or not")
public void user_7180_verify_the_status_bar_whether_it_is_disable_or_not() {
	String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("StatusBar_attribute")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetmanufactureDC.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("user_7180 verify the back button")
public void user_7180_verify_the_back_button() {
	
	for (int i = 0; i <200; i++) {
		
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Repayment_JS.getElement("BackButton")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
			}
	}
}
}
