package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = { // "src/test/java/features/CSM_TransactionsFEATURE.feature",
		//"src/test/java/features/murabha_Repayment_Mode.feature" }, glue = "stepdefinitions",
			"src/test/java/features/Murabha_Datacheck_identificationdetails.feature" }, glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }

// ,dryRun = false //to check compilation errors
// , tags = "@CW_032"
// , tags=" @AT_FI_001"
  , tags = "@AT_DC_MU_ID_005"



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