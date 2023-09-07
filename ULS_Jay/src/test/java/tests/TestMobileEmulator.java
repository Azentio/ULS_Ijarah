package tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestMobileEmulator {
	public static void main(String args[]) {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Galaxy S5");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(
				"https://stackoverflow.com/questions/58772489/how-can-i-open-the-chrome-browser-in-mobile-mode-using-the-selenium-webdriver-fo");
		
		

	}

}
