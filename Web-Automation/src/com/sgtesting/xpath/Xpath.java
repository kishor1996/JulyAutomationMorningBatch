package com.sgtesting.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
	public static WebDriver oBrowser = null;
	public  static void main(String args[])
	{
		launchBrowser();
		navigate();
		//absoluteXPath();
		//relativeXpathUsingTagNameAlone();
		//relativeXpathUsingTagNamewithindex();
		//relativeXpathUsingattributenameandvalue();
		//relativeXpathUsingTagNameWithMultipleAttributenameandvalue();
		demo();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("C:\\Users\\kisho\\Downloads\\tests_2nd_sept_2021\\tests_2nd_SEPT_2021\\Sample.html ");	
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXPath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Kishor");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAlone()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input")).sendKeys("Demo");
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void relativeXpathUsingTagNamewithindex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[4]")).sendKeys("Demo");
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingattributenameandvalue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//option[@ value = 'ide']")).click();
			oBrowser.findElement(By.xpath("//a[@href = 'http://eclipse.org']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameWithMultipleAttributenameandvalue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@ type = 'text'][@ name = 'submitbtn1']")).click();
			oBrowser.findElement(By.xpath("//a[@href = 'http://eclipse.org'][@href= 'http://sgtestinginstitute.com'")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void demo()
	{
		try
		{
			List<WebElement> olink = oBrowser.findElements(By.xpath("//a[@href"));
			System.out.println(olink.size());
			for(WebElement link:olink)
			{
				String name = link.getText();
				System.out.println(name);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}