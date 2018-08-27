package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class DataDrivenPOM extends Base{

	public DataDrivenPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement first;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement last;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement hobby;
	
	@FindBy(xpath="//*[@id='msdd']")
	private WebElement lang;
	
	@FindBy(id="Skills")
	private WebElement skills;
	
	@FindBy(id="countries")
	private WebElement country;
	
	@FindBy(id="select2-country-container")
	private WebElement scountry;
	
	@FindBy(id="yearbox")
	private WebElement year;
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	private WebElement month;
	
	@FindBy(id="daybox")
	private WebElement day;
	
	@FindBy(id="firstpassword")
	private WebElement fpwd;
	
	@FindBy(id="secondpassword")
	private WebElement spwd;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobby() {
		return hobby;
	}

	public WebElement getLang() {
		return lang;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getScountry() {
		return scountry;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getFpwd() {
		return fpwd;
	}

	public WebElement getSpwd() {
		return spwd;
	}
	
	
}
