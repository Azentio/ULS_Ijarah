package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ClicksAndActionsHelper {
	private WebDriver driver;
	Logger Log = LogManager.getLogger(WaitHelper.class.getName());
	JavascriptHelper javascriptHelper;

	// Click helper constrcutor
	public ClicksAndActionsHelper(WebDriver driver) {
		this.driver = driver;

	}

	/// Webdriver click
	public void clickOnElement(WebElement element) {
		element.click();
		// ExtentTestManager.getTest().info("Clicked on the element" +element);

	}

	// click to the element
	public void JSEClick(WebElement Element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Element);
	}

	// Moving to element
	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);

		action.moveToElement(element).perform();
		// ExtentTestManager.getTest().info("Moved to the element" +element);
	}

//hovering to element and selecting from options
	public void clickUsingActionClass(WebElement hoveringelelement, WebElement clickingelement) {
		Actions action = new Actions(driver);

		action.moveToElement(hoveringelelement).perform();
		action.moveToElement(clickingelement).click().build().perform();
		// ExtentTestManager.getTest().info("Moved to the element" +hoveringelelement+
		// "and clicked" +clickingelement);
	}

	public void rightClick(WebElement element) {

		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		// ExtentTestManager.getTest().info("Right clicked on the element" +element);

	}

	public void doubleClick(WebElement element) {

		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		// ExtentTestManager.getTest().info("Double clicked on the element" +element);
	}

	// drag and drop
	public void DragAndDrop(WebElement DragElement, WebElement DropElement) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(DragElement, DropElement);
		// ExtentTestManager.getTest().info("Dragged and droped");
	}
	
	
	

	public void jsSelectUsingText(String dropdownValue) {
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		javascriptHelper = new JavascriptHelper(driver);
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
				
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			
			if ((dropdownString.trim()).equalsIgnoreCase((dropdownValue).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
	}
}
