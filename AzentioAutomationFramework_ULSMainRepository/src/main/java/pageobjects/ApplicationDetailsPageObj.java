package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsPageObj {


	WebDriver driver;

	public ApplicationDetailsPageObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Heading of the tab
	@FindBy(xpath = "//ion-title[.=' Application Details ']")
	private WebElement tab_Title;

	public WebElement tab_TitleElement() {
		return tab_Title;

	}
	
	//Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement back_Btn;

	public WebElement back_BtnElement() {
		return back_Btn;

	}
	
	//Save Button
	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement save_Btn;

	public WebElement save_BtnElement() {
		return save_Btn;

	}
	
    //	Product Dropdown
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Product ']")
	private WebElement product_Dropdwn;

	public WebElement product_DropdwnElement() {
		return product_Dropdwn;

	}
	
//	SubProduct Dropdown
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Sub Product ']")
	private WebElement subProduct_Dropdwn;

	public WebElement subProduct_DropdwnElement() {
		return subProduct_Dropdwn;

	}
	
//	total_Amount_Finance_Request_TxtBox 
	@FindBy(xpath = "(//input[@ng-reflect-ng-class='p-inputnumber-input'])[1]")
	private WebElement total_Amount_Finance_Request_TxtBox;

	public WebElement total_Amount_Finance_Request_TxtBoxElement() {
		return total_Amount_Finance_Request_TxtBox;

	}
	
//	 Declared Net Monthly Income _TxtBox 
	@FindBy(xpath = "(//input[@ng-reflect-ng-class='p-inputnumber-input'])[2]")
	private WebElement  declared_Net_Monthly_Income_TxtBox;

	public WebElement declared_Net_Monthly_Income_TxtBoxElement() {
		return declared_Net_Monthly_Income_TxtBox;

	}
	
//	  Sourcing Channel _Dropdown 
	@FindBy(xpath = "(//input[@ng-reflect-ng-class='p-inputnumber-input'])[3]")
	private WebElement   declared_Obligation_Textfield;

	public WebElement declared_Obligation_TextfieldElement() {
		return declared_Obligation_Textfield;

	}
	
//	   Business Center Code_Dropdown 
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Business Center Code ']")
	private WebElement    business_Center_Code_Dropdwn;

	public WebElement business_Center_Code_DropdwnElement() {
		return business_Center_Code_Dropdwn;

	}
	
//	   Servicing Type_Dropdown 
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Servicing Type ']")
	private WebElement servicing_Type_Dropdwn;

	public WebElement servicing_Type_DropdwnElement() {
		return servicing_Type_Dropdwn;

	}
	
//	   Region_Dropdown 
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Region ']")
	private WebElement region_Dropdwn;

	public WebElement region_DropdwnElement() {
		return region_Dropdwn;

	}
	
//	    Servicing Branch _Dropdown 
	@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Servicing Branch ']")
	private WebElement servicing_Branch_Dropdwn;

	public WebElement servicing_Branch_DropdwnElement() {
		return servicing_Branch_Dropdwn;

	}
	
//     Closing Staff or Servicing Staff or RM  _Dropdown 
@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Closing Staff or Servicing Staff or RM ']")
private WebElement   closing_Staff_or_Servicing_Staff_or_RM_Dropdwn;

public WebElement closing_Staff_or_Servicing_Staff_or_RM_DropdwnElement() {
	return closing_Staff_or_Servicing_Staff_or_RM_Dropdwn;

}
	

//Spoke Location_Dropdown 
@FindBy(xpath = "//ion-label[text()=' Spoke Location ']")
private WebElement spoke_Location_Dropdwn;

public WebElement spoke_Location_DropdwnElement() {
return spoke_Location_Dropdwn;

}

//Sourcing Type_Dropdown 
@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Sourcing Type ']")
private WebElement sourcing_Type_Dropdwn;

public WebElement sourcing_Type_DropdwnElement() {
return sourcing_Type_Dropdwn;

}

// Sourcing Office_Dropdown 
@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Sourcing Office ']")
private WebElement sourcing_Office_Dropdwn;

public WebElement sourcing_Office_DropdwnElement() {
return sourcing_Office_Dropdwn;

}

// Sourcing Entity_Dropdown 
@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Sourcing Entity ']")
private WebElement sourcing_Entity_Dropdwn;

public WebElement sourcing_Entity_DropdwnElement() {
return sourcing_Entity_Dropdwn;

}

// Sourcing Staff_Dropdown 
@FindBy(xpath = "//span[@class='redclr ng-star-inserted']/parent::ion-label[text()=' Sourcing Staff ']")
private WebElement sourcing_Staff_Dropdwn;

public WebElement sourcing_Staff_DropdwnElement() {
return sourcing_Staff_Dropdwn;

}

//reference_Type_Dropdown 
@FindBy(xpath = "//ion-label[text()=' Reference Type ']")
private WebElement reference_Type_Dropdwn;

public WebElement reference_Type_DropdwnElement() {
return reference_Type_Dropdwn;

}

// Reference Entity_Dropdown 
@FindBy(xpath = "//ion-label[text()=' Reference Entity ']")
private WebElement  reference_Entity_Dropdwn;

public WebElement reference_Entity_DropdwnElement() {
return reference_Entity_Dropdwn;

}

// Reference Code_Dropdown 
@FindBy(xpath = "//ion-label[text()=' Reference Code ']")
private WebElement   reference_Code_Dropdwn;

public WebElement reference_Code_DropdwnElement() {
return reference_Code_Dropdwn;

}



//Status toggle btn 
@FindBy(xpath = "//ion-label[text()='Status ']")
private WebElement   status_Btn;

public WebElement status_BtnElement() {
return status_Btn;

}

//Submit btn 
@FindBy(xpath = "//span[text()='Submit']/parent::button")
private WebElement   submit_Btn;

public WebElement submit_BtnElement() {
return submit_Btn;

}

//Submit btn 
@FindBy(xpath = "//span[text()='Cancel']/parent::button")
private WebElement   cancel_Btn;

public WebElement cancel_BtnElement() {
return cancel_Btn;

}

//Summary btn 
@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
private WebElement summary_Btn;

public WebElement summary_BtnElement() {
return summary_Btn;

}

	
}
