package com.XLS_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrmlink {

	Properties prop = new Properties();
	@Test
	void linktest() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		FileInputStream file = new FileInputStream("./src/test/java/com.testdata/config.properties");
		prop.load(file);
	
		webdriver.get(prop.getProperty("url1"));
		ArrayList<WebElement> list = (ArrayList<WebElement>) webdriver.findElements(By.xpath("//a"));
		for (int initial = 0; initial < list.size(); initial++) {
		String element =list.get(initial).getText();
		
		String links=list.get(initial).getAttribute("href");
		System.out.print(element+"\t"+"=");
		System.out.println(links);
		}
		webdriver.close();

}
}