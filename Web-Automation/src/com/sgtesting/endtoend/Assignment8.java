package com.sgtesting.endtoend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment8 {
	public static WebDriver obj = null;
	public static void main(String[] args) {
		launchBowser();
		navigate();
		login();
		importTasks();

	}
	static void launchBowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			obj =new ChromeDriver();	
			obj.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			obj.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obj.findElement(By.xpath(" //*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void importTasks()
	{
		try
		{
			obj.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("/html/body/div[11]/div[2]")).click();
			Thread.sleep(2000);
			obj.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			System.out.println("1111");
			obj.findElement(By.xpath("E:\\Java\\Sample.csv")).click();
			Thread.sleep(2000);
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
