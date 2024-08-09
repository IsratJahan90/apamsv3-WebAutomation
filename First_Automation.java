package bd.com.Practice;

import org.testng.annotations.Test;

public class First_Automation extends Base_class {
	
	String baseUrl = "https://apams-v3.babl.xyz/";
	
	@Test
	public void openurl() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.quit();
	}

}
