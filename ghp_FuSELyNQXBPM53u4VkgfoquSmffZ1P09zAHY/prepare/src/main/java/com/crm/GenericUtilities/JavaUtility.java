package com.crm.GenericUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
public int RandomNum()
{
	Random ranNum=new Random();
	int randomNum = ranNum.nextInt(8000);
	return randomNum;
}
public String sysDate() 
{
	Date date = new Date();
	String sysdate = date.toString();
	return sysdate;
}

public void pressVirtualKey() throws AWTException 
{
	Robot rc = new Robot();
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
}

}
