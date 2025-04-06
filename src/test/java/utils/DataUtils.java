package utils;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import base.BaseTest;

public class DataUtils extends BaseTest{

	@DataProvider(name="xy")
	public Object[][] getData(Method m)
	{
		String sheetName = m.getName();
		
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		
		System.out.println("Data from excel "+excel.getCellData(sheetName, 0, 2));
		
		System.out.println("Total rows are : "+rowNum+" Total cols are: "+colNum);
		
		
		Object[][] data = new Object[rowNum - 1][colNum];
		
		
		for(int rows=2; rows<=rowNum;rows++)
		{
			for(int cols=0; cols<colNum;cols++)
			{
				data[rows-2][cols] = excel.getCellData(sheetName, cols, rows);
			}
				
		}
		return data;
	}
}
