package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.utility.Base;

import pmaven.Demotask.CoursesPOM;

public class Courses {

	public static void main(String[] args) throws InterruptedException  {
		
		Base b=new Base();
		
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		CoursesPOM cr=new CoursesPOM();
		
		b.actionPerform(cr.getCrse());
		Thread.sleep(1000);
		b.actionPerform(cr.getJava());
		Thread.sleep(1000);
		b.actionPerform(cr.getCore());
		
		b.btnClick(cr.getCore());
		b.getText(cr.getText());
		b.scrollDown(cr.getAnita());
		b.getText(cr.getAnita());
		

	}

}
