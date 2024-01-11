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
	
	@And("login with valid credentials06")
	public void login_with_valid_credentials06()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication06();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials07")                                     //Ijara AppDataCheck InsuranceInfo
	public void login_with_valid_credentials07()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication07();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials08")                                     
	public void login_with_valid_credentials08()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication08();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials09")                                     
	public void login_with_valid_credentials09()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication09();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials10")                                     
	public void login_with_valid_credentials10()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication10();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials11")                                     
	public void login_with_valid_credentials11()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication11();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials12")                                     
	public void login_with_valid_credentials12()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication12();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials13")                                     
	public void login_with_valid_credentials13()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication13();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials14")                                     
	public void login_with_valid_credentials14()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication14();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials15")                                     
	public void login_with_valid_credentials15()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication15();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials16")                                     
	public void login_with_valid_credentials16()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication16();
                break;
            } catch (Exception e) {
                if (i==199) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
	
	@And("login with valid credentials17")                                     
	public void login_with_valid_credentials17()throws Throwable {
		for (int i = 0; i < 200; i++) {
            try {
                ijaraLogin.loginWithIjaraApplication17();
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
