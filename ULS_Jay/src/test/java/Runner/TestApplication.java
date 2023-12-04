package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = { 
	//"src/test/java/features/Ijara_AppDataCheck_IdentificationDetails_610.feature",
	//	"src/test/java/features/ijara_AppDataCheck_InsuranceInfo.feature",
	//	"src/test/java/features/Ijara_AppDataCheck_ProductDetails_610.feature"
		}
   

         , glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors/ , tags = "@AT_LEA_007"
 
//, tags="@AT_DC_ID_006"                       
 
)                                                                         
public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * @Override 
	 *d
	 *
	 *
	 *
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