package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class TawaraqCommodityPurchaseMakerApplicationDetails {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");	
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "TWCommodityPurchaseAppDetails", "DataCheckAppDetails_FieldName", "JSPath");
	JSPaths offering_OfferDetailsJsPaths = new JSPaths(excelPath, "OfferingOfferDetails_Elements", "Offering_OfferDetails_FieldName", "JSPath");
	
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();
	
	ExcelData dataCheck_ApplicationDetailsExcelData  = new ExcelData(excelTestDataPath,"TWCommodityPurchaseAppDetails","DataSet ID");
	Map<String, String> testData;
	
	@And("^User_604 get the test data for test case AT_TW_CSM_10$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_10() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_TW_CSM_10");
    }
	
	
	@And("User_604 verify the Back button available under Application details screen")
	public void user_verify_the_back_button_available_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
//		for (int i = 0; i <= 500; i++) {
//			try {
//				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
//				break;
//			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		WebElement AppDetailsBackBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsBackBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsBackBtn);
				actions.moveToElement(AppDetailsBackBtn).perform();
				Assert.assertTrue(AppDetailsBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@Given("User_604 Click Application Details tab")
	public void user_click_application_details_tab() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("ApplicationDetailsTab")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
	}


	@And("User_604 verify the Submit button available under Application details screen")
	public void user_verify_the_submit_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsSubmitBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSubmitBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsSubmitBtn);
				actions.moveToElement(AppDetailsSubmitBtn).build().perform();
				Assert.assertTrue(AppDetailsSubmitBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Return button available under Application details screen")
	public void user_verify_the_return_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsReturnBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsReturnBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsReturnBtn);
				actions.moveToElement(AppDetailsReturnBtn).build().perform();
				Assert.assertTrue(AppDetailsReturnBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the View Summary button available under Application details screen")
	public void user_verify_the_view_summary_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsViewSummaryBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsViewSummaryBtn);
				actions.moveToElement(AppDetailsViewSummaryBtn).build().perform();
				Assert.assertTrue(AppDetailsViewSummaryBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_604 validate the Classification value displayed correctly under Application details screen")
	public void user_validate_the_classification_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		String classificationValue = classificationDropdown.getAttribute("aria-label");
		System.out.println("Classification Value: "+classificationValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(classificationDropdown);
				Assert.assertTrue(classificationValue.contains(testData.get("Classification")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}
	
	@And("User_604 validate the Product value displayed correctly under Application details screen")
	public void user_validate_the_product_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		String productDropdownValue = productDropdown.getAttribute("aria-label");
		System.out.println("Product Value: "+productDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(productDropdown);
				Assert.assertTrue(productDropdownValue.contains(testData.get("Product")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Total Finance Amount Requested value displayed correctly under Application details screen")
	public void user_validate_the_total_finance_amount_requested_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalFinanceAmtInput);
				String totalFinanceAmtValue = totalFinanceAmtInput.getAttribute("ng-reflect-model");
				System.out.println("Total Finance Amount: "+totalFinanceAmtValue);
				Assert.assertTrue(totalFinanceAmtValue.contains(testData.get("Total Finance Amt")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Declared Net Monthly Income value displayed correctly under Application details screen")
	public void user_validate_the_declared_net_monthly_income_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredMonthlyIncomeInput);
				String declaredMonthlyIncomeValue = declaredMonthlyIncomeInput.getAttribute("ng-reflect-model");
				System.out.println("Declared Net Income Value: "+declaredMonthlyIncomeValue);
				Assert.assertTrue(declaredMonthlyIncomeValue.contains(testData.get("Declared Monthly Income")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_604 validate the Sourcing Channel value displayed correctly under Application details screen")
	public void user_validate_the_sourcing_channel_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingChannelDropdown);
				String sourcingChannelDropdownValue = sourcingChannelDropdown.getAttribute("aria-label");
				System.out.println("Sourcing Channel Value: "+sourcingChannelDropdownValue);
				Assert.assertTrue(sourcingChannelDropdownValue.contains(testData.get("Sourcing Channel")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Business Center Code value displayed correctly under Application details screen")
	public void user_validate_the_business_center_code_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		String businessCenterCodeDropdownValue = businessCenterCodeDropdown.getAttribute("aria-label");
		System.out.println("Business Center Code Value: "+businessCenterCodeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdownValue.contains(testData.get("Business Center Code")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Servicing Type value displayed correctly under Application details screen")
	public void user_validate_the_servicing_type_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		String servicingTypeDropdownValue = servicingTypeDropdown.getAttribute("aria-label");
		System.out.println("Servicing Type Value: "+servicingTypeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdownValue.contains(testData.get("Servicing Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Region value displayed correctly under Application details screen")
	public void user_validate_the_region_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		String regionDropdownValue = regionDropdown.getAttribute("aria-label");
		System.out.println("Region Value: "+regionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(regionDropdown);
				Assert.assertTrue(regionDropdownValue.contains(testData.get("Region")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Servicing Branch value displayed correctly under Application details screen")
	public void user_validate_the_servicing_branch_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		String servicingBrachValue = servicingBrachDropdown.getAttribute("aria-label");
		System.out.println("Servicing Branch Value: "+servicingBrachValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachValue.contains(testData.get("Servicing Branch")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen")
	public void user_validate_the_closing_staff_or_servicing_staff_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement closingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		String closingStaffDropdownValue = closingStaffDropdown.getAttribute("aria-label");
		System.out.println("Closing Staff Value: "+closingStaffDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdownValue.contains(testData.get("Closing Staff")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	
	
//	AT_ADC_02
	@And("User_604 verify the Classification field available under Application details screen")
	public void user_verify_the_classification_field_available_under_application_details_screen() throws Throwable {
//		Thread.sleep(1000);
		WebElement classificationLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel"));
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		System.out.println("Field Name: "+classificationLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(classificationLabel);
				Assert.assertTrue(classificationLabel.isDisplayed());
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Product field available under Application details screen")
	public void user_verify_the_product_field_available_under_application_details_screen() throws Throwable {
		WebElement productLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productLabel"));
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		System.out.println("Field Name: "+productLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(productLabel);
				Assert.assertTrue(productLabel.isDisplayed());
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Total Finance Amount Requested field available under Application details screen")
	public void user_verify_the_total_finance_amount_requested_field_available_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtLabel"));
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		System.out.println("Field Name: "+totalFinanceAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalFinanceAmtLabel);
				Assert.assertTrue(totalFinanceAmtLabel.isDisplayed());
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				Assert.assertTrue(totalFinanceAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Declared Net Monthly Income field available under Application details screen")
	public void user_verify_the_declared_net_monthly_income_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeLabel"));
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		System.out.println("Field Name: "+declaredMonthlyIncomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredMonthlyIncomeLabel);
				Assert.assertTrue(declaredMonthlyIncomeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				Assert.assertTrue(declaredMonthlyIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Declared Current Obligations field available under Application details screen")
	public void user_verify_the_declared_current_obligations_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredCurrentObligationsLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsLabel"));
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		System.out.println("Field Name: "+declaredCurrentObligationsLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredCurrentObligationsLabel);
				Assert.assertTrue(declaredCurrentObligationsLabel.isDisplayed());
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				Assert.assertTrue(declaredCurrentObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Special Promotion field available under Application details screen")
	public void user_verify_the_special_promotion_field_available_under_application_details_screen() throws Throwable {
		WebElement specialPromotionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionLabel"));
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		System.out.println("Field Name: "+specialPromotionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(specialPromotionLabel);
				Assert.assertTrue(specialPromotionLabel.isDisplayed());
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(specialPromotionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Sourcing Channel field available under Application details screen")
	public void user_verify_the_sourcing_channel_field_available_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelLabel"));
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		System.out.println("Field Name: "+sourcingChannelLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingChannelLabel);
				Assert.assertTrue(sourcingChannelLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				Assert.assertTrue(sourcingChannelDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Business Center Code field available under Application details screen")
	public void user_verify_the_business_center_code_field_available_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeLabel"));
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		System.out.println("Field Name: "+businessCenterCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(businessCenterCodeLabel);
				Assert.assertTrue(businessCenterCodeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Servicing Type field available under Application details screen")
	public void user_verify_the_servicing_type_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeLabel"));
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		System.out.println("Field Name: "+servicingTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingTypeLabel);
				Assert.assertTrue(servicingTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Region field available under Application details screen")
	public void user_verify_the_region_field_available_under_application_details_screen() throws Throwable {
		WebElement regionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionLabel"));
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		System.out.println("Field Name: "+regionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(regionLabel);
				Assert.assertTrue(regionLabel.isDisplayed());
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Servicing Branch field available under Application details screen")
	public void user_verify_the_servicing_branch_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingBrachLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachLabel"));
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		System.out.println("Field Name: "+servicingBrachLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingBrachLabel);
				Assert.assertTrue(servicingBrachLabel.isDisplayed());
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Spoke Location field available under Application details screen")
	public void user_verify_the_spoke_location_field_available_under_application_details_screen() throws Throwable {
		WebElement spokeLocationLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel"));
		System.out.println("Field Name: "+spokeLocationLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(spokeLocationLabel);
				Assert.assertTrue(spokeLocationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Closing Staff or Servicing Staff or RM field available under Application details screen")
	public void user_verify_the_closing_staff_or_servicing_staff_or_rm_field_available_under_application_details_screen() throws Throwable {
		WebElement closingStaffLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffLabel"));
		WebElement closingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		System.out.println("Field Name: "+closingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput")));
				javascriptHelper.backgroundColor(closingStaffLabel);
				Assert.assertTrue(closingStaffLabel.isDisplayed());
				javascriptHelper.backgroundBorder(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Topup Type field available under Application details screen")
	public void user_verify_the_topup_type_field_available_under_application_details_screen() throws Throwable {
		WebElement topupTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeLabel"));
		WebElement topupType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupType"));
		System.out.println("Field Name: "+topupTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(topupTypeLabel);
				Assert.assertTrue(topupTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(topupType);
				Assert.assertTrue(topupType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Topup Application No field available under Application details screen")
	public void user_verify_the_topup_application_no_field_available_under_application_details_screen() throws Throwable {
		WebElement topupAppNoLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoLabel"));
		WebElement topupAppNoInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput"));
		System.out.println("Field Name: "+topupAppNoLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(topupAppNoLabel);
				Assert.assertTrue(topupAppNoLabel.isDisplayed());
				javascriptHelper.backgroundBorder(topupAppNoInput);
				Assert.assertTrue(topupAppNoInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_ADC_03
	@And("User_604 verify the Sourcing Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_type_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel"));
		WebElement sourcingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeDropdown"));
		System.out.println("Field Name: "+sourcingTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				javascriptHelper.backgroundColor(sourcingTypeLabel);
				Assert.assertTrue(sourcingTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingTypeDropdown);
				Assert.assertTrue(sourcingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Sourcing Office field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_office_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingOfficeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel"));
		WebElement sourcingOfficeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		System.out.println("Field Name: "+sourcingOfficeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingOfficeLabel);
				Assert.assertTrue(sourcingOfficeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingOfficeDropdown);
				Assert.assertTrue(sourcingOfficeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Sourcing Entity field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_entity_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingEntityLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel"));
		WebElement sourcingEntityDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityDropdown"));
		System.out.println("Field Name: "+sourcingEntityLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingEntityLabel);
				Assert.assertTrue(sourcingEntityLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingEntityDropdown);
				Assert.assertTrue(sourcingEntityDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Sourcing Staff field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_staff_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingStaffLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel"));
		WebElement sourcingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffDropdown"));
		System.out.println("Field Name: "+sourcingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingStaffLabel);
				Assert.assertTrue(sourcingStaffLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingStaffDropdown);
				Assert.assertTrue(sourcingStaffDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Reference Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_reference_type_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement referenceTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel"));
		WebElement referenceTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeDropdown"));
		System.out.println("Field Name: "+referenceTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(referenceTypeLabel);
				Assert.assertTrue(referenceTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(referenceTypeDropdown);
				Assert.assertTrue(referenceTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Reference Code field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_reference_code_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement referenceCodeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel"));
		WebElement referenceCodeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeInput"));
		System.out.println("Field Name: "+referenceCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(referenceCodeLabel);
				Assert.assertTrue(referenceCodeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(referenceCodeInput);
				Assert.assertTrue(referenceCodeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
		
	
//	AT_ADC_05
	@And("User_604 verify the Classification Dropdown field available under Application details screen")
	public void user_verify_the_classification_dropdown_field_available_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_604 verify the Product Dropdown field available under Application details screen")
	public void user_verify_the_product_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Total Finance Amount Requested input field available under Application details screen")
	public void user_verify_the_total_finance_amount_requested_input_field_available_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				Assert.assertTrue(totalFinanceAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Declared Net Monthly Income input field available under Application details screen")
	public void user_verify_the_declared_net_monthly_income_input_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				Assert.assertTrue(declaredMonthlyIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Declared Current Obligations input field available under Application details screen")
	public void user_verify_the_declared_current_obligations_input_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				Assert.assertTrue(declaredCurrentObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_ADC_06
	@And("User_604 verify the Special Promotion Dropdown field available under Application details screen")
	public void user_verify_the_special_promotion_dropdown_field_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(specialPromotionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Sourcing Channel Dropdown field available under Application details screen")
	public void user_verify_the_sourcing_channel_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				Assert.assertTrue(sourcingChannelDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Business Center Code Dropdown field available under Application details screen")
	public void user_verify_the_business_center_code_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Servicing Type Dropdown field available under Application details screen")
	public void user_verify_the_servicing_type_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Region Dropdown field available under Application details screen")
	public void user_verify_the_region_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify the Servicing Branch Dropdown field available under Application details screen")
	public void user_verify_the_servicing_branch_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
}
