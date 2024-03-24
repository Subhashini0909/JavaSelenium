package testNG_Basic;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider()
	String[][] getdata() throws IOException
	{
	String[][] excel_data = ReadData_UseInScript.ExcelData();
	return excel_data;
	}

}
