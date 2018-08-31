package pmaven.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoQaCucumber {

	
	public static WebDriver driver;
	
	@Given("^The user has to launch demoqa Registration Login Page$")
	public void the_user_has_to_launch_demoqa_Registration_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@When("^The user has to enter phone number$")
	public void the_user_has_to_enter_phone_number() {
		
		WebElement w=driver.findElement(By.name("phone_9"));
		
		Assert.assertTrue(w.isEnabled());
		w.sendKeys("7893526544");
		
	}

	@Then("^The user has to verify the Phone number$")
	public void the_user_has_to_verify_the_Phone_number() {
		Assert.assertEquals("7893526544", driver.findElement(By.id("phone_9")).getAttribute("value"));
	}

}
