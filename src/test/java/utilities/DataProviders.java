package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
   //DataProvider1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException, InterruptedException
	{
		
		String path=".\\TestData\\data1.xlsx";//taking xl file from testData
		
		Excelutilitls xlutil=new Excelutilitls(path); //creating an object for xlutility
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		String logindata[][]=new String[totalrows][totalcols];//create for two dimension array which can store
		for(int i=1;i<=totalrows;i++)//1  //read the data from xl storing in two dimensional array
		{
			for(int j=0;j<totalcols;j++)//0   i is rows j is col
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j);//1,0
			}
		}
		return logindata;//returning two dimension array
	}
	
}			
		
	

