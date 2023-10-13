package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class IjaraTest extends BaseClass{
	WebDriver driver=BaseClass.driver;
	ConfigFileReader configFileReader= new ConfigFileReader();
	IjaraLogin ijaraLogin= new IjaraLogin();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	 
	}
	@And("login with valid credentials")
	public void login_with_valid_credentials()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials02")
	public void login_with_valid_credentials02()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication02();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials03")
	public void login_with_valid_credentials03()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication03();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials04")
	public void login_with_valid_credentials04()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication04();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials05")
	public void login_with_valid_credentials05()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication05();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	
	//------------------------
	
	
}
