package bd.com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	
	static String Staging = "https://apams-v3.babl.xyz/";
	static String Training = "https://training.apamsv3.cabinet.gov.bd/";

	WebDriver driver;

	@BeforeSuite
	public void start() {

		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@AfterSuite
	public void end() {

		driver.quit();
	}

	String browser = System.getProperty("browser", "chrome");

}
