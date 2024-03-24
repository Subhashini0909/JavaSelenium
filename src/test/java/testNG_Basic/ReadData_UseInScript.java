package testNG_Basic;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_UseInScript {

	public static String[][] ExcelData() throws IOException 
	{
		String File = "./Read-Data/LoginData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet sh = wb.getSheetAt(0);
		
	int LRow = sh.getLastRowNum();
	int LCell = sh.getRow(0).getLastCellNum();
	
	String[][] data = new String[LRow][LCell];
		for(int i=1; i<=LRow; i++)
		{
			XSSFRow r = sh.getRow(LRow);
	
		for(int j=0;j<LCell;j++)
		{
			XSSFCell cell = r.getCell(LCell);
			
			DataFormatter df = new DataFormatter();
			String Val = df.formatCellValue(cell);
			//System.out.println(Val);
			data[i-1][j] = Val;
		}
		}
return data;
	}

}
