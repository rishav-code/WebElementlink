package com.TestUtility;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.XLS_Reader.Menu;
import com.XLS_Reader.Takeproperties;

public class Testurl extends Menu {
	// static TakeLocator tl = new TakeLocator();
	@BeforeSuite
	public void startMessage()
	{
		System.out.println("Starting test");
	}
	@AfterSuite
	public void endingMessage()
	{
		System.out.println("Ending test");
	}
	@Test
	public void test() throws IOException {
		Takeproperties tp = new Takeproperties();
		
		setup();

	
	

		driver.get(prop.getProperty("url1"));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("cta_button_3749854_7956a89e-6f16-4650-8d49-9f825d5cc7d6")).click();
		driver.findElement(By.id(tp.Takeproperties("first_name"))).click();
		driver.findElement(By.id(tp.Takeproperties("first_name"))).sendKeys("rishav");
		driver.findElement(By.id(tp.Takeproperties("last_name"))).sendKeys("kumar");
		driver.findElement(By.id(tp.Takeproperties("Bussiness_email"))).sendKeys("rishav.kumar@gmail.com");
		driver.findElement(By.id(tp.Takeproperties("job_title"))).sendKeys("engineer");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='optanon-allow-all accept-cookies-button']")).click();
		driver.findElement(By.id(tp.Takeproperties("no_of_employees"))).click();
		
	{
			WebElement dropdown = driver.findElement(By.id(tp.Takeproperties("no_of_employees")));
			dropdown.findElement(By.xpath("//option[. = '401 - 450']")).click();
		}
		driver.findElement(By.id(tp.Takeproperties("no_of_employees"))).click();
		driver.findElement(By.id(tp.Takeproperties("company_name"))).click();
		driver.findElement(By.id(tp.Takeproperties("company_name"))).sendKeys("Atmecs");
		driver.findElement(By.id(tp.Takeproperties("industry"))).click();
		{
			WebElement dropdown = driver.findElement(By.id(tp.Takeproperties("industry")));
			dropdown.findElement(By.xpath("//option[. = 'Computer / Technology - Services / Consultancy']")).click();
		}
		driver.findElement(By.id(tp.Takeproperties("industry"))).click();
		driver.findElement(By.id(tp.Takeproperties("phone_no"))).click();
		driver.findElement(By.id(tp.Takeproperties("phone_no"))).sendKeys("1234567");
		driver.findElement(By.id(tp.Takeproperties("country"))).click();
		{
			WebElement dropdown = driver.findElement(By.id(tp.Takeproperties("country")));
			dropdown.findElement(By.xpath("//option[. = 'India']")).click();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Time out");
			e.printStackTrace();
		}
		driver.findElement(By.id(tp.Takeproperties("state"))).click();
		{
			WebElement dropdown = driver.findElement(By.id(tp.Takeproperties("state")));
			dropdown.findElement(By.xpath("//option[. = 'Jharkhand']")).click();
		}
		driver.findElement(By.id(tp.Takeproperties("url"))).sendKeys("rishavqwertry");
		driver.findElement(By.id(tp.Takeproperties("submit"))).click();
		System.out.println("Test run");
		
	}
}

