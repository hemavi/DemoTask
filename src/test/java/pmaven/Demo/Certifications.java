package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pmaven.Demotask.CertificationPOM;

public class Certifications {

	public static void main(String[] args) {

		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		CertificationPOM c=new CertificationPOM();
		b.btnClick(c.getText());
		b.scrollDown(c.getSeleniumcrse());
		b.btnClick(c.getSeleniumcrse());
		b.getText(c.getTestimonial());
		b.getText(c.getHeader());

	}

}
