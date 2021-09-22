package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage
{
	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Username Text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password Text field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//login button field

	@FindBy (xpath="//div[text() ='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//Create customer
	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement clickTasks;
	public WebElement gettaskbutton()
	{
		return clickTasks;
	}

	@FindBy (xpath = "//div[@ class = 'title ellipsis' and text()='Add New' ]")
	private WebElement addNewCust ;
	public WebElement getaddNewbutton ()
	{
		return addNewCust ;
	}


	@FindBy (xpath = "//div[@ class = 'item createNewCustomer ellipsis' ]")
	private WebElement newcust ;
	public WebElement getNewCustomerButton()
	{
		return newcust;
	}

	@FindBy (xpath = "//input[@ id= 'customerLightBox_nameField' ]")
	private WebElement custname;
	public WebElement getCustomerName()
	{
		return custname;
	}

	@FindBy (xpath = "//textarea[@ class= 'inputFieldWithPlaceholder' ]")
	private WebElement custDesc;
	public WebElement getCustomerDescription()
	{
		return custDesc;
	}

	@FindBy (xpath = "//div[@id ='customerLightBox_commitBtn']")
	private WebElement createbutton;
	public WebElement getCreateCustomerButton()
	{
		return createbutton;
	}

///DELETE CUSTOMER
	
	@FindBy (xpath = "//*[@class ='editButton available']")
	private WebElement setButton ;
	public WebElement getSettingButton()
	{
		return setButton;
	}
	
	@FindBy(xpath ="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actionbutton;
	public WebElement getActionButton()
	{
		return actionbutton;
	}
	
	@FindBy (xpath = "//div[@class='title' and text() = 'Delete']")
	private WebElement delete;
	public WebElement getDeleteButton()
	{
		return delete;
	}
	
	/*@FindBy (xpath = " ")
	private WebElement ;
	public WebElement ()
	{
		return ;*/
}













	/*
	@FindBy (xpath = " ")
	private WebElement ;
	public WebElement ()
	{
		return ;*/
