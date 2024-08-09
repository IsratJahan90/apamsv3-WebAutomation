package bd.com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends Base_class {
	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(Staging);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void LoginApams() throws InterruptedException {

		WebElement login = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		login.click();
		Thread.sleep(5000);

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("2163");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("200000000163");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("R3@L$tr0nG!P@$$w0rd");
		Thread.sleep(1000);

		WebElement enothi_login = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/form[1]/button[1]"));
		enothi_login.click();
		Thread.sleep(1000);

		WebElement configuration = driver.findElement(By.xpath("//button[contains(text(),'কনফিগারেশন')]"));
		configuration.click();
		Thread.sleep(3000);

		WebElement faq = driver.findElement(By.xpath("//a[contains(text(),'এফএকিউ')]"));
		faq.click();
		Thread.sleep(3000);

		WebElement new_add = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		new_add.click();
		Thread.sleep(3000);

		WebElement ques = driver.findElement(
				By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		ques.sendKeys("প্রশ্ন");
		Thread.sleep(3000);

		WebElement ans = driver.findElement(By.xpath(
				"//body/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		ans.sendKeys("উত্তর");
		Thread.sleep(3000);

		WebElement save = driver.findElement(By.xpath("//button[contains(text(),'সংরক্ষণ করুন')]"));
		save.click();
		Thread.sleep(5000);

		WebElement apa_management = driver.findElement(By.xpath("//button[contains(text(),'এপিএ ব্যবস্থাপনা')]"));
		apa_management.click();
		Thread.sleep(5000);

		/*
		 * Select select = new Select(APA_management);
		 * select.selectByVisibleText("অর্থবছর (তৈরি এবং নির্ধারণ)");
		 */

		WebElement fiscal_year = driver.findElement(By.xpath("//a[contains(text(),'অর্থবছর (তৈরি এবং নির্ধারণ)')]"));
		fiscal_year.click();
		Thread.sleep(5000);

		WebElement fiscal_assign = driver.findElement(By.xpath("//button[contains(text(),'অর্থবছর নির্ধারণ')]"));
		fiscal_assign.click();
		Thread.sleep(5000);

		WebElement add = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/button[2]"));
		add.click();
		Thread.sleep(5000);

		/*
		 * WebElement year = driver.findElement(By.xpath(
		 * "//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]"));
		 * Select value = value="56"; year.click(); Thread.sleep(5000);
		 */

	}

}


