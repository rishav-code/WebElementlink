package com.XLS_Reader;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectbrowser {
	public void openBrowser(){
		System.out.println("Please select below Option \n "
				+ "1: Firefox \n "
				+ "2: Googlechrome \n "
				+ "3: internetexplorer \n "
				
				);
		Scanner scan= new Scanner(System.in);
		int browserType1 = scan.nextInt();
	
		switch (browserType1) {
		case 1:
			
			break;
		case 2:
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe");
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("browser : " + browserType1 + " is invalid, Launching Firefox as browser of choice..");
			
		}
	

	}
}
