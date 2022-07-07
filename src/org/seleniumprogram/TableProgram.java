package org.seleniumprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		String parent=driver.getWindowHandle();
		WebElement table=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table"));
		
		
// The Count Of Number Of Columns and Printing the Heading of the Column
		
		List<WebElement> columns=table.findElements(By.tagName("th"));
		System.out.println("Number Of Column In The Table : "+columns.size());
		for (WebElement heading : columns) 
		{
			String headText=heading.getText();
			System.out.println(headText);
		}

//The Count of Number of Rows
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("\n"+"Number of Rows in the Table : "+ rows.size()+"\n");
		
//To Display the Elements of the Table	
		
		List<WebElement> elements= table.findElements(By.tagName("td"));
		System.out.println("The Elements in the Table are ");
		System.out.println("------------------------------"+"\n");
		for (WebElement datas : elements)
		{
			String data=datas.getText();
			System.out.println(data);
		}
		System.out.println(""+"\n"+"-----------------------------------------------------------------------------------"+"\n");
		
//Get the progress value of 'Learn to interact with Elements
		
		WebElement progressValue=driver.findElement(By.xpath("(//td[normalize-space()='Learn to interact with Elements']//following::td[9])[1]"));
		String str=progressValue.getText();
		System.out.println("The Progress of Learn to interact with Elements : "+str);
		System.out.println(""+"\n"+"-----------------------------------------------------------------------------------"+"\n");
		
//Check the vital task for the least completed progress.
		
		List<Integer> intProgress=new ArrayList<>();
		List<WebElement> progress=driver.findElements(By.xpath("//td[2]"));
		for (WebElement webElements : progress)
		{
			String individual=webElements.getText().replace("%", "");
			intProgress.add(Integer.parseInt(individual));
		}
		int minValue=Collections.min(intProgress);
		String strMinValue=Integer.toString(minValue)+"%";
		String xPath="//td[normalize-space()="+"\""+ strMinValue+"\"]//following::td[1]";
		driver.findElement(By.xpath(xPath)).click();
		System.out.println(""+"\n"+"-----------------------------------------------------------------------------------"+"\n");

		//driver.switchTo().window(parent).close();
		
//Display the Heading 
		
/*		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement htmlTable=driver1.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
		List<WebElement> htmlHeadings=htmlTable.findElements(By.tagName("th"));
		System.out.println("Number Of Column In The Table : "+htmlHeadings.size());
		for (int i = 0; i < htmlHeadings.size(); i++) 
		{
			WebElement htmlHeading=htmlHeadings.get(i);
			String headingText=htmlHeading.getText();
			System.out.println(headingText);
		}

//To Display the Elements of the Table	
		
		List<WebElement> tableElements= htmlTable.findElements(By.tagName("td"));
		System.out.println("\n"+"The Elements in the Table are ");
		System.out.println("------------------------------"+"\n");
		for (WebElement datas : tableElements)
			{
				String data=datas.getText();
				System.out.println(data);
			}*/
	}

	
}
