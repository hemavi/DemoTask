package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pmaven.Demotask.CareersPOM;

public class Careers {

	public static void main(String[] args) {
		Base b = new Base();
		
		WebDriver driver = b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		CareersPOM cp = new CareersPOM();
		b.btnClick(cp.getCareer());
		b.getText(cp.getText());
		b.getText(cp.getMail());

	}

}
