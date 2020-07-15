package com.capgemini.librarymanagementsystemcucumber.testrunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/dummy/librarymanagementsystemcucumber/src/main/java/com/capgemini/librarymanagementsystemcucumber/features", 
					glue = { "com/capgemini/librarymanagementsystemcucumber/stepdefinitions" }, 
					dryRun = false,  
					plugin = { "pretty", "html:target/cucumber" }, 
					monochrome = true)
public class TestRunner {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	/*
	 * @Before public void openBrowser() throws Exception { driver = new
	 * ChromeDriver(); driver.get("http://localhost:4200/login"); wait = new
	 * WebDriverWait(driver, 10); action = new Actions(driver);
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }
	 */
}
