package Runner;

import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataProvider.ExcelData;
import tests.ExcelTest;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

public class NewExcelTestRunner {
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData testExecution = new ExcelData(path,
			"Transaction_ExecutionTracker", "TestCaseID");
	Map<String, String> testExecutionData;
	
	ExcelTest excelTest = new ExcelTest(path, "Transaction_ExecutionTracker", "TestCaseID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	static String currentExecutionTag;
	public void excelTestArea(String tags, int listSize, int tagIndex) {
		String[] parameter = {
				"src/test/java/features/CSM_TransactionsFEATURE.feature",
				"--glue", "stepdefinitions", "--plugin", "pretty", "--plugin",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "--plugin",
				"rerun:ReRunScenarios/FailedReRun.txt", "--tags", "@" + tags };
		CucumberRunner.run(parameter, listSize, tagIndex);	
	}
	@BeforeTest
	public void beforeTest() {

		System.out.println("Test Execution Started");
	}

	@Test()
	public void test() {
		String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
		ExcelTest excelTest = new ExcelTest(path, "Transaction_ExecutionTracker", "TestCaseID");
		testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
		NewExcelTestRunner newExcelTestRunner = new NewExcelTestRunner();

		for (String string : testCaseTagsFromExcel) {
			ExcelTest excelTest2 = new ExcelTest(path, "Transaction_ExecutionTracker", "TestCaseID");
			testCaseTagsFromExcel = excelTest2.getTestCaseTagsfromExcel();
			System.out.println(string);
			currentExecutionTag = string;
			ExcelData testExecution = new ExcelData(path, "Transaction_ExecutionTracker", "TestCaseID");
			testExecutionData = testExecution.getTestdata(string);
			// run the scenarios based on tags from excel
			newExcelTestRunner.excelTestArea(string, testCaseTagsFromExcel.size(),
					testCaseTagsFromExcel.indexOf(string));
		}
	}
	

	// get the current execution tag for before and after hooks
	public static String getCurrentExecutionTag() {
		return currentExecutionTag;
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test Execution Ended");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}
}
