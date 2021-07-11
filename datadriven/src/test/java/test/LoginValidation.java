package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidation extends Base{
  
	
	@Parameters({"validUsername","validPassword"})
	
	
	@Test
  public void LoginTest(String username,String password) {
	Login LoginObj = new Login(driver);
	LoginObj.LoginPage(username, password);
  }
}
