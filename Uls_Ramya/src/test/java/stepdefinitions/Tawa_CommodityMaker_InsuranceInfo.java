package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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

public class Tawa_CommodityMaker_InsuranceInfo {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	//JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Tawarruq_Commodity_InsuranceInfo_JS = new JSPaths(excelPath, "Tawa_Commodity_InsuranceInfo",
			"InsuranceInfoElement", "JSPath");
	JSPaths Tawarruq_Commodity_documentDetail_JS = new JSPaths(excelPath, "Tawa_commodity_documentDetail",
			"DocumentDetailElement", "JSPath");
	ExcelData Tawa_Commoditymaker_TestData = new ExcelData(excelTestDataPath, "Tawa_Commoditymaker",
			"Dataset ID");
	

	@And("User_6047 Get the test data for test case ID AT_TW_CSM_17")
	public void user_6047_get_the_test_data_for_test_case_AT_TW_CSM_17() {
		testData = Tawa_Commoditymaker_TestData.getTestdata("DS01_AT_TW_CSM_17");

	}
	@And("User_6047 Get the test data for test case ID AT_TW_CSM_18")
	public void user_6047_get_the_test_data_for_test_case_AT_TW_CSM_18() {
		testData = Tawa_Commoditymaker_TestData.getTestdata("DS01_AT_TW_CSM_18");

	}

	
	@And("User_6047 search the Ref id under Inbox")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
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
	
	
	
	
	@And("User_6047 click next Button")
	public void user_6047_click_next_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				//javascriptHelper.executeScriptWithWebElement("document.querySelector('button[class=\"btnNext ng-star-inserted\"]')").click();
				//javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("NextButton")).click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('button[class=\"btnNext ng-star-inserted\"]')").click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_6047 click insuranceInfo tab")
	public void user_6047_click_insurance_info_tab() {
		String lengthOfTheSegmentButton = "";
		boolean isClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				lengthOfTheSegmentButton = javascriptHelper.executeScript(
						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
						.toString();
				if ((!lengthOfTheSegmentButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveSegmentLength = Integer.parseInt(lengthOfTheSegmentButton);
		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[14].innerText
		String segmentLabelName = "";
		for (int i = 0; i < premitiveSegmentLength; i++) {
			try {
				for (int j = 0; j <= 200; j++) {
					segmentLabelName = javascriptHelper.executeScript(
							"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
									+ "].innerText")
							.toString();
					System.out.println("Segment Label Name " + segmentLabelName);
					if (segmentLabelName.equalsIgnoreCase("Insurance Info")) {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
										+ "]")
								.click();
						isClicked = true;
						break;

					} else if (!(segmentLabelName.equalsIgnoreCase("Insurance Info"))) {
						isClicked = false;
						break;
					}
				}

			} catch (Exception e) {
			}
			if (isClicked == true) {
				break;
			}
		}    
	}

	@And("User_6047 click EyeButton")
	public void user_6047_click_eye_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Eye_Button")));
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Eye_Button")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@Then("User_6047 To verify the Insurance Quatation Id field in Insurance Info screen")
	public void user_6047_to_verify_the_insurance_quatation_id_field_in_insurance_info_screen() {
		boolean InsuranceQuatationId = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			
				InsuranceQuatationId = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("InsuranceQuatationId")).isDisplayed();
				System.out.println(InsuranceQuatationId);
				if (InsuranceQuatationId == true) {
					break;
				}	
			}
		
		softAssert.assertTrue(InsuranceQuatationId, "Insurance Quatation Id is not visisble hence failed");

		//data must be display only
		String InsuranceQuatationId_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("InsuranceQuatationId")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((InsuranceQuatationId_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
		
	

	@Then("User_6047 To verify the Insurance Year field in Insurance Info screen")
	public void user_6047_to_verify_the_insurance_year_field_in_insurance_info_screen() {
		boolean InsuranceYear = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				InsuranceYear = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("InsuranceYear")).isDisplayed();
				if (InsuranceYear == true) {
					break;
				}	
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(InsuranceYear, "Insurance Year is not visisble hence failed");
		
		//data must be display only
		
		String InsuranceYear_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("InsuranceYear")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((InsuranceYear_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	}

	@Then("User_6047 To verify the Deprication field in Insurance Info screen")
	public void user_6047_to_verify_the_deprication_field_in_insurance_info_screen() {
		boolean Deprication = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				Deprication = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("Deprication")).isDisplayed();
				if (Deprication == true) {
					break;
				}
				
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(Deprication, "Deprication is not visisble hence failed");
		
		//data must be display only
		
		String Deprication_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("Deprication")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Deprication_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	}

	@Then("User_6047 To verify the Asset Price field in Insurance Info screen")
	public void user_6047_to_verify_the_asset_price_field_in_insurance_info_screen() {
		boolean AssetPrice = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				AssetPrice = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("AssetPrice")).isDisplayed();
				if (AssetPrice == true) {
					break;
				}
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(AssetPrice, "AssetPrice is not visisble hence failed");
		
		//data must be display only
		
		String AssetPrice_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("AssetPrice")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((AssetPrice_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	}

	@Then("User_6047 To verify the Rate Per Asset field in Insurance Info screen")
	public void user_6047_to_verify_the_rate_per_asset_field_in_insurance_info_screen() {
		boolean RatePerAsset = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				RatePerAsset = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("RatePerAsset")).isDisplayed();
				if (RatePerAsset == true) {
					break;
				}
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(RatePerAsset, "Rate Per Asset is not visisble hence failed");
		
		//data must be display only
		
		String RatePerAsset_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("Id_Type_value")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((RatePerAsset_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	}

	@Then("User_6047 To verify the Minium Insurance Premium field in Insurance Info screen")
	public void user_6047_to_verify_the_minium_insurance_premium_field_in_insurance_info_screen() {
		boolean MiniumInsurancePremium = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				MiniumInsurancePremium = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("MiniumInsurancePremium")).isDisplayed();
				
					if (MiniumInsurancePremium == true) {
						break;
					}
				
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(MiniumInsurancePremium, "Minium Insurance Premium is not visisble hence failed");
		
		//data must be display only
		
		String MiniumInsurancePremium_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("MiniumInsurancePremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((MiniumInsurancePremium_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	}

	@Then("User_6047 To verify the Base Insurance Premium field in Insurance Info screen")
	public void user_6047_to_verify_the_base_insurance_premium_field_in_insurance_info_screen() {
		boolean BaseInsurancePremium = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				BaseInsurancePremium = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("BaseInsurancePremium")).isDisplayed();
				if (BaseInsurancePremium == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(BaseInsurancePremium, "Base Insurance Premium is not visisble hence failed");
		
		//data must be display only
		
		String BaseInsurancePremium_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("BaseInsurancePremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((BaseInsurancePremium_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the VAT Premium field in Insurance Info screen")
	public void user_6047_to_verify_the_vat_premium_field_in_insurance_info_screen() {
		boolean VATPremium = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				VATPremium = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("VATPremium")).isDisplayed();
				if (VATPremium == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(VATPremium, "VAT Premium is not visisble hence failed");
		
		//data must be display only
		
		String VATPremium_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("VATPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((VATPremium_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the NET Premium field in Insurance Info screen")
	public void user_6047_to_verify_the_net_premium_field_in_insurance_info_screen() {
		boolean NETPremium = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				NETPremium = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("NETPremium")).isDisplayed();
				if (NETPremium == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(NETPremium, "NET Premium is not visisble hence failed");
		
		//data must be display only
		
		String NETPremium_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((NETPremium_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 click Document Details tab")
	public void user_6047_click_document_details_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentDetailTag")));
				//javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_InsuranceInfo_JS.getElement("InsuranceInfoTab")).click();
				
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@Then("User_6047 To verify the Customer Name field in Insurance Info screen")
	public void user_6047_to_verify_the_customer_name_field_in_insurance_info_screen() {
		boolean CustomerName = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				CustomerName = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("CustomerName")).isDisplayed();
				if (CustomerName == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(CustomerName, "CustomerName is not visisble hence failed");
		
		//data must be display only
		
		String CustomerName_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("CustomerName")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((CustomerName_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Name field in Insurance Info screen")
	public void user_6047_to_verify_the_document_name_field_in_insurance_info_screen() {
		boolean DocumentName = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentName = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentName")).isDisplayed();
				if (DocumentName == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(DocumentName, "Document Name is not visisble hence failed");
		
		//data must be display only
		
		String DocumentName_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentName")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentName_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Required At Stage field in Insurance Info screen")
	public void user_6047_to_verify_the_required_at_stage_field_in_insurance_info_screen() {
	    // Write code here that turns the phrase above into concrete actions
		boolean RequiredAtStage = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				RequiredAtStage = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("RequiredAtStage")).isDisplayed();
				if (RequiredAtStage == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(RequiredAtStage, "Required At Stage is not visisble hence failed");
		
		//data must be display only
		
		String RequiredAtStage_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("RequiredAtStage")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((RequiredAtStage_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Status field in Insurance Info screen")
	public void user_6047_to_verify_the_document_status_field_in_insurance_info_screen() {
		boolean DocumentStatus = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentStatus = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentStatus")).isDisplayed();
				if (DocumentStatus == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(DocumentStatus, "Document Status is not visisble hence failed");
		
		//data must be display only
		
		String DocumentStatus_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentStatus_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Mandatory\\/optional field in Insurance Info screen")
	public void user_6047_to_verify_the_mandatory_optional_field_in_insurance_info_screen() {
		boolean Mandatory_optional = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				Mandatory_optional = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("Mandatory_optional")).isDisplayed();
				if (Mandatory_optional == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(Mandatory_optional, "Mandatory_optional is not visisble hence failed");
		
		//data must be display only
		
		String Mandatory_optional_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("Mandatory_optional")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Mandatory_optional_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the document Category field in Insurance Info screen")
	public void user_6047_to_verify_the_document_category_field_in_insurance_info_screen() {
		boolean documentCategory = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				documentCategory = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("documentCategory")).isDisplayed();
				if (documentCategory == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(documentCategory, "document Category is not visisble hence failed");
		
		//data must be display only
		
		String documentCategory_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((documentCategory_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Upload Date field in Insurance Info screen")
	public void user_6047_to_verify_the_upload_date_field_in_insurance_info_screen() {
		boolean UploadDate = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				UploadDate = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("UploadDate")).isDisplayed();
				if (UploadDate == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(UploadDate, "Upload Date is not visisble hence failed");
		
		//data must be display only
		
		String UploadDate_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("UploadDate")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((UploadDate_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Expected Receipt Date field in Insurance Info screen")
	public void user_6047_to_verify_the_expected_receipt_date_field_in_insurance_info_screen() {
		boolean ExpectedReceiptDate = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				ExpectedReceiptDate = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ExpectedReceiptDate")).isDisplayed();
				if (ExpectedReceiptDate == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(ExpectedReceiptDate, "Expected Receipt Date is not visisble hence failed");
		
		//data must be display only
		
		String ExpectedReceiptDate_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ExpectedReceiptDate")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ExpectedReceiptDate_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Defferal Stage field in Insurance Info screen")
	public void user_6047_to_verify_the_defferal_stage_field_in_insurance_info_screen() {
		boolean DefferalStage = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DefferalStage = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DefferalStage")).isDisplayed();
				if (DefferalStage == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(DefferalStage, "Defferal Stage is not visisble hence failed");
		
		//data must be display only
		
		String DefferalStage_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DefferalStage")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DefferalStage_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Def Approved By field in Insurance Info screen")
	public void user_6047_to_verify_the_def_approved_by_field_in_insurance_info_screen() {
		boolean DefApprovedBy = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DefApprovedBy = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DefApprovedBy")).isDisplayed();
				if (DefApprovedBy == true) {
					break;
				}
			} catch (Exception e) {

			}}
		
		softAssert.assertTrue(DefApprovedBy, "Def Approved By is not visisble hence failed");
		
		//data must be display only
		
		String DefApprovedBy_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DefApprovedBy_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Change in Nature Approved By field in Insurance Info screen")
	public void user_6047_to_verify_the_change_in_nature_approved_by_field_in_insurance_info_screen() {
		boolean ChangeinNatureApprovedBy = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				ChangeinNatureApprovedBy = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ChangeinNatureApprovedBy")).isDisplayed();
				if (ChangeinNatureApprovedBy == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(ChangeinNatureApprovedBy, "Change in Nature Approved By is not visisble hence failed");
		
		//data must be display only
		
		String ChangeinNatureApprovedBy_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ChangeinNatureApprovedBy")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ChangeinNatureApprovedBy_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Form field in Insurance Info screen")
	public void user_6047_to_verify_the_document_form_field_in_insurance_info_screen() {
		boolean DocumentForm = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentForm = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentForm")).isDisplayed();
				if (DocumentForm == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		
		softAssert.assertTrue(DocumentForm, "Document Form is not visisble hence failed");
		
		//data must be display only
		
		String DocumentForm_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentForm_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Quality field in Insurance Info screen")
	public void user_6047_to_verify_the_document_quality_field_in_insurance_info_screen() {
		boolean DocumentQuality = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentQuality = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentQuality")).isDisplayed();
				if (DocumentQuality == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(DocumentQuality, "Document Quality is not visisble hence failed");
		
		//data must be display only
		
		String DocumentQuality_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentQuality")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentQuality_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Ref Num field in Insurance Info screen")
	public void user_6047_to_verify_the_document_ref_num_field_in_insurance_info_screen() {
		boolean DocumentRefNum = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentRefNum = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentRefNum")).isDisplayed();
				if (DocumentRefNum == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(DocumentRefNum, "Document Ref Num is not visisble hence failed");
		
		//data must be display only
		
		String DocumentRefNum_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentRefNum")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentRefNum_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Document Received By field in Insurance Info screen")
	public void user_6047_to_verify_the_document_received_by_field_in_insurance_info_screen() {
		boolean DocumentReceivedBy = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DocumentReceivedBy = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentReceivedBy")).isDisplayed();
				if (DocumentReceivedBy == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		
		softAssert.assertTrue(DocumentReceivedBy, "Document Received By is not visisble hence failed");
		
		//data must be display only
		
		String DocumentReceivedBy_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DocumentReceivedBy")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentReceivedBy_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Location Where Received field in Insurance Info screen")
	public void user_6047_to_verify_the_location_where_received_field_in_insurance_info_screen() {
		boolean LocationWhereReceived = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				LocationWhereReceived = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("LocationWhereReceived")).isDisplayed();
				if (LocationWhereReceived == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		
		softAssert.assertTrue(LocationWhereReceived, "Location Where Received is not visisble hence failed");
		
		//data must be display only
		
		String LocationWhereReceived_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((LocationWhereReceived_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Rack No field in Insurance Info screen")
	public void user_6047_to_verify_the_rack_no_field_in_insurance_info_screen() {
		boolean RackNo = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				RackNo = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("RackNo")).isDisplayed();
				if (RackNo == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(RackNo, "Rack No is not visisble hence failed");
		
		//data must be display only
		
		String RackNo_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("RackNo")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((RackNo_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Shelf No field in Insurance Info screen")
	public void user_6047_to_verify_the_shelf_no_field_in_insurance_info_screen() {
		boolean ShelfNo = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				ShelfNo = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ShelfNo")).isDisplayed();
				if (ShelfNo == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(ShelfNo, "Shelf No is not visisble hence failed");
		
		//data must be display only
		
		String ShelfNo_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("ShelfNo")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((ShelfNo_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Box No field in Insurance Info screen")
	public void user_6047_to_verify_the_box_no_field_in_insurance_info_screen() {
		boolean BoxNo = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("BoxNo")));
				BoxNo = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("BoxNo")).isDisplayed();
				if (BoxNo == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(BoxNo, "NET Premium is not visisble hence failed");
		
		//data must be display only
		
		String BoxNo_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((BoxNo_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the DateOfExpiry field in Insurance Info screen")
	public void user_6047_to_verify_the_date_of_expiry_field_in_insurance_info_screen() {
		boolean DateOfExpiry = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				DateOfExpiry = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DateOfExpiry")).isDisplayed();
				if (DateOfExpiry == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(DateOfExpiry, "Date Of Expiry is not visisble hence failed");
		
		//data must be display only
		
		String DateOfExpiry_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("DateOfExpiry")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DateOfExpiry_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Lodgement Amount field in Insurance Info screen")
	public void user_6047_to_verify_the_lodgement_amount_field_in_insurance_info_screen() {
		boolean LodgementAmount = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				LodgementAmount = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("LodgementAmount")).isDisplayed();
				if (LodgementAmount == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(LodgementAmount, "Lodgement Amount is not visisble hence failed");
		
		//data must be display only
		
		String LodgementAmount_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("LodgementAmount")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((LodgementAmount_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

	@Then("User_6047 To verify the Remarks field in Insurance Info screen")
	public void user_6047_to_verify_the_remarks_field_in_insurance_info_screen() {
		boolean Remarks = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				Remarks = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("Remarks")).isDisplayed();
				if (Remarks == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(Remarks, "Remarks is not visisble hence failed");
		
		//data must be display only
		
		String Remarks_display = javascriptHelper.executeScriptWithWebElement(Tawarruq_Commodity_documentDetail_JS.getElement("NETPremium")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((Remarks_display.contains("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

}
