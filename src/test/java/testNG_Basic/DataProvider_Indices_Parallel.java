package testNG_Basic;

public class DataProvider_Indices_Parallel 
{
	@org.testng.annotations.DataProvider(name="login", indices = {0,1}, parallel = true)
	public String[][] getdata()
	{
		String data[][]=new String[3][2];
		
		//Data 1
		data[0][0] = "worthyweapon@gmail.com";
		data[0][1] = "Subha@0909";
		
		//Data 2
		data[1][0] = "c.subhashini09@gmail.com";
		data[1][1] = "Subha@0909";
		
		//Data 3 - Dummy
		data[1][0] = "c.subhashini@gmail.com";
		data[1][1] = "Subha@0909";
		
		return data;
	}
}
