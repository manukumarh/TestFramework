package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectValidation extends Base {
  @Test
  public void titleValidation() {
	  String actualtitle = "Facebook - Log In or Sign Up";
	  String expectedtitle = driver.getTitle();
	  
	  assertTrue(actualtitle.equals(expectedtitle), "mismatch in title");
  }
  
  @Test
  public void URLValidation() {
	  String actualURL = "https://www.facebook.com/";
	  String expectedURL = driver.getCurrentUrl();
	  
	  Reporter.log("Actual url is:" +actualURL);
	  Reporter.log("Expected url is:" +expectedURL);
	  
	  assertTrue(actualURL.equals(expectedURL), "mismatch in url");
  }
}
