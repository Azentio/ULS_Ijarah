package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.JavascriptHelper;

public class UserUtility_615 {
	
	public void verifyGivenFieldIsMandatory(WebDriver driver,String jspath) {
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		for (int i = 0; i <2000; i++) {
			try {
				String Field = javascriptHelper.executeScript("return "+jspath).toString();
				//System.out.println(Field);
				Assert.assertTrue(Field.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	public void verifyGivenFieldIsNotMandatory(WebDriver driver,String jspath) {
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		for (int i = 0; i <2000; i++) {
			try {
				String Field = javascriptHelper.executeScript("return "+jspath).toString();
				//System.out.println(Field);
				Assert.assertFalse(Field.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	public void selectRadioButton(WebDriver driver,String value) {
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		int length=0;
		for (int i = 0; i <2000; i++) {
			try {
				String string = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio').length").toString();
				length = Integer.parseInt(string);
				//System.out.println(length);
				if (length!=0) {
					break;
				}
				
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		System.err.println(length);
		for (int i = 0; i < length; i++) {
			String jsPath = "return document.querySelectorAll('ion-radio')["+i+"].shadowRoot.querySelector('label').innerText";
			//System.out.println(jsPath);
			String radio=null;
			for (int j = 0; j<2000; j++) {
				try {
					 radio = javascriptHelper.executeScript(jsPath).toString();
					if (!radio.isBlank()||!radio.isEmpty()) {
						break;
					}
					
				} catch (Exception e) {
					if (j==1999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			//System.out.println(radio);
			
			if (radio.trim().equalsIgnoreCase(value)) {
				for (int j = 0; j < 200; j++) {
					try {
						String js1= "document.querySelectorAll('ion-radio')["+i+"]";
					//	System.out.println(js1);
						javascriptHelper.executeScriptWithWebElement(js1).click();
						break;
					} catch (Exception e) {
						if (i==199) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
			}
		}

	}


}
