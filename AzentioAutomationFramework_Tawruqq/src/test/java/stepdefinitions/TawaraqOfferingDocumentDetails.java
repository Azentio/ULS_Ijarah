package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class TawaraqOfferingDocumentDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths TawaraqOfferingDocumentDetails = new JSPaths(excelPath, "TawaraqOfferingDocumentDetails", "FieldName", "JSPath");
	ExcelData TawaAppDataEntryIncomeDetailsexelData = new ExcelData(excelTestDataPath, "TawaAppDataEntryIncomeDetails", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	
	
	@And("User_607 Select the module name as LOS in ULS application")
	public void Select_the_module_name_as_LOS_in_ULS_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isEmpty()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

	//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}

	}


	
	@And("User_607 click the Document Details section")
	public void User_607_click_the_document_details_section() {
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('button[class=\"btnNext ng-star-inserted\"]')").click();
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentDetails_module")));
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@Then("User_607 verify the Customer Name field")
	public void User_607_verify_the_customer_name_field() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i <400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("customerName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Click View button in Tawaraq Offering Document Details")
	public void user607_click_view_button_in_tawaraq_offering_document_details() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("ViewButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@Then("User_607 verify the Document Name field")
	public void User_607_verify_the_document_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Required Stage field")
	public void User_607_verify_the_required_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("requiredAtStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Staus field")
	public void User_607_verify_the_document_staus_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentStatus")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Mandatory\\/optional field")
	public void User_607_verify_the_mandatory_optional_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("mandatory/optional")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Category field")
	public void User_607_verify_the_document_category_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentCategory")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Upload date field")
	public void User_607_verify_the_upload_date_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("uploadDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Expected receipt date Stage field")
	public void User_607_verify_the_expected_receipt_date_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("expectedReceiptDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Deferral Stage field")
	public void User_607_verify_the_deferral_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("referralStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Def Approved By Stage field")
	public void User_607_verify_the_def_approved_by_stage_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("defApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}  
	  
	}

	@Then("User_607 verify the Change In Nature Approved By field")
	public void User_607_verify_the_change_in_nature_approved_by_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("changeInNatureApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Form field")
	public void User_607_verify_the_document_form_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentForm")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Quality field")
	public void User_607_verify_the_document_quality_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentQuality")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Reference Number field")
	public void User_607_verify_the_document_reference_number_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReferrenceNumber")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Document Received By field")
	public void User_607_verify_the_document_received_by_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReceivedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Location Where Received field")
	public void User_607_verify_the_location_where_received_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("locationWhereReceived")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Rack No field")
	public void User_607_verify_the_rack_no_field() {
		for (int i = 0; i <200; i++) {
			try {
					javascriptHelper.scrollIntoView(
					javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("rackNo")));
					 
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("rackNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the  Shelf No field")
	public void User_607_verify_the_shelf_no_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("shelfNo")));
				
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("shelfNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Box No field")
	public void User_607_verify_the_box_no_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("boxNo")));
				
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("boxNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 verify the Date Of Expiry field")
	public void User_607_verify_the_date_of_expiry_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("dateOfExpiry")));
			
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("dateOfExpiry")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 verify the Lodgement Amount field")
	public void User_607_verify_the_lodgement_amount_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollToElemet(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("ladgementAmount")));
			
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("ladgementAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 verify the Remarks field")
	public void User_607_verify_the_remarks_field() {
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.scrollToElemet(
						javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("remark")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("remark")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_607 to verify the Document Name field should be mandatory,Dropdown")
	public void User_607_to_verify_the_document_name_field_should_be_mandatory_text_box() {
		String DocumentNameMandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentName")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentNameMandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String DocumentNameDropdown= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentName")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentNameDropdown.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
	}

	@Then("User_607 to verify the Completion Stage field should be mandatory")
	public void User_607_to_verify_the_completion_stage_field_should_be_mandatory() {
		String CompletionStageMandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("repaymentMode_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(CompletionStageMandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
	}

	@Then("User_607 to verify the Status field should be mandatory,Editable,dropdown")
	public void User_607_to_verify_the_status_field_should_be_mandatory_editable_dropdown() {
		String StatusFieldMandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentStatus")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(StatusFieldMandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String StatusFieldDropdown= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentStatus")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(StatusFieldDropdown.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Quality field should be mandatory,Editable,dropdown")
	public void User_607_to_verify_the_quality_field_should_be_mandatory_editable_dropdown() {
		String QualityMandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentQuality")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(QualityMandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Quality_Editable= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentQuality")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Quality_Editable.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Quality_DropDown= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentQuality")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Quality_DropDown.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Date field should be nonmandatory,Date")
	public void User_607_to_verify_the_date_field_should_be_mandatory_date() {
		String Date_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("uploadDate")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Date_Mandy.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Date_Date= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("uploadDate_calender")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Date_Date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Deferred stage field should be nonmandatory,Dropdown")
	public void User_607_to_verify_the_deferred_stage_field_should_be_mandatory_text_box() {
		String DeferredStage_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("referralStage")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!DeferredStage_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String DeferredStage_Dropdown= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("referralStage")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DeferredStage_Dropdown.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Location field should be nonmandatory,Dropdown")
	public void User_607_to_verify_the_location_field_should_be_mandatory_text_box() {
		String Location_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("locationWhereReceived")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!Location_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Location_Dropdown= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("locationWhereReceived")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Location_Dropdown.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Rack Number field should be nonmandatory,Text box")
	public void User_607_to_verify_the_rack_number_field_should_be_mandatory_text_box() {
		String RackNumber_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("rackNo_nonmandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RackNumber_Mandy.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String RackNumber_Text= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("rackNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RackNumber_Text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Shelf Number field should be nonmandatory,Text box")
	public void User_607_to_verify_the_shelf_number_field_should_be_mandatory_text_box() {
		String ShelfNumber_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("shelfno_nonMandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ShelfNumber_Mandy.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String ShelfNumber_Text= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("shelfNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ShelfNumber_Text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Box Number field should be nonmandatory,Text box")
	public void User_607_to_verify_the_box_number_field_should_be_mandatory_text_box() {
		String BoxNumber_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("boxNo_nonMandy")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(BoxNumber_Mandy.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String BoxNumberText= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("boxNo")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(BoxNumberText.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_607 to verify the Document with field should be nonmandatory,dropdown")
	public void User_607_to_verify_the_document_with_field_should_be_mandatory_text_box() throws Throwable {
		Thread.sleep(1000);
		String DocumentWith_Mandy= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReceivedBy")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!DocumentWith_Mandy.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String DocumentWith_Text= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReceivedBy")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentWith_Text.contains("Select"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}
	
	@Given("User_607 To verify the field Customer Name should be non-mandatory")
	public void User_607_to_verify_the_field_customer_name_should_be_non_mandatory() throws Throwable {
		Thread.sleep(1000);
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("customerNameNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	    
	}

	@Given("User_607 To verify the field Document Name should be mandatory")
	public void user_607_to_verify_the_field_document_name_should_be_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentName*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }	}

	@Given("User_607 To verify the field Required at stage should be non-mandatory")
	public void user_607_to_verify_the_field_required_at_stage_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("requiredAtStageNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field Document Status should be mandatory")
	public void user_607_to_verify_the_field_document_status_should_be_non_mandatory() {
	    
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentStatus*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}

	@Given("User_607 To verify the field Mandatory\\/Optional should be mandatory")
	public void user_607_to_verify_the_field_mandatory_optional_should_be_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("mandatory/optional*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}
	
	@Given("User_607 To verify the field documentCategory should be mandatory")
	public void user_607_to__verify_the_field_document_category_should_be_mandatory() throws Throwable {
		Thread.sleep(1000);
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentCategory*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field upload Date should be non mandatory")
	public void user_607_to__verify_the_field_upload_date_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("uploadDateNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field expected Receipt Date should be non mandatory")
	public void user_607_to__verify_the_field_expected_receipt_date_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("expectedReceiptDateNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field deferral Stage should be non mandatory")
	public void user_607_to__verify_the_field_deferral_stage_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("deferralStageNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field def Approved By should be non mandatory")
	public void user_607_to__verify_the_field_def_approved_by_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("defApprovedByNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}
	
	@Given("User_607 To verify the field change In Nature Approved By should be non mandatory")
	public void user_607_to_verify_the_field_change_in_nature_approved_by_should_be_non_mandatory() throws Throwable {
		Thread.sleep(1000);
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("changeInNatureApprovedByNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field document Form By should be non mandatory")
	public void user_607_to_verify_the_field_document_form_by_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentFormNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	    
	}

	@Given("User_607 To verify the field document Quality should be mandatory")
	public void user_607_to_verify_the_field_document_quality_should_be_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentQuality*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field document Referrence Number should be non mandatory")
	public void user_607_to_verify_the_field_document_referrence_number_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReferrenceNumberNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field document Received By should be non mandatory")
	public void user_607_to_verify_the_field_document_received_by_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("documentReceivedByNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	}
	
	@Given("User_607 To verify the field Location Where Received should be non mandatory")
	public void user_to_verify_the_field_location_where_received_should_be_non_mandatory() throws Throwable {
		Thread.sleep(1000);
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("locationWhereReceivedNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field Rack should be non mandatory")
	public void user_to_verify_the_field_rack_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("rackNoNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field Shelf No should be non mandatory")
	public void user_to_verify_the_field_shelf_no_should_be_non_mandatory() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("remark")));
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("shelfNoNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	}

	@Given("User_607 To verify the field Box No should be non mandatory")
	public void user_to_verify_the_field_box_no_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("boxNoNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field Date Of Expiry should be non mandatory")
	public void user_to_verify_the_field_date_of_expiry_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("dateOfExpiryNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the field Lodgement Amount should be non mandatory")
	public void user_to_verify_the_field_lodgement_amount_should_be_non_mandatory() {
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("ladgementAmountNonMan")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(!FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	    
	}

	@Given("User_607 To verify the Remark should be mandatory")
	public void user_to_verify_the_remark_should_be_mandatory() throws Throwable {
		Thread.sleep(1000);
		String FieldName= javascriptHelper.executeScriptWithWebElement(TawaraqOfferingDocumentDetails.getElement("remark*")).getText();
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FieldName.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		} 
	}



	
	
}
