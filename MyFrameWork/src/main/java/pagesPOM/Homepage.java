package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClassPOM.EELoginCredentialsBase;

public class Homepage extends EELoginCredentialsBase  {
	public Homepage(ChromeDriver driver) {
		this.driver = driver;	}

//	public HomePage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	public void clickImportLetter() throws InterruptedException {
		Thread.sleep(100);
	driver.switchTo().frame(3);
	
	driver.findElement(By.name("Import Letter of Credit")).click();
	
//	String title = driver.getTitle();
//	System.out.println(title);
	
	
	}
}
