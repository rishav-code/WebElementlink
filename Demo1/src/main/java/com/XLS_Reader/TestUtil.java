package com.XLS_Reader;

import java.util.ArrayList;
import java.util.HashMap;

public class TestUtil {
	
 static Reader reader;
 
	public static HashMap<String,String> getDataFromExcel(){
		HashMap<String,String> data=new HashMap<String,String>();
		try {
			reader=new Reader("C:\\Users\\rishav.kumar\\Desktop\\details.xlsx");
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++)
		{
			String elements=reader.getCellData("Sheet1", 0, rowNum);
			String locators=reader.getCellData("Sheet1", 1, rowNum);
		
			data.put(elements,locators);

		}
		return data;
	}
}
