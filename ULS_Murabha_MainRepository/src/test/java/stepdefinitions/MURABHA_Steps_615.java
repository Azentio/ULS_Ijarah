package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ApplicationDetailsPageObj;
import pageobjects.JSPaths;
import resources.BaseClass;

public class MURABHA_Steps_615 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths commonJSElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths applicationDetailsJsPaths = new JSPaths(excelPath, "Ijara_AddCustInfoElements",
			"AdditionalCustomerInfo_FieldName", "JSPath");
	JSPaths searchCustomerJsPaths = new JSPaths(excelPath, "SearchCustomer_Elements",
			"Search_Customer_FieldName", "JSPath");
	JSPaths applicationDetailsListJsPaths = new JSPaths(excelPath, "Application_Details_List_Page",
			"Application_Details_List_FieldName", "JSPath");	
	ExcelData customerDetailsExcelData  = new ExcelData(excelTestDataPath,"CustomerDetail_TestData","DataSet ID");
	ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths customerDetailsJsPaths = new JSPaths(excelPath, "CustomerDetail_JSPath", "CustomerDetails_FieldName", "JSPath");
	ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath, "ApplicationDetails_TestData","DataSet ID");
	ExcelData searchCustomerExcelData=new ExcelData(excelTestDataPath, "Search_Customer_TestData", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	ExcelData IjarahExecution = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker",
			"TestCase ID");
	Map<String, String> ExecutionData;
	Map<String, String> searchCustomerTestExecutionData;
	Map<String, String> searchCustomerTestData;
	
	
	Robot robot;
	SoftAssert softAssert=new SoftAssert();
	WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(2000));

//  TestData path	
	//@AT_SC_001 search Customer
	@And("^User get the search customer test data for test case AT_SC_001$")
	public void get_the_test_data_for_test_case_search_customer_AT_SC_001() throws Throwable {
		searchCustomerTestData = searchCustomerExcelData.getTestdata("DS_AT_SC_001");
	}
	@And("^User get the test data for test case AT_CD_05$")
    public void get_the_test_data_for_test_case_AT_CD_05() throws Throwable {
		ExecutionData= IjarahExecution.getTestdata("AT_CD_05");
		testData = customerDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
    }
	@And("^User get the search customer test data for test case AT_SC_002$")
	public void get_the_test_data_for_test_case_search_customer_AT_SC_002() throws Throwable {
		searchCustomerTestData = searchCustomerExcelData.getTestdata("DS_AT_SC_001");
	}
	
	@And("^User get the search customer test data for test case AT_SC_003$")
	public void get_the_test_data_for_test_case_search_customer_AT_SC_003() throws Throwable {
		searchCustomerTestData = searchCustomerExcelData.getTestdata("DS_AT_SC_003");
	}

	// Application Details Feature
//	@AT_APP_001
	@And("^User get the test data for test case AT_APP_001$")
	public void get_the_test_data_for_test_case_AT_APP_001() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_001");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_002$")
	public void get_the_test_data_for_test_case_AT_APP_002() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_002");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_003_01$")
	public void get_the_test_data_for_test_case_AT_APP_003_01() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_003_01");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_003_02$")
	public void get_the_test_data_for_test_case_AT_APP_003_02() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_003_02");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_003_03$")
	public void get_the_test_data_for_test_case_AT_APP_003_03() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_003_03");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_004$")
	public void get_the_test_data_for_test_case_AT_APP_004() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_004");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	
	@And("^User get the test data for test case AT_APP_010$")
	public void get_the_test_data_for_test_case_AT_APP_010() throws Throwable {
		ExecutionData = IjarahExecution.getTestdata("AT_APP_010");
		testData = applicationDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
	}
	@And("^User get the test data for test case AT_CD_01$")
    public void get_the_test_data_for_test_case_AT_CD_01() throws Throwable {
		ExecutionData= IjarahExecution.getTestdata("AT_CD_01");
		testData = customerDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
    }	
	@And("^User get the test data for test case AT_CD_03$")
    public void get_the_test_data_for_test_case_AT_CD_03() throws Throwable {
		ExecutionData= IjarahExecution.getTestdata("AT_CD_03");
		testData = customerDetailsExcelData.getTestdata(ExecutionData.get("dataSet_ID"));
    }
	@And("User click the module name dropdown in ULS application")
	public void user_click_the_module_name_dropdown_in_uls_application() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
//				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("moduleNameDropdown"))
						.click();
				System.out.println(testData.get("Module Name"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And ("user click the Customer type dropdown and select the Individual Customer in ULS application")
	public void user_click_the_customer_type_dropdown_and_select_the_individual_customer_in_uls_application() throws IOException {
		
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		 * .executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
		 * "customerTypeDropdwn")));
		 */
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerTypeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(searchCustomerTestData.get("Customer Type"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}


	}
	
	@And("user click the CIF ID textfield and enter the id in ULS application")
	public void user_click_the_cif_id_textfield_in_uls_application() throws IOException, InterruptedException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		 * .executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
		 * "cif_Id_TextField")));
		 */
		
		System.out.println(searchCustomerTestData.get("CIF ID"));
	
			for (int i = 0; i <=500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("cif_Id_TextField"));
					Assert.assertTrue(v.isDisplayed());
					javascriptHelper.JSEClick(v);
					
					v.clear();
					//System.out.println(searchCustomerTestData.get("CIF ID"));
					v.sendKeys(searchCustomerTestData.get("CIF ID"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					if(i==500)
					Assert.fail(e.getMessage());
				}

			}
		

	}

	@And("user click the Company Name textfield and enter the number in ULS application")
	public void user_click_the_company_name_textfield_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("companyName_TextField")));
		boolean b = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("companyName_TextField"))
				.isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("companyName_TextField"));
					v.click();
					v.clear();
					v.sendKeys(searchCustomerTestData.get("Company Name"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					Assert.fail(e.getMessage());
				}

			}
		}

	}
	
	@And ("user click the ID type dropdown and select the Driving License in ULS application")
	public void user_click_the_id_type_dropdown_and_select_the_driving_license_in_uls_application() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("idType_Dropdwn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("idType_Dropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(searchCustomerTestData.get("ID Type"));
			System.out.println(searchCustomerTestData.get("ID Num"));

		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}


	}
	
	@And("user click the ID number textfield and enter the number in ULS application")
	public void user_click_the_id_number_textfield_and_enter_the_number_in_uls_application() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		 * .executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
		 * "idNumber_TextField")));
		 */
		
		
			for (int i = 0; i <=500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("idNumber_TextField"));
					v.click();
					v.clear();
					//System.out.println(searchCustomerTestData.get("ID Number"));
					//v.sendKeys(searchCustomerTestData.get("ID Num"));
					v.sendKeys("123456789012");
					break;
				} catch (Exception e) {
					// TODO: handle exception
					if(i==500)
					Assert.fail(e.getMessage());
				}

			}
		

	}
	
	@Then ("click on the Search button")
	public void click_on_the_Search_button() {
		for(int i=0; i<=500; i++) {
			try {
				WebElement searchBTN=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("searchBtn_SearchCust"));
				javascriptHelper.JSEClick(searchBTN);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==500)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@Then ("click on the Create New Request Button")
	public void click_on_the_create_New_request_button() {
		
		for(int i=0; i<=500; i++) {
			try {
				
				WebElement createBTN=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("createNewRequestBtn_SearchCust"));
				javascriptHelper.JSEClick(createBTN);
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==500)
					Assert.fail(e.getMessage());
			}
		}
	}
	


	// Application details For Product
	@And("User click the product name dropdown in ULS application")
	public void user_click_the_product_name_dropdown_in_uls_application() throws Throwable {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
		 * getElement("productDropdwn")));
		 * 
		 */
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productDropdwn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// Application details For SUbProduct
	@And("User click the subproduct name dropdown in ULS application")
	public void user_click_the_subproduct_name_dropdown_in_uls_application() throws Throwable {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
		 * getElement("subProductDropdwn")));
		 */
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("subProductDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("subProductDropdwn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User select the module name as LOS in ULS application")
	public void user_select_the_module_name_as_los_in_uls_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
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

//		document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
//                    if (moduleName.equalsIgnoreCase("LOS")) {
					if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");

						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
					}

					// else {
					// driver.findElement(By.)
					// }
				} catch (Exception e) {

				}
			}
		}
	}

	@And("User select the module name as LOS1 in ULS application")
	public void user_select_the_module_name_as_los1_in_uls_application() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}

	
	//Hamburger Menu 
	@And("user click on the hamburger menu")

	public void user_click_on_the_hamburger_menu() {

		for (int i = 0; i <= 1000; i++) {

			try {

				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hamburgerMenu")).click();

			//	javascriptHelper.JSEClick(ijarahCustomerDetailObj.hB_CustomerDetailElement());

				break;

			} catch (Exception e) {

				if (i == 1000) {

					Assert.fail(e.getMessage());

				}

			}

		}

	}

	

	@And("user click on the transactions module")

	public void user_click_on_the_transactions_module() {

		for (int i = 0; i <= 1000; i++) {

			try {

				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_Transaction")).click();
			WebElement transction=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_Transaction")); 
			javascriptHelper.JSEClick(transction);
				
				break;

			} catch (Exception e) {

				if (i == 1000) {

					Assert.fail(e.getMessage());

				}

			}

		}

	}

	

	@And("user click on the appication manager option")

	public void user_click_on_the_appication_manager_option() {

		for (int i = 0; i <= 1000; i++) {

			try {

				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_ApplicationManager")).click();
			     WebElement appManger=	javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_ApplicationManager"));
                 javascriptHelper.JSEClick(appManger);
				
				break;

			} catch (Exception e) {

				if (i == 1000) {

					Assert.fail(e.getMessage());

				}

			}

		}

	}
	
	@And("user click on the application details icon")

	public void user_click_on_the_application_details_icon() {

		for (int i = 0; i <= 1000; i++) {

			try {

				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_ApplicationManager")).click();
			     WebElement appManger=	javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("hB_ApplicationDetailsIcon"));
                 javascriptHelper.JSEClick(appManger);
				 Thread.sleep(10000);
				break;

			} catch (Exception e) {

				if (i == 1000) {

					Assert.fail(e.getMessage());

				}

			}

		}

	}
	
	@And ("user click on the add button")
	public void user_click_on_the_add_button() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.  
				    executeScriptWithWebElement(applicationDetailsJsPaths.getElement("addBtn_ApplicationDetails")));
		for(int i=0; i<=1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
						                                     getElement("addBtn_ApplicationDetails")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
						                                     getElement("addBtn_ApplicationDetails")).click();
			    
			    break;
			}catch (Exception e) {
				// TODO: handle exception
				    if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}
	
	

	
	// Application Detail Product dropdown
	@And("User select the Product name as HomeLoan in ULS application")
	public void user_select_the_product_name_as_homeloan_in_uls_application() {
		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Product"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}
	}

	// Application Detail SUbProduct dropdown
	@And("User select the SubProduct name as Home Loan-Ready to move or Under construction Property from Builder or Society in ULS application")
	public void user_select_the_subproduct_name_as_homeloan_in_uls_application() {
		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sub Product"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}
	}

	@And("User click the Sourcing Channel dropdown and Select the Branch in ULS application")
	public void user_click_the_sourcing_channel_dropdown_and_select_the_branch_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingChannelDropdwn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingChannelDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingChannelDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sourcing Channel"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Business Center Code dropdown and Select the Business Center-Retail Banking in ULS application")
	public void user_click_the_business_center_code_dropdown_and_select_the_business_center_retail_banking_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("businessCenterCodeDropdwn")));
		// javascriptHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[.='
		// Referral/Sourcing Details ']")));
		// waitHelper.waitForElementwithFluentwait(driver,
		// driver.findElement(By.xpath("//ion-label[.=' Referral/Sourcing Details
		// ']")));

		javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("businessCenterCodeDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("businessCenterCodeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Bussiness Center Code"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Servicing Type dropdown and Select the Financier in ULS application")
	public void user_click_the_servicing_type_dropdown_and_select_the_business_center_retail_banking_in_uls_application()
			throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		 * .executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
		 * "serviceTypeDropdwn")));
		 */

		//javascriptHelper.scrollDownByPixel();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("serviceTypeDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("serviceTypeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Servicing Type"));
			
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Region dropdown and Select the Azentio Vs in ULS application")
	public void user_click_the_region_dropdown_and_select_the_azentio_vs_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("regionDropdwn")));

		//javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("regionDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("regionDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Region"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Servicing Branch dropdown and Select the NAGPUR in ULS application")
	public void user_click_the_servicing_branch_dropdown_and_select_the_nagpur_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("servicingBranchDropdwn")));
		

		javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("servicingBranchDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("servicingBranchDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			System.out.println(testData.get("Servicing Branch"));
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Servicing Branch"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Spoke Location dropdown in ULS application")
	public void user_click_the_spoke_location_dropdown_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("spokeLocationDropdwn")));

		javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("spokeLocationDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("spokeLocationDropdwn")).click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		try {
			System.out.println(testData.get("Spoke Location"));
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Spoke Location"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Closing Staff or Servicing Staff or RM dropdown and Select the Renu Purohit in ULS application")
	public void user_click_the_closing_staff_or_servicing_staff_or_rm_dropdown_and_select_the_renu_purohit_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				applicationDetailsJsPaths.getElement("closingStaffOrServicingStaffOrRMDropdwn")));

		//javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(
								applicationDetailsJsPaths.getElement("closingStaffOrServicingStaffOrRMDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(
								applicationDetailsJsPaths.getElement("closingStaffOrServicingStaffOrRMDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			System.out.println(testData.get("Closing Staff Or Servicing Staff Or RM"));
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Closing Staff Or Servicing Staff Or RM"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}
		
		

	}

	@And("User click the Sourcing Type dropdown and Select the Financier in ULS application")
	public void user_click_the_sourcing_type_dropdown_and_select_the_financier_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingTypeDropdwn")));

	//	javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingTypeDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingTypeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			System.out.println(testData.get("Sourcing Type"));
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sourcing Type"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Sourcing Office dropdown and Select the NAGPUR in ULS application")
	public void user_click_the_sourcing_office_dropdown_and_select_the_nagpur_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingOfficeDropdwn")));
	
		//javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingOfficeDropdwn")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingOfficeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			System.out.println(testData.get("Sourcing Office"));
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sourcing Office"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Sourcing Entity dropdown and Select the Azentio Vs in ULS application")
	public void user_click_the_sourcing_entity_dropdown_and_select_the_azentio_vs_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingEntityDropdwn")));
		
		//javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingEntityDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingEntityDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sourcing Entity"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Sourcing Staff dropdown and Select the Renu Purohit in ULS application")
	public void user_click_the_sourcing_staff_dropdown_and_select_the_renu_purohit_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingStaffDropdwn")));

		//javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingStaffDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingStaffDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Sourcing Staff"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Reference Type dropdown and Select the Agency in ULS application")
	public void user_click_the_reference_type_dropdown_and_select_the_agency_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceTypeDropdwn")));

		javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceTypeDropdwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceTypeDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Reference Type"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click the Reference Entity dropdown and Select the Azentio Vs in ULS application")
	public void user_click_the_reference_entity_dropdown_and_select_the_azentio_vs_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceEntityDropdwn")));

		javascriptHelper.scrollDownVertically();
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceEntityDropdwn"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Reference Entity"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}

	}

	@And("User click on the status toggle button")
	public void user_click_on_the_status_toggle_button() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
		 * getElement("statusToggleBtn")));
		 */
		String recordStatus="";
		
		
		for (int i = 0; i<=300; i++) {
			try {
				
				WebElement ele = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn"));
		        javascriptHelper.scrollToElemet(ele);
				//recordStatus=ele.getAttribute("aria-checked").trim();
		        recordStatus="fasle";
		        if(recordStatus.equalsIgnoreCase("false")) {
		        	javascriptHelper.JSEClick(ele);
		        	break;
		        }
		        else {
		        	System.out.println("It is already enabled "+recordStatus);
		        	break;
		        }
		        
			} catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}

	
	@And ("User click on the status toggle button2")
	public void user_click_on_the_status_toggle_button2() throws AWTException {
		String recordStatus = "";
		String listViewRecordStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths
						.getElement("statusToggleBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				recordStatus = javascriptHelper.executeScript("return " + applicationDetailsJsPaths
						.getElement("statusToggleBtn")).toString();
				if (!(recordStatus.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		robot = new Robot();

 

		for (int i = 0; i <= 300; i++) {
			try {
				robot.mouseWheel(-200);
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

 

		/*
		 * for (int i = 0; i <= 300; i++) { try { listViewRecordStatus =
		 * javascriptHelper.executeScript("return"+document.querySelectorAll('ion-col[
		 * class="m-0 p-0 ng-star-inserted md hydrated"]')[" + i +
		 * "].querySelector('p-tag span').innerText").toString(); if
		 * (!(listViewRecordStatus.isBlank())) { break; } } catch (Exception e) { if (i
		 * == 300) { Assert.fail(e.getMessage()); } } } if
		 * (recordStatus.equals("false")) {
		 * softAssert.assertEquals(listViewRecordStatus, "Active"); } else if
		 * (recordStatus.equals("true")) { softAssert.assertEquals(listViewRecordStatus,
		 * "In-active"); }
		 */
	}
	@And("User click on the save button")
	public void user_click_on_the_save_button() {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click on the Back button")
	public void user_click_on_the_back_button() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
		 * getElement("backBtn")));
		 */

		for (int i = 0; i < 300; i++) {
			try {
				WebElement ele = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn"));
				javascriptHelper.JSEClick(ele);
				break;
				
				
			} catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}

	}

	@And("Verify the page after clicking Back button")
	public void verify_the_page_after_clicking_back_button() throws IOException {

		for(int i=0; i<=300; i++) {
			try {
				WebElement input=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inputTitle"));
				waitHelper.waitForElementwithFluentwait(driver, input);
				//WebElement input=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inputTitle"));
				boolean b=input.isDisplayed();
				if(b==true) {
					Assert.assertTrue(b);
					System.out.println("Back button functionality verified");
					break;
				}
				else {
					System.out.println("Back button functionality not verified");
					break;
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}

	

	

	// Application Detail textField total finance Amount
	@And("User click the Total Finance Amount Requested name textfield and enter amount in ULS application")
	public void user_click_the_total_finance_amount_requested_name_textfield_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("totalFinanceAmountRequestedField")));
		boolean b = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("totalFinanceAmountRequestedField"))
				.isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("totalFinanceAmountRequestedField"));
					Assert.assertTrue(v.isDisplayed());
					v.click();
					v.clear();
					System.out.println(testData.get("Total Finance Amount Requested"));
					v.sendKeys(testData.get("Total Finance Amount Requested"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					Assert.fail(e.getMessage());
				}

			}
		}

	}
	
	@And("User click the Total Finance Amount Requested name textfield")
	public void user_click_the_total_finance_amount_requested_name_textfield() throws IOException {
		
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
			getElement("totalFinanceAmountRequestedField")));
		 
		boolean b = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("totalFinanceAmountRequestedField"))
				    .isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("totalFinanceAmountRequestedField"));
					v.click();
					v.clear();
					v.sendKeys(testData.get("Total Finance Amount Requested"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					Assert.fail(e.getMessage());
				}

			}
		}

	}
	
	@And ("User keep any mandatory field blank and click on save button")
	public void user_keep_any_mandatory_field_blank_and_click_on_save_button() {
		
		for(int i=0; i<=300; i++) {
			try {
				
				WebElement saveBtn=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn"));
				javascriptHelper.JSEClick(saveBtn);
				
				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}
	
	@And("user verify the popup post clicking save button")
	public void user_verify_the_popup_post_clicking_save_button() {
		String popUp=null;
		for (int i = 0; i <= 1000; i++) {
			try {
				popUp =javascriptHelper.executeScript("return "+applicationDetailsJsPaths.getElement("postClickSavePopup")).toString();
				if (!popUp.isBlank()||!popUp.isEmpty()) {
					break;
				}
			} catch (Exception e) {

			}

		}
		System.out.println(popUp);
}
	
	@Then("scroll the Page")
	public void scroll_the_page() throws IOException {
    // waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn")));
     javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn")));
		for (int i = 0; i <= 300; i++) {

			try {
				expWait.until(ExpectedConditions.visibilityOf(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn"))));
				 //   javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn")));
					//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn")));
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("statusToggleBtn")));
			  
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("scroll the Page1")
	public void scroll_the_page1() {

		for (int i = 0; i <= 300; i++) {

			try {
								javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceTypeDropdwn")));
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("scroll the Page2")
	public void scroll_the_page2() {

		for (int i = 0; i <= 500; i++) {

			try {
			
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sourcingChannelDropdwn")));
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}



	}

	@And("User click the Declared Net Monthly Income name textfield and enter income in ULS application")
	public void user_click_the_declared_net_monthly_income_name_textfield_and_enter_income_in_uls_application()
			throws IOException, InterruptedException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				applicationDetailsJsPaths.getElement("declaredNetMonthlyIncomeTextField")));
		Thread.sleep(5000);
		boolean b = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("declaredNetMonthlyIncomeTextField"))
				.isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("declaredNetMonthlyIncomeTextField"));
					Assert.assertTrue(v.isDisplayed());
					v.click();
					v.clear();
					v.sendKeys(testData.get("Declared Net  Monthly Income"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User click the Declared Current Obligations name textfield and enter income in ULS application")
	public void user_click_the_declared_current_obligations_name_textfield_and_enter_income_in_uls_application()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				applicationDetailsJsPaths.getElement("declaredCurrentObligationsTextField")));
		boolean b = javascriptHelper.executeScriptWithWebElement(
				applicationDetailsJsPaths.getElement("declaredCurrentObligationsTextField")).isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("declaredCurrentObligationsTextField"));
					v.click();
					v.clear();
					System.out.println("Enter the negative value "+testData.get("Declared Current Obligations"));
					v.sendKeys(testData.get("Declared Current Obligations"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					Assert.fail(e.getMessage());
				}

			}
		}
	}
	
	@And ("User enter the negative value and click on the save button")
	public void user_enter_the_negative_value_and_click_on_the_save_button() {
		
		for(int i=0; i<=300; i++) {
			try {
				
				WebElement saveBtn=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn"));
				Assert.assertTrue(saveBtn.isDisplayed());
				javascriptHelper.JSEClick(saveBtn);
				
				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}
	
	@And ("User enter the character value and click on the save button")
	public void user_enter_the_character_value_and_click_on_the_save_button() {
		
		for(int i=0; i<=300; i++) {
			try {
				
				WebElement saveBtn=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn"));
				Assert.assertTrue(saveBtn.isDisplayed());
				javascriptHelper.JSEClick(saveBtn);
				
				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}

	@And("User click the Reference Code textfield and enter code in ULS application")
	public void user_click_the_reference_code_textfield_and_enter_code_in_uls_application() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver,
		 * javascriptHelper.executeScriptWithWebElement(
		 * applicationDetailsJsPaths.getElement("declaredCurrentObligationsTextField")))
		 * ;
		 */
		boolean b = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("referenceCodeTextField")).isDisplayed();
		if (b == true) {
			for (int i = 0; i < 500; i++) {
				try {
					WebElement v = javascriptHelper.executeScriptWithWebElement(
							applicationDetailsJsPaths.getElement("referenceCodeTextField"));
					Assert.assertTrue(v.isDisplayed());
					v.click();
					v.clear();
					v.sendKeys(testData.get("Reference Code"));
					break;
				} catch (Exception e) {
					// TODO: handle exception
					if(i==500)
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User click the Mail box in ULS application")
	public void user_click_the_mail_box_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Search button under inbox")
	public void user_click_the_search_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User search the Ref id under inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inboxSearchInput")));
		
		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User click the Entitle button under inbox")
	public void user_click_the_entitle_button_under_inbox() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And ("verify the functionality of Back Button")
	public void verify_the_functionality_of_back_button() throws IOException {
		
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				           //   executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn")));
		
		for(int i=0; i<=300; i++) {
			
			try {
				
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And ("verify the previous page element")
	public void verify_the_previous_page_element() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
	              executeScriptWithWebElement(applicationDetailsJsPaths.getElement("inboxTitle")));
		
		for(int i=0; i<=300; i++) {
			
			try {
				
			    boolean inbox=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
			    		                                            getElement("inboxTitle")).isDisplayed();
			    
			    Assert.assertTrue(inbox,"Title is visible and verified");
			    
			    break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And ("verify the Buttons are present on the page")
	public void verify_the_buttons_are_present_on_the_page() throws IOException {
	   waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn")));
	}
	
	//Application Details List Page
	@Then ("verify the Fields is Present")
	public void verify_the_fields_is_present() throws IOException {
		
		System.out.println("1");
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		                executeScriptWithWebElement(applicationDetailsListJsPaths.getElement("action_Column")));	
				
		//boolean actnCol=javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
				   //                                      getElement("action_Column")).isDisplayed();
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
                getElement("action_Title")).isDisplayed(), "It is visible");
		
		System.out.println("2");
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				          executeScriptWithWebElement(applicationDetailsListJsPaths.getElement("client_Name_Title")));
		
		boolean clientNameCol=javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
                                                              getElement("client_Name_Title")).isDisplayed();
         Assert.assertTrue(clientNameCol, "It is visible");
		
         System.out.println("3");
         waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
        		                                               getElement("client_Name_Alternative_Language_Title")));
         
        boolean clientAltCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
        		      getElement("client_Name_Alternative_Language_Title")).isDisplayed();
        
        Assert.assertTrue(clientAltCol,"It is visible");
        
        System.out.println("4");
        waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
       		                                               getElement("product_Title")));
        
       boolean prodtCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
       		      getElement("product_Title")).isDisplayed();
       
       Assert.assertTrue(prodtCol,"It is visible");
       
       System.out.println("5");
       waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
      		                                               getElement("sub_Product_Title")));
       
        boolean subProdCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
      		      getElement("sub_Product_Title")).isDisplayed();
      
        Assert.assertTrue(subProdCol,"It is visible");
        
        System.out.println("6");
        waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
       		                                               getElement("current_Stage_Title")));
        
         boolean currentStgCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
       		      getElement("current_Stage_Title")).isDisplayed();
       
         Assert.assertTrue(currentStgCol,"It is visible");
         
         //javascriptHelper.scrollToElemet(javascriptHelper.
        		 //        executeScriptWithWebElement(applicationDetailsListJsPaths.getElement("status_Title")));
        
         
         System.out.println("7");
         waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
        		                                               getElement("location_Title")));
         
          boolean locaCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
        		      getElement("location_Title")).isDisplayed();
        
          Assert.assertTrue(locaCol,"It is visible");
          
          System.out.println("8");
          waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
         		                                               getElement("allocated_To_Title")));
          
           boolean alloCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
         		      getElement("allocated_To_Title")).isDisplayed();
         
           Assert.assertTrue(alloCol,"It is visible");
           
           
           for(int i=0; i<=300; i++) {
               try {
              	 
              	 clicksAndActionsHelper.moveToElement(javascriptHelper.
              			                      executeScriptWithWebElement(applicationDetailsListJsPaths.getElement("status_Title")));
              	 break;
               }catch (Exception e) {
      			// TODO: handle exception
              	 if(i==300)
              		 Assert.fail(e.getMessage());
      		}
               }
           System.out.println("9");
           waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
          		                                               getElement("service_Title")));
           
            boolean servCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
          		      getElement("service_Title")).isDisplayed();
         System.out.println(servCol);
            Assert.assertTrue(servCol,"It is visible");
            
            System.out.println("10");
            waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsListJsPaths.
           		                                               getElement("status_Title")));
            
             boolean statCol= javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.
           		      getElement("status_Title")).isDisplayed();
           
             Assert.assertTrue(statCol,"It is visible");
            
      
         
	}
	

	@And("Verify the fields present on the page")
	public void verify_the_fields_present_on_the_page() throws IOException, InterruptedException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn")));
		//for(int i=0; i<=500; i++) {
			/*try {
				//boolean backBTN = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("backBtn")).isDisplayed();

				//if (backBTN == true) {
				//	System.out.println("Back button displayed");
				//	Assert.assertTrue(backBTN);
				//	break;
				//} else {
				//	System.out.println("Back button not displayed");
				//	break;
				//}
				

			} catch (Exception e) {
				// TODO: handle exception
				if(i==500)
				Assert.fail(e.getMessage());
			}

		}
		*/
		for(int i=0; i<=300; i++) {
			//Thread.sleep(5000);
			//waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")));
			boolean saveBTN = javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).isDisplayed();

			if (saveBTN == true) {
				System.out.println("save button displayed");
				Assert.assertTrue(saveBTN);
				break;
			} else {
				System.out.println("save button not displayed");
				break;
			}
		}
		
	}


	@And("User click the Customer Application Detail tab")
	public void user_click_the_customer_application_detail_tab() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,
		// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("applicationDetailsTab")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("applicationDetailsTab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	

	@And("User click Add button in Financial Commitments under Customer Financials tab")
	public void user_click_add_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
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

	/*
	 * @And("User validate the Customer Debt screen is available in Financial Commitments"
	 * ) public void
	 * user_validate_the_customer_debt_screen_is_available_in_financial_commitments(
	 * ) throws Throwable { // waitHelper.waitForElementwithFluentwait(driver,
	 * javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
	 * "customerDebtDetailsScreen"))); WebElement customerDebtDetailsScreen =
	 * javascriptHelper .executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
	 * "customerDebtDetailsScreen")); for (int i = 0; i <= 1000; i++) { try {
	 * Assert.assertTrue(customerDebtDetailsScreen.isDisplayed()); break; } catch
	 * (Exception e) { if (i == 1000) { Assert.fail(e.getMessage()); } } } }
	 */

	@And("User validate the Save button available in Customer Debt screen")
	public void user_validate_the_save_button_available_in_customer_debt_screen() throws Throwable {
		WebElement customerDebtSaveBtn = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDebtSaveBtn"));
//		waitHelper.waitForElementwithFluentwait(driver, customerDebtSaveBtn);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(customerDebtSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}



	@And("User click the Back button in Customer Debt screen navigate to the previous screen")
	public void user_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDebtBackBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Finance type field available in Customer Debt screen")
	public void user_validate_the_finance_type_field_available_in_customer_debt_screen() throws Throwable {
		WebElement financeTypeField = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financeTypeField"));
		waitHelper.waitForElementwithFluentwait(driver, financeTypeField);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financeTypeField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financeTypeField")).getText();
//        System.err.println(financeTypeText);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User select the Finanacy type in Customer Debt screen")
	public void user_select_the_finanacy_type_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financeTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("Finance Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance Type")).trim())) {
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

	@And("User validate the Financial Institution field is available in Customer Debt screen")
	public void user_validate_the_financial_institution_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement financialInstitutionlabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialInstitutionlabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financialInstitutionlabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialInstitutionlabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Account Number field is available in Customer Debt screen")
	public void user_validate_the_account_number_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement accountNumberLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("accountNumberLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(accountNumberLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("accountNumberLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User validate the Sanction Date field is available in Customer Debt screen")
	public void user_validate_the_sanction_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionDataLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionDataLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(sanctionDataLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionDataLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Sanction Amount field is available in Customer Debt screen")
	public void user_validate_the_sanction_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionAmtLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(sanctionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Interest Rate % field is available in Customer Debt screen")
	public void user_validate_the_interest_rate_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement interestRateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("interestRateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(interestRateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("interestRateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Current Principal balance field is available in Customer Debt screen")
	public void user_validate_the_current_principal_balance_field_is_available_in_customer_debt_screen()
			throws Throwable {
		WebElement currentPrincipalBalanceLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("currentPrincipalBalanceLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(currentPrincipalBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("currentPrincipalBalanceLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Tenure field is available in Customer Debt screen")
	public void user_validate_the_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement tenureMonthLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("tenureMonthLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(tenureMonthLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("tenureMonthLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Maturity Date field is available in Customer Debt screen")
	public void user_validate_the_maturity_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement maturityDateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("maturityDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(maturityDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("maturityDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Installment Amount field is available in Customer Debt screen")
	public void user_validate_the_installment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement installmentAmtLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtLabel"));
		for (int i = 0; i <= 11000; i++) {
			try {
				Assert.assertTrue(installmentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Amount considered field is available in Customer Debt screen")
	public void user_validate_the_amount_considered_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("amountConsideredLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("amountConsideredLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Currency field is available in Customer Debt screen")
	public void user_validate_the_currency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("currencyLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("currencyLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Remarks field is available in Customer Debt screen")
	public void user_validate_the_remarks_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remarksLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remarksLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(remarksLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Next Due Date field is available in Customer Debt screen")
	public void user_validate_the_next_due_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement nextDueDateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("nextDueDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(nextDueDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("nextDueDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Collateral Type is available in Customer Debt screen")
	public void user_validate_the_collateral_type_is_available_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("NPAClassificationLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement collateralTypeLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("collateralTypeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(collateralTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("collateralTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Close Date field is available in Customer Debt screen")
	public void user_validate_the_close_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement closeDateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("closeDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(closeDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("closeDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Frequency field is available in Customer Debt screen")
	public void user_validate_the_frequency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("frequencyLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("frequencyLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Last payment amount field is available in Customer Debt screen")
	public void user_validate_the_last_payment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentAmtLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("lastPaymentAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(lastPaymentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("lastPaymentAmtLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Last payment date field is available in Customer Debt screen")
	public void user_validate_the_last_payment_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentDateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("lastPaymentDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(lastPaymentDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("lastPaymentDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Product Name field is available in Customer Debt screen")
	public void user_validate_the_product_name_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement productNameLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productNameLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(productNameLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productNameLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Last24 cycle field is available in Customer Debt screen")
	public void user_validate_the_last24_cycle_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement last24CycleLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("last24CycleLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(last24CycleLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("last24CycleLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Balance Transfer flag field is available in Customer Debt screen")
	public void user_validate_the_balance_transfer_flag_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement balanceTransferFlagLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("balanceTransferFlagLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(balanceTransferFlagLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("balanceTransferFlagLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Facility Status field is available in Customer Debt screen")
	public void user_validate_the_facility_status_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement facilityStatusLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facilityStatusLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facilityStatusLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facilityStatusLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Remaining Tenure field is available in Customer Debt screen")
	public void user_validate_the_remaining_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remainingTenureLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(remainingTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Disbursement Date field is available in Customer Debt screen")
	public void user_validate_the_disbursement_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement disbursementDateLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("disbursementDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(disbursementDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("disbursementDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Request for Balance Takeover field is available in Customer Debt screen")
	public void user_validate_the_request_for_balance_takeover_field_is_available_in_customer_debt_screen()
			throws Throwable {
		WebElement reqForBalanceTakeoverLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("reqForBalanceTakeoverLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(reqForBalanceTakeoverLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("reqForBalanceTakeoverLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the NPA Classification field is available in Customer Debt screen")
	public void user_validate_the_npa_classification_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement NPAClassificationLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("NPAClassificationLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(NPAClassificationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("NPAClassificationLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////////
	@And("User enter the Sanction Amount in Customer Debt screen")
	public void user_enter_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User enter the Tenure in Customer Debt screen")
	public void user_enter_the_tenure_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("tenureMonthInput"))
						.sendKeys(testData.get("Tenure(Months)"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User enter the Installment Amount in Customer Debt screen")
	public void user_enter_the_installment_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Installment Amt"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User enter the Remaining Tenure in Customer Debt screen")
	public void user_enter_the_remaining_tenure_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User click the Save button in Customer Debt screen")
	public void user_click_the_save_button_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDebtSaveBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User validate the confirm message in Customer Debt screen")
	public void user_validate_the_confirm_message_in_customer_debt_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("successMsg")));
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("successMsg")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("Success!"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the mandatory field blank message in Customer Debt screen")
	public void user_validate_the_mandatory_field_blank_message_in_customer_debt_screen() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mandatoryFillToastMsg")));
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User enter the Text value in numeric field and validate the error message in Customer Debt screen")
	public void user_enter_the_text_value_in_numeric_field_and_validate_the_error_message_in_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// Validate the numeric error
		String numericError = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("textInNumericFieldError")).getText();
		System.err.println("Numeric Error: " + numericError);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the message for invalid data in Customer Debt screen")
	public void user_validate_the_message_for_invalid_data_in_customer_debt_screen() throws Throwable {
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the pencil button under Financial Commitments in Customer Financials tab")
	public void user_click_the_pencil_button_under_financial_commitments_in_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
									.click();
// document.querySelectorAll('button[icon="pi pi-plus"]')[3].parentElement.parentElement.parentElement.nextElementSibling.querySelector("table tbody tr td button")
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

//	AT_CUD_003
	@And("User modify the Sanction amount in Customer Debt screen")
	public void user_modify_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User enter the invalid data and verify in Installment field under Customer Debt screen")
	public void user_enter_the_invalid_data_and_verify_in_installment_field_under_customer_debt_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Invalid Data"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// Validate the numeric error
		String numericError = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("textInNumericFieldError")).getText();
		System.err.println("Numeric Error: " + numericError);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User clear the mandatory field value in Customer Debt screen")
	public void user_clear_the_mandatory_field_value_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("installmentAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}

	@And("User Update the record with mandatory field blank in Customer Debt screen")
	public void user_update_the_record_with_mandatory_field_blank_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDebtUpdateBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User click the Update button in Customer Debt screen")
	public void user_click_the_update_button_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDebtUpdateBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	**************************************** Underwriter Feature ******************************************
	@And("User verify the Offer Decision tab is displayed in Underwriter")
	public void user_verify_the_offer_decision_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement offerDecisionTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offerDecisionTab"));
		for (int i = 0; i <= 5000; i++) {
			try {
				Assert.assertTrue(offerDecisionTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Application Details tab is displayed in Underwriter")
	public void user_verify_the_application_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement applicationDetailsTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("applicationDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(applicationDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Customer details tab is displayed in Underwriter")
	public void user_verify_the_customer_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerDetailsTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Additional Customer info tab is displayed in Underwriter")
	public void user_verify_the_additional_customer_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement additionalCustomerInfoTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("additionalCustomerInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(additionalCustomerInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Customer Financials tab is displayed in Underwriter")
	public void user_verify_the_customer_financials_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerFinancialsTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("customerFinancialsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerFinancialsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Living Expenses tab is displayed in Underwriter")
	public void user_verify_the_living_expenses_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement livingExpensesTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("livingExpensesTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(livingExpensesTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Facility Info tab is displayed in Underwriter")
	public void user_verify_the_facility_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement facilityInfoTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facilityInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(facilityInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Asset Details tab is displayed in Underwriter")
	public void user_verify_the_asset_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement assetDetailsTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("assetDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(assetDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Quotation Info tab is displayed in Underwriter")
	public void user_verify_the_quotation_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement quotationInfoTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("quotationInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(quotationInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Insurance Info tab is displayed in Underwriter")
	public void user_verify_the_insurance_info_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement InsuranceInfoTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("InsuranceInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(InsuranceInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Policy Check tab is displayed in Underwriter")
	public void user_verify_the_policy_check_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement policyCheckTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("policyCheckTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(policyCheckTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Document Details tab is displayed in Underwriter")
	public void user_verify_the_document_details_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement documentDetailsTab = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("documentDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(documentDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Pencil icon under Offer Decision tab")
	public void user_click_the_pencil_icon_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offerDecisionPencilEditBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Decision section is displayed under Offer Decision tab")
	public void user_verify_decision_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_Decision = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_Decision"));
		System.out.println("Field Name: " + offer_Decision.getText());
		waitHelper.waitForElementwithFluentwait(driver, offer_Decision);
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_Decision.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Facility Details section is displayed under Offer Decision tab")
	public void user_verify_facility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FacilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_FacilityDetails = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FacilityDetails"));
		System.out.println("Field Name: " + offer_FacilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_FacilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Eligibility Details section is displayed under Offer Decision tab")
	public void user_verify_eligibility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_EligibilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_EligibilityDetails = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_EligibilityDetails"));
		System.out.println("Field Name: " + offer_EligibilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_EligibilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Finance Configuration section is displayed under Offer Decision tab")
	public void user_verify_finance_configuration_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FinanceConfiguration")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_FinanceConfiguration = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FinanceConfiguration"));
		System.out.println("Field Name: " + offer_FinanceConfiguration.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_FinanceConfiguration.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Pricing Details section is displayed under Offer Decision tab")
	public void user_verify_pricing_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_PricingDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_PricingDetails = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_PricingDetails"));
		System.out.println("Field Name: " + offer_PricingDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_PricingDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Instlment Details section is displayed under Offer Decision tab")
	public void user_verify_instlment_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_InstalmentDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_InstalmentDetails = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_InstalmentDetails"));
		System.out.println("Field Name: " + offer_InstalmentDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_InstalmentDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Approval Details Hyperlinks section is displayed under Offer Decision tab")
	public void user_verify_approval_details_hyperlinks_section_is_displayed_under_offer_decision_tab()
			throws Throwable {
		WebElement offer_ApprovalDetailsHyperlinks = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_ApprovalDetailsHyperlinks"));
		System.out.println("Field Name: " + offer_ApprovalDetailsHyperlinks.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_ApprovalDetailsHyperlinks.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_03
	@And("User verify Approval level field under Decision section in Offer Decision tab")
	public void user_verify_approval_level_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_Decision")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement decision_ApprovalLevel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_ApprovalLevel"));
		waitHelper.waitForElementwithFluentwait(driver, decision_ApprovalLevel);
		System.out.println("Field Name: " + decision_ApprovalLevel.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(decision_ApprovalLevel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Underwriter field under Decision section in Offer Decision tab")
	public void user_verify_underwriter_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Underwriter = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_Underwriter"));
		System.out.println("Field Name: " + decision_Underwriter.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_Underwriter.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Reviewer field under Decision section in Offer Decision tab")
	public void user_verify_reviewer_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Reviewer = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_Reviewer"));
		System.out.println("Field Name: " + decision_Reviewer.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_Reviewer.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Decision Date field under Decision section in Offer Decision tab")
	public void user_verify_decision_date_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDate = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_DecisionDate"));
		System.out.println("Field Name: " + decision_DecisionDate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_DecisionDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Decison field under Decision section in Offer Decision tab")
	public void user_verify_decison_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDropdown = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_DecisionField"));
		System.out.println("Field Name: " + decision_DecisionDropdown.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_DecisionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_04
	@And("User verify the Offer amount under Finance Configuration section in Offer Decision tab")
	public void user_verify_the_offer_amount_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		String approveValue = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_ApprovalLevelValue")).getText();
		System.out.println("Appove Level: " + approveValue);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FinanceConfiguration")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String offerAmt = javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling")
				.getAttribute("ng-reflect-model");
		System.out.println("Offer Amount: " + offerAmt);
		int targetValue = 1000000;
		if (Integer.parseInt(offerAmt) < targetValue) {
			Assert.assertEquals("LEVEL1", approveValue);
		} else {
			System.out.println("Offer amount Greater than targer value");
		}
	}

//	Unw_06
	@And("User select the Decision dropdown as Accept\\Reject under Decision section in Offer Decision tab")
	public void user_select_the_decision_dropdown_as_accept_reject_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('[aria-label*=\"Accept\"]')")
						.click();
//				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("decision_DecisionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-item').length";
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
			System.out.println("Map " + testData.get("Decision Dropdown").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Decision Dropdown")).trim())) {
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

//	UNW_07
	@And("User verify the Product field is displayed under Facility Details section")
	public void user_verify_the_product_field_is_displayed_under_facility_details_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FacilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement facility_ProductLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ProductLabel"));
		System.out.println("Field Name: " + facility_ProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ProductInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Sub-Product field is displayed under Facility Details section")
	public void user_verify_the_sub_product_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SubProductLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_SubProductLabel"));
		System.out.println("Field Name: " + facility_SubProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SubProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SubProductInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_SubProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SubProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Scheme field is displayed under Facility Details section")
	public void user_verify_the_scheme_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SchemeLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_SchemeLabel"));
		System.out.println("Field Name: " + facility_SchemeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SchemeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SchemeInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_SchemeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SchemeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Pricing Indicator field is displayed under Facility Details section")
	public void user_verify_the_pricing_indicator_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_PricingIndicatorLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_PricingIndicatorLabel"));
		System.out.println("Field Name: " + facility_PricingIndicatorLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PricingIndicatorLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PricingIndicatorInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_PricingIndicatorInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PricingIndicatorInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User verify the Repayment Type field is displayed under Facility Details section")
	public void user_verify_the_repayment_type_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_RepaymentTypeLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_RepaymentTypeLabel"));
		System.out.println("Field Name: " + facility_RepaymentTypeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_RepaymentTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_RepaymentTypeInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_RepaymentTypeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_RepaymentTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Compute Instalment On field is displayed under Facility Details section")
	public void user_verify_the_compute_instalment_on_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_ComputeInstalmentLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ComputeInstalmentLabel"));
		System.out.println("Field Name: " + facility_ComputeInstalmentLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ComputeInstalmentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ComputeInstalmentInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ComputeInstalmentInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ComputeInstalmentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Principal Frequency field is displayed under Facility Details section")
	public void user_verify_the_principal_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_PrincipalFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_PrincipalFrequencyLabel"));
		System.out.println("Field Name: " + facility_PrincipalFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PrincipalFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PrincipalFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_PrincipalFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PrincipalFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Interest Frequency field is displayed under Facility Details section")
	public void user_verify_the_interest_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_InterestFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_InterestFrequencyLabel"));
		System.out.println("Field Name: " + facility_InterestFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_InterestFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_InterestFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_InterestFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_InterestFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Eligible Income field is displayed under Facility Details section")
	public void user_verify_the_eligible_income_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_EligibleIncomeLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_EligibleIncomeLabel"));
		System.out.println("Field Name: " + facility_EligibleIncomeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_EligibleIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_EligibleIncomeInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_EligibleIncomeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_EligibleIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Average Account Balance field is displayed under Facility Details section")
	public void user_verify_the_average_account_balance_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_AverageAccBalanceLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_AverageAccBalanceLabel"));
		System.out.println("Field Name: " + facility_AverageAccBalanceLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_AverageAccBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_AverageAccBalanceInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_AverageAccBalanceInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_AverageAccBalanceInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Applicable LTV1 field is displayed under Facility Details section")
	public void user_verify_the_applicable_ltv1_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV1Label = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ApplicableLTV1Label"));
		System.out.println("Field Name: " + facility_ApplicableLTV1Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV1Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV1Input = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ApplicableLTV1Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV1Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Applicable LTV2 field is displayed under Facility Details section")
	public void user_verify_the_applicable_ltv2_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV2Label = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ApplicableLTV2Label"));
		System.out.println("Field Name: " + facility_ApplicableLTV2Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV2Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV2Input = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("facility_ApplicableLTV2Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV2Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_08
	@And("User verify Requested Amount field is displayed under Finance configuration section")
	public void user_verify_requested_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_FinanceConfiguration")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Finance_RequestAmountLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_RequestAmountLabel"));
		System.out.println("Field Name: " + Finance_RequestAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestAmountInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_RequestAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Requested Tenure field is displayed under Finance configuration section")
	public void user_verify_requested_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_RequestTenureLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_RequestTenureLabel"));
		System.out.println("Field Name: " + Finance_RequestTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestTenureInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_RequestTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Offered Amount field is displayed under Finance configuration section")
	public void user_verify_offered_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedAmountLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_OfferedAmountLabel"));
		System.out.println("Field Name: " + Finance_OfferedAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedAmountInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_OfferedAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Offered Tenure field is displayed under Finance configuration section")
	public void user_verify_offered_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedTenureLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_OfferedTenureLabel"));
		System.out.println("Field Name: " + Finance_OfferedTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedTenureInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_OfferedTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Deviation Amount field is displayed under Finance configuration section")
	public void user_verify_deviation_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationAmountLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_DeviationAmountLabel"));
		System.out.println("Field Name: " + Finance_DeviationAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationAmountInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_DeviationAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Deviation Tenure field is displayed under Finance configuration section")
	public void user_verify_deviation_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationTenureLabel = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_DeviationTenureLabel"));
		System.out.println("Field Name: " + Finance_DeviationTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationTenureInput = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Finance_DeviationTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_09
	@And("User verify Period field is displayed under Pricing Details section")
	public void user_verify_period_field_is_displayed_under_pricing_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_PricingDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Pricing_Period = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_Period"));
		System.out.println("Field Name: " + Pricing_Period.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_Period.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Interest Def field is displayed under Pricing Details section")
	public void user_verify_interest_def_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_InterestDef = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_InterestDef"));
		System.out.println("Field Name: " + Pricing_InterestDef.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_InterestDef.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Rate Type field is displayed under Pricing Details section")
	public void user_verify_rate_type_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_RateType = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_RateType"));
		System.out.println("Field Name: " + Pricing_RateType.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_RateType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Index Rate field is displayed under Pricing Details section")
	public void user_verify_index_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_IndexRate = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_IndexRate"));
		System.out.println("Field Name: " + Pricing_IndexRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_IndexRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Offer Rate field is displayed under Pricing Details section")
	public void user_verify_offer_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_OfferRate = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_OfferRate"));
		System.out.println("Field Name: " + Pricing_OfferRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_OfferRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify Effective Rate field is displayed under Pricing Details section")
	public void user_verify_effective_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_EffectiveRate = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Pricing_EffectiveRate"));
		System.out.println("Field Name: " + Pricing_EffectiveRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_EffectiveRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_10
	@And("User verify the Instalment Period field is displayed under Installment Details section")
	public void user_verify_the_instalment_period_field_is_displayed_under_installment_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_InstalmentDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Instalment_InstalPeriod = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Instalment_InstalPeriod"));
		System.out.println("Field Name: " + Instalment_InstalPeriod.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Instalment_InstalPeriod.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Instalment Amount field is displayed under Installment Details section")
	public void user_verify_the_instalment_amount_field_is_displayed_under_installment_details_section()
			throws Throwable {
		WebElement Instalment_InstalAmount = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("Instalment_InstalAmount"));
		System.out.println("Field Name: " + Instalment_InstalAmount.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Instalment_InstalAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_14
	@And("User verify the Deviate button under Offer Decision screen")
	public void user_verify_the_deviate_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_DeviateBtn = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_DeviateBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_DeviateBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Recompute button under Offer Decision screen")
	public void user_verify_the_recompute_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_RecomputeBtn = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_RecomputeBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_RecomputeBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Save button under Offer Decision screen")
	public void user_verify_the_save_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_SaveBtn = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_SaveBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_SaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Offer button under Offer Decision screen")
	public void user_verify_the_offer_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_OfferBtn = javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_OfferBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_OfferBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_15
	@And("User clicks on the Save button under the Offer Decision tab")
	public void user_clicks_on_the_save_button_under_the_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("offer_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Offer button after selecting the Decision under Offer Decision tab")
	public void user_click_the_offer_button_after_selecting_the_decision_under_offer_decision_tab() throws Throwable {

	}

	@And("User verify the validation messgage after clicking Offer button under Offer Decision tab")
	public void user_verify_the_validation_messgage_after_clicking_offer_button_under_offer_decision_tab()
			throws Throwable {

	}

	@And("User click the Offer button without selecting the Decision under Offer Decision tab")
	public void user_click_the_offer_button_without_selecting_the_decision_under_offer_decision_tab() throws Throwable {

	}

//	AT_CUD_004
	@And("User click Search button in Financial Commitments under Customer Financials tab")
	public void user_click_search_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]")
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

	@And("User search the record in Financial Commitments under Customer Financials tab")
	public void user_search_the_record_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentSearchInput"))
						.sendKeys("usd");
//				javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys(testData.get("Currency Value"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the available record status in Financial Commitments under Customer Financials tab")
	public void user_validate_the_available_record_status_in_financial_commitments_under_customer_financials_tab()
			throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('p-paginator[ng-reflect-style-class=\"p-paginator-bottom\"]')["
											+ j + "].querySelector('button[ng-reflect-text=\"Refresh\"]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
//document.querySelectorAll('p-paginator[ng-reflect-style-class="p-paginator-bottom"]')[4].querySelector('button[ng-reflect-text="Refresh"]')				
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

	//
	@And("User click the Export button in Financial Commitments under Customer Financials tab")
	public void user_click_the_export_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('p-dropdown[ng-reflect-placeholder=\"Export\"]')[" + j
											+ "]")
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
	//taqueer
	@And("user click the customer details tab") 
	public void user_click_the_customer_details_tab() throws Throwable {
	
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetailsTab")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetailsTab")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user click the add button under customer details tab")
	public void user_click_the_add_button_under_customer_details_tab() throws InterruptedException, IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn")).click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetailsAddNew")).click();
			
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerPersonalInformationTitle")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerPersonalInformationTitle")).isDisplayed());
	}
	@And("user verify the back button")
	public void user_verify_the_back_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_BackBtn")).isEnabled();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("user verify the save button")
	public void user_verify_the_save_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_SaveBtn")).isEnabled();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user verify all the details under personal details for AT_CD_01")
	public void user_verify_all_the_details_under_personal_details_for_at_cd_01() throws IOException {
		
		
		
		
		//applicantType
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeStar")).isDisplayed());
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")));
		System.out.println("1");
		
		
		//customerType
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeStar")).isDisplayed());
		System.out.println("2");
		
		//title
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titleDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titleDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titlelabelStar")).isDisplayed());
		System.out.println("3");
		
		
		//firstName
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameStar")).isDisplayed());
		System.out.println("4");
		
		
		//middleName
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameTextField")).isDisplayed());
		System.out.println("5");
		
		
		//lastName
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameTextField")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameStar")).isDisplayed());
		System.out.println("6");
		
		
		//familyName
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameTextField")).isDisplayed());
		System.out.println("7");
		
		
		//firstNameArabic
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicTextField")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicStar")).isDisplayed());
		System.out.println("8");
		
		
		//middleNameArabic
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameArabicTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameArabicTextField")).isDisplayed());
		System.out.println("9");
		
		
		//lastNameArabic
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicTextField")).isDisplayed());
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicStar")).isDisplayed());
		System.out.println("10");
		
		
		//familyNameArabic
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameArabicTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameArabicTextField")).isDisplayed());
		System.out.println("11");
		
		
		//dob
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobTextField")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobStar")).isDisplayed());
		System.out.println("12");
		
		
		//age
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("ageTextfield")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("ageTextfield")).isDisplayed());
		System.out.println("13");
		
		
		//gender
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderStar")).isDisplayed());
		System.out.println("14");
		
		
		//maritalStatus
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusStar")).isDisplayed());
		System.out.println("15");
		
		
		//educationLevel
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLevelStar")).isDisplayed());
		System.out.println("16");
		
		
		//nationality
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityLabelStar")).isDisplayed());
		System.out.println("17");
		
		
		//residentialStatus	
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusStar")).isDisplayed());
		System.out.println("18");
		
		
		//language
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageDropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageDropdown")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageStar")).isDisplayed());
		System.out.println("19");
		
		
		//noOfDependents
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey")).isDisplayed());
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsStar")).isDisplayed());
		System.out.println("20");
		
		
		//clientCategory
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("clientCategoryDropDown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("clientCategoryDropDown")).isDisplayed());
		System.out.println("21");
		
		
		//blacklistedToggle
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("blackListedToggleBtn")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("blackListedToggleBtn")).isDisplayed());
		System.out.println("22");
		
		
		//consentObtainedCreditBureau
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("consentObtainedCreditBureauDropDown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("consentObtainedCreditBureauDropDown")).isDisplayed());
		System.out.println("23");
		
		
		//remarks
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("remarksTextBox")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("remarksTextBox")).isDisplayed());
		System.out.println("24");
	}
	@And("user click on the back button in personal details")
	public void user_click_on_the_back_button_in_personal_details() throws InterruptedException, IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_BackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerPersonalInformationTitle")));;
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerPersonalInformationTitle")).isDisplayed());
	}
	@And("user click the save button under cusomer details")
	public void user_click_the_save_button_under_cusomer_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	@And("user click on the first name textfield")
	public void user_click_on_the_first_name_textfield() throws InterruptedException {
		Thread.sleep(9000);
		
	for (int i = 0; i <= 1000; i++) {
		try {		
			javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).sendKeys(testData.get("First Name"));
			
			//javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).sendKeys(testData.get("First Name"));
			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}
	@And("user verify the invalid message of first name textfield")
	public void user_verify_the_invalid_message_of_first_name_textfield() {
		for (int i = 0; i <= 1000; i++) {
			try {
				String invalidAlphaMsg = javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("invalidAlphabetmessage")).getText();
				System.out.println(invalidAlphaMsg);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user click on the no of dependents field")
	public void user_click_on_the_no_of_dependents_field() throws IOException {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey")));
		WebElement noOfDependentsField = javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey"));
		for (int i = 0; i <= 1000; i++) {
			try {
				noOfDependentsField.click();
				noOfDependentsField.sendKeys("-1");
				//noOfDependentsField.sendKeys(testData.get("No Of Dep"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user verify error message of no of dependents field")
	public void user_verify_error_message_of_no_of_dependents_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				String errorMsg = javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsErrorMsg")).getText();
				System.out.println(errorMsg);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user click on the first record edit button under customer details")
	public void user_click_on_the_first_record_edit_button_under_customer_details() {
		
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("CD_EditButton1")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	//AT_CD_04
		@And("user verify all the details under personal details")
		public void user_verify_all_the_details_under_personal_details() throws IOException {
			
			//back Button
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_BackBtn")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_BackBtn")).isDisplayed());
			
			//update or save button
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_UpdateBtn")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_UpdateBtn")).isDisplayed());
			
			
			
			//applicantType
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeStar")).isDisplayed());
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")));
			System.out.println("1"+javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("applicantTypeLabel")).isDisplayed());
			
			
			//customerType
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerTypeStar")).isDisplayed());
			System.out.println("2");
			
			//title
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titleDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titleDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("titlelabelStar")).isDisplayed());
			System.out.println("3");
			
			
			//firstName
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameStar")).isDisplayed());
			System.out.println("4");
			
			
			//middleName
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameTextField")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameTextField")).isDisplayed());
			System.out.println("5");
			
			
			//lastName
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameTextField")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameTextField")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameStar")).isDisplayed());
			System.out.println("6");
			
			
			//familyName
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameTextField")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameTextField")).isDisplayed());
			System.out.println("6");
			
			
			//firstNameArabic
			//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicTextField")));
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicTextField")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameArabicStar")).isDisplayed());
			
			//middleNameArabic
			//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameArabicTextField")));
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("middleNameArabicTextField")).isDisplayed());
			
			//lastNameArabic
			//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicTextField")));
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicTextField")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("lastNameArabicStar")).isDisplayed());
			
			//familyNameArabic
			//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameArabicTextField")));
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("familyNameArabicTextField")).isDisplayed());
			
			//dob
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobTextField")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobTextField")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("dobStar")).isDisplayed());
			System.out.println("7");
			
			
			//age
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("ageTextfield")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("ageTextfield")).isDisplayed());
			System.out.println("8");
			
			
			//gender
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("genderStar")).isDisplayed());
			System.out.println("9");
			
			
			//maritalStatus
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("maritalStatusStar")).isDisplayed());
			System.out.println("10");
			
			
			//educationLevel
			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")));
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLeveldropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("educationLevelStar")).isDisplayed());
			System.out.println("11");
			
			
			//nationality
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("nationalityLabelStar")).isDisplayed());
			System.out.println("12");
			
			
			//residentialStatus	
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("residentialStatusStar")).isDisplayed());
			System.out.println("13");
			
			
			//language
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageDropdown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageDropdown")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("languageStar")).isDisplayed());
			System.out.println("14");
			
			
			//noOfDependents
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsUpDownKey")).isDisplayed());
			//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("noOfDependentsStar")).isDisplayed());
			System.out.println("15");
			
			
			//clientCategory
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("clientCategoryDropDown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("clientCategoryDropDown")).isDisplayed());
			System.out.println("16");
			
			
			//blacklistedToggle
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("blackListedToggleBtn")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("blackListedToggleBtn")).isDisplayed());
			System.out.println("17");
			
			
			//consentObtainedCreditBureau
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("consentObtainedCreditBureauDropDown")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("consentObtainedCreditBureauDropDown")).isDisplayed());
			System.out.println("18");
			
			//activeDeactiveButton
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("activeDeactiveBtn")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("activeDeactiveBtn")).isDisplayed());
			System.out.println("19");
			
			
			//remarks
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("remarksTextBox")));
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("remarksTextBox")).isDisplayed());
			System.out.println("20");
		}
		
		//AT_CD_05
				@And("user clear the first name textfield")
				public void user_clear_the_first_name_textfield() throws IOException {
					waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")));
					for (int i = 0; i <= 1000; i++) {
						try {
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).clear();
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).sendKeys(Keys.TAB);
							//javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).clear();
							break;
						} catch (Exception e) {
							if (i == 1000) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				
				@And("user enter the name in first name textfield")
				public void user_enter_the_name_in_first_name_textfield() throws IOException {
					waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")));
					for (int i = 0; i <= 1000; i++) {
						try {
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("firstNameTextField")).sendKeys(testData.get("First Name"));
							break;
						} catch (Exception e) {
							if (i == 1000) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				
			
				
				@And("user click on the update button")
				public void user_click_on_the_update_button() throws IOException {
					waitHelper.waitForElementwithFluentwait(driver, 
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_UpdateBtn")));
					for (int i = 0; i <= 1000; i++) {
						try {
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("customerDetails_UpdateBtn")).click();
							break;
						} catch (Exception e) {
							if (i == 1000) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
			
				@And("user capture the text of post update popup")
				public void user_capture_the_text_of_post_update_popup() throws IOException {
					waitHelper.waitForElementwithFluentwait(driver, 
							javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("postUpdatePopUp")));
					for (int i = 0; i <= 1000; i++) {
						try {
							String popup = javascriptHelper.executeScriptWithWebElement(customerDetailsJsPaths.getElement("postUpdatePopUp")).getText();
							System.out.println(popup);
							break;
						} catch (Exception e) {
							if (i == 1000) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				
}
