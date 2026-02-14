package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static Object[][] getExcelData(String filepath , String sheetName) throws IOException{
		Object[][] data = null;
		FileInputStream file = new FileInputStream(filepath);
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(sheetName);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		data = new Object[lastRowNum][lastCellNum];
		for(int i = 1; i<lastRowNum;i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j = 0; j<lastCellNum;j++) {
				
				Cell cell = row.getCell(j);
				data[i-1][j] = (cell ==null)?"":cell.toString();
				
			}
		}
		
		
		return data;
		
		
	}

}
