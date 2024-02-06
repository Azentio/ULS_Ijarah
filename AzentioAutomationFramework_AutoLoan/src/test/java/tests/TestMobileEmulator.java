package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMobileEmulator {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://engineeringinterviewquestions.com/selenium-multiple-choice-questions/");
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		String question = "";
		for (int i = 1; i <= 94; i++) {
			try {
				question = javascriptExecutor
						.executeScript("return document.getElementsByTagName('p')[" + i + "].innerText").toString();
				System.out.println(question);
			} catch (Exception e) {

			}
		}
	}

}
