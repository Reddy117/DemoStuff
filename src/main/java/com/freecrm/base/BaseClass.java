package com.freecrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Splitter;


public class BaseClass extends OR{

	public static WebDriver driver;
	public static FileInputStream f;
	public static Properties config;
	public static Actions a;
	public static FileOutputStream out;


	
	public static void initialize(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config.getProperty("url"));
	}
	
	public BaseClass() {
		try {
			f=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config/config.property");
			config=new Properties();
			config.load(f);
			
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void mouseHover(WebElement ele) {
		try {
			a.moveToElement(ele).perform();
		}catch(Exception e) {
			
		}
	}	
	
}
