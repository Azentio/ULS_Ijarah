package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {
		"src\\test\\java\\features\\MurabhaFeatures",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_AddressDetailsNewAppFEATURE.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_ApplicationDetailsFEATURE.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_ContactDetailsFEATURE.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_CustomerDetailsFEATURE.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_CustomerReferenceFEATURE.feature",
//		"src\\test\\java\\features\\MurabhaFeatures\\Murabha_NewApp_IdentifiationDetailsFEATURE.feature"
		}, glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors
 //, tags = "@AT_MU_CS_11" 

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