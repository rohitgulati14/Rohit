package com.ActionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadProperty {
	
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Read data from Excel file
		FileInputStream fin=new FileInputStream(new File("C:\\temp\\rohit.xlsx"));
		ExcelWBook=new XSSFWorkbook(fin);
		ExcelWSheet=ExcelWBook.getSheet("Sheet1");
		Cell=ExcelWSheet.getRow(2).getCell(0);
		System.out.println("Data:" +Cell.getStringCellValue());
		
		
		//Write data to Excel file
		
		ExcelWSheet.createRow(4);
		Row=ExcelWSheet.getRow(4);
		Cell=Row.createCell(0);
		Cell.setCellValue("Mohit");
		FileOutputStream fileout=new FileOutputStream(new File("C:\\temp\\rohit.xlsx"));
		ExcelWBook.write(fileout);
		fileout.flush();
		
		//Reading data from text property file which is stored in src/test/resources folder in IDE
	/*	File file=new File("C:\\Users\\training_d5.01.02\\Desktop\\SeleniumRohit\\src\\test\\resources\\test.properties");
		FileInputStream fileInput= new FileInputStream(file);
		
		Properties properties=new Properties();
		properties.load(fileInput);
		fileInput.close();
		Enumeration enuKeys=properties.keys();
		while (enuKeys.hasMoreElements()) {
			String key=(String) enuKeys.nextElement();
			String value=properties.getProperty(key);
			System.out.println(key+":"+value);
		}
			//Writing data in file
			FileOutputStream fout=new FileOutputStream(file);
			properties.setProperty("ppath", "\\pframes");
			properties.store(fout, null);
			fout.close();*/
		
		
		
		
	}
	
	}


