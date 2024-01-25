package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;
@CucumberOptions(features = { 
//	"src/test/java/features/Murabha_PurchaseChecker.feature",
//	"src/test/java/features/Tawarrq_AppData_Check_DocumentDetails.feature",
//	"src/test/java/features/murabhe_AppDataEntery_EmployementDetails.feature",
		
		
		"src/test/java/features/Murabha_AppDataEntry_CustomerDetails.feature",
		}
   

         , glue = "stepdefinitions",
		// monochrome=false, //to make steps in color
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRunScenarios/FailedReRun.txt" }
// ,dryRun = false //to check compilation errors/ , tags = "@AT_LEA_007"
 
 //, tags="@AT_MU_ADE_CD_11"                   
 
)                                                                         
public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * @Override 
	 *d..
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