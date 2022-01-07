package com.spread;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceltest {
public static void main(String[] args) throws IOException   {
	File f = new File("C:\\Users\\unsto\\Downloads\\java\\aaa.xlsx");
	FileInputStream fs = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fs);
	Sheet sheet = w.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row r = sheet.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
		System.out.print(c+"\t");
		}
		
		System.out.println();
		
	}
		
	}
	
	
	
}


	


