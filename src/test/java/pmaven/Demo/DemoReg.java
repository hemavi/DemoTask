package pmaven.Demo;

import org.openqa.selenium.WebDriver;
import org.utility.*;

import pmaven.Demotask.Demoregpage;

public class DemoReg{

	public static void main(String[] args) {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("https://demoqa.com/registration/");
		driver.manage().window().maximize();
		Demoregpage demo=new Demoregpage();
		b.type(demo.getFirst(), "Hemavi");
		b.type(demo.getLast(), "Konakala");
		b.btnClick(demo.getStatus());
		b.btnClick(demo.getHobby());
		b.type(demo.getCountry(), "Bahrain");
		b.type(demo.getDate(), "29");
		b.type(demo.getMonth(), "8");
		b.type(demo.getYear(), "1989");
		b.type(demo.getUser(), "Hemavi");
		b.type(demo.getMail(),"konakala.hemavi");
		b.type(demo.getPhone(), "7893526544");
		
		

	}

}
