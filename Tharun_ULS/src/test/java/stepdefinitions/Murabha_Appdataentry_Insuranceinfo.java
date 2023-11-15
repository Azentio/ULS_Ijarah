package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_Appdataentry_Insuranceinfo {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths MurabhAppdataEntryInsuranceInfo = new JSPaths(excelPath, "MurabhAppdataEntryInsuranceInfo", "FieldName", "JSPath");
	ExcelData MurabhAppdataEntryInsuranceInfoexelData = new ExcelData(excelTestDataPath, "MurabhAppdataEntryInsuranceInfo", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	
	@And("user Enter the clientname under searchButton for insuranceInfo")
	public void user_enter_the_clientname_under_search_button_for_insuranceInfo() throws Throwable {
		for (int i = 0; i <= 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("searchinput")).sendKeys(testData.get("ClientName"));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
			}
	
	@And("User_607 Enter the clientname under searchButton for Appdata entry QuationInfo")
	public void user_enter_the_clientname_under_search_button_for_Appdata_entry_QuationInfoInfo() throws Throwable {
		for (int i = 0; i <= 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("searchinput")).sendKeys("3357");
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
			}
	
	@And("^User_607 Update testdata from AT_MU_INS_01$")
	public void user_update_test_data_set_id_for_AT_MU_INS_01() throws Throwable {
		testData = MurabhAppdataEntryInsuranceInfoexelData.getTestdata("DS_AT_MU_INS_01");
	}
	
	@And("^User_607 Update testdata from AT_MU_INS_02$")
	public void user_update_test_data_set_id_for_AT_MU_INS_02() throws Throwable {
		testData = MurabhAppdataEntryInsuranceInfoexelData.getTestdata("DS_AT_MU_INS_02");
	}
	
	
	@And("user click the insurance Info Screen")
	public void user_click_the_insurance_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceInfo")));
//		String jsPath ="return document.querySelectorAll('ion-label').length";
//        int length=0;
//        for (int i = 0; i <2000; i++) {
//            try {
//                 String label = javascriptHelper.executeScript(jsPath).toString();
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
//            String label = javascriptHelper.executeScript(jsPath1).toString();
//            System.out.println(label);
//            if (label.equalsIgnoreCase("Insurance Info")) {
//                String jsPath2 ="document.querySelectorAll('ion-label')["+i+"]";
//                System.out.println(jsPath2);
//				WebElement insurance = javascriptHelper.executeScriptWithWebElement(jsPath2);
//				javascriptHelper.JSEClick(insurance);
//						
//					}
//            if (i==length-1) {
//                Assert.fail("Element not clicked mismatch with text");
//            }
//				}
		
     
	

		for (int i = 0; i < 200; i++) {
			try {
				//javascriptHelper.scrollIntoViewAndClick(MurabhAppdataEntryInsuranceInfo.getElement("insuranceInfo"));
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceInfo")).click();
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
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("Addbutton")));
		//Thread.sleep(5000);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("Addbutton")).click();
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("user click the Add button under Quotation Info screen")
	public void user_click_the_add_button_under_Quotation_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("Addbutton")));
		//Thread.sleep(5000);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("Addbutton")).click();
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user Enter the value in insuranceQuotationId field")
	public void user_enter_the_value_in_insurance_quotation_id_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceQuotationId")));
	
				for (int i = 0; i < 500; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceQuotationId")).click();
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
				System.out.println("String "+dropdownString.trim());
				System.out.println("Map "+testData.get("insuranceQuotationId").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceQuotationId")).trim())) {			 
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

	@And("user Enter the value in insuranceYear field")
	public void user_enter_the_value_in_insurance_year_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceYear")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("insuranceYear")).click();
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
		System.out.println("String "+dropdownString.trim());
		System.out.println("Map "+testData.get("insuranceYear").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceYear")).trim())) {			 
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
		
 
	

	@And("user Enter the value in depriciation field")
	public void user_enter_the_value_in_depriciation_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("depriciation")));
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("depriciation")).sendKeys(testData.get("depriciation"));
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user Enter the value in AssetPrice field")
	public void user_enter_the_value_in_asset_price_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("AssetPrice")));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("AssetPrice")).sendKeys(testData.get("AssetPrice"));
	}

	@And("user Enter the value in RatePerAsset field")
	public void user_enter_the_value_in_rate_per_asset_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("RatePerAsset")));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("RatePerAsset")).sendKeys(testData.get("RatePerAsset"));
		 
	}

	@And("user Enter the value in minimumInsurancePremium field")
	public void user_enter_the_value_in_minimum_insurance_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("minimumInsurancePremium")));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("minimumInsurancePremium")).sendKeys(testData.get("minimumInsurancePremium"));
		
	    
	}

	@And("user Enter the value in BaseInsurancePremium field")
	public void user_enter_the_value_in_base_insurance_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("BaseInsurancePremium")));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("BaseInsurancePremium")).sendKeys(testData.get("BaseInsurancePremium"));
		
	    
	}

	@And("user Enter the value in VATPremium field")
	public void user_enter_the_value_in_vat_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("VATPremium")));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("VATPremium")).sendKeys(testData.get("VATPremium"));
		
	    
	}

	@And("user Enter the value in NetPremium field")
	public void user_enter_the_value_in_net_premium_field() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("NetPremium")));
		
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("NetPremium")).sendKeys(testData.get("NetPremium"));
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("NetPremium")).sendKeys(Keys.TAB);
	    
	}

	@And("user click the saveButton under insurance info screen")
	public void user_click_the_save_button_under_insurance_info_screen() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("saveButton")));
		
		javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("saveButton")).click();
		Thread.sleep(3000);
	    
	}
	@And("user verify the success pop up")
	public void user_verify_the_success_pop_up() {
		for (int i = 0; i < 200; i++) {
			try {
				 javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryInsuranceInfo.getElement("saveSuccessAlert"));
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
	            String insuranceQuotationIdMandatory = MurabhAppdataEntryInsuranceInfo.getElement("insuranceQuotationIdMandatory") ;
	            String accountholdername = (String) javascriptHelper.executeScript("return "+insuranceQuotationIdMandatory);
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
            String insuranceYearMandatory = MurabhAppdataEntryInsuranceInfo.getElement("insuranceYearMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+insuranceYearMandatory);
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
             String depriciationMandatory = MurabhAppdataEntryInsuranceInfo.getElement("depriciationMandatory") ;
             String accountholdername = (String) javascriptHelper.executeScript("return "+depriciationMandatory);
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
            String AssetPriceMandatory = MurabhAppdataEntryInsuranceInfo.getElement("AssetPriceMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+AssetPriceMandatory);
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
            String RatePerAssetMandatory = MurabhAppdataEntryInsuranceInfo.getElement("RatePerAssetMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+RatePerAssetMandatory);
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
            String minimumInsurancePremiumMandatory = MurabhAppdataEntryInsuranceInfo.getElement("minimumInsurancePremiumMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+minimumInsurancePremiumMandatory);
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
            String BaseInsurancePremiumMandatory = MurabhAppdataEntryInsuranceInfo.getElement("BaseInsurancePremiumMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+BaseInsurancePremiumMandatory);
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
            String VATPremiumMandatory = MurabhAppdataEntryInsuranceInfo.getElement("VATPremiumMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+VATPremiumMandatory);
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
            String NetPremiumMandatory = MurabhAppdataEntryInsuranceInfo.getElement("NetPremiumMandatory") ;
            String accountholdername = (String) javascriptHelper.executeScript("return "+NetPremiumMandatory);
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
