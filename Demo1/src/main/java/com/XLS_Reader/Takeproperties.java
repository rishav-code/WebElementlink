package com.XLS_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Takeproperties {
	public String Takeproperties(String file) throws FileNotFoundException {
		
	Properties properties = new Properties();
	FileInputStream f = new FileInputStream ("./src/test/java/com.testdata/config.properties");
    try {
		properties.load(f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String data = properties.getProperty(file);
    return data;
    
}
}