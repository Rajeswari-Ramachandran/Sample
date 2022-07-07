package org.seleniumprogram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@type='file']"));
		chooseFile.click();
		
	}

}
