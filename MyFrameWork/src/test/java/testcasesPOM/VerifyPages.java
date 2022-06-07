package testcasesPOM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClassPOM.EELoginCredentialsBase;
import pagesPOM.Loginpage;

public class VerifyPages extends EELoginCredentialsBase {
	@BeforeTest
	public void set() {


		testCaseName = "Login ";
		testDescription = "Login testCase ";
		authors = "Hari";
		category = "Smoke";

	}


	@Test(dataProvider = "fetchData")

	public void testingpages(String unitcode,String Userid ,String password ) throws InterruptedException {
		Loginpage lp=new Loginpage((ChromeDriver) driver);
		lp.enterUnitCode(unitcode).Userid(Userid).enterPassword(password).clickSubmit().clickImportLetter();

	}

}
