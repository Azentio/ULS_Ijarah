package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentificationDetailApplicationPageObj {

	WebDriver driver;

	public IdentificationDetailApplicationPageObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement user_name;

	public WebElement Login_userName() {
		return user_name;

	}

}
