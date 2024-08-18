package bd.com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Apams_login extends New {

	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {
		driver.get(Staging);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		WebElement notice1 = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
		notice1.click();
		Thread.sleep(2000);

		WebElement cross = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/button[1]/i[1]"));
		cross.click();
		Thread.sleep(2000);

		WebElement login = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		login.click();
		Thread.sleep(3000);

		WebElement enothi = driver.findElement(By.xpath(
				"//body/div[@role='dialog']/div[@class='modal-dialog modal-lg']/div[@class='modal-content']/div[1]/button[1]/h5[1]"));
		enothi.click();
		Thread.sleep(2000);

		WebElement userid = driver.findElement(By.xpath("//input[@placeholder='ইউজার আইডি অথবা ইউজার নেম']"));
		/*userid.sendKeys("2163");
		Thread.sleep(1000);
		userid.clear();
		Thread.sleep(1000);*/
		userid.sendKeys("200000000163");
		Thread.sleep(1000);

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("02522016");
		Thread.sleep(1000);

		WebElement click = driver.findElement(By.xpath("//span[@class='mr-1']"));
		click.click();
		Thread.sleep(4000);

		/*
		 * WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		 * username.sendKeys("2163"); Thread.sleep(1000); username.clear();
		 * Thread.sleep(1000); username.sendKeys("200000000163"); Thread.sleep(1000);
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//input[@id='password']"));
		 * password.sendKeys("R3@L$tr0nG!P@$$w0rd"); Thread.sleep(1000);
		 * 
		 * WebElement enothi_login = driver .findElement(By.
		 * xpath("//h5[contains(text(),'ই-নথি বহির্ভূত ব্যবহারকারী লগইন')]"));
		 * enothi_login.click(); Thread.sleep(1000);
		 */

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
		Thread.sleep(2000);

		WebElement fiscal_assign = driver.findElement(By.xpath("//button[contains(text(),'অর্থবছর নির্ধারণ')]"));
		fiscal_assign.click();
		Thread.sleep(2000);

		WebElement add = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/button[2]"));
		add.click();
		Thread.sleep(2000);
		
		WebElement fiscal = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]/option[2]"));
		fiscal.click();
		Thread.sleep(2000);

		WebElement achieve_year = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/select[1]/option[2]"));
		achieve_year.click();
		Thread.sleep(2000);

		WebElement layer = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/select[1]/option[3]"));
		layer.click();
		Thread.sleep(2000);
		
		WebElement drop3 = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[6]"));
		drop3.click();
		Thread.sleep(5000);
		
		WebElement close = driver.findElement(By.xpath("//button[contains(text(),'সংরক্ষণ করুন')]"));
		close.click();
		Thread.sleep(5000);

		
	}

}
