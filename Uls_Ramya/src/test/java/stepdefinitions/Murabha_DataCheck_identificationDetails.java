package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_DataCheck_identificationDetails extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	ExcelData Murabha_identificationDetail_TestData  = new ExcelData(excelTestDataPath,"mura_identificationDetail","Dataset ID");
	JSPaths Murabha_IdentificationDetail_Js = new JSPaths(excelPath, "murabha_identificationdetail_js", "identificationDetailElement", "JSPath");
	

	
	@And("User_6047 Get the test data for test case ID AT_DC_MU_ID_001")
	public void user_get_the_test_data_for_test_case_id_at_fi() {
		testData =  Murabha_identificationDetail_TestData.getTestdata("DS01_AT_DC_MU_ID_001");
	}


	@And("User_6047 Search the Ref Id Under Inbox")
	public void user_search_the_ref_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		.sendKeys(testData.get("Ref No"));
//		for (int i = 0; i <= 500; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
//				.sendKeys(testData.get("Ref No"));
//				break;
//			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}
	@And("User_6047 click additional customer info")
	public void user_click_additional_customer_info() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("AdditionalCustomerInfo_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_6047 Click view button under customer personal information")
	public void user_click_view_button_under_customer_personal_information() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("ViewButton")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 Click view button under customer identification")
	public void user_click_view_button_under_customer_identification() {
		for (int i = 0; i <= 100; i++) {
		try {
				javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("ViewButton_customerIdentification")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		
		
		
//		// document.querySelectorAll('ion-title[class="pl-2 pr-2 ion-color
//		// ion-color-dark md title-default hydrated"]').length
//     	String listOfViewButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
//		String listOfViewButton = "";
//		String viewButtonScreenName = "";
//		boolean isviewButtonClicked = false;
//		for (int i = 0; i <= 100; i++) {
//			try {
//				listOfViewButton = javascriptHelper.executeScript("return " + listOfViewButtonQuery).toString();
//				System.out.println("List of view button " + listOfViewButton);
//				if (!(listOfViewButton.isBlank())) {					break;
//				}
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//
//			}
//		}
//		int premitiveListOfviewButton = Integer.parseInt(listOfViewButton);
//		for (int j = 0; j < premitiveListOfviewButton; j++) {
//			for (int k = 0; k <= 100; k++) {
//				try {
//					viewButtonScreenName = javascriptHelper.executeScript(
//							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["+ j + "].textContent")
//							.toString();
//					System.out.println("Screen Name " + viewButtonScreenName);
//					if (!(viewButtonScreenName.isBlank())) {
//						System.out.println("Screen Name" + viewButtonScreenName + " is Not null");
//						if ((viewButtonScreenName.trim()).equalsIgnoreCase(("Customer Identification").trim())) {
//							System.out.println("Inside nested loop");
//							System.err.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
//							javascriptHelper
//									.executeScriptWithWebElement(
//											"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]")
//								.click();
//					
//							isviewButtonClicked = true;
//						break;
//							
//					}
//					}
//				} catch (Exception e) {
//					if (k == 300) {
//						Assert.fail(e.getMessage());
//					}
//				}
//
//			}
//			if (isviewButtonClicked == true) {
//				break;
//			}
//
//		}
//		
		
		
		
	
		}
	

	@Then("User_6047 verify the Help button")
	public void user_verify_the_help_button() {
		boolean HelpButtonVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
		 HelpButtonVerification = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("helpButton")).isDisplayed();
		 Thread.sleep(7000);
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(HelpButtonVerification, "Help button is not visisble hence failed");
	
	}
		}

	@Then("User_6047 verify the Back button")
	public void user_verify_the_back_button() {
		boolean BackButtonVerification = false;
		for (int i = 0; i <= 300; i++) {
			try {
				BackButtonVerification = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("helpButton")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(BackButtonVerification, "Back button is not visisble hence failed");
	
	}
	}
	@Then("User_6047 verify the ID Type")
	public void user_verify_the_id_type() {
		boolean IDType = false;
		for (int i = 0; i <= 300; i++) {
			try {
				IDType = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Type")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(IDType, "ID Type is not visisble hence failed");
	
	}
	}

	@Then("User_6047 verify the ID Number")
	public void user_verify_the_id_number() {
		boolean IDNumber = false;
		for (int i = 0; i <= 300; i++) {
			try {
				IDNumber = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Number")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(IDNumber, "ID Number is not visisble hence failed");
	
	}
	}

	@Then("User_6047 verify the ID Issue Date")
	public void user_verify_the_id_issue_date() {
		boolean IDIssueDate = false;
		for (int i = 0; i <= 300; i++) {
			try {
				IDIssueDate = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Issue_Date")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(IDIssueDate, "ID Issue Date is not visisble hence failed");
	
	}
	}

	@Then("User_6047 verify the ID Expiry Date")
	public void user_verify_the_id_expiry_date() {
		boolean IDExpiryDate = false;
		for (int i = 0; i <= 300; i++) {
			try {
				IDExpiryDate = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Expiry_Date")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(IDExpiryDate, "ID Expiry Date is not visisble hence failed");
	
	}
	}

	@Then("User_6047 verify the Issuing Authority")
	public void user_verify_the_issuing_authority() {
		boolean IssuingAuthority = false;
		for (int i = 0; i <= 300; i++) {
			try {
				IssuingAuthority = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("IssuingAuthority")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(IssuingAuthority, "Issuing Authority is not visisble hence failed");
	
	}
	}

	@Then("User_6047 verify the Country of Issue")
	public void user_verify_the_country_of_issue() {
		boolean CountryofIssue = false;
		for (int i = 0; i <= 300; i++) {
			try {
				CountryofIssue = javascriptHelper
						.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("CountryOfIssue")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(CountryofIssue, "Country of Issue is not visisble hence failed");
	
	}
	}
	@Then("User_6047 verify the Data in ID Type under identification details")
	public void user_verify_the_data_in_id_type_under_identification_details() {
		
		String ID ="document.querySelector('digital-select-layout[ng-reflect-name=\"idType\"] ion-select').getAttribute(\"aria-label\")";
		String IDVerify = (String) javascriptHelper.executeScript("return "+ID);
		
		System.err.println(IDVerify);
		String IDVerify1 =IDVerify.substring(1,7);
		
		String IDVeriy = "AADHAR";
		
		System.err.println("first print  " + IDVerify1);
		
		Assert.assertEquals(IDVeriy, IDVerify1);
		
	
	}


	@Then("User_6047 verify the Data in ID Number under identification details")
	public void user_verify_the_data_in_id_number_under_identification_details() {
		String IDNumberdata = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Number"))
				.getAttribute("ng-reflect-model");
	
		//String IDNumber =IDNumberdata.substring(0,9);
		
	String IDNumber1 = "XXXXXX5522";
		
		System.err.println("IDNumber :" + IDNumberdata);
		
		Assert.assertEquals(IDNumber1, IDNumberdata);
	}

	@Then("User_6047 verify the Data in ID Issue Date under identification details")
	public void user_verify_the_data_in_id_issue_date_under_identification_details() {
		//String IDIssueDate1 = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Issue_Date")).getText();
		String IDdate ="document.querySelector('digital-prime-date[ng-reflect-title=\"FORM.ISSUE_DATE\"] input').innerText";
		String IDdateVerify = (String) javascriptHelper.executeScript("return "+IDdate);
		//String IDIssueDate2 =IDIssueDate1.substring(4,15);
		System.out.println("Date"+IDdateVerify);
        String date="";
		for (int i = 0; i <2000; i++) {
            try {
              
                Assert.assertEquals(date, IDdateVerify);
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify the Data in ID Expiry Date under identification details")
	public void user_verify_the_data_in_id_expiry_date_under_identification_details() {
		//String IDExpiryDate1 = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Expiry_Date_Value")).getText();
		//String IDExpiryDate2 =IDExpiryDate1.substring(4,15);
		String IDExdate ="document.querySelector('digital-prime-date[ng-reflect-title=\"FORM.EXPIRY_DATE\"] input').innerText";
		String IDExdateVerify = (String) javascriptHelper.executeScript("return "+IDExdate);
		
        String IDTypeValue="";
		for (int i = 0; i <2000; i++) {
            try {
              
                Assert.assertEquals(IDExdateVerify, IDTypeValue);
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify the Data in Issuing Authority under identification details")
	public void user_verify_the_data_in_issuing_authority_under_identification_details() {
		String  IssuingAuthorityData1 = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("IssuingAuthority")).getAttribute("aria-label");
		String IssuingAuthorityData2 =IssuingAuthorityData1.substring(1,20);
        String IDTypeValue="Government of India";
		for (int i = 0; i <2000; i++) {
            try {
              
                Assert.assertEquals(IssuingAuthorityData2, IDTypeValue);
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify the Data in Country of Issue identification details")
	public void user_verify_the_data_in_country_of_issue_identification_details() {
		String CountryofIssueData1 = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("CountryOfIssue")).getAttribute("aria-label");
		String CountryofIssueData2 =CountryofIssueData1.substring(1,6);
        String IDTypeValue="INDIA";
		for (int i = 0; i <2000; i++) {
            try {
              
                Assert.assertEquals(CountryofIssueData2, IDTypeValue);
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("User_6047 verify ID Type field should be mandatory display only and text box")
	public void user_verify_id_type_field_should_be_mandatory_display_only_and_text_box() {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector('digital-select-layout[ng-reflect-form-control-name-label=\"idType\"]>ion-item>ion-select').getAttribute(\"aria-label\")";
				String accountnumber = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(accountnumber);
				Assert.assertTrue(accountnumber.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		String IDType_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Type_value")).getAttribute("aria-label");
//		for (int i = 0; i <2000; i++) {
//	        try {
//	            Assert.assertTrue(IDType_mandy.contains("*"));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	            }
//	        }
//	    }
		
		String IDType_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Type_value")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((IDType_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String IDType_text= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Type_value")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDType_text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 verify ID number should be mandatory display only and numberic")
	public void user_verify_id_number_should_be_mandatory_display_only_and_numberic() {
		String IDNumber_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Number_value")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDNumber_mandy.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String IDNumber_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Number_value")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((IDNumber_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String IDNumber_text= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Id_Number_value")).getAttribute("ng-reflect-input-type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDNumber_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 verify ID Issue Date field should be non mandatory display and calender")
	public void user_verify_id_issue_date_field_should_be_non_mandatory_display_and_calender() {
		String IDIssueDate_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Issue_Date_Attribute")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDIssueDate_mandy.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String IDIssueDate_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Issue_Date_Attribute")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((IDIssueDate_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String IDIssueDate_calender= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Issue_Date_calender")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDIssueDate_calender.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 verify ID Expiry Date field should be non mandatory display and calender")
	public void user_verify_id_expiry_date_field_should_be_non_mandatory_display_and_text_box() {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector('digital-prime-date[ng-reflect-name=\"dateOfExpiry\"]').getAttribute(\"ng-reflect-required\")";
				String accountnumber = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(accountnumber);
				Assert.assertTrue(accountnumber.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		String IDExpiryDate_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Expiry_Date_attribute")).getAttribute("ng-reflect-required");
//		for (int i = 0; i <2000; i++) {
//	        try {
//	            Assert.assertTrue(IDExpiryDate_mandy.contains("false"));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	            }
//	        }
//	    }
		
		String IDExpiryDate_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Expiry_Date_attribute")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((IDExpiryDate_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String IDExpiryDate_calender= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("Expiry_Date_calender")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IDExpiryDate_calender.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }   
	}

	@Then("User_6047 verify Issuing Authority number should be non mandatory display and lookup")
	public void user_verify_issuing_authority_number_should_be_non_mandatory_display_and_numberic() {
		String IssuingAuthorityNumber_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("IssuingAuthority_attribute")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(IssuingAuthorityNumber_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String IssuingAuthorityNumber_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("IssuingAuthority_attribute")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((IssuingAuthorityNumber_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String PricingIndicator_lookup= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("IssuingAuthority_attribute")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(PricingIndicator_lookup.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 verify Country of Issue field should be non mandatory display and lookup")
	public void user_verify_country_of_issue_field_should_be_non_mandatory_display_and_calender() {
		String CountryOfIssue_mandy= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("CountryOfIssue_Attribute")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(CountryOfIssue_mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		String CountryOfIssue_display = javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("CountryOfIssue_Attribute")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((CountryOfIssue_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String CountryOfIssue_lookup= javascriptHelper.executeScriptWithWebElement(Murabha_IdentificationDetail_Js.getElement("CountryOfIssue_Attribute")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(CountryOfIssue_lookup.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
              }
	        }
	    }
	}

	@Then("User_6047 verify Post clicking on Back button, system should navigate to the previous screen")
	public void user_verify_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Murabha_IdentificationDetail_Js.getElement("BackButton_navigate")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inboxTitle = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inboxTitle = javascriptHelper
						.executeScript("return " + Murabha_IdentificationDetail_Js.getElement("BackButtonVerification"))
						.toString();
				if (!(inboxTitle.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(inboxTitle.contains("Customer Identification"), "back button not work");
		System.out.println(inboxTitle);
	}

	@Then("User_6047 verify Post clicking on Help button, system should display the description of all the fields in details")
	public void user_verify_post_clicking_on_help_button_system_should_display_the_description_of_all_the_fields_in_details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Murabha_IdentificationDetail_Js.getElement("helpButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String descriptionOfDetails = "";
		for (int i = 0; i <= 300; i++) {
			try {
				descriptionOfDetails = javascriptHelper
						.executeScript("return " + Murabha_IdentificationDetail_Js.getElement("help_description"))
						.toString();
				if (!(descriptionOfDetails.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
		System.out.println(descriptionOfDetails);
		
	}
}
