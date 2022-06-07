package cucumberStepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EEBase extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.2.120:9087/EximBillWeb/SYS_index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
