package org.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleProg {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje4\\eclipse-workspace\\SeleniumPrograms\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
