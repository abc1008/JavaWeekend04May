package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite
{
	
	public static void main(String[] args) throws IOException
	{
//		 *********** Write the data  **************
//		make sure that excel file is closed before executing below code.
		
		String path = "D:\\Trainings\\TESTOMETER\\Seleniun_JAVA_04May24_WEEKEND\\Excel_File.xlsx";
		FileInputStream file = new FileInputStream(path); // to let java know about the file path
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  //opening the file 
		XSSFSheet sh = wb.getSheet("Sheet9");  // open the excel sheet
		
		FileOutputStream fOut = new FileOutputStream(path);
		
		// existing cell
		XSSFRow row3 = sh.getRow(2);  // navigate to row
		XSSFCell cell3 = row3.getCell(1);  // navigate to cell	
		cell3.setCellValue(7800);  // set the data into excel file
		
		//  empty cell address
	   XSSFRow createdRow = sh.createRow(4);  	// create row
	   XSSFCell createdCell = createdRow.createCell(1);  // create cell
	   createdCell.setCellValue(900);  // set the data into excel file
		
		wb.write(fOut);  // save the updated workbook
		wb.close();
		
		System.out.println("Completed");
		
	}
	

}
