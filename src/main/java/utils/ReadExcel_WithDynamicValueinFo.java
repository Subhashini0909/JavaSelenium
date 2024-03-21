package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_WithDynamicValueinFo {

	public static void main(String[] args) throws IOException 
	{
		String file ="./Read-Data/LoginData.xlsx";
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet sheet = WorkBook.getSheet("Sheet1");
		
		//getLastRowNum - Gives the no.of.rows excluding the heading
			int Total_Rows = sheet.getLastRowNum();
	
		//Provide no.of.rows with the heading
			//int Total_Rows_WithHeading = sheet.getPhysicalNumberOfRows();
		
		for(int row=1; row<=Total_Rows;row++)
		{
		XSSFRow Row = sheet.getRow(row);
		
		short Total_Cell = Row.getLastCellNum();
			for(int cell =0; cell<Total_Cell;cell++)
			{
			XSSFCell Cell = Row.getCell(cell);
			
			/*IllegalStateException will be thrown when we have numberic values in the cell as we are 
			calling out string. To avoid that, use DataFormatter */
			DataFormatter dft = new DataFormatter();
			String value = dft.formatCellValue(Cell);
			//String value = Cell.getStringCellValue();
			
			System.out.println(value);
			}
		}
	}
}
