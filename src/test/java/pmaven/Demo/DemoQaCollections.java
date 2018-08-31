package pmaven.Demo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoQaCollections {

	static WebDriver driver;
	@Given("^The user want to Login Demoqa page$")
	public void the_user_want_to_Login_Demoqa_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
	}

	@When("^The user have to enter Login Details$")
	public void the_user_have_to_enter_Login_Details(DataTable data) {
	    List<String> myList = data.asList(String.class);
	    for (String s : myList) {
			System.out.println(s);
		}
	    
	   /* driver.findElement(By.id("name_3_firstname")).sendKeys(myList.get(0));
	    driver.findElement(By.id("name_3_lastname")).sendKeys(myList.get(1));
	    driver.findElement(By.xpath("//input[@value='married']")).click();
	    driver.findElement(By.xpath("//input[@value='dance']")).click();
	    driver.findElement(By.xpath("//input[@value='reading']")).click();
	    WebElement w=driver.findElement(By.id("dropdown_7"));
	    Select s=new Select(w);
	    s.selectByValue(myList.get(2));
	    driver.findElement(By.id("mm_date_8")).sendKeys(myList.get(3));
	    driver.findElement(By.id("dd_date_8")).sendKeys(myList.get(4));
	    driver.findElement(By.id("yy_date_8")).sendKeys(myList.get(5));
	    driver.findElement(By.id("phone_9")).sendKeys(myList.get(6));
	    driver.findElement(By.id("username")).sendKeys(myList.get(7));
	    driver.findElement(By.id("email_1")).sendKeys(myList.get(8));
	    driver.findElement(By.id("description")).sendKeys(myList.get(9));
	    driver.findElement(By.id("password_2")).sendKeys(myList.get(10));
	    driver.findElement(By.id("confirm_password_password_2")).sendKeys(myList.get(11));
	     */   
	}

	@Then("^The user want to verify entered values$")
	public void the_user_want_to_verify_entered_values() {
	    
	}

	@Given("^The user want to Login page$")
	public void the_user_want_to_Login_page() {
	    
	}

	@When("^The user have to enter Login Credentials$")
	public void the_user_have_to_enter_Login_Credentials(DataTable details) {
	    Map<String, String> myMap = details.asMap(String.class, String.class);
	    System.out.println(myMap);
	    driver.findElement(By.id("name_3_firstname")).sendKeys(myMap.get("fname"));
	    driver.findElement(By.id("name_3_lastname")).sendKeys(myMap.get("lname"));
	    driver.findElement(By.xpath("//input[@value='married']")).click();
	    driver.findElement(By.xpath("//input[@value='dance']")).click();
	    driver.findElement(By.xpath("//input[@value='reading']")).click();
	    WebElement w=driver.findElement(By.id("dropdown_7"));
	    Select s=new Select(w);
	    s.selectByValue(myMap.get("country"));
	    driver.findElement(By.id("mm_date_8")).sendKeys(myMap.get("month"));
	    driver.findElement(By.id("dd_date_8")).sendKeys(myMap.get("date"));
	    driver.findElement(By.id("yy_date_8")).sendKeys(myMap.get("year"));
	    driver.findElement(By.id("phone_9")).sendKeys(myMap.get("phone"));
	    driver.findElement(By.id("username")).sendKeys(myMap.get("username"));
	    driver.findElement(By.id("email_1")).sendKeys(myMap.get("email"));
	    driver.findElement(By.id("description")).sendKeys(myMap.get("Abt"));
	    driver.findElement(By.id("password_2")).sendKeys(myMap.get("pass"));
	    driver.findElement(By.id("confirm_password_password_2")).sendKeys(myMap.get("cpwd"));
	        
		   
	}

	@Then("^The user want to verify entered credentials$")
	public void the_user_want_to_verify_entered_credentials() {
	    
	}



}
