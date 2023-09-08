package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CFEmploymentDetailsSteps611 {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	
    String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
    
    WebDriver driver = BaseClass.driver;
    JSPaths jsPathexcel = new JSPaths(excelPath, "CF_EmploymentDetails", "Ijara_LoginFieldName", "JSPath");
    ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
    Map<String, String> loginTestData = new HashMap<>();
    JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
    WaitHelper waithelper = new WaitHelper(driver);
    ClicksAndActionsHelper clicksandactionshelper = new ClicksAndActionsHelper(driver);
    SoftAssert softassert = new SoftAssert();
    
    String path = System.getProperty("user.dir") +"\\TestData\\ijaraTestData.xlsx";
	ExcelData CFEmpolymentDetails = new ExcelData(path,"CF_EmploymentDetails","DataSet ID");
	
	ExcelData ContractSigningAppdet = new ExcelData(path,"ContractSigning_Appdet","DataSet ID");
	Map<String, String> testData;
	
    //-------------CF_EmploymentDetails
	
	@And("^User_611 Get the dataSetId for DS_AT_EMPD_001")
    public void User_611_Get_the_data_set_Id_for_DS_AT_EMPD_001() throws Throwable {
		testData = CFEmpolymentDetails.getTestdata("DS_AT_EMPD_001");
    }
	
	//-------------ContractSigningAppdet
	
	@And("^User_611 Get the dataSetId for DS_AT_ADC_001")
    public void User_611_Get_the_data_set_Id_for_DS_AT_ADC_001() throws Throwable {
		testData = ContractSigningAppdet.getTestdata("DS_AT_ADC_001");
    }
	
    @And("User_611 Clicks the modue name in Kuls application")
    public void user_clicks_the_modue_name_in_kuls_application() throws Throwable {
    	javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("moduleNameDropdown")).click();
     }
           
    @And("User_611 Clicks the Los in Kuls application")
    public void user_clicks_the_los_in_kuls_application() throws Throwable {
    	String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
        String moduleLength = "";
        for (int i = 0; i <= 300; i++) {
            try {
                moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
                System.out.println("Module Length " + moduleLength);
                if (!(moduleLength.isBlank())) {
                    break;
                }
            } catch (Exception e) {
                if (i == 300) {
                    Assert.fail(e.getMessage());
                }
            }
        }
        int premitiveIntegerLength = Integer.parseInt(moduleLength);

 

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
        for (int i = 0; i < premitiveIntegerLength; i++) {
            for (int j = 0; j <= 300; j++) {
                try {
                    String moduleName = javascriptHelper.executeScript(
                            "return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
                            .toString();
                    System.out.println("Module name " + moduleName);
                    if (moduleName.equalsIgnoreCase("LOS")) {
                        System.out
                                .println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
                        javascriptHelper
                                .executeScriptWithWebElement(
                                        "document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
                                .click();
                        break;
                     }
                } catch (Exception e) {
                 }
            }
        }
    }

    @And("User_611 Clicks the Mail box in Kuls application")
    public void user_clicks_the_mail_box_in_kuls_application() throws Throwable {
        javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Mailbox")).click();
    }
    @And("User_611 Clicks the search box in Kuls application")
    public void user_clicks_the_search_box_in_kuls_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox1")));
    	for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox1")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				
				}// TODO: handle exception
			}
		}
    	
    }
    @And("User_611 Search the app data in Kuls application")
    public void user_search_the_app_data_in_kuls_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox2")));
        for (int i = 0; i<=500; i++) {
        	try {
        		javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox2")).sendKeys("App data");
        		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    	
    }
    @And("User_611 Clicks the Entitle button in Kuls application")
    public void user_clicks_the_entitle_button_in_kuls_application() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Entitle button")) );
    	javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Entitle button")).click();
    }
    @And("User_611 Clicks the customer financial tab in Kuls application")
    public void user_clicks_the_customer_financial_tab_in_kuls_application() throws Throwable {
       	javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Customer Financial Tab")).click();
    }
    @And("User_611 Clicks the edit button in customer financial tab under Kuls application")
    public void user_clicks_the_edit_button_in_customer_financial_tab_under_kuls_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Customer Personal Information Edit btn")));
    	javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Customer Personal Information Edit btn")).click();
    }
    @And("User_611 Clicks the add button in customer financial tab under Kuls application")
    public void user_clicks_the_add_button_in_customer_financial_tab_under_kuls_application() throws Throwable {
    	// document.querySelectorAll('ion-title[class="pl-2 pr-2 ion-color
    	// ion-color-dark md title-default hydrated"]').length
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
    	for (int j = 0; j < premitiveListOfAddButton; j++) {
    	for (int k = 0; k <= 300; k++) {
    	try {
    	addButtonScreenName = javascriptHelper.executeScript(
    	"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
    	+ j + "].textContent")
    	.toString();
    	System.out.println("Screen Name " + addButtonScreenName);
    	if (!(addButtonScreenName.isBlank())) {
    	System.out.println("Screen Name" + addButtonScreenName + " is Not null");
    	if ((addButtonScreenName.trim()).equalsIgnoreCase((" Customer Employment List ").trim())) {
    	System.out.println("Inside nested loop");
    	System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
    	javascriptHelper
    	.executeScriptWithWebElement(
    	"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
    	.click();
    	isAddButtonClicked = true;
    	break;
    	}
    	}
    	} catch (Exception e) {
    	if (k == 300) {
    	Assert.fail(e.getMessage());
    	}
    	}
   	     	}
    	if (isAddButtonClicked == true) {
    	break;
    	}
    	     	}
    }
    @And("User_611 Enter the Current Value in Employment details under customer financial")
    public void user_enter_the_current_value_in_employment_details_under_customer_financial() throws Throwable {
    	for (int i = 0; i <= 300; i++) {
    		try {
    		javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Emplyment period select box")).click();
    		break;
    		} catch (Exception e) {
    		if (i == 300) {
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
    		System.out.println("Map "+testData.get("Employment Period").trim());
    		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Employment Period")).trim())) {
      		for (int k = 0; k <= 300; k++) {
    		try {
    		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
    		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
    		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
    
 //@AT_ADC_001
    //ADC_01_01
    
    @And("User_611 Validate the Back button in Application details under contract signing")
    public void user_validate_the_back_button_in_application_details_under_contract_signing() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Go back button")) );
    	for (int i = 0; i<=500; i++) {
        	try {
        		if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Go back button")).isDisplayed()) {
            		softassert.fail();
        		}
        		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
           	    }
    @And("User_611 Validate the Save button in Application details under contract signing")
    public void user_validate_the_save_button_in_application_details_under_contract_signing() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Save update button")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Save update button")).isDisplayed()) {
    		softassert.fail();
    	}
    }

   
    @And("User_611 Validate the Approved button in Application details under contract signing")
    public void user_validate_the_approved_button_in_application_details_under_contract_signing() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Approve button ")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Approve button ")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the Reject button in Application details under contract signing")
    public void user_validate_the_reject_button_in_application_details_under_contract_signing() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reject button")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reject button")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the return button in Application details under contract signing")
    public void user_validate_the_return_button_in_application_details_under_contract_signing() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Return button")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Return button")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the view summary button in Application details under contract signing")
    public void user_validate_the_view_summary_button_in_application_details_under_contract_signing() throws Throwable {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("View Summary")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("View Summary")).isDisplayed()) {
    		softassert.fail();
    	}

    }
    @And("User_611 Search the duplicate in Kuls application")
    public void user_search_the_dupicate_in_kuls_application() throws Throwable  {
    	//waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox2")));
        for (int i = 0; i<=500; i++) {
        	try {
        		javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Searchbox2")).sendKeys("283");
        		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    	
    }
    //@ADC_01_02
    @And("User_611 Validate the product value is inbuiltly entered")
    public void user_validate_the_product_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Product value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Product value is visible")).isDisplayed()) {
    		softassert.fail();
    	}   
    }

    @And("User_611 Validate the sub product value is inbuiltly entered")
    public void user_validate_the_sub_product_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Sub Product value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Sub Product value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the Total finance amount requested value is inbuiltly entered")
    public void user_validate_the_total_finance_amount_requested_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the declared net monthly income value is inbuiltlt entered")
    public void user_validate_the_declared_net_monthly_income_value_is_inbuiltlt_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared  net monthly income value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared  net monthly income value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the declared current obligations value is inbuiltly entered")
    public void user_validate_the_declared_current_obligations_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" declared current oblications value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" declared current oblications value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the Sourcing channel value is inbuiltly entered")
    public void user_validate_the_sourcing_channel_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("sourcing channel value is visible ")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("sourcing channel value is visible ")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the Business central code value is inbuiltly entered")
    public void user_validate_the_business_central_code_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Business center code value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Business center code value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }

    @And("User_611 Validate the servicing type value is inbuiltly entered")
    public void user_validate_the_servicing_type_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Servicing type value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Servicing type value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    	
    }
    @And("User_611 Validate the Servicing Branch value is inbuiltly entered")
	public void user_validate_the_servicing_branch_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("servicing branch select box ")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("servicing branch select box ")).isDisplayed()) {
    		softassert.fail();
    	}
	}

	@And("User_611 Validate the closing and servicing staff value is inbuiltly entered")
	public void user_validate_the_closing_and_servicing_staff_value_is_inbuiltly_entered() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Closing Staff or Servicing Staff slect box")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Closing Staff or Servicing Staff slect box")).isDisplayed()) {
    		softassert.fail();
    	}
	}

    @And("User_611 Validate the Region value is inbuiltly entered")
    public void user_validate_the_region_value_is_inbuiltly_entered() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Region value is visible")) );
    	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Region value is visible")).isDisplayed()) {
    		softassert.fail();
    	}
    }
  //@ADC_01_03
    
     @And("User_611 Validate the Special promotional /campaign is editable")
    public void user_select_the_value_in_special_promotion_and_campaign() throws Throwable{
    	waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("special promotion/Campaign selct box")));
    	for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("special promotion/Campaign selct box")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				
				}// TODO: handle exception
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
		System.out.println("Map "+testData.get("Special promotion ").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Special promotion ")).trim())) {
		 
		for (int k = 0; k <= 300; k++) {
		try {
		 
		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
     
     @And("User_611 Validate the product label")
     public void user_validate_the_product_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Product")) );
     	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Product")).isDisplayed()) {
     		softassert.fail();
     	}
 	}
     @And("User_611 Validate the Total finance amount requested label")
     public void user_validate_the_total_finance_amount_requested_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Total Finance Amount Requested")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Total Finance Amount Requested")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Declared net  monthly income label")
     public void user_validate_the_declared_net_monthly_income_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation declared  net monthly income ")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation declared  net monthly income ")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Declared current obligations label")
     public void user_validate_the_declared_current_obligations_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation declared current oblications")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation declared current oblications")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Special promotional \\/campaign label")
     public void user_validate_the_special_promotional_campaign_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation special promotion/Campaign")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation special promotion/Campaign")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the sourcing channel label")
     public void user_validate_the_sourcing_channel_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation sourcing channel")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation sourcing channel")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Bussiness center code label")
     public void user_validate_the_bussiness_center_code_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Business center code")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Business center code")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the servicing type label")
     public void user_validate_the_servicing_type_label() throws Throwable {
       
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Servicing type")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Servicing type")).isDisplayed()) {
      		softassert.fail();
      	}
     }

     @And("User_611 Validate the Region label")
     public void user_validate_the_region_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Region")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Region")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Servicing branch label")
     public void user_validate_the_servicing_branch_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Servicing branch")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Servicing branch")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Spoke location label")
     public void user_validate_the_spoke_location_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Spoke location ")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Spoke location ")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }

     @And("User_611 Validate the Closing staff or servicing staff or RM label")
     public void user_validate_the_closing_staff_or_servicing_staff_or_rm_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Closing Staff or Servicing Staff")) );
      	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Closing Staff or Servicing Staff")).isDisplayed()) {
      		softassert.fail();
      	}
         
     }
     @And("User_611 Valiadte the sub product label")
     public void user_valiadte_the_sub_product_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sub Product")) );
       	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sub Product")).isDisplayed()) {
       		softassert.fail();
       	}
     }
     
     //#@ADC_01_04
     
     @And("User_611 Validate the Sourcing Type label")
     public void user_validate_the_sourcing_type_label() throws Throwable {
//    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing type")) );
    	 javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing type")));
    	 if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing type")).isDisplayed()) {
     		softassert.fail();
     	}
 
}
    	        
     @And("User_611 Validate the Sourcing Office label")
     public void user_validate_the_sourcing_office_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing office")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing office")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }

     @And("User_611 Validate the Sourcing Entity label")
     public void user_validate_the_sourcing_entity_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing Entity")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing Entity")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }

     @And("User_611 Validate the Sourcing Staff label")
     public void user_validate_the_sourcing_staff_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing staff")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing staff")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }

     @And("User_611 Validate the Reference Type label")
     public void user_validate_the_reference_type_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference type")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference type")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }

     @And("User_611 Validate the Reference Entity label")
     public void user_validate_the_reference_entity_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference entity")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference entity")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }

     @And("User_611 Validate the Reference Code label")
     public void user_validate_the_reference_code_label() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference Code")) );
        	if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference Code")).isDisplayed()) {
        		softassert.fail();
        	}
        
     }
     //
     
     @And("User_611 Click the save button after validating all the value")
     public void user_click_the_save_button_after_validating_all_the_value() throws Throwable {
    	// waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Save update button")) );
         for (int i = 0; i < 500; i++) {
        	 try {
        		 javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Save update button")).click();	
			} catch (Exception e) {
				if (i==500) {
					Assert.fail(e.getMessage());
				}
			}
        	 
			
		}
     }

     @And("User_611 Validate the confirmation message while saving the data")
     public void user_validate_the_confirmation_message_while_saving_the_data() throws Throwable {
    	 //waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation confirmation message")) );
    	 for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation confirmation message")).isDisplayed()) {
             		softassert.fail();
         		}
         		break;
 			} catch (Exception e) {
// 				if(i==500) {
// 					Assert.fail(e.getMessage());
 				
 			}
 			
 		}
         
     }

     @And("User_611 Validate the close button for confirmation message while saving the data")
     public void user_validate_the_close_button_for_confirmation_message_while_saving_the_data() throws Throwable {
    	 //waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation confirm msg close btn")) );
    	 for (int i = 0; i<=500; i++) {
         	try {
         		if (!javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation confirm msg close btn")).isDisplayed()) {
             		softassert.fail();
         		}
         		break;
 			} catch (Exception e) {
// 				if(i==500) {
// 					Assert.fail(e.getMessage());
// 				}
 			}
 			
 		}
         
     }
     //
     @And("User_611 Validate the product dropdown value is editable")
     public void user_validate_the_product_dropdown_value_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Product value is visible")));
     	for (int i = 0; i <= 500; i++) {
 			try {
 				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Product value is visible")).click();
 				break;
 			} catch (Exception e) {
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
 		System.out.println("Map "+testData.get("Product").trim());
 		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
 		 
 		for (int k = 0; k <= 300; k++) {
 		try {
 		 
 		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
 		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
 		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
         
     


     @And("User_611 Validate the Total finance amount requested is editable")
     public void user_validate_the_total_finance_amount_requested_is_editable() throws Throwable {
    	 //waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")));
      	for (int i = 0; i <= 500; i++) {
  			try {
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")).click();
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")).sendKeys("1,50,000");
  				break;
  			} catch (Exception e) {
  				  			}
  		}
     }

     @And("User_611 Validate the Declared net  monthly income is editable")
     public void user_validate_the_declared_net_monthly_income_is_editable() throws Throwable {
    	// waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")));
       	for (int i = 0; i <= 500; i++) {
   			try {
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared  net monthly income value is visible")).click();
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared  net monthly income value is visible")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared  net monthly income value is visible")).sendKeys("1,50000");
   				break;
   			} catch (Exception e) {
   				if (i == 500) {
   					Assert.fail(e.getMessage());
   				
   				}// TODO: handle exception
   			}
   		}
         
     }

     @And("User_611 Validate the Declared current obligations is editable")
     public void user_validate_the_declared_current_obligations_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Total Finance Amount Requested value is visible")));
        	for (int i = 0; i <= 500; i++) {
    			try {
    				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared current oblications value is visible")).click();
      				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared current oblications value is visible")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
      				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("declared current oblications value is visible")).sendKeys("1,50000");
    				
    				break;
    			} catch (Exception e) {
    				if (i == 500) {
    					Assert.fail(e.getMessage());
    				
    				}// TODO: handle exception
    			}
    		} 
         
     } 

    
     @And("User_611 Validate the sourcing channel is editable")
     public void user_validate_the_sourcing_channel_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("sourcing channel value is visible ")));
      	for (int i = 0; i <= 500; i++) {
  			try {
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("sourcing channel value is visible ")).click();
  				break;
  			} catch (Exception e) {
  				if (i == 500) {
  					Assert.fail(e.getMessage());
  				
  				}// TODO: handle exception
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
  		System.out.println("Map "+testData.get("Sourcing Channel").trim());
  		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Sourcing Channel")).trim())) {
  		 
  		for (int k = 0; k <= 300; k++) {
  		try {
  		 
  		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
  		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
  		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
         
     
     @And("User_611 Validate the Bussiness center code is editable")
     public void user_validate_the_bussiness_center_code_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Business center code value is visible")));
       	for (int i = 0; i <= 500; i++) {
   			try {
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Business center code value is visible")).click();
   				break;
   			} catch (Exception e) {
   				if (i == 500) {
   					Assert.fail(e.getMessage());
   				
   				}// TODO: handle exception
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
   		System.out.println("Map "+testData.get("Business Center Code").trim());
   		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Business Center Code")).trim())) {
   		 
   		for (int k = 0; k <= 300; k++) {
   		try {
   		 
   		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
   		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
   		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Region is editable")
     public void user_validate_the_region_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Region value is visible")));
        	for (int i = 0; i <= 500; i++) {
    			try {
    				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Region value is visible")).click();
    				break;
    			} catch (Exception e) {
    				if (i == 500) {
    					Assert.fail(e.getMessage());
    				
    				}// TODO: handle exception
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
    		System.out.println("Map "+testData.get("Region").trim());
    		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Region")).trim())) {
    		 
    		for (int k = 0; k <= 300; k++) {
    		try {
    		 
    		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
    		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
    		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Servicing branch is editable")
     public void user_validate_the_servicing_branch_is_editable() throws Throwable {
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("servicing branch select box ")));
     	for (int i = 0; i <= 500; i++) {
 			try {
 				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("servicing branch select box ")).click();
 				break;
 			} catch (Exception e) {
 				if (i == 500) {
 					Assert.fail(e.getMessage());
 				
 				}// TODO: handle exception
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
 		System.out.println("Map "+testData.get("Servicing Branch").trim());
 		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Servicing Branch")).trim())) {
 		 
 		for (int k = 0; k <= 300; k++) {
 		try {
 		 
 		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
 		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
 		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Closing staff or servicing staff or RM is editable")
     public void user_validate_the_closing_staff_or_servicing_staff_or_rm_is_editable() throws Throwable {
    	 //waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Closing Staff or Servicing Staff slect box")));
      	for (int i = 0; i <= 500; i++) {
  			try {
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Closing Staff or Servicing Staff slect box")).click();
  				break;
  			} catch (Exception e) {
  				if (i == 500) {
  					Assert.fail(e.getMessage());
  				
  				}// TODO: handle exception
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
  		System.out.println("Map "+testData.get("Closing&Servicing Staff").trim());
  		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Closing&Servicing Staff")).trim())) {
  		 
  		for (int k = 0; k <= 300; k++) {
  		try {
  		 
  		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
  		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
  		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
     //
     @And("User_611 Validate the Sourcing Type is editable")
     public void user_validate_the_sourcing_type_is_editable() throws Throwable {
    	 for (int i = 0; i <= 500; i++) {
   			try {
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Sourcing type select box")).click();
   				break;
   			} catch (Exception e) {
   				if (i == 500) {
   					Assert.fail(e.getMessage());
   				
   				}// TODO: handle exception
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
   		System.out.println("Map "+testData.get("Sourcing Type").trim());
   		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Sourcing Type")).trim())) {
   		 
   		for (int k = 0; k <= 300; k++) {
   		try {
   		 
   		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
   		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
   		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Sourcing Office is editable")
     public void user_validate_the_sourcing_office_is_editable() throws Throwable{
    	 for (int i = 0; i <= 500; i++) {
    			try {
    				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Sourcing office select box")).click();
    				break;
    			} catch (Exception e) {
    				if (i == 500) {
    					Assert.fail(e.getMessage());
    				
    				}// TODO: handle exception
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
    		System.out.println("Map "+testData.get("Sourcing Office").trim());
    		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Sourcing Office")).trim())) {
    		 
    		for (int k = 0; k <= 300; k++) {
    		try {
    		 
    		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
    		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
    		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Sourcing Entity is editable")
     public void user_validate_the_sourcing_entity_is_editable() throws Throwable{
    	 for (int i = 0; i <= 500; i++) {
 			try {
 				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Sourcing Entity select box")).click();
 				break;
 			} catch (Exception e) {
 				if (i == 500) {
 					Assert.fail(e.getMessage());
 				
 				}// TODO: handle exception
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
 		System.out.println("Map "+testData.get("Sourcing Entity").trim());
 		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Sourcing Entity")).trim())) {
 		 
 		for (int k = 0; k <= 300; k++) {
 		try {
 		 
 		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
 		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
 		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

     @And("User_611 Validate the Sourcing Staff is editable")
     public void user_validate_the_sourcing_staff_is_editable() throws Throwable{
    	 for (int i = 0; i <= 500; i++) {
  			try {
  				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Sourcing staff  select box")).click();
  				break;
  			} catch (Exception e) {
  				if (i == 500) {
  					Assert.fail(e.getMessage());
  				
  				}// TODO: handle exception
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
  		System.out.println("Map "+testData.get("Sorucing Staff").trim());
  		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Sorucing Staff")).trim())) {
  		 
  		for (int k = 0; k <= 300; k++) {
  		try {
  		 
  		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
  		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
  		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
         
          @And("User_611 Validate the Reference Typeis editable")
     public void user_validate_the_reference_typeis_editable() throws Throwable{
    	 for (int i = 0; i <= 500; i++) {
   			try {
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reference type select box")).click();
   				break;
   			} catch (Exception e) {
   				if (i == 500) {
   					Assert.fail(e.getMessage());
   				
   				}// TODO: handle exception
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
   		System.out.println("Map "+testData.get("Reference Type").trim());
   		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Reference Type")).trim())) {
   		 
   		for (int k = 0; k <= 300; k++) {
   		try {
   		 
   		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
   		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
   		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
          
         
     

     @And("User_611 Validate the Reference Entity is editable")
     public void user_validate_the_reference_entity_is_editable() throws Throwable{
    	 for (int i = 0; i <= 500; i++) {
    			try {
    				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement(" Reference entity select box")).click();
    				break;
    			} catch (Exception e) {
    				if (i == 500) {
    					Assert.fail(e.getMessage());
    				
    				}// TODO: handle exception
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
    		System.out.println("Map "+testData.get("Reference Entity").trim());
    		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Reference Entity")).trim())) {
    		 
    		for (int k = 0; k <= 300; k++) {
    		try {
    		 
    		clicksandactionshelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
    		"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
    		clicksandactionshelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
                        
     @And("User_611 Validate the Reference Code  is editable")
     public void user_validate_the_reference_code_is_editable() throws Throwable{
    	 waithelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reference Code select box")));
       	for (int i = 0; i <= 500; i++) {
   			try {
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reference Code select box")).click();
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reference Code select box")).clear();
   				javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Reference Code select box")).sendKeys("123456");
   				break;
   			} catch (Exception e) {
   				if (i == 500) {
   					Assert.fail(e.getMessage());
   				
   				}// TODO: handle exception
   			}
   		}
         
     }
     //
     @And("User_611 Validate the Sourcing type is mandatory")
     public void user_validate_the_sourcing_type_is_mandatory() throws Throwable {
    	 String Sourcingtype = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing type")).getText();
//       System.err.println(Validation Sourcing type);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(Sourcingtype.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

     @And("User_611 Validate the Sourcing office is mandatory")
     public void user_validate_the_sourcing_office_is_mandatory() throws Throwable {
    	 String Sourcingoffice = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing office")).getText();
//       System.err.println(Validation Sourcing office);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(Sourcingoffice.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

     @And("User_611 Validate the Sourcing entity is mandatory")
     public void user_validate_the_sourcing_entity_is_mandatory() throws Throwable {
    	 String Sourcingentity = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing Entity")).getText();
//       System.err.println(Validation Sourcing Entity);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(Sourcingentity.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

     @And("User_611 Validate the Sourcing staff is mandatory")
     public void user_validate_the_sourcing_staff_is_mandatory() throws Throwable {
    	 String Sourcingstaff = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Sourcing staff")).getText();
//       System.err.println(Validation Sourcing staff);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(Sourcingstaff.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

     @And("User_611 Validate the Reference type is non mandatory")
     public void user_validate_the_reference_type_is_non_mandatory() throws Throwable {
    	 String Referencetype = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference type")).getText();
//       System.err.println(Validation Reference type);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(!Referencetype.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

     @And("User_611 Validate the Reference entity is non mandatory")
     public void user_validate_the_reference_entity_is_non_mandatory() throws Throwable {
    	 String Referenceentity = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference entity")).getText();
//       System.err.println(Validation Reference entity);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(!Referenceentity.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
        
     }

     @And("User_611 Validate the Reference code is non mandatory")
     public void user_validate_the_reference_code_is_non_mandatory() throws Throwable {
    	 String Referenceentity = javascriptHelper.executeScriptWithWebElement(jsPathexcel.getElement("Validation Reference Code")).getText();
//       System.err.println(Validation Reference Code);
       for (int i = 0; i <2000; i++) {
           try {
               Assert.assertTrue(!Referenceentity.contains("*"));
               break;
           } catch (Exception e) {
               if (i==1999) {
                   Assert.fail(e.getMessage());
               }
           }
       }
         
     }

    
      
    
}
