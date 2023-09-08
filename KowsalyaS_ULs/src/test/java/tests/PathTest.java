package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import helper.WaitHelper;

public class PathTest {
	public static void main(String args[]) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		WaitHelper waitHelper = new WaitHelper(driver);
		driver.manage().window().maximize();
		driver.get("https://imal.path-solutions.com:8543/omni_web_portal_omnichannel_qc_o19/#/omni-login");
		System.out.println("Website got launched");
		// waitHelper.waitForElementwithFluentwait(driver,
		// driver.findElement(By.xpath("//input[@placeholder='Username']")));
		for (int i = 0; i <= 200; i++) {
			try {
				WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				userName.click();
				userName.sendKeys("rnakad");
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}

		}
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.click();
		password.sendKeys("123");
		WebElement Login = driver.findElement(By.xpath("//ion-label[text()=' LOGIN ']"));
		Login.click();
		driver.quit();

	}

}
