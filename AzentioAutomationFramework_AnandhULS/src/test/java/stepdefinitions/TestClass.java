package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import resources.BaseClass;

public class TestClass extends BaseClass {
	WebDriver driver = BaseClass.driver;

	@Given("navigate to URL feature one")
	public void navigate_to_url_feature_one() {
		ExpectedCondition<WebElement> elementToBeClickable = ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("test")));
	}

	@Given("navigate to URL feature two")
	public void navigate_to_url_feature_two() throws Exception {
		throw new Exception("Exception occured");
	}
}
