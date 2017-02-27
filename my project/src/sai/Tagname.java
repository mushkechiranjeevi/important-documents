package sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("WebDriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://www.cleartrip.com");
	}
	
	

}
