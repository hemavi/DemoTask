package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class Demoregpage extends Base{

	public Demoregpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name_3_firstname")
	private WebElement first;
	
	@FindBy(id="name_3_lastname")
	private WebElement last;
	
	@FindBy(xpath="//input[@value='married']")
	private WebElement status;
	
	@FindBy(xpath="//input[@value='reading']")
	private WebElement hobby;
	
	@FindBy(id="dropdown_7")
	private WebElement country;
	
	@FindBy(id="mm_date_8")
	private WebElement month;
	
	@FindBy(id="dd_date_8")
	private WebElement date;
	
	@FindBy(id="yy_date_8")
	private WebElement year;
	
	@FindBy(id="phone_9")
	private WebElement phone;
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="email_1")
	private WebElement mail;
	
	public WebElement getHobby() {
		return hobby;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getStatus() {
		
		return status;
	}
	
	
}
