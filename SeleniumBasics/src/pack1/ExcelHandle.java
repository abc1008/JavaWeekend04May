package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandle
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\Excel_File.xlsx";
		FileInputStream file = new FileInputStream(path); // to let java know about the file path
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  //opening the file 
		XSSFSheet sh = wb.getSheet("Sheet9");  // open the excel sheet
		
		XSSFRow row = sh.getRow(2);  // navigate to row
		XSSFCell cell = row.getCell(0);  // navigate to cell
		
		String data = cell.getStringCellValue();  // read the String data
		System.out.println(data);
		
		XSSFRow row2 = sh.getRow(2);  // navigate to row
		XSSFCell cell2 = row2.getCell(1);  // navigate to cell	
		
		Double data2 = cell2.getNumericCellValue();  // read the Numeric data
		System.out.println(data2);
		
//		 *********** Write the data  **************
		
//		make sure that excel file is closed before executing below code.
		
		FileOutputStream fOut = new FileOutputStream(path);
		
		XSSFRow row3 = sh.getRow(2);  // navigate to row
		XSSFCell cell3 = row2.getCell(1);  // navigate to cell	
		
		cell3.setCellValue(6000);  // set the data into excel file
		
		wb.write(fOut);  // save the updated workbook
		wb.close();
		
		System.out.println("Completed");
		
	}
	

}
