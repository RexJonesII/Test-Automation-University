package com.testautomationu.chp4priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testautomationu.utility.Highlighter;

@Test
public class DefaultExecutionOrder_Class
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp () throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");		
	}
	
	public void signIn ()
	{		
	      driver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();

	      WebElement emailAddress = driver.findElement(By.id("email"));
	      Highlighter.highlightElement(driver, emailAddress);
	      emailAddress.sendKeys("TestNG@Framework.com");

	      WebElement password = driver.findElement(By.id("passwd"));
	      Highlighter.highlightElement(driver, password);
	      password.sendKeys("TestNG1234");

	      WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
	      Highlighter.highlightElement(driver, buttonSignIn);
	      buttonSignIn.click();
		
		System.out.println("1. Sign In");
	}
	
	public void searchTShirt ()
	{		
	      WebElement menu = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']"));
	      Highlighter.highlightElement(driver, menu);
	      menu.click();

	      WebElement searchBox = driver.findElement(By.id("search_query_top"));
	      Highlighter.highlightElement(driver, searchBox);
	      searchBox.sendKeys("Blue");

	      WebElement buttonSearch = driver.findElement(By.xpath("//*[@id='searchbox']/button"));
	      Highlighter.highlightElement(driver, buttonSearch);
	      buttonSearch.click();
		
		System.out.println("2. Search For T-Shirt");
	}
	
	public void signOut () 
	{
	      WebElement linkSignOut = driver.findElement(By.className("logout"));
	      Highlighter.highlightElement(driver, linkSignOut);
	      linkSignOut.click();

		System.out.println("3. Sign Out");
	}
	
	@AfterClass
	public void tearDown () throws Exception
	{
		driver.quit();		
	}
}