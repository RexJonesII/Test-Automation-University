package com.testautomationu.chp7datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM 
{
	WebDriver driver;
	
	@Test (dataProviderClass = SignInDP.class, dataProvider = "signin-provider")
	public void signIn (String usename, String password, boolean success) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");		
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(usename);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		System.out.println("Sign In Credentials: " + "\n" +
										"  Username = " + usename + "\n" +
										"  Password = " + password + "\n" +
										"  Successful Sign In = " + success + "\n" );
		
		String actualResult = driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
		String expectedResult = "Welcome Admin";
		Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");
		
		driver.quit();
	}	
}
























