package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataEntry_FacilityDetails extends BaseClass{
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
    
	
	WebDriver driver = BaseClass.driver;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Actions actions = new Actions(driver);

	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	ExcelData FacilityDetails = new ExcelData(excelTestDataPath,"ADE_FacilityDetails","DataSet ID");
	Map<String, String> testExecutionData;			
	Map<String, String> testData;

	
	JSPaths FacilityDetails_JSPath = new JSPaths(excelPath, "ADE_FacilityDetails", "FacilityInfo_Elements", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");

	
	
	@And("User_6047 get the test data set id for AT_CD_ADE_FI_01")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FI_01() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FI_01");
		testData = FacilityDetails.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	@And("User_6047 search the Ref ID for Consumer Durable")
	public void user_6047_search_the_ref_id_for_consumer_durable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	@And("User_6047 Click the Facility info screen tab in ConsumerDurable")
	public void user_6047_click_the_facility_info_screen_tab_in_consumerDurable() {
		//Thread.sleep(1500);
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Facility Info")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
			//		addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}

	@And("User_6047 Click Add button under the Facility info")
	public void user_6047_click_add_button_under_the_facility_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("AddButton_under_FacilityInfo")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 To verify the save button under the Facilityinfo screen")
	public void user_6047_to_verify_the_save_button_under_the_facilityinfo_screen() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("SaveButton")).isDisplayed();
				break;
			} catch (Exception e) { 
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the back button field under the Facilityinfo screen")
	public void user_6047_to_verify_the_back_button_field_under_the_facilityinfo_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("SaveButton")));
		WebElement SaveButton = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("SaveButton"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(SaveButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 To verify the Classification field under the Facilityinfo screen")
	public void user_6047_to_verify_the_classification_field_under_the_facilityinfo_screen() {
		WebElement Classification = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification"));
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

	@Then("User_6047 To verify the Product field under the Facilityinfo screen")
	public void user_6047_to_verify_the_product_field_under_the_facilityinfo_screen() {
		WebElement Product = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Product"));
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

	@Then("User_6047 To verify the Scheme field under the Facilityinfo screen")
	public void user_6047_to_verify_the_scheme_field_under_the_facilityinfo_screen() {
		WebElement Scheme = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Scheme"));
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

	@Then("User_6047 To verify the Program Code field under the Facilityinfo screen")
	public void user_6047_to_verify_the_program_code_field_under_the_facilityinfo_screen() {
		WebElement ProgramCode = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ProgrameCode"));
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

	@Then("User_6047 To verify the Facility type field under the Facilityinfo screen")
	public void user_6047_to_verify_the_facility_type_field_under_the_facilityinfo_screen() {
		WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("FacilityType"));
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

	@Then("User_6047 To verify the Pricing Indicator field under the Facilityinfo screen")
	public void user_6047_to_verify_the_pricing_indicator_field_under_the_facilityinfo_screen() {
		WebElement PricingIndicator = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("PricingIndicator"));
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

	@Then("User_6047 To verify the serving branch field under the Facilityinfo screen")
	public void user_6047_to_verify_the_serving_branch_field_under_the_facilityinfo_screen() {
		WebElement ServicingBranch = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ServicingBranch"));
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

	@Then("User_6047 To verify the Request Amount under the Facilityinfo screen")
	public void user_6047_to_verify_the_request_amount_under_the_facilityinfo_screen() {
		WebElement RequestedAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("RequestedAmount"));
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

	@Then("User_6047 To verify the Currency field under the Facilityinfo screen")
	public void user_6047_to_verify_the_currency_field_under_the_facilityinfo_screen() {
		WebElement Currency = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Currency"));
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

	@Then("User_6047 To verify the Loan Tenure under the Facilityinfo screen")
	public void user_6047_to_verify_the_loan_tenure_under_the_facilityinfo_screen() {
		WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("LoanTenure"));
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

	@Then("User_6047 To verify the Declared Down payment amount under the Facilityinfo screen")
	public void user_6047_to_verify_the_declared_down_payment_amount_under_the_facilityinfo_screen() {
		WebElement DeclaredDownPaymentAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("DeclaredDownPaymentAmount"));
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

	@Then("User_6047 To verify the status under the Facilityinfo screen")
	public void user_6047_to_verify_the_status_under_the_facilityinfo_screen() {
		WebElement status = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("status_ToggleButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(status.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 Click edit button under the Facility info")
	public void user_6047_click_edit_button_under_the_facility_info() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Edit_button")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 Verify the Classification field should be mandatory,editable,text lookup")
	public void user_6047_verify_the_classification_field_should_be_mandatory_editable_text_lookup() throws Throwable {
		Thread.sleep(2000);
		String Classification_Mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification")).getAttribute("aria-label");
		for (int i = 0; i <200; i++) {
	        try {
	            Assert.assertTrue(Classification_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==199) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String Classification_edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <200; i++) {

	      try {
	          Assert.assertTrue((Classification_edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==199) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
	 String Classification_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification")).getAttribute("ng-reflect-placeholder");
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

	@Then("User_6047 Verify the Product field should be mandatory,editable,text lookup")
	public void user_6047_verify_the_product_field_should_be_mandatory_editable_text_lookup() {
		String Product_Mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Product")).getAttribute("aria-label");
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
		
		String Product_edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Product")).getAttribute("ng-reflect-is-disabled");

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
		String Product_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Product")).getAttribute("ng-reflect-placeholder");
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
	@Then("User_6047 Verify the Scheme field should be mandatory,editable,text lookup")
	public void user_6047_verify_the_scheme_field_should_be_mandatory_editable_numeric_lookup() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Scheme")).getAttribute("aria-label");
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
		
		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Scheme")).getAttribute("ng-reflect-is-disabled");

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
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Scheme")).getAttribute("ng-reflect-placeholder");
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
	public void user_6047_verify_the_program_code_field_should_be_mandatory_editable_numeric_lookup() {
		String ProgramCode_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ProgrameCode")).getAttribute("aria-label");
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
		
		String ProgramCode_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ProgrameCode")).getAttribute("ng-reflect-is-disabled");

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
		String ProgramCode_Num= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ProgrameCode")).getAttribute("ng-reflect-placeholder");
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

	@Then("User_6047 Verify the Servicing branch field should be mandatory,noneditable")
	public void user_6047_verify_the_servicing_branch_field_should_be_mandatory_noneditable() {
		String ServicingBranch_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ServicingBranch")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!(ServicingBranch_mandy.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String ServicingBranch_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("ServicingBranch")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ServicingBranch_Edit.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		
	}
	@Then("User_6047 Verify the Pricing indicator field should be mandatory,editable,text lookup")
	public void user_6047_verify_the_pricing_indicator_field_should_be_mandatory_editable_text_lookup() {
		String PricingIndicator_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("PricingIndicator")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!(PricingIndicator_mandy.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String PricingIndicator_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("PricingIndicator")).getAttribute("ng-reflect-is-disabled");

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
		String PricingIndicator_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("PricingIndicator")).getAttribute("ng-reflect-placeholder");
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




	@Then("User_6047 Verify the Requested amount field should be mandatory,noneditable")
	public void user_6047_verify_the_requested_amount_field_should_be_mandatory_editable_num() throws Throwable {
	Thread.sleep(900);
		String RequestedAmount_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("RequestedAmount_mandy")).getText();
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
		
		String RequestedAmount_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("RequestedAmount")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue(!(RequestedAmount_Edit.contains("false")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
	}

	@Then("User_6047 Verify the Declared downpayment amount field should be mandatory,editable,text")
	public void user_6047_verify_the_declared_downpayment_amount_field_should_be_mandatory_editable_text() {
		String DeclaredDownpaymentAmount_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("DeclaredDownPaymentAmount_mandy")).getText();
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
		
		String DeclaredDownpaymentAmount_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("DeclaredDownPaymentAmount")).getAttribute("ng-reflect-readonly");

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
		String DeclaredDownpaymentAmount_num= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("DeclaredDownPaymentAmount_num")).getAttribute("inputmode");
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
	public void user_6047_verify_the_currency_field_should_be_mandatory_editable_text_lookup() {
		String Currency_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Currency")).getAttribute("aria-label");
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
		
		String Currency_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Currency")).getAttribute("ng-reflect-is-disabled");

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
		String Currency_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Currency")).getAttribute("ng-reflect-placeholder");
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
	public void user_6047_verify_the_loan_tenure_months_field_should_be_mandatory_editable_numeric_lookup() {
		String LoanTenure_mandy= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("LoanTenure")).getAttribute("ng-reflect-required");
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
		
		String LoanTenure_Edit = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("LoanTenure")).getAttribute("ng-reflect-readonly");

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
		String LoanTenure_text= javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("LoanTenure")).getAttribute("ng-reflect-input-type");
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
	@Then("User_6047 To verify the system should allow user to add new record of Facility info")
	public void user_6047_to_verify_the_system_should_allow_user_to_add_new_record_of_Facility_info() {
		//to check the classification field is present
		WebElement Classification = javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification"));
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
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_JSPath.getElement("Classification")).click();
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
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isEmpty())) {
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
}
