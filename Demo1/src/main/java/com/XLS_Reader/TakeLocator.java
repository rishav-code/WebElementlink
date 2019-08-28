package com.XLS_Reader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TakeLocator {
	 static HashMap<String, String> data;

	public String locator(String elements) {
		String value = null;
		data = TestUtil.getDataFromExcel();
		Iterator dataIterator = data.entrySet().iterator();
		getvalue: while (dataIterator.hasNext())
		{
			Map.Entry mapElement = (Map.Entry) dataIterator.next();
			if (elements.equalsIgnoreCase("" + mapElement.getKey())) {
				value = (String) mapElement.getValue();
				break getvalue;
			}

		}
		return value;
	}
}