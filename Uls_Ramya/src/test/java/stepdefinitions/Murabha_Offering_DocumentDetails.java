package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
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

public class Murabha_Offering_DocumentDetails {
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
	
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Murabha_offering_documentDetail_js = new JSPaths(excelPath, "Mura_offering_documentDetail",
			"DocumentDetailsElement", "JSPath");
	ExcelData Murabha_DocumentDetails_TestData = new ExcelData(excelTestDataPath, "Mura_Offering_documentDetail",
			"Dataset ID");




	@And("User_6047 Get the test data for test case ID AT_DOC_01")
	public void user_get_the_test_data_for_test_case_ID_AT_DOC_01() {
		testData = Murabha_DocumentDetails_TestData.getTestdata("DS01_AT_DOC_01");

	}
	@And("User_6047 Get the test data for test case ID AT_DOC_04")
	public void user_get_the_test_data_for_test_case_ID_AT_DOC_04() {
		testData = Murabha_DocumentDetails_TestData.getTestdata("DS01_AT_DOC_04");

	}
	@And("User_6047 search the Refer id under Inbox")
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
	

@And("User_6047 click the Document Details tab")
public void user_click_the_document_details_tab() {
	for (int i = 0; i <= 1000; i++) {
		try {
		//	javascriptHelper.JSEClick(
				//	javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentDetailTag")));
			javascriptHelper.executeScriptWithWebElement("document.querySelector('button[class=\"btnNext ng-star-inserted\"]')").click();
			javascriptHelper.JSEClick(
					javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentDetailTag")));
			//javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentDetailTag")).click();
			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}	    
}

@And("User_6047 click the Eye button")
public void user_click_the_eye_button() {
	for (int i = 0; i <= 1000; i++) {
		try {
		
					javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("Eye_Button")).click();
			
	
			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}	
}

@And("User_6047 To verify the Document Name field")
public void user_to_verify_the_document_name_field() throws IOException {
	boolean DocumentName = false;
	int i;
	for ( i = 0; i <= 300; i++) {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentName")));
	DocumentName = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentName")).isDisplayed();
		
			if (DocumentName == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DocumentName, "Document Name is not visisble hence failed");
	//data must be display only
			String DocumentName_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentName")).getAttribute("ng-reflect-readonly");

			for (i = 0; i <2000; i++) {

		      try {
		          Assert.assertTrue((DocumentName_display.equals("true")));
		          break;
		      } catch (Exception e) {
		          if (i==1999) {
		              Assert.fail(e.getMessage());
		          }
		      }

			}
}

@Then("User_6047 To verify the Completion Stage field")
public void user_to_verify_the_completion_stage_field() {
	boolean RequiredAtStage = false;
	int i;
	for ( i = 0; i <= 300; i++) {
		
		RequiredAtStage = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("RequiredAtStage")).isDisplayed();
		
			if (RequiredAtStage == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(RequiredAtStage, "Required At Stage is not visisble hence failed");
	//data must be display only
	String RequiredAtStage_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("RequiredAtStage")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((RequiredAtStage_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}

@Then("User_6047 To verify the Status field")
public void user_to_verify_the_status_field() {
	boolean DocumentStatus = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		DocumentStatus = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentStatus")).isDisplayed();
		
			if (DocumentStatus == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DocumentStatus, "Document Status is not visisble hence failed");
	//data must be display only
		String DocumentStatus_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentStatus")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentStatus_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
}

@Then("User_6047 To verify the Quality field")
public void user_to_verify_the_quality_field() {
	boolean DocumentQuality = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		DocumentQuality = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentQuality")).isDisplayed();
		
			if (DocumentQuality == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DocumentQuality, "Quality is not visisble hence failed");
	
	//data must be display only
	String DocumentQuality_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentQuality")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((DocumentQuality_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}

@Then("User_6047 To verify the Date field")
public void user_to_verify_the_date_field() {
	boolean UploadDate = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		UploadDate = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("UploadDate")).isDisplayed();
		
			if (UploadDate == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(UploadDate, "UploadDate is not visisble hence failed");
	
	//data must be display only
		String UploadDate_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("UploadDate")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((UploadDate_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
}

@Then("User_6047 To verify the Deferred Stage field")
public void user_to_verify_the_deferred_stage_field() {
	boolean DefferalStage = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		
		DefferalStage = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DefferalStage")).isDisplayed();
		
			if (DefferalStage == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DefferalStage, "Defferal Stage is not visisble hence failed");
	//data must be display only
			String DefferalStage_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DefferalStage")).getAttribute("ng-reflect-readonly");

			for (i = 0; i <2000; i++) {

		      try {
		          Assert.assertTrue((DefferalStage_display.equals("true")));
		          break;
		      } catch (Exception e) {
		          if (i==1999) {
		              Assert.fail(e.getMessage());
		          }
		      }

			}
}

@Then("User_6047 To verify the Location field")
public void user_to_verify_the_location_field() {
	boolean LocationWhereReceived = false;
	int i = 0; 
	for ( i = 0; i <= 300; i++) {
		
		LocationWhereReceived = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("LocationWhereReceived")).isDisplayed();
		
			if (LocationWhereReceived == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(LocationWhereReceived, "Location Where Received is not visisble hence failed");
	//data must be display only
	String LocationWhereReceived_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("LocationWhereReceived")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((LocationWhereReceived_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}

@Then("User_6047 To verify the Rack No field")
public void user_to_verify_the_rack_no_field() {
	boolean RackNo = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		
		RackNo = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("RackNo")).isDisplayed();
		
			if (RackNo == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(RackNo, "Rack No is not visisble hence failed");
	//data must be display only
		String RackNo_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("RackNo")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((RackNo_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
}

@Then("User_6047 To verify the Shelf No field")
public void user_to_verify_the_shelf_no_field() {

	boolean ShelfNo = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		ShelfNo = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ShelfNo")).isDisplayed();
		
			if (ShelfNo == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(ShelfNo, "Shelf No is not visisble hence failed");
	//data must be display only
			String ShelfNo_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ShelfNo")).getAttribute("ng-reflect-readonly");

			for (i = 0; i <2000; i++) {

		      try {
		          Assert.assertTrue((ShelfNo_display.equals("true")));
		          break;
		      } catch (Exception e) {
		          if (i==1999) {
		              Assert.fail(e.getMessage());
		          }
		      }

			}
}

@Then("User_6047 To verify the Box No field")
public void user_to_verify_the_box_no_field() {
	boolean BoxNo = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		
		BoxNo = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("BoxNo")).isDisplayed();
		
			if (BoxNo == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(BoxNo, "Box No is not visisble hence failed");
	//data must be display only
	String BoxNo_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("BoxNo")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((BoxNo_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}


@Then("User_6047 To verify the Document Category field")
public void user_to_verify_the_document_category_field() {
	boolean documentCategory = false;
	int i = 0; 
	for ( i = 0; i <= 300; i++) {
		
		documentCategory = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("documentCategory")).isDisplayed();
		
			if (documentCategory == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(documentCategory, "document Category is not visisble hence failed");
	//data must be display only
		String documentCategory_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("documentCategory")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((documentCategory_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
}

@Then("User_6047 To verify the Document Form field")
public void user_to_verify_the_document_form_field() {
	boolean DocumentForm = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		DocumentForm = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentForm")).isDisplayed();
		
			if (DocumentForm == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DocumentForm, "Document Form is not visisble hence failed");
	//data must be display only
			String DocumentForm_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentForm")).getAttribute("ng-reflect-readonly");

			for (i = 0; i <2000; i++) {

		      try {
		          Assert.assertTrue((DocumentForm_display.equals("true")));
		          break;
		      } catch (Exception e) {
		          if (i==1999) {
		              Assert.fail(e.getMessage());
		          }
		      }

			}
}

@Then("User_6047 To verify the Expected Date of Receipt field")
public void user_to_verify_the_expected_date_of_receipt_field() {
	boolean ExpectedReceiptDate = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		
		ExpectedReceiptDate = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ExpectedReceiptDate")).isDisplayed();
		
			if (ExpectedReceiptDate == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(ExpectedReceiptDate, "Expected Receipt Date is not visisble hence failed");
	//data must be display only
	String ExpectedReceiptDate_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ExpectedReceiptDate")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((ExpectedReceiptDate_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}

@Then("User_6047 To verify the Waiver\\/Defferral Approved By field")
public void user_to_verify_the_waiver_defferral_approved_by_field() {
	boolean DefApprovedBy = false;
	int i = 0; 
	for (i = 0; i <= 300; i++) {
		
		DefApprovedBy = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DefApprovedBy")).isDisplayed();
		
			if (DefApprovedBy == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DefApprovedBy, "Def Approved By is not visisble hence failed");
	//data must be display only
		String DefApprovedBy_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DefApprovedBy")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DefApprovedBy_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	
}

@Then("User_6047 To verify the Change in Nature of Document Approved By field")
public void user_to_verify_the_change_in_nature_of_document_approved_by_field() {
	boolean ChangeinNatureApprovedBy = false;
	int i = 0; 
	for (i = 0; i <= 300; i++) {
		
		ChangeinNatureApprovedBy = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ChangeinNatureApprovedBy")).isDisplayed();
		
			if (ChangeinNatureApprovedBy == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(ChangeinNatureApprovedBy, "Change in Nature Approved By is not visisble hence failed");
	//data must be display only
			String ChangeinNatureApprovedBy_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ChangeinNatureApprovedBy")).getAttribute("ng-reflect-readonly");

			for (i = 0; i <2000; i++) {

		      try {
		          Assert.assertTrue((ChangeinNatureApprovedBy_display.equals("true")));
		          break;
		      } catch (Exception e) {
		          if (i==1999) {
		              Assert.fail(e.getMessage());
		          }
		      }

			}
}

@Then("User_6047 To verify the Document Number field")
public void user_to_verify_the_document_number_field() {
	boolean DocumentRefNum = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		
		DocumentRefNum = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentRefNum")).isDisplayed();
		
			if (DocumentRefNum == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(DocumentRefNum, "Document Ref Num is not visisble hence failed");
	//data must be display only
	String DocumentRefNum_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentRefNum")).getAttribute("ng-reflect-readonly");

	for (i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((DocumentRefNum_display.equals("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }

	}
}

@Then("User_6047 To verify the Branch Remarks field")
public void user_to_verify_the_branch_remarks_field() {
	
	boolean Remarks = false;
	int i = 0;

	for ( i = 0; i <= 300; i++) {
		
		Remarks = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Remarks")).isDisplayed();
		
			if (Remarks == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(Remarks, "Remarks is not visisble hence failed");
	//data must be display only
		String DocumentRefNum_display = javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("DocumentRefNum")).getAttribute("ng-reflect-readonly");

		for (i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((DocumentRefNum_display.equals("true")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
}

@Then("User_6047 To verify the Upload field")
public void user_to_verify_the_upload_field() {
	boolean Upload = false;
	int i = 0; 
	for (i = 0; i <= 300; i++) {
		javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Upload")));
		Upload = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Upload")).isDisplayed();
		
			if (Upload == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(Upload, "Upload is not visisble hence failed");
	

			
}

@Then("User_6047 To verify the View field")
public void user_to_verify_the_view_field() {
	boolean view = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("view")));
		view = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("view")).isDisplayed();
		
			if (view == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(view, "view is not visisble hence failed");
	

	
}

@Then("User_6047 To verify the Help Button field")
public void user_to_verify_the_help_button_field() {
	//javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ShelfNo"))
//	.sendKeys(Keys.PAGE_UP);
	boolean Help_Button = false;
	int i = 0;
	for (i = 0; i <= 300; i++) {
		javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Help_Button")));
		Help_Button = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Help_Button")).isDisplayed();
		
			if (Help_Button == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(Help_Button, "Help_Button is not visisble hence failed");
	
}

@Then("User_6047 To verify the Back Button field")
public void user_to_verify_the_back_button_field() {
	boolean Pre_Back_Button = false;
	int i = 0;
	for ( i = 0; i <= 300; i++) {
		javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Pre_Back_Button")));
		Pre_Back_Button = javascriptHelper
					.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("Pre_Back_Button")).isDisplayed();
		
			if (Pre_Back_Button == true) {
				break;
			}	
		}
	
	softAssert.assertTrue(Pre_Back_Button, "Pre Back Button is not visisble hence failed");
	
}

@Then("User_6047 To click the Back Button field")
public void user_to_click_the_back_button_field() {
	javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("ShelfNo"))
	.sendKeys(Keys.PAGE_UP);
	for (int i = 0; i <= 1000; i++) {
		try {
		
					javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("Pre_Back_Button")).click();
			
	
			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}	
}

@Then("User_6047 verify the functionality of Back Button")
public void user_verify_the_functionality_of_back_button() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_offering_documentDetail_js.getElement("backButton_verify")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
    
}
@Then("User_6047 click the Search button and search the matching data in listview")
public void user_click_the_search_button_and_search_the_matching_data_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement("document.querySelector('button[ng-reflect-icon=\"pi pi-search\"] span[class=\"p-button-icon pi pi-search\"]')").click();
		
			javascriptHelper
					.executeScriptWithWebElement(commonJSPaths.getElement("search_listView"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <= 500; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("search_box_search_text"))
					.sendKeys(testData.get("matching data"));
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

@Then("User_6047 check the match result data in list view")
public void user_check_the_match_result_data_in_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			searchResult = javascriptHelper.executeScript("return " + commonJSPaths
					.getElement("list_view_search_result")).toString();
			System.out.println(searchResult);
			if (!(searchResult.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
		softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"system is not showing the matched result");
	}
}

@Then("User_6047 click the Search button and search the mismatching data in listview")
public void user_click_the_search_button_and_search_the_mismatching_data_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(commonJSPaths.getElement("search_listView"))
					.click();
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
					.sendKeys(testData.get("mismatch data"));
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

@Then("User_6047 check the mismatch result in list view")
public void user_check_the_mismatch_result_in_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			searchResult = javascriptHelper.executeScript("return " + commonJSPaths
					.getElement("list_view_search_result")).toString();
		
			if (!(searchResult.isBlank()) && i > 250) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	System.out.println(searchResult);
	softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is  showing the un matched result");
}
}
