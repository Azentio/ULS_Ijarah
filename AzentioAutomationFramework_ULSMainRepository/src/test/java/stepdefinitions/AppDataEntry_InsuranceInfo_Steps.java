package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataEntry_InsuranceInfo_Steps {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath =configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
	ExcelData excelDataForInsuranceInfo = new ExcelData(excelTestDataPath, "InsuranceInfo", "DataSetID");
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths jsPaths = new JSPaths(excelPath, "InsuranceInfo", "Ijara_AppDataEntryInsuranceInfo", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData;
	
	

	@And("user Enter the clientname under searchButton for insuranceInfo")
	public void user_enter_the_clientname_under_search_button_for_insuranceInfo() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")));
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).click();
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).sendKeys(testData.get("Ref No"));
		   
	    
	}
	@And("^user update test data set id for AT_INS_001$")
	public void user_update_test_data_set_id_for_at_ins_001() throws Throwable {
		testData = excelDataForInsuranceInfo.getTestdata("AT_INS_001_D1");
	}
	
	@And("user click the insurance Info Screen")
	public void user_click_the_insurance_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceInfo")));
//		String jsPath ="return document.querySelectorAll('ion-label').length";
//        int length=0;
//        for (int i = 0; i <2000; i++) {
//            try {
//                 String label = javaScriptHelper.executeScript(jsPath).toString();
//            //     System.out.println(label);
//                length = Integer.parseInt(label);
//                if (length!=0) {
//               //     System.err.println(length);
//                    break;
//                }
//            } catch (Exception e) {
//                if (i==1999) {
//                    Assert.fail(e.getMessage());
//                }
//            }
//        }
//        for (int i = 0; i <length ; i++) {
//            String jsPath1 =" return document.querySelectorAll('ion-label')["+i+"].innerText";
//            String label = javaScriptHelper.executeScript(jsPath1).toString();
//            System.out.println(label);
//            if (label.equalsIgnoreCase("Insurance Info")) {
//                String jsPath2 ="document.querySelectorAll('ion-label')["+i+"]";
//                System.out.println(jsPath2);
//				WebElement insurance = javaScriptHelper.executeScriptWithWebElement(jsPath2);
//				javaScriptHelper.JSEClick(insurance);
//						
//					}
//            if (i==length-1) {
//                Assert.fail("Element not clicked mismatch with text");
//            }
//				}
		
     
	

		for (int i = 0; i < 200; i++) {
			try {
				//javaScriptHelper.scrollIntoViewAndClick(jsPaths.getElement("insuranceInfo"));
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceInfo")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}	
		    
	

	@And("user click the Add button under insurance Info screen")
	public void user_click_the_add_button_under_insurance_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Addbutton")));
		//Thread.sleep(5000);
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Addbutton")).click();
	    
	}

	@And("user Enter the value in insuranceQuotationId field")
	public void user_enter_the_value_in_insurance_quotation_id_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceQuotationId")));
	
				for (int i = 0; i < 500; i++) {
					try {
						javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceQuotationId")).click();
						break;
					} catch (Exception e) {
					if (i==499) {
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
				dropdownLength = javaScriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
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
				dropdownString = javaScriptHelper.executeScript(
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
				System.out.println("String "+dropdownString.trim());
				System.out.println("Map "+testData.get("insuranceQuotationId").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceQuotationId")).trim())) {			 
				for (int k = 0; k <= 300; k++) {
				try {			 
				clicksAndActionsHelper.moveToElement(javaScriptHelper.executeScriptWithWebElement(
				"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
				clicksAndActionsHelper.clickOnElement(javaScriptHelper.executeScriptWithWebElement(
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

	@And("user Enter the value in insuranceYear field")
	public void user_enter_the_value_in_insurance_year_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceYear")));
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("insuranceYear")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
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
		dropdownLength = javaScriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
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
		dropdownString = javaScriptHelper.executeScript(
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
		System.out.println("String "+dropdownString.trim());
		System.out.println("Map "+testData.get("insuranceYear").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceYear")).trim())) {			 
		for (int k = 0; k <= 300; k++) {
		try {			 
		clicksAndActionsHelper.moveToElement(javaScriptHelper.executeScriptWithWebElement(
		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		clicksAndActionsHelper.clickOnElement(javaScriptHelper.executeScriptWithWebElement(
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
		
 
	

	@And("user Enter the value in depriciation field")
	public void user_enter_the_value_in_depriciation_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("depriciation")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("depriciation")).sendKeys(testData.get("depriciation"));
		
	    
	}

	@And("user Enter the value in AssetPrice field")
	public void user_enter_the_value_in_asset_price_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AssetPrice")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AssetPrice")).sendKeys(testData.get("AssetPrice"));
		 
	    
	}

	@And("user Enter the value in RatePerAsset field")
	public void user_enter_the_value_in_rate_per_asset_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("RatePerAsset")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("RatePerAsset")).sendKeys(testData.get("RatePerAsset"));
		 
	}

	@And("user Enter the value in minimumInsurancePremium field")
	public void user_enter_the_value_in_minimum_insurance_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("minimumInsurancePremium")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("minimumInsurancePremium")).sendKeys(testData.get("minimumInsurancePremium"));
		
	    
	}

	@And("user Enter the value in BaseInsurancePremium field")
	public void user_enter_the_value_in_base_insurance_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BaseInsurancePremium")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BaseInsurancePremium")).sendKeys(testData.get("BaseInsurancePremium"));
		
	    
	}

	@And("user Enter the value in VATPremium field")
	public void user_enter_the_value_in_vat_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("VATPremium")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("VATPremium")).sendKeys(testData.get("VATPremium"));
		
	    
	}

	@And("user Enter the value in NetPremium field")
	public void user_enter_the_value_in_net_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("NetPremium")));
		
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("NetPremium")).sendKeys(testData.get("NetPremium"));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("NetPremium")).sendKeys(Keys.TAB);
	    
	}

	@And("user click the saveButton under insurance info screen")
	public void user_click_the_save_button_under_insurance_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("saveButton")));
		
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("saveButton")).click();
		Thread.sleep(3000);
	    
	}
	@And("user verify the success pop up")
	public void user_verify_the_success_pop_up() {
		for (int i = 0; i < 200; i++) {
			try {
				 javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("saveSuccessAlert"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user check the insurancequotation field is mandatory or not")
	public void user_check_the_insurancequotation_field_is_mandatory_or_not() {
		for (int i = 0; i <2000; i++) {
	        try {
	            String insuranceQuotationIdMandatory = jsPaths.getElement("insuranceQuotationIdMandatory") ;
	            String accountholdername = (String) javaScriptHelper.executeScript("return "+insuranceQuotationIdMandatory);
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
@And("user check the insuranceYear field is mandatory or not")
public void user_check_the_insurance_year_field_is_mandatory_or_not() {
	for (int i = 0; i <2000; i++) {
        try {
            String insuranceYearMandatory = jsPaths.getElement("insuranceYearMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+insuranceYearMandatory);
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

@And("user check the depriciation field is mandatory or not")
public void user_check_the_depriciation_field_is_mandatory_or_not() {
	 for (int i = 0; i <2000; i++) {
         try {
             String depriciationMandatory = jsPaths.getElement("depriciationMandatory") ;
             String accountholdername = (String) javaScriptHelper.executeScript("return "+depriciationMandatory);
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

@And("user check the AssetPrice field is mandatory or not")
public void user_check_the_asset_price_field_is_mandatory_or_not() {
	for (int i = 0; i <2000; i++) {
        try {
            String AssetPriceMandatory = jsPaths.getElement("AssetPriceMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+AssetPriceMandatory);
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

@And("user check the RatePerAsset field is mandatory or not")
public void user_check_the_rate_per_asset_field_is_mandatory_or_not() {
	for (int i = 0; i <2000; i++) {
        try {
            String RatePerAssetMandatory = jsPaths.getElement("RatePerAssetMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+RatePerAssetMandatory);
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

@And("user check the minimumInsurancePremium field is mandatory or not")
public void user_check_the_minimum_insurance_premium_field_is_mandatory_or_not() {
    
	for (int i = 0; i <2000; i++) {
        try {
            String minimumInsurancePremiumMandatory = jsPaths.getElement("minimumInsurancePremiumMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+minimumInsurancePremiumMandatory);
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

@And("user check the BaseInsurancePremium field is mandatory or not")
public void user_check_the_base_insurance_premium_field_is_mandatory_or_not() {
    
	for (int i = 0; i <2000; i++) {
        try {
            String BaseInsurancePremiumMandatory = jsPaths.getElement("BaseInsurancePremiumMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+BaseInsurancePremiumMandatory);
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

@And("user check the VATPremium field is mandatory or not")
public void user_check_the_vat_premium_field_is_mandatory_or_not() {
	for (int i = 0; i <2000; i++) {
        try {
            String VATPremiumMandatory = jsPaths.getElement("VATPremiumMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+VATPremiumMandatory);
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

@And("user check the NetPremium field is mandatory or not")
public void user_check_the_net_premium_field_is_mandatory_or_not() {
	for (int i = 0; i <2000; i++) {
        try {
            String NetPremiumMandatory = jsPaths.getElement("NetPremiumMandatory") ;
            String accountholdername = (String) javaScriptHelper.executeScript("return "+NetPremiumMandatory);
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


}
