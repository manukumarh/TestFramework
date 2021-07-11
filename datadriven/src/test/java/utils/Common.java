package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	WebDriver driver;
	public void Setupbrowser(String browser,String url) {
		
	String currdir = System.getProperty("user.dir");
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", currdir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", currdir + "\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", currdir + "\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	//maximize
	driver.manage().window().maximize();
	
	if(url!="")
		driver.get(url);
	else
		driver.get("about:blank");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

	public static void main(String[] args) {

	}

}
