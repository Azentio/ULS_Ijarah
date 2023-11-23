package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		
		
		
		WebElement element = driver.findElement(By.id("menuform:j_idt40"));
		element.click();
		Thread.sleep(3000);
		
		
		WebElement dropDown = driver.findElement(By.id("menuform:m_dropdown"));
		dropDown.click();
		Thread.sleep(3000);
		
		WebElement UI_Automation = driver.findElement(By.className("ui-selectonemenu"));
		UI_Automation.click();
		Thread.sleep(3000);
		
		driver.close();
		
		//scroll
//		WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - (Product) RED'])[2]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iphone);
//		iphone.click();
		
	
		
	}
}
