package com.sgtesting.endtoend;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	public static WebDriver oBrowser = null;
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		createUser();
		modifyUser();
		//deleteUser();
		//logout();
		//closeApplication();
		

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Practice\\GIT\\DemoWorkSpace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizewindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Kishor");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Kumar");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("S");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("kishorsrinivas6@gmail.com");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("kishu@1996");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("password");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("password");
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
		System.out.println("@@@");
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();		
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Sumanth");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("C");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("S");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("sumanth@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sum@1996");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Pasd123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Pasd123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj = oBrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
				oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}