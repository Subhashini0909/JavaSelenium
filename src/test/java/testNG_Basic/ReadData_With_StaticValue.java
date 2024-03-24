package testNG_Basic;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_With_StaticValue {

	public static void main(String[] args) throws IOException {
		
		String File = "./Read-Data/LoginData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(File);

		XSSFSheet sheet = wb.getSheetAt(0);
		for(int i=1; i<=2;i++)
		{
		XSSFRow row = sheet.getRow(i);
		for(int j=0; j<2;j++)
		{
			XSSFCell cell = row.getCell(j);
			String val = cell.getStringCellValue();
			System.out.println(val);
		}
		}
		
	}

}
