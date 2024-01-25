package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class IjaraTest extends BaseClass{
	WebDriver driver=BaseClass.driver;
	ConfigFileReader configFileReader= new ConfigFileReader();
	IjaraLogin ijaraLogin= new IjaraLogin();
	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	 
	}
	@And("login with valid credentials")
	public void login_with_valid_credentials()throws Throwable {
		ijaraLogin.loginWithIjaraApplication();
	}

	@Then("logout from the ULSApplication")
	public void logout_from_the_uls_application()throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	
	@And("login with valid credentials2")
	public void login_with_valid_credentials2()throws Throwable {
		ijaraLogin.loginWithIjaraApplication2();
	}
	
	@And("login with valid credentials3")
	public void login_with_valid_credentials3()throws Throwable {
		ijaraLogin.loginWithIjaraApplication3();
	}
	
	@And("login with valid credentials4")
	public void login_with_valid_credentials4()throws Throwable {
		ijaraLogin.loginWithIjaraApplication4();
	}
	
	@And("login with valid credentials5")
	public void login_with_valid_credentials5()throws Throwable {
		ijaraLogin.loginWithIjaraApplication5();
	}
	
	@And("login with valid credentials6")
	public void login_with_valid_credentials6()throws Throwable {
		ijaraLogin.loginWithIjaraApplication6();
	}
	
	@And("login with valid credentials7")
	public void login_with_valid_credentials7()throws Throwable {
		ijaraLogin.loginWithIjaraApplication7();
	}
	
	@And("login with valid credentials8")
	public void login_with_valid_credentials8()throws Throwable {
		ijaraLogin.loginWithIjaraApplication8();
	}
	
	@And("login with valid credentials9")
	public void login_with_valid_credentials9()throws Throwable {
		ijaraLogin.loginWithULSApplication9("userType09");
	}
	
	@And("login with valid credentials10")
	public void login_with_valid_credentials10()throws Throwable {
		ijaraLogin.loginWithULSApplication9("userType02");
	}
	
	@And("login with valid credentials11")
	public void login_with_valid_credentials11()throws Throwable {
		ijaraLogin.loginWithULSApplication9("userType10");
	}
}
