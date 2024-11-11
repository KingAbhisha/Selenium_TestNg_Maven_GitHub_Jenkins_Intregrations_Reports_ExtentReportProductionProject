package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;

public class OrangeHRM_Tests extends BaseClass {

	@Test
	public void loginPageTest() throws Exception {
		WebElement img = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Thread.sleep(3000);
		Assert.assertTrue(img.isDisplayed());
	}

	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actualTitle = driver.getTitle();
		String expectedTitel = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitel);
	}

	@Test
	public void testDemo() {
		System.out.println("Demo Test");
	}

}
