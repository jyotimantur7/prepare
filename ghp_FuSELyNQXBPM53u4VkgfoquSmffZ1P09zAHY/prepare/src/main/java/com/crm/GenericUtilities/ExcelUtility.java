package com.crm.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public void getFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./Data/Book1.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		 String val = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue().toString();
		  Object value = val;
		 return;
	}
	

}
