package sai;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tag {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
			
		List <WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println("all link list"+li.size());
		
		for(WebElement we : li)
		{
			
		
		
		//for(WebElement we : li){
		System.out.println(we.getText());
		}
		
		
		
	}
}
