package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ApplicationDataEntry_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	MurabhaLogin murabhaLogin = new MurabhaLogin();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath =configFileReader.getMurabhaTestDataFilePath();
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "Murabha_CommonElements", "Murabha_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "Murabha_CommonElements", "Murabha_CommonFieldName", "JSPath");
	JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	ExcelData ApplicationDataEntry_testdata  = new ExcelData(excelTestDataPath,"ApplicationDataEntry_testdata","Dataset ID");
	
	@And("Navigate the IJARA URL")
	public void Navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());

	}
	@And("User_6047 Login with valid credentials")
	public void Login_with_valid_credentials() throws Throwable {
		murabhaLogin.loginWithMurabhaApplication("userType01");
		
		
	}
	@And("User_6047 Click the Mail box in ULS application")
	public void user_click_the_mail_box_in_uls_application() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@And("User_6047 Click the Search button under inbox")
	public void user_click_the_search_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
			
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	@And("User_6047 Search the Ref Id under inbox")
	public void user_search_the_ref_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 search the Ref Id Under inbox for submit")
	public void user_search_the_ref_id_under_inbox_for_submit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No")); 
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
	@And("User_6047 Click the Entitle button under inbox")
	public void user_click_the_entitle_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxEntitleBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	@And("User_6047 Click the Facility info tab")
	public void user_click_the_facility_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Facility_info_Tab")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_6047 Get the test data for test case ID AT_FI_001")
	public void user_get_the_test_data_for_test_case_id_at_fi() {
		testData =  ApplicationDataEntry_testdata.getTestdata("DS01_AT_FI_001");
	}


	

	@And("User_6047 Click Add button under the Facility info")
	public void user_click_add_button_under_the_facility_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("AddButton_under_FacilityInfo")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 check the Save button under the Facility info")
	public void user_check_the_save_button_under_the_facility_info() {

		WebElement SaveButton = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SaveButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(SaveButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Back button under the Facility info")
	public void user_check_the_back_button_under_the_facility_info() {
		WebElement BackButton = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("BackButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(BackButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Classification field under the Facility info")
	public void user_check_the_classification_field_under_the_facility_info() {
		WebElement Classification = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Classification.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Product field under the Facility info")
	public void user_check_the_product_field_under_the_facility_info() {
		WebElement Product = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Product.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Scheme field under the Facility info")
	public void user_check_the_scheme_field_under_the_facility_info() {
		WebElement Scheme = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Scheme.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Program Code field under the Facility info")
	public void user_check_the_program_code_field_under_the_facility_info() {
		WebElement ProgramCode = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ProgramCode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Facility type field under the Facility info")
	public void user_check_the_facility_type_field_under_the_facility_info() {
		WebElement FacilityType = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("FacilityType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(FacilityType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Pricing Indicator field under the Facility info")
	public void user_check_the_pricing_indicator_field_under_the_facility_info() {
		WebElement PricingIndicator = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Requested Amount field under the Facility info")
	public void user_check_the_requested_amount_field_under_the_facility_info() {
		WebElement RequestedAmount = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Declared Property Value field under the Facility info")
	public void user_check_the_declared_property_value_field_under_the_facility_info() {
		WebElement  DeclaredDownPaymentValue = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredPropertyValue "));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownPaymentValue.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 check the Declared Down Payment Amount field under the Facility info")
	public void user_check_the_declared_down_payment_amount_field_under_the_facility_info() {
		WebElement  DeclaredDownPaymentAmount = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownPaymentAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Currency field under the Facility info")
	public void user_check_the_currency_field_under_the_facility_info() {
		WebElement Currency = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Currency"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Currency.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Loan Tenure field under the Facility info")
	public void user_check_the_loan_tenure_field_under_the_facility_info() {
		WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 check the Servicing Branch field under the Facility info")
	public void user_check_the_servicing_branch_field_under_the_facility_info() {
		WebElement ServicingBranch = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ServicingBranch"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ServicingBranch.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_6047 Verify the Classification field should be mandatory,editable,text lookup")
	public void user_verify_the_classification_field_should_be_mandatory_editable_text_lookup() {
		String Classification_Mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Classification_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String Classification_edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Classification_edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
	 String Classification_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).getAttribute("ng-reflect-placeholder");
	 	for (int i = 0; i <2000; i++) {
	         try {
	             Assert.assertTrue(Classification_text.contains("Select"));
	             break;
	         } catch (Exception e) {
	             if (i==1999) {
	                 Assert.fail(e.getMessage());
	             }
	         }
	     }
	 }

	@Given("User_6047 Verify the Product field should be mandatory,editable,text lookup")
	public void user_verify_the_product_field_should_be_mandatory_editable_text_lookup() {
		String Product_Mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Product_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String Product_edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Product_edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String Product_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product")).getAttribute("ng-reflect-placeholder");
    	for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Product_text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Given("User_6047 Verify the Scheme field should be mandatory,editable,text lookup")
	public void user_verify_the_scheme_field_should_be_mandatory_editable_numeric_lookup() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Scheme_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Scheme_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Scheme_text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 Verify the Program code field should be mandatory,editable,text lookup")
	public void user_verify_the_program_code_field_should_be_mandatory_editable_numeric_lookup() {
		String ProgramCode_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ProgramCode_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String ProgramCode_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ProgramCode_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String ProgramCode_Num= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ProgramCode_Num.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 Verify the Servicing branch field should be mandatory,editable")
	public void user_verify_the_servicing_branch_field_should_be_mandatory_editable() {
		String ServicingBranch_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ServicingBranch")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ServicingBranch_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String ServicingBranch_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ServicingBranch")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ServicingBranch_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		
	}

	@Then("User_6047 Verify the Pricing indicator field should be mandatory,editable,text lookup")
	public void user_verify_the_pricing_indicator_field_should_be_mandatory_editable_text_lookup() {
		String PricingIndicator_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(PricingIndicator_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String PricingIndicator_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((PricingIndicator_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String PricingIndicator_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(PricingIndicator_text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}


	@Then("User_6047 Verify the Requested amount field should be mandatory,editable,num")
	public void user_verify_the_requested_amount_field_should_be_mandatory_editable_num() {
		String RequestedAmount_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount_mandy")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RequestedAmount_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String RequestedAmount_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((RequestedAmount_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String RequestedAmount_NUM= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount_number")).getAttribute("inputmode");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RequestedAmount_NUM.contains("decimal"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 Verify the Declared downpayment amount field should be mandatory,editable,num")
	public void user_verify_the_declared_downpayment_amount_field_should_be_mandatory_editable_text() {
		String DeclaredDownpaymentAmount_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount_mandy")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DeclaredDownpaymentAmount_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String DeclaredDownpaymentAmount_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DeclaredDownpaymentAmount_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String DeclaredDownpaymentAmount_num= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount_num")).getAttribute("inputmode");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DeclaredDownpaymentAmount_num.contains("decimal"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 Verify the Currency field should be mandatory,editable,text lookup")
	public void user_verify_the_currency_field_should_be_mandatory_editable_text_lookup() {
		String Currency_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Currency")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Currency_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String Currency_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Currency")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Currency_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String Currency_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Currency")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Currency_text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 Verify the Loan tenure\\(months) field should be mandatory,editable,numeric lookup")
	public void user_verify_the_loan_tenure_months_field_should_be_mandatory_editable_numeric_lookup() {
		String LoanTenure_mandy= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(LoanTenure_mandy.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String LoanTenure_Edit = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((LoanTenure_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String LoanTenure_text= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure")).getAttribute("ng-reflect-input-type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(LoanTenure_text.contains("number"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}
	@And ("User_6047 Get the test data for test case ID AT_FI_005")
	public void user_get_the_test_data_for_test_case_id_at_fi_005() {
		testData =  ApplicationDataEntry_testdata.getTestdata("DS01_AT_FI_005");
	}
@Then("User_6047 click the classification field and select the data for user to add new record")
public void user_click_the_classification_field_and_select_the_data_for_user_to_add_new_record() {
	//to check the classification field is present
	WebElement Classification = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Classification.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	

	//to click dropdown
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("Product").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
@Then("User_6047 click the Back button and verify the functionality of back button")
public void user_click_the_back_button_and_verify_the_functionality_of_back_button() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("BackButton")).click();
			Thread.sleep(4000);
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	WebElement AddButton = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("AddButton_under_FacilityInfo"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(AddButton.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}	
	
}

@And("User_6047 search the facility list under facility info")
public void user_search_the_ref_id_under_inbox() {
	//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_button_for_employment_det")).click();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text")).
			sendKeys(testData.get("Record"));
			break;
		}
		
		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}		
	}
} 
@Then("User_6047 click the Entitle button under facility list")
public void user_click_the_entitle_button_under_facility_list() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Edit_button")).click();
			Thread.sleep(4000);
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 to verify the same record should get saved in the system")
public void user_to_verify_the_same_record_should_get_saved_in_the_system() {
	String ClassificationField= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ClassificationField.contains("Home Loan"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String Product= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Product.contains("Home Loan-Ready to move / Under construction Property from Builder/Society"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String scheme= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(scheme.contains("Ready to move / Under construction Property from Builder/Society "));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String programcode= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(programcode.contains("Income Based"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String FacilityType= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("FacilityType")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(FacilityType.contains("Auto Leasing Loan"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String PricingIndicator= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(PricingIndicator.contains("Ijara auto retail 3"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount")).getAttribute("ng-reflect-value-variable");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(RequestedAmount.contains("1000000"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
}
	
@Then("User_6047 select the input for Classification field under the Facility info")
public void user_select_the_input_for_classification_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("Classification").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Classification")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

@Then("User_6047 select the input for Product field under the Facility info")
public void user_select_the_input_for_product_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Product")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("Product").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
@Then("User_6047 select the input for Scheme field under the Facility info")
public void user_select_the_input_for_scheme_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Scheme")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("Scheme").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Scheme")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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
	}}

@Then("User_6047 select the input for Program Code field under the Facility info")
public void user_select_the_input_for_program_code_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("ProgrameCode")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("ProgrameCode").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProgrameCode")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

@Then("User_6047 select the input for Facility type field under the Facility info")
public void user_select_the_input_for_facility_type_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("FacilityType")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("FacilityType").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("FacilityType")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

@Then("User_6047 select the input for Pricing Indicator field under the Facility info")
public void user_select_the_input_for_pricing_indicator_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PricingIndicator")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("PricingIndicator").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("PricingIndicator")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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

@Then("User_6047 give the input for Declared Property Value field under the Facility info")
public void user_give_the_input_for_declared_property_value_field_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredPropertyValue_Input")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("DeclaredPropertyValue_Input"))
//			.sendKeys("10000");
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//		}
//		}
//	}
	javascriptHelper                    

	.executeScriptWithWebElement(

	
	"document.querySelector('#assetPrice > div > div > ion-item > div.PrimeInputBox > div > p-inputnumber > span > input')")
.sendKeys("1000000");

}
@And("User_6047 enter the characters to the declared downpayment amount")
public void user_enter_the_characters_to_the_declared_downpayment_amount() throws Throwable {
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
.clear();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
	.sendKeys("d");
	

}
@And("User_6047 enter the special characters to the declared downpayment amount")
public void user_enter_the_special_characters_to_the_declared_downpayment_amount() throws Throwable {

	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')").sendKeys("*");
	Thread.sleep(6000);
	}

		
@And("User_6047 enter the negative number to the declared downpayment amount")
public void user_enter_the_negative_number_to_the_declared_downpayment_amount() throws Throwable {
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')").sendKeys("-10000");

}

@Given("User_6047 check the negative data in the declared downpayment amount")
public void user_check_the_negative_data_in_the_declared_downpayment_amount() {
	String value= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount_num")).getAttribute("aria-valuenow");
	for (int i = 0; i <2000; i++) {
        try { 
            Assert.assertTrue(value.contains("10000"));
            System.out.println("not allow the negative value"+value);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 give the input for Declared Down Payment Amount field under the Facility info")
public void user_give_the_input_for_declared_down_payment_amount_field_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredPropertyValue_Input")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("DeclaredPropertyValue_Input"))
//			.sendKeys("10000");
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	javascriptHelper                    

	.executeScriptWithWebElement(

	
			"document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")

.sendKeys("10000");

}

@Then("User_6047 give the input for Request Amount field under the Facility info")
public void user_give_the_input_for_request_amount_field_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("RequestedAmount")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("RequestedAmount"))
//			.sendKeys(testData.get("RequestedAmount"));
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	javascriptHelper                    

	.executeScriptWithWebElement(

			"document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")

	
.sendKeys("1000000");
}

@Then("User_6047 select the input for Currency field under the Facility info")
public void user_select_the_input_for_currency_field_under_the_facility_info() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Currency")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("Currency").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
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


@Then("User_6047 give the input for Loan Tenure field under the Facility info")
public void user_give_the_input_for_loan_tenure_field_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure")).click();
	javascriptHelper                    

	.executeScriptWithWebElement(

			
	"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

	
.sendKeys("3");
	
	
}


@Then("User_6047 click the save button under the facility info")
public void user_click_the_save_button_under_the_facility_info() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SaveButton")).click();
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 verify the popup of fill all field")
public void user_verify_the_popup_of_fill_all_field() throws Throwable {
	
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PleaseFillDetails_Popup")).getText();
        	System.out.println(text);
            Assert.assertTrue(text.contains("Please fill all the details"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}
	



@Then("User_6047 modify the classification field data")
public void user_click_the_classification_field_and_modify_the_data() {
	for (int i = 0; i <= 2000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Classification")).click();
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
	String dropdownLength = "";
	boolean isDropdownValueSelected = false;
	String dropdownString = "";
	for (int i = 0; i <= 300; i++) {
		try {
			dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
			System.out.println("Dropdown length " + dropdownLength);
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
				System.out.println("L value is " + l);
				System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
				dropdownString = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("String " + dropdownString.trim());
		System.out.println("Map " + testData.get("ProcuctModification").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProcuctModification")).trim())) {
			for (int k = 0; k <= 300; k++) {
				try {
					clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
					isDropdownValueSelected = true;
					  Assert.assertTrue(dropdownString.contains("Non Housing Loan"));
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

@Then("User_6047 clear the Loan Tenure field under facility")
public void user_clear_the_loan_tenure_field_under_facility() throws Throwable {
	javascriptHelper                    

	.executeScriptWithWebElement(

			
	"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

	
.clear();
	Thread.sleep(3000);
}
@Then("User_6047 modify the Loan Tenure field under facility info")
public void user_modify_the_loan_tenure_field_under_facility_info() throws Throwable {
	//javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure")).click();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('digital-text-box[id=\"loanTenure\"] input')");
for (int i = 0; i <2000; i++) {
    try {
    	javascriptHelper                    

    	.executeScriptWithWebElement(

    			
    	"document.querySelector('digital-text-box[id=\"loanTenure\"] input')").sendKeys("3");
        break;
    } catch (Exception e) {
        if (i==1999) {
            Assert.fail(e.getMessage());
        }
    }
}
}
@Given("User_6047 to check same record saved inLoan Tenure field under facility info")
public void user_to_check_same_record_saved_in_loan_tenure_field_under_facility_info() {
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("LoanTenure_value")).getAttribute("ng-reflect-model");
        	System.out.println(text);
            Assert.assertTrue(text.contains("3"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("User_6047 verify the successfully saved message under the facility info")
public void user_verify_the_successfully_saved_message_under_the_facility_info() {
	for (int i = 0; i <2000; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP")).getText();
        	System.out.println(text);
            Assert.assertTrue(text.contains("Success!"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
	}
}



@And("User_6047 modify the declared downpayment amount")
public void user_modify_the_declared_downpayment_amount() throws Throwable {
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
.clear();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
	.sendKeys("d");
	Thread.sleep(6000);
}

@And("User_6047 check the invalid data in the declared downpayment amount")
public void user_check_the_modified_data_in_the_declared_downpayment_amount() {
	
	String value= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("DeclaredDownPaymentAmount_num")).getAttribute("aria-valuenow");
	System.out.println(value);
	for (int i = 0; i <2000; i++) {
        try { 
            Assert.assertTrue(value.contains("null"));
            System.out.println(value);
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}
@And("User_6047 modify the correct data for declared downpayment amount")
public void user_modify_the_correct_data_for_declared_downpayment_amount() throws Throwable {
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
.clear();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
	.sendKeys("10000");

}
@And("User_6047 Click the back button in facility list")
public void user_click_the_back_button_in_facility_list() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("BackButton_prev")).click();
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
}
@And("User_6047 verify the the back button function using inbox label in facility list")
public void user_verify_the_the_back_button_function_using_inbox_label_in_facility_list() {
	WebElement FacilityType = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Inbox_title"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(FacilityType.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@And("User_6047 click the status toggle button for deactivate")
public void user_click_the_status_toggle_button_for_deactivate() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.JSEClick(
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("status_ToggleButton")));
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@And("User_6047 click the status toggle button for activate")
public void user_click_the_status_toggle_button_for_activate() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("status_ToggleButton")));
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@And("User_6047 to check the status is deactive")
public void user_to_check_the_status_is_deactive() {
	String value= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("status_ToggleButton")).getAttribute("aria-checked");
	for (int i = 0; i <2000; i++) {
        try { 
            Assert.assertTrue(value.contains("false"));  
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@And("User_6047 to check the status is active")
public void user_to_check_the_status_is_active() {
	String value= javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("status_ToggleButton")).getAttribute("aria-checked");
	for (int i = 0; i <2000; i++) {
        try { 
            Assert.assertTrue(value.contains("true"));  
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    } 
}
@And("User_6047 click the back Button")
public void user_click_the_back_Button() {
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("BackButton")).click();
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@And("User_6047 to verify the functionality of back button with add button display")
public void user_to_verify_the_functionality_of_back_button_with_add_button_display() {
	WebElement Scheme = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("AddButton_under_FacilityInfo"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Scheme.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@And ("User_6047 Get the test data for test case ID AT_FI_012")
public void user_get_the_test_data_for_test_case_id_at_fi_012() {
	testData =  ApplicationDataEntry_testdata.getTestdata("DS01_AT_FI_012");
}


@And("User_6047 click the Search button under facility info tab and search the matching data in listview")
public void user_click_the_search_button_under_facility_info_tab_and_search_the_matching_data_in_listview() {

	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}	
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_button_for_employment_det")).click();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text")).
			sendKeys(testData.get("Record"));
			Thread.sleep(3000);
			break;
		}
		
		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}		
	}

}


@And("User_6047 check the result data in facility list view")
public void user_check_the_result_data_in_facility_list_view() {

	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			if (i > 200) {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelector('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
                   break;

			}



		} catch (Exception e) {

			if (i == 300) {

				Assert.fail(e.getMessage());

			}
       	}

	}

	System.out.println(searchResult);
	softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");
}
@And("User_6047 clear the search box")
public void user_clear_the_search_box() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
			.clear();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	} 
}


@And("User_6047 click the Search button under facility info tab and search the mismatching data in listview")
public void user_click_the_search_button_under_facility_info_tab_and_sheck_the_mismatching_data_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}	
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
			.sendKeys(testData.get("MisMatchRecord"));
			Thread.sleep(3000);
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	} 

}

@And("User_6047 check the result in facility list view")
public void user_check_the_result_in_facility_list_view() {

	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			if (i > 200) {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelector('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
                   break;

			}



		} catch (Exception e) {

			if (i == 300) {

				Assert.fail(e.getMessage());

			}
       	}

	}

	System.out.println(searchResult);
	softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");
}

@Given("User_6047 Get the test data for test case ID AT_FI_013")
public void user_get_the_test_data_for_test_case_id_at_fi_() {
	testData =  ApplicationDataEntry_testdata.getTestdata("DS01_AT_FI_013");
}

@And("User_6047 Click the Export button under Facility info tab")
public void user_click_the_export_button_under_facility_info_tab() throws Throwable {

	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ExportButton")).click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}  
}

@And("User_6047 Click the PDF button under Export")
public void user_click_the_pdf_button_under_export() throws Throwable {
	javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ExportButton")).click();
	Thread.sleep(3000);
	
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PDF")).click();
			Thread.sleep(3000);
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}  
			


}

@And("User_6047 Click the Excel button under Export")
public void user_click_the_excel_button_under_export() throws Throwable {
	
	for (int i = 0; i <= 500; i++) {
	try {
		
		javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("XLS")).click();
		Thread.sleep(6000);
		break;
	} catch (Exception e) {
		if (i == 500) {
			Assert.fail(e.getMessage());
		}
	}
}  
		

}


}
