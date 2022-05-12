/**
 * 
 */
package com.database;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.data.Data;

/**
 * @author nbusireddy
 *
 */
public class testingDB extends Databaseconnect{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		testing();
	}
	
	public static void testing() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String name = testmain().toString();
		System.out.println("method"+name);
		System.out.println(passwords);
		//driver.findElement(By.id("txtUsername")).sendKeys(""));
		driver.findElement(By.id("txtUsername")).sendKeys(passwords);
	}
	
	

}
