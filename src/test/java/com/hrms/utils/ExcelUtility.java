package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;
	private static void openExcel(String filePath) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void loadSheet(String sheetName) {
		sheet=book.getSheet(sheetName);
		
	}
	private static int CountRow() {
		return sheet.getPhysicalNumberOfRows();
	}
	private static int CountCols(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	private static String getCellData (int rowIndex, int colsIndex) {
		return sheet.getRow(rowIndex).getCell(colsIndex).toString();
	}
	
	public static Object[][] excelItoArray(String filePath, String sheetName){
		openExcel(filePath);
		loadSheet(sheetName);
		
		int rows=CountRow();
		int cols= CountCols(0);
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int row=1; row<rows; row++) {
			
			for(int col=0; col<cols; col++) {
				
			}
		}
		return data;
	}
	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName){
		openExcel(filePath);
		loadSheet(sheetName);
		
		List<Map<String, String>> list=new ArrayList<>();
		Map<String, String> excelMap;
		
		for(int row=1; row<CountRow(); row++) {
			
			excelMap=new LinkedHashMap<>();
			for(int c=0; c<CountCols(row); c++) {
				excelMap.put(getCellData(0, c), getCellData(row, c));
			}
			list.add(excelMap);
			
		}
		return list;
		
	}
	

}
