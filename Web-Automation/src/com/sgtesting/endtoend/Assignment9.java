package com.sgtesting.endtoend;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assignment9 {
	public static WebDriver obj = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginasAdmin();
		createUser();
		logoutasAdmin();
		loginAsUser1();
		logoutUser1();
		loginAsUser2();
		logoutUser2();
		loginAsUser3();
		logoutUser3();
		loginasAdmin();
		modifyPassword();
		logoutasAdmin();
		loginAsUser1modify();
		logoutUser1modify();
		loginAsUser2modify();
		logoutUser2modify();
		loginAsUser3modify();
		logoutUser3modify();
		loginasAdmin();
		deleteUser();
		logoutasAdmin();
		closeApplication();
		


	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			obj = new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			obj.manage().window().maximize();
			obj.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasAdmin()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			obj.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Kishor");
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Kumar");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("kishorsrinivas6@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user123");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(3000);


			obj.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Newton");
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Galilio");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo6@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user123");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(3000);

			obj.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Narendra");
			Thread.sleep(3000);
			obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Modi");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("modi6@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user123");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(3000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutasAdmin()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser1modify()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user1");
			obj.findElement(By.name("pwd")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(2000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutUser1modify()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser2modify()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user2");
			obj.findElement(By.name("pwd")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(3000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser2modify()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser3modify()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user3");
			obj.findElement(By.name("pwd")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(3000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser3modify()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyPassword()
	{
		try
		{
			obj.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);	
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);	
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user1234");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);	
			
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);	
			obj.findElement(By.id("userDataLightBox_passwordField")).click();
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);	  
			
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);	
			obj.findElement(By.id("userDataLightBox_passwordField")).click();
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user1234");
			obj.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);	  			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser1()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user1");
			obj.findElement(By.name("pwd")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(2000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popUpWindow()
	{
		try
		{
			obj.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser1()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser2()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user2");
			obj.findElement(By.name("pwd")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(3000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser2()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser3()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("user3");
			obj.findElement(By.name("pwd")).sendKeys("user123");
			obj.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();			
			Thread.sleep(3000);	
			popUpWindow();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser3()
	{
		try
		{
			obj.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			obj.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);	
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);	
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert o = obj.switchTo().alert();
			o.accept();
			Thread.sleep(2000);
			
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);	
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert o1 = obj.switchTo().alert();
			o1.accept();
			Thread.sleep(2000);
			
			
			obj.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);	
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert o2 = obj.switchTo().alert();
			o2.accept();
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
			obj.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
