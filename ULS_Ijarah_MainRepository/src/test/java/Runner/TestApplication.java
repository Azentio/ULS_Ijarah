package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {
//		"src\\test\\java\\features\\IjarahFeatures"
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_UNDERWRITER.feature",
		"src\\test\\java\\features",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_CFIncome.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_Customer_FollowUpDetails_610.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_CONTRACTSIGN_ApplicationDetails1.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_CustomerDetails.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_DocumentDetails_610.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\ijarah_APPDATAENTRY_InsuranceInfo.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_LivingExpense.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_Quotation_Info.feature",
//		"src\\test\\java\\features\\IjarahFeatures\\Ijarah_APPDATAENTRY_Repayment_Mode.feature"
	//	,"src/test/javafeatures/MurabhaFeatures"
		//"src/test/java/features/IjarahFeatures/Ijarah_ApplicationDetailsFEATURE.feature"
		//"src/test/java/features/IjarahFeatures/Ijarah_ApplicationDetailsFEATURE.feature"
		}, glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors
 , tags = "@AT_IJCS_06"

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