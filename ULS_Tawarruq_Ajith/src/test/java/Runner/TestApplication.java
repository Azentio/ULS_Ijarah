package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {

		// "src/test/java/features/Ijarah_AddressDetailsFeature.feature",
//		"src/test/java/features/Ijarah_ApplicationDetailsFEATURE.feature"
		//"src/test/java/features/IjarahFeatures/Ijarah_NewAppplicationIdentificationDetailsFEATURE.feature",
	//	"src/test/java/features/MurabhaFeatures/Murabha_ApplicationDetailsFEATURE.feature",
//	"src/test/java/features/MurabhaFeatures/Murabha_CustomerDetailsFEATURE.feature",
//	"src/test/java/features/MurabhaFeatures/Murabha_ApplicationDetailsFEATURE.feature",
//	"src/test/java/features/IjarahFeatures/Ijara_AssetDetailsFEATURE.feature",
//	"src/test/java/features/IjarahFeatures/Ijarah_AddressDetailsFeature.feature",
//	"src/test/java/features/IjarahFeatures/Ijarah_ApplicationDetailsFEATURE.feature",
//	"src/test/java/features/IjarahFeatures/Ijarah_newApp_customerDetailsFEATURE.feature",
	//"src/test/java/features/IjarahFeatures/Ijarah_NewAppContactDetailsFEATURE.feature"
	//"src/test/java/features/IjarahFeatures/Ijarah_NewApplicationAddressDetailsFEATURE.feature"
	//"src/test/java/features/MurabhaFeatures/Murabha_CustomerDetailsFEATURE.feature"
		//"src/test/java/features/Ijarah_newApp_customerDetailsFEATURE.feature"
		//"src/test/java/features/MurabhaFeatures/Murabha_ApplicationDetailsFEATURE.feature",
		

		"src/test/java/features/Tawarruq/Tawarruq_AppDataEntry_InsuranceInfo.feature"
		// Ijara_AssetDetailsFEATURE.feature

}, glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors
// , tags = "@CW_032"
 , tags="@AT_INS_001"

//, tags = "@AT_MAppDetails_NewApp_06"

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