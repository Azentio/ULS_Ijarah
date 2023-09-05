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
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class New_Application {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths New_ApplicationPaths = new JSPaths(excelPath, "New_Application", "FieldName", "JSPath");
	
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "New_Application", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	@Given("User_607 Update testdata from AT_NEWAPP_02")
	public void user_update_testdata_from_at_newapp() {
		testData = IncomeDetailsListexelData.getTestdata("DS_AT_NEWAPP_02");
	}

	@Given("User_607 Check GoBack Field")
	public void user_check_go_back_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("GoBack")).isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Save button Field")
	public void user_check_save_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Savebutton")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	}

	@Given("User_607 Check Submit button Field")
	public void user_check_submit_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Submitbutton")).isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Return button Field")
	public void user_check_return_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Returnbutton")).isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Views summary Field")
	public void user_check_views_summary_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Viewsummary")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	}
	
	@Given("User_607 Check Product Field")
	public void user_check_product_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Product")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Subproduct Field")
	public void user_check_subproduct_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Subproduct")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Total Finance Amount Requested Field")
	public void user_check_total_finance_amount_requested_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Declared Net Monthly Income Field")
	public void user_check_declared_net_monthly_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Declared Current Obligations Field")
	public void user_check_declared_current_obligations_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredCurrentObligations")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Special Promotion\\/Campaign Field")
	public void user_check_special_promotion_campaign_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Special Promotion/Campaign")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Sourcing Channel Field")
	public void user_check_sourcing_channel_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingChannel")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Business Center Code Field")
	public void user_check_business_center_code_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("BusinessCenterCode")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Servicing Type Field")
	public void user_check_servicing_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingType")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Region Field")
	public void user_check_region_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Region")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Servicing Branch Field")
	public void user_check_servicing_branch_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingBranch")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Spoke Location Field")
	public void user_check_spoke_location_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SpokeLocation")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Closing Staff Or Servicing Staff Or RM Field")
	public void user_check_closing_staff_or_servicing_staff_or_rm_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ClosingStaffOrServicingStaffOrRM")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Topup Type Field")
	public void user_check_topup_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupType")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Topup Application No Field")
	public void user_check_topup_application_no_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupApplicationNo")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	    
	}
	
	@Given("User_607 Check SourcingType Field")
	public void user_check_sourcing_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingType")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check SourcingOffice Field")
	public void user_check_sourcing_office_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingOffice")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check SourcingEntity Field")
	public void user_check_sourcing_entity_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingEntity")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check SourcingStaff Field")
	public void user_check_sourcing_staff_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingStaff")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check ReferenceType Field")
	public void user_check_reference_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceType")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check ReferenceEntity Field")
	public void user_check_reference_entity_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceEntity")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check ReferenceCode Field")
	public void user_check_reference_code_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	    
	}
	
	@Given("User_607 Save the record")
	public void user_save_the_record() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Savebutton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Check popup after save the record")
	public void user_check_popup_after_save_the_record() throws Throwable {
		Thread.sleep(2000);
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SuccessSavePopup")).isDisplayed()) {
			SoftAssert.fail();
		}
		SoftAssert.assertAll();
	}
	
	@Given("User_607 Click back button to move main page")
	public void user_click_back_button_to_move_main_page() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("backButton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		
	}
	
	@Given("User_607 Check Product field should be mandatory")
	public void user_check_product_field_should_be_mandatory() {
            for (int i = 0; i <2000; i++) {
                try {
                	String repayment = New_ApplicationPaths.getElement("Product*");
                   // String repayment ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
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
	

	@Given("User_607 Check Product Field should be editable")
	public void user_check_product_field_should_be_editable() {
	   
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Product")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
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

				System.out.println("Map " + testData.get("SelectOptionInProduct").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("SelectOptionInProduct")).trim())) {

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

	@Given("User_607 Check Sub Product field should be mandatory")
	public void user_check_sub_product_field_should_be_mandatory() {
	    
		  for (int i = 0; i <2000; i++) {
              try {
              	String repayment = New_ApplicationPaths.getElement("Subproduct*");
                 // String repayment ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
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

	@Given("User_607 Check Sub Product Field should be editable")
	public void user_check_sub_product_field_should_be_editable() {
	  
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Subproduct*")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
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

				System.out.println("Map " + testData.get("SelectOptionInSubProduct").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("SelectOptionInSubProduct")).trim())) {

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


	
	
	
	
}
