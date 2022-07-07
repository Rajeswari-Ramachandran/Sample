package org.seleniumprogram;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownLoadingFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Raje\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement excelFile=driver.findElement(By.linkText("Download Excel"));
		excelFile.click();
		File f=new File("C:\\Users\\raje4\\Downloads");
		File[] allFiles=f.listFiles();
		
		//System.out.println(allFiles);
		}

}
