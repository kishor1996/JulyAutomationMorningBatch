package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver driver = null;
	public static ActiPage page = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		
		


	}
	static void launchBrowser()
	{
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			page=new ActiPage(driver);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			driver.get("http://localhost:82/login.do");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			page.getUserName().sendKeys("admin");
			page.getPassword().sendKeys("manager");
			page.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			page.gettaskbutton().click();
			Thread.sleep(2000);
			page.getaddNewbutton().click();
			Thread.sleep(2000);
			page.getNewCustomerButton().click();
			Thread.sleep(2000);
			page.getCustomerName().sendKeys("Newton");
			Thread.sleep(2000);
			page.getCustomerDescription().sendKeys("Scientist");
			Thread.sleep(2000);
			page.getCreateCustomerButton().click();
			Thread.sleep(3000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
