package testNG_Basic;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_With_DynamicValue {

	public static void main(String[] args) throws IOException 
	{
	
		String File = "./Read-Data/LoginData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet sh = wb.getSheetAt(0);
		
		int lastrow = sh.getLastRowNum();
		for(int i=1;i<=lastrow; i++)
		{
			XSSFRow r = sh.getRow(i);
			
			int lastcell = sh.getRow(0).getLastCellNum();
				//Included getRow(0) --> To let TestNG to find the last cell value of the rows which has headings
			for(int j=0;j<lastcell; j++)
			{
				XSSFCell cell = r.getCell(j);
				/*String Val = cell.getStringCellValue();
					IllegalStateException - Will be thrown when we pass int values 
							in the cell as we are receiving String
				System.out.println(Val);
				*/

		//This accepts all the values and convert it to string
				DataFormatter dft = new DataFormatter();
				String val = dft.formatCellValue(cell);
				System.out.println(val);
				
			}
		}

	}

}
