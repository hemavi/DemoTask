package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pmaven.Demotask.TestimonialsPOM;

public class Testimonial {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		TestimonialsPOM t=new TestimonialsPOM();
		b.btnClick(t.getTest());
		b.scrollDown(t.getTest());
		String st=t.getTest().getText();
		String name=st.substring(st.indexOf("Thank you"));
		System.out.println(name);
		b.getText(t.getPhn());
		

	}

}
