package pmaven.Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pmaven.Demotask.GreensPOM;

public class Greens  {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		GreensPOM g=new GreensPOM();
		b.scrollDown(g.getText1());
		
		b.getText(g.getText());
		b.getText(g.getText1());
		
		
		

	}

}
