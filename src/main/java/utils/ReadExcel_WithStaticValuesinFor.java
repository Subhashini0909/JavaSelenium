package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_WithStaticValuesinFor {

	public static void main(String[] args) throws IOException {
		
	//Locating Workspace
		String fileLoc = "./Read-Data/LoginData.xlsx";
		XSSFWorkbook WorkBook = new XSSFWorkbook(fileLoc);
	//Locating sheet
		XSSFSheet sheet = WorkBook.getSheetAt(0);
		
//Using for loop to get values from all the rows
		for(int row=1; row<=2;row++)
		{
	//Locating Row
		XSSFRow Row = sheet.getRow(row);
		
//Using for loop to get values from both the cells of the row
		for(int cell=0;cell<2;cell++)
		{
	//Locating Cell
		XSSFCell Cell  = Row.getCell(cell);
	//Get the value of the cell
		String StringValue = Cell.getStringCellValue();
		
		System.out.println(StringValue);
		}
		}
	}

}
