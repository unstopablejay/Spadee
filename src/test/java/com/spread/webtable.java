package com.spread;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver w = new ChromeDriver();
	
	w.get("https://demo.guru99.com/test/table.html");
	
List<WebElement> head = w.findElements(By.tagName("//tr[1]"));
List<WebElement> head2 = w.findElements(By.tagName("//tr[2]"));

	for (int i = 0; i < head.size(); i++) {
		System.out.println(head.get(i));
		
		for (int j = 0; j < head2.size(); j++) {
			System.out.println(head2.get(j));
		}
	}




}
}
