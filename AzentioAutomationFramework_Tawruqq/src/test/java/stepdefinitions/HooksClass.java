package stepdefinitions;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Runner.NewExcelTestRunner;
import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ScreenshotHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseClass;
import tests.ExcelTest;
import utilities.ExtentTestManager;

public class HooksClass extends BaseClass {
	WebDriver driver;

	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = configFileReader.getTawruqqTestDataFile();
	ExcelData testExecution = new ExcelData(path, "Tawruqq_ExecutionTracker", "TestCase ID");
	Map<String, String> testExecutionData;
	ExcelTest excelTest = new ExcelTest(path, "Tawruqq_ExecutionTracker", "TestCase ID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();
	boolean excelRunnerStatus = false;
	ScreenshotHelper screenshotHelper = new ScreenshotHelper(driver);

	@Before
	public void browserSetup(Scenario scenario) throws IOException {
		// get flag status from excel and skip the test cases
		if (excelRunnerStatus == true) {
			System.out.println("Test excel runner");
			if (testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No")
					.equalsIgnoreCase("No")) {

				System.out.println("Status of the flag"
						+ testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No"));
				Assume.assumeTrue(false);
			}

		}

		driver = initializeDriver();
		System.out.println("Driver Initiated");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Started executing");
		ExtentTestManager.startTest(name);
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		driver = BaseClass.driver;
		System.out.println("Screen shot got added");
		try {
			java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent, "image/png", "screenshot");
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@After
	public void TearDown(Scenario scenario) throws IOException {
		driver = BaseClass.driver;
		driver.quit();
		String testTag = "";
		System.out.println("Browser closed");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Stopped executing");
		io.cucumber.java.Status status = scenario.getStatus();
		String currentExecutionStatus = status.toString();
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		if (excelRunnerStatus == true) {
			if (currentExecutionStatus.equalsIgnoreCase("FAILED")) {

				for (int i = 1; i < testCaseTagsFromExcel.size(); i++) {
					testExecutionData = testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag());
					testExecution.updateTestData(testCaseTagsFromExcel.get(i - 1), "Test Execution Status", "Failed");
					Collection<String> values = testExecutionData.values();
					values.remove(NewExcelTestRunner.getCurrentExecutionTag());
					if (values.contains(testCaseTagsFromExcel.get(i))) {

						testExecution.updateTestData(testCaseTagsFromExcel.get(i), "ExecuteYes/No", "No");

					}

				}

			} else if (currentExecutionStatus.equalsIgnoreCase("PASSED")) {
				for (int i = 1; i < testCaseTagsFromExcel.size(); i++) {
					testExecutionData = testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag());
					testExecution.updateTestData(testCaseTagsFromExcel.get(i), "Test Execution Status", "Passed");
					break;
				}
			}

		}

	}
}
