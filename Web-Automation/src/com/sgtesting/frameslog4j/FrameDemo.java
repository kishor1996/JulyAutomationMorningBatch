package com.sgtesting.frameslog4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo
{
	public static WebDriver drive = null;
	public static void main (String args[])
	{
		launchBrowser();
		navigate();
		identify();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			drive = new ChromeDriver();
			drive.manage().window().maximize();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			drive.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void identify()
	{
		try
		{
			drive.switchTo().frame(0);
			drive.findElement(By.xpath("//a[@target ='packageFrame' and text()='org.openqa.selenium']")).click();
			drive.switchTo().defaultContent();
			
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}