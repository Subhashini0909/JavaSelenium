package testNG_Basic;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider_Read_a_Cell {
	
	public static void main(String[] args) throws IOException {
		
		String file ="./Read-Data/LoginData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow r = sheet.getRow(1);
		XSSFCell cell = r.getCell(0);
		
		String Val = cell.getStringCellValue();
		System.out.println(Val);
		
		
	}

}
