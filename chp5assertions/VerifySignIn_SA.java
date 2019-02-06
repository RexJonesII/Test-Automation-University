package com.testautomationu.chp5assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testautomationu.utility.Highlighter;

public class VerifySignIn_SA
{
	SoftAssert softassert = new SoftAssert();
	WebDriver driver;
	
	@BeforeClass
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("1. Open Chrome & Application");
	}
	
	@Test
	public void signIn ()
	{		
		WebElement textUsername = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		Highlighter.highlightElement(driver, textUsername);
		textUsername.sendKeys("Admin");
		
		WebElement textPassword = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		Highlighter.highlightElement(driver, textPassword);
		textPassword.sendKeys("admin123");
		
		WebElement buttonLogin = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		Highlighter.highlightElement(driver, buttonLogin);
		buttonLogin.click();
		
		System.out.println("2. Sign In");
	}
	
	@Test
	public void testHomePageVerification ()
	{
		softassert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
		System.out.println("3. Verify Welcome Link");
				
		softassert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");		
		System.out.println("4. Verify Admin Tab");
	
		softassert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
		System.out.println("5. Verify Dashboard");		
		
		softassert.assertAll();
	}
	
	@Test
	public void userSearch ()
	{		
		WebElement menuAdmin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		Highlighter.highlightElement(driver, menuAdmin);
		menuAdmin.click();
		
		WebElement textUserName = driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']"));
		Highlighter.highlightElement(driver, textUserName);
		textUserName.sendKeys("Admin");
				
		WebElement buttonSearch = driver.findElement(By.xpath("//*[@id='searchBtn']"));
		Highlighter.highlightElement(driver, buttonSearch);
		buttonSearch.click();		
		
		System.out.println("6. Search For User");		
	}
	
	@Test
	public void userSignOut () 
	{
		WebElement linkWelcome = driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		Highlighter.highlightElement(driver, linkWelcome);
		linkWelcome.click();
			
		WebElement linkLogout = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));
		Highlighter.highlightElement(driver, linkLogout);
		linkLogout.click();

		System.out.println("7. Sign Out");
	}
	
	@AfterClass
	public void tearDown ()
	{
		System.out.println("8. Close Chrome & Application");
		driver.quit();		
	}
}
