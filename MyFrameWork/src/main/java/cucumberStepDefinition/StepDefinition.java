package cucumberStepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends EEBase {
	@Given("Enter the userunit as {string}")
	public void enter_the_userunit_as(String userunit) {
		driver.findElement(By.name("C_BUSINESS_UNIT")).sendKeys(userunit);
	   
	}
	@Given("Enter the Userid as {string}")
	public void enter_the_userid_as(String Userid) {
		driver.findElement(By.name("C_USER_ID")).sendKeys(Userid);
	
	   	}
	@Given("Enter the Password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("tipLogPwd")).sendKeys(password);
		
	}
	@When("Click on the Login")
	public void click_on_the_login() {
		driver.findElement(By.id("Image1")).click();
		
	
	}




}
