package runner;

import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import tests.ExcelTest;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

public class NewExcelTestRunner {
	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData testExecution = new ExcelData(path,
			"ULSExecution", "TestCase ID");
	Map<String, String> testExecutionData;
	
	ExcelTest excelTest = new ExcelTest(path, "ULSExecution", "TestCase ID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	static String currentExecutionTag;
	public void excelTestArea(String tags, int listSize, int tagIndex) {
		String[] parameter = {
				"src/test/java/features/Ijarah_AppData_CustomerDebt.feature",
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
		String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelTest excelTest = new ExcelTest(path, "ULSExecution", "TestCase ID");
		testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
		NewExcelTestRunner newExcelTestRunner = new NewExcelTestRunner();

		for (String string : testCaseTagsFromExcel) {
			ExcelTest excelTest2 = new ExcelTest(path, "ULSExecution", "TestCase ID");
			testCaseTagsFromExcel = excelTest2.getTestCaseTagsfromExcel();
			System.out.println(string);
			currentExecutionTag = string;
			ExcelData testExecution = new ExcelData(path, "ULSExecution", "TestCase ID");
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
