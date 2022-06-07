package pagesPOM;

import org.openqa.selenium.chrome.ChromeDriver;

import baseClassPOM.EELoginCredentialsBase;

public class Loginpage extends EELoginCredentialsBase {
	public Loginpage(ChromeDriver driver) {
		this.driver = driver;	}

	public Loginpage enterUnitCode(String unitcode) {
		
		clearAndType(locateElement("name","C_BUSINESS_UNIT"),unitcode);
		
		return this;
//		clearAndType(locateElement("id","username"), data);
	}
	public Loginpage Userid(String Userid) {
//		driver.findElement(By.name("C_USER_ID")).sendKeys(Userid);
		clearAndType(locateElement("name","C_USER_ID"),Userid);
		return this;

	}
	public Loginpage enterPassword(String password) {
//		driver.findElement(By.id("tipLogPwd")).sendKeys(password);
		clearAndType(locateElement("id","tipLogPwd"),password);

		return this;
	}
	public Homepage clickSubmit() {
//		driver.findElement(By.id("Image1")).click();
		click(locateElement("id","Image1"));

		return new Homepage((ChromeDriver) driver);
	}


}
