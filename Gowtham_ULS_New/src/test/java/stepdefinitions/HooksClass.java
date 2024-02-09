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

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ScreenshotHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseClass;
import runner.NewExcelTestRunner;
import tests.ExcelTest;
import utilities.ExtentTestManager;

public class HooksClass extends BaseClass {
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData testExecution = new ExcelData(path, "AutoLoanExecution", "TestCase ID");
	Map<String, String> testExecutionData;
	ExcelTest excelTest = new ExcelTest(path, "AutoLoanExecution", "TestCase ID");
	List<String> testCaseTagsFromExcel = excelTest.getTestCaseTagsfromExcel();

	ScreenshotHelper screenshotHelper = new ScreenshotHelper(driver);

	@Before
	public void browserSetup(Scenario scenario) throws IOException {
		// get flag status from excel and skip the test cases
		if (configFileReader.getExcelRunnerFlag().equalsIgnoreCase("yes")) {
			if (testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No")
					.equalsIgnoreCase("No")) {
				
				System.out.println("Status of the flag"+testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag()).get("ExecuteYes/No"));
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
		System.out.println("Browser closed");
		String name = scenario.getName();
		System.out.println("Scenario : **" + name + "** Stopped executing");
		io.cucumber.java.Status status = scenario.getStatus();
		String currentExecutionStatus = status.toString();

		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		if (configFileReader.getExcelRunnerFlag().equals("yes")) {
			if (currentExecutionStatus.equalsIgnoreCase("FAILED")) {

				// change flag to "No" for dependent scenarios in excel when main Scenario got
				// failed
				for (int i = 1; i < testCaseTagsFromExcel.size(); i++) {
					testExecutionData = testExecution.getTestdata(NewExcelTestRunner.getCurrentExecutionTag());
					Collection<String> values = testExecutionData.values();
					values.remove(NewExcelTestRunner.getCurrentExecutionTag());
					if (values.contains(testCaseTagsFromExcel.get(i))) {
						testExecution.updateTestData(testCaseTagsFromExcel.get(i), "ExecuteYes/No", "No");
					}

				}

			}
		}
	}

}
