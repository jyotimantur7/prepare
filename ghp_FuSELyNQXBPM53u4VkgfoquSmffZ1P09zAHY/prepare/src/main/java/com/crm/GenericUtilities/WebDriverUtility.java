package com.crm.GenericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
public void waitAndClick(WebElement element) throws InterruptedException
{
	int count =0;
	while(count<20)
	{
		try {
	    element.click();
	    break;
		}catch(Exception e)
		{
			Thread.sleep(2000);
			count++;
		}
	}
}

public void waitForVisibility(WebDriver driver,WebElement element) 
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public void select(WebElement element,int index)
{
	Select sct=new Select(element);
	sct.selectByIndex(index);
}

public void select1(WebElement element,String value)
{
	Select sct=new Select(element);
	sct.selectByValue(value);
}

public void select(WebElement element,String text)
{
	Select sct=new Select(element);
	sct.selectByVisibleText(text);
}	
	public void waitUntilPageLoad(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void mouseOverActions(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/*public void dropAndDrag(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(element, element).perform();
	}*/
	
	public void switchTOFrame(WebDriver driver ,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver ,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
}
