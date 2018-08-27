package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pmaven.Demotask.ContactsPOM;

public class Contacts {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		ContactsPOM ct=new ContactsPOM();
		b.btnClick(ct.getContact());
		b.scrollDown(ct.getCopyright());
		b.getText(ct.getTitle());
		b.getText(ct.getCopyright());
		
	}

}
