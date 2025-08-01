package com.test.utils;


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
	
	
	/**
	 * This will initialize a workbook object given the filepath.
	 * 
	 * @param filePath
	 */
	private static void openExcel(String filePath)
	{
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will initialize the sheet by loading a sheet from the workbook using the given sheetName
	 * 
	 * @param sheetName
	 */
	private static void loadSheet(String sheetName)
	{
		sheet = book.getSheet(sheetName);
	}

	/**
	 * This method returns the row count on the current sheet.
	 * 
	 * @return
	 */
	private static int rowCount()
	{
		return sheet.getPhysicalNumberOfRows();
	}
	
	/**
	 * This method will return the column count of a given rowIndex in the current sheet.
	 * 
	 * @param rowIndex
	 * @return
	 */
	private static int colCount(int rowIndex)
	{
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	
	/**
	 * This method returns the cell data as a String given the row and column indices.
	 * 
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 */
	private static String cellData(int rowIndex, int colIndex)
	{
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	
	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName)
	{
		//open the file: filePath
		openExcel(filePath);
		
		//load the sheet: sheetName
		loadSheet(sheetName);
		
		//get the number of rows 
		int rowNumber = rowCount();
		
		//get the number of cols 
		int colNumber = colCount(0);
		
		//fill out the array by using a nested for loop to go through all the elements....
		
		List<Map<String, String>> list = new ArrayList<>();
		
		for(int row = 1; row < rowNumber; row++)
		{
			// create a map for each row
			Map<String, String> map = new LinkedHashMap<>();
			for (int col = 0; col < colNumber; col ++)
			{
				String key = cellData(0, col); // first row is the header
				String value = cellData(row, col);
				map.put(key, value);
			}
			
			// add the map to the list
			list.add(map);
		}
		
		return list;
		
	}
	

}