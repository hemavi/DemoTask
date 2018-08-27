package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class ContactsPOM extends Base{

	public ContactsPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contact;
	
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement title;
	
	@FindBy(xpath="/html/body/section[3]/section/footer/div[2]/div/div/div[1]/p")
	private WebElement copyright;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getCopyright() {
		return copyright;
	}
	
	
	
}
