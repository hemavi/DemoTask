package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;

	public WebDriver getDriver(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public void getText(WebElement element) {
		System.out.println(element.getText());
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	public void actionPerform(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
public String getData(int rowNum,int cellNo) throws IOException {
		
		File excelloc=new File("C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\Excel\\Profile.xlsx");
		
		FileInputStream stream=new FileInputStream(excelloc);
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet s=w.getSheet("Data");
		
		Row r=s.getRow(rowNum);
		
		Cell c=r.getCell(cellNo);
		
		String name="";
		if(c.getCellType()==1) {
			name=c.getStringCellValue();
		}
		else if(c.getCellType()==0) {
			name=String.valueOf((long)c.getNumericCellValue());
		}
		
		return name;
   }	
	

}
