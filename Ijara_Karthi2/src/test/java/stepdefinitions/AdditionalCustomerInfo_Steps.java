package stepdefinitions;

import java.util.Map;

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

public class AdditionalCustomerInfo_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	
	ExcelData excelDataForAdditionalCustomerInfo = new ExcelData(excelTestDataPath, "AdditionalCustomerInfo", "DataSetID");
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths jsPaths = new JSPaths(excelPath, "AdditionalCustomerInfo", "Ijara_AdditionalCustomerInfo", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData;
	
	
	@And("^user update test data set id for AT_IDA_01$")
	public void user_update_test_data_set_id_for_at_ida_01() throws Throwable {
		testData = excelDataForAdditionalCustomerInfo.getTestdata("AT_IDA_01_D1");
	}

	@And("user Enter the clientname under searchButton for AdditionalCustomerInfo")
	public void user_enter_the_clientname_under_search_button_for_AdditionalCustomerInfo() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")));
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).click();
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).sendKeys(testData.get("ClientName"));
		   
	    
	}
	@And("user click the Additional customer Info tab")
	public void user_click_the_additional_customer_info_tab() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AdditionalCustomerInfo")).click();
				break;
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("user verify the BackButton in additional customer info tab")
	public void user_verify_the_back_button_in_additional_customer_info_tab() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BackButton")).isDisplayed());
	    
	}

	@And("user verify the FirstAddButton in additional customer info tab")
	public void user_verify_the_first_add_button_in_additional_customer_info_tab() {
	   
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("FirstAddButton")).isDisplayed());
	}

	@And("user verify the SecondAddButton in additional customer info tab")
	public void user_verify_the_second_add_button_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("SecondAddButton")).isDisplayed());
	    
	}

	@And("user verify the IdType in additional customer info tab")
	public void user_verify_the_id_type_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdType")).isDisplayed());
	    
	}

	@And("user verify the IdNumber in additional customer info tab")
	public void user_verify_the_id_number_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdNumber")).isDisplayed());
	    
	}

	@And("user verify the IssueDateCalender in additional customer info tab")
	public void user_verify_the_issue_date_calender_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueDateCalender")).isDisplayed());
	    
	}

	@And("user verify the IssueDateToday in additional customer info tab")
	public void user_verify_the_issue_date_today_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueDateToday")).isDisplayed());
	    
	}

	@And("user verify the ExpiryDateCalender in additional customer info tab")
	public void user_verify_the_expiry_date_calender_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpiryDateCalender")).isDisplayed());
	    
	}

	@And("user verify the ExpireDateToday in additional customer info tab")
	public void user_verify_the_expire_date_today_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpireDateToday")).isDisplayed());
	    
	}

	@And("user verify the IssueingAuthority in additional customer info tab")
	public void user_verify_the_issueing_authority_in_additional_customer_info_tab() {
	   
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueingAuthority")).isDisplayed());
	}

	@And("user verify the CountryOfIssue in additional customer info tab")
	public void user_verify_the_country_of_issue_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("CountryOfIssue")).isDisplayed());
	    
	}

	@And("user verify the IdTypeMandatory in additional customer info tab")
	public void user_verify_the_id_type_mandatory_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdTypeMandatory")).isDisplayed());
	    
	}

	@And("user verify the IssueingAuthorityMandatory in additional customer info tab")
	public void user_verify_the_issueing_authority_mandatory_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueingAuthorityMandatory")).isDisplayed());
	    
	}

	@And("user verify the CountryOfIssueMandatory in additional customer info tab")
	public void user_verify_the_country_of_issue_mandatory_in_additional_customer_info_tab() {
	   
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("CountryOfIssueMandatory")).isDisplayed());
	}

	@And("user verify the SaveButton in additional customer info tab")
	public void user_verify_the_save_button_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("SaveButton")).isDisplayed());
	    
	}

	@And("user verify the IdNumVerification in additional customer info tab")
	public void user_verify_the_id_num_verification_in_additional_customer_info_tab() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdNumVerification")).isDisplayed());
	    
	}

	@And("user click the EditButton in additional customer info tab")
	public void user_click_the_edit_button_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("EditButton")).click();
	    
	}
	@And("user click the FirstAddButton in additional customer info tab")
	public void user_click_the_first_add_button_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("FirstAddButton")).click();
	   
	}

	@And("user click the SecondAddButton in additional customer info tab")
	public void user_click_the_second_add_button_in_additional_customer_info_tab() throws Throwable {
		Thread.sleep(4000);
		String length=null;
		for (int i = 0; i < 200; i++) {try {
			length = javaScriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
			if (!length.isBlank()||!length.isEmpty()) {
				System.err.println(length);
				break;
			}
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
			
			
		}
		 
		int length1 = Integer.parseInt(length);
		for (int i = 0; i <length1; i++) {
			String jsPath = "return document.querySelectorAll('ion-title[mode=\"md\"]')["+i+"].innerText";
			String screename=null;
			for (int j = 0; j <200; j++) {
				try {
					screename = javaScriptHelper.executeScript(jsPath).toString();
					if (!screename.isBlank()||!screename.isEmpty()) {
						System.err.println(screename);
						break;
					}
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
				}
			}
			}
			if (screename.contains("Customer Identification")) {
				String jspath2 ="document.querySelectorAll('ion-title[mode=\"md\"]')["+i+"].parentElement.nextElementSibling.querySelector('button')";
				System.out.println(jspath2);
				for (int k = 0; k <200; k++) {
					try {
						javaScriptHelper.executeScriptWithWebElement(jspath2).click();
						break;
					} catch (Exception e) {
						if (k==199) {
							Assert.fail(e.getMessage());
					
					}
			
			}
				}
			
		}
			

		}
//		for (int h = 0; h < 200; h++) {
//			try {
//				 javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("SecondAddButton")).click(); 
//				break;
//			} catch (Exception e) {
//				if (h==199) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		
//		}
	}
	

	@And("user click the BackButton in additional customer info tab")
	public void user_click_the_back_button_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BackButton")).click();
	   
	}

	@And("user click and enter the value IdType in additional customer info tab")
	public void user_click_enter_the_value_id_type_in_additional_customer_info_tab() {
	    
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdType")).click();
		
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
		System.out.println("Map "+testData.get("IdType").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IdType")).trim())) {			 
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

	@And("user click and enter the value IdNumber in additional customer info tab")
	public void user_click_and_enter_the_value_id_number_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdNumber")).sendKeys(testData.get("IdNumber"));
	   
	}

	@And("user click the IssueDateCalender in additional customer info tab")
	public void user_click_the_issue_date_calender_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueDateCalender")).click();
	   
	}

	@And("user click the IssueDateToday in additional customer info tab")
	public void user_click_the_issue_date_today_in_additional_customer_info_tab() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueDateToday")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	   
	}

	@And("user click the ExpiryDateCalender in additional customer info tab")
	public void user_click_the_expiry_date_calender_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpiryDateCalender")).click();
	   
	}

	@And("user click the ExpireDateToday in additional customer info tab")
	public void user_click_the_expire_date_today_in_additional_customer_info_tab() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpireDateToday")).click();
				   
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user click and enter the value IssueingAuthority in additional customer info tab")
	public void user_click_and_enter_the_value_issueing_authority_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueingAuthority")).click();

		
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
		System.out.println("Map "+testData.get("IssueingAuthority").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IssueingAuthority")).trim())) {			 
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

	@And("user click and enter the value CountryOfIssue in additional customer info tab")
	public void user_click_and_enter_the_value_country_of_issue_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("CountryOfIssue")).click();

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
		System.out.println("Map "+testData.get("IssueCountry").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IssueCountry")).trim())) {			 
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

	@And("user verify IdTypeMandatory in additional customer info tab")
	public void user_verify_id_type_mandatory_in_additional_customer_info_tab() {
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdTypeMandatory")).click();
		for (int i = 0; i <2000; i++) {
	        try {
	            String insuranceQuotationIdMandatory = jsPaths.getElement("IdTypeMandatory") ;
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
	@And("user verify IdNumberMandatory in additional customer info tab")
	public void user_verify_id_number_mandatory_in_additional_customer_info_tab() {
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdTypeMandatory")).click();
		for (int i = 0; i <2000; i++) {
	        try {
	            String insuranceQuotationIdMandatory = jsPaths.getElement("IdNumberMandatory") ;
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

	@And("user verify IssueingAuthorityMandatory in additional customer info tab")
	public void user_verify_issueing_authority_mandatory_in_additional_customer_info_tab() {
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IssueingAuthorityMandatory")).click();
		for (int i = 0; i <2000; i++) {
	        try {
	            String insuranceQuotationIdMandatory = jsPaths.getElement("IssueingAuthorityMandatory") ;
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

	@And("user verify CountryOfIssueMandatory in additional customer info tab")
	public void user_verify_country_of_issue_mandatory_in_additional_customer_info_tab() {
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("CountryOfIssueMandatory")).click();
		for (int i = 0; i <2000; i++) {
	        try {
	            String insuranceQuotationIdMandatory = jsPaths.getElement("CountryOfIssueMandatory") ;
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

	@And("user click the IdNumVerification in additional customer info tab")
	public void user_click_the_id_num_verification_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("IdNumVerification")).click();
	   
	}

	@And("user click the SaveButton in additional customer info tab")
	public void user_click_the_save_button_in_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("SaveButton")).click();
	   
	}
	
	@And("user verify the same record got saved in screen")
	public void user_verify_the_same_record_got_saved_in_screen() {
		String verification = null;
		for (int i = 0; i < 200; i++) {
			 verification = javaScriptHelper.executeScript("return "+jsPaths.getElement("IdNumVerification")).toString();
			if (!verification.isBlank()||!verification.isEmpty()) {
				break;
			}
		}
		  System.out.println(verification);
		  Assert.assertEquals(verification,testData.get("IdNumber"));
		
	}



	
}
