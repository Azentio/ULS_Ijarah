package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {
		"src\\test\\java\\features\\MurabhaFeatures",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_CFDebt.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_CustomerFollowUPDetails_610.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_DocumentDetails.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_Employment Details.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_FacilityDetails.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_Income.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_LivingExpenses.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_QuotationInfo.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_APPDATAENTRY_Repayment_Mode.feature"
		
		}, glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors
 , tags = "@AT_MU_OC_01" 

)
public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

	@Before
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");

	}

	@After
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}