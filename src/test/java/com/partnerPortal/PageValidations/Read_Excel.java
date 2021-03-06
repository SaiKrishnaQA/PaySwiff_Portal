package com.partnerPortal.PageValidations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.payswiff.util.TestDataUtils;

public class Read_Excel {
	
	TestDataUtils utils= new TestDataUtils();
	
	/*To read the complete Excel file*/
		public void readTestFile(String f) {
        try
        {
        	
            FileInputStream file = new FileInputStream(new File(f));
 
            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
		
		//To fetch only one column from the Excel
		public String readColumn(String f, int rowIndex, int colIndex) {
			
			String value = null;
			try {
			 FileInputStream file = new FileInputStream(new File(f));
			 
			//Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
			
            value= sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			//return value;
            
            
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
			return value;
	}
		
		
		//To fetch only one column from the Excel
				public double readNumColumn(String f, int rowIndex, int colIndex) {
					
					double value = 0;
					try {
					 FileInputStream file = new FileInputStream(new File(f));
					 
					//Create Workbook instance holding reference to .xlsx file
		            HSSFWorkbook workbook = new HSSFWorkbook(file);
		 
		            //Get first/desired sheet from the workbook
		            HSSFSheet sheet = workbook.getSheetAt(0);
					
		            value= sheet.getRow(rowIndex).getCell(colIndex).getNumericCellValue();
					//return value;
		            
		            
				}catch(Exception e) {
					
					System.out.println(e.getMessage());
				}
					return value;
			}
		
}

