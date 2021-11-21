package com.crm.GenericUtilities;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassAnnotations {
	public WebDriver driver;
public FileUtility fLib=new FileUtility();
public ExcelUtility eLib=new ExcelUtility();
public JavaUtility jLib=new JavaUtility();
public WebDriverUtility wLib=new WebDriverUtility();
public DataBaseUtility dbLib=new DataBaseUtility();

	@BeforeSuite
		public void conFigBS()
		{
			System.out.println("connect to db");
			dbLib.connectDB();
		}
	@BeforeClass
	public void conFigBC() throws IOException
	{
		System.out.println("launch browser");
		String BROWSER = fLib.getPropertyKeyString("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else
		{
			driver=new FirefoxDriver();
		}
		String URL=fLib.getPropertyKeyString("url");
		wLib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void conFigBM() throws IOException
	{
		System.out.println("login to application");
		String URL=fLib.getPropertyKeyString("url");
		String USERNAME=fLib.getPropertyKeyString("username");
		String PASSWORD=fLib.getPropertyKeyString("password");
		
		driver.get(URL);
		//create login page
	}
	
	@AfterMethod
	public void conFigAM()
	{
		System.out.println("logout from the application");
		//create home page
		wLib.doubleClick(driver, null);
		//mouseraction
		//sognout
	}
	@AfterClass
	public void conFigAC()
	{
		System.out.println("close the browser");
		driver.quit();
		
	}
	@AfterSuite
	public void conFigAS() throws SQLException
	{
		System.out.println("close db connection");
		dbLib.closeDB();
	}
	
	
	


}
