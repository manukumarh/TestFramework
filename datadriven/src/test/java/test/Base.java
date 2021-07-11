package test;

import org.testng.annotations.Test;

import utils.Common;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {

	static WebDriver driver;
	//String browser;
	//String url = "https://fb.com";
	Common common;

	@Parameters({"vbrowser","vurl"})
	@BeforeTest
	public void beforeTest(String browser,String url) {
		common = new Common();
		common.Setupbrowser(browser, url);
		driver = common.getDriver();

	}

	@AfterTest
	public void afterTest() {
		//common.closeBrowser();
	}

}
