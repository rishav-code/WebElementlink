package com.XLS_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Menu  {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public void setup  () throws IOException {
		
	
		FileInputStream file = new FileInputStream("./src/test/java/com.testdata/config.properties");
		
		
		prop.load(file);
	
		switch (prop.getProperty("browsername")) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rishav.kumar\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
		case "Ie":
		System.setProperty("webdriver.chrome.driver", "./libs/IEDriver.exe");
		driver = new InternetExplorerDriver();
		break;
		case "microsoftEdge":
		System.setProperty("webdriver.chrome.driver", "./libs/IEDriver.exe");
		driver = new InternetExplorerDriver();
		break;
		}
	}
}
