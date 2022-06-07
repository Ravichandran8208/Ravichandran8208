package baseClassPOM;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import seleniumBase.SeleniumBaseFoPractice;

public class EELoginCredentialsBase  extends SeleniumBaseFoPractice {
	public String dataSheetName;
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return utils.DataLibrary.readExcelData("sheetforpractice");
	}
	@BeforeMethod
	public void Bassclass () {
		driver = startApp("chrome", "http://192.168.2.120:9087/EximBillWeb/SYS_index.htm");
	}

}
