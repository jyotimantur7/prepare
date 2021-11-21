package com.crm.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
 public String getPropertyKeyString(String key) throws IOException {
	 FileInputStream fis=new FileInputStream("./Data/Datas.properties.txt");
	 Properties obj=new Properties();
	 obj.load(fis);
	 String value = obj.getProperty(key);
	return key;
	 
 }
}
