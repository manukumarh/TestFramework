package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
		
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement password;

	public Login(WebDriver driverObj){
		this.driver = driverObj;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPage(String username,String Password) {
		email.clear();
		email.sendKeys(username);
		
		password.clear();
		password.sendKeys(Password);

	}

}
