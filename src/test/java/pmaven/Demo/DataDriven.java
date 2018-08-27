package pmaven.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.utility.Base;

import com.google.common.collect.Table.Cell;

import pmaven.Demotask.DataDrivenPOM;

public class DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		 
        /* File f=new File("C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\Excel\\Profile.xlsx");
         FileInputStream stream=new FileInputStream(f);
         Workbook w=new XSSFWorkbook(stream);
         Sheet s=w.getSheet("Data");*/
        Thread.sleep(1000);
		
         DataDrivenPOM dd=new DataDrivenPOM();
         
         dd.getFirst().sendKeys(b.getData(1, 0));
         dd.getLast().sendKeys(b.getData(1, 1));
         dd.getAddress().sendKeys(b.getData(1, 2));
         dd.getMail().sendKeys(b.getData(1, 3));
         dd.getPhone().sendKeys(b.getData(1, 4));
         b.btnClick(dd.getGender());
         b.btnClick(dd.getHobby());
         Select s=new Select(dd.getLang());
         s.selectByValue(b.getData(1, 7));
         //dd.getLang().sendKeys(b.getData(1, 7));
         dd.getSkills().sendKeys(b.getData(1, 8));
         dd.getCountry().sendKeys(b.getData(1, 9));
         dd.getScountry().sendKeys(b.getData(1, 10));
         dd.getYear().sendKeys(b.getData(1, 11));
         dd.getMonth().sendKeys(b.getData(1, 12));
         dd.getDay().sendKeys(b.getData(1, 13));
         dd.getFpwd().sendKeys(b.getData(1, 14));
         dd.getSpwd().sendKeys(b.getData(1, 15));     
	}

}
