package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {
	XSSFWorkbook wb;
	public void ExcelDataProvider() throws Exception {
	String path="C:\\Users\\LENOVO\\eclipse-workspace\\eclips data\\Framework\\Testdata\\TestData.xlsx";
	FileInputStream file=new FileInputStream(path);
	 wb=new XSSFWorkbook(file);
	
	
	
	}
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
