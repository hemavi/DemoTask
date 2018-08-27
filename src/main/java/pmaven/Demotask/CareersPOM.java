package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class CareersPOM extends Base {

	public CareersPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='CAREERS']")
	private WebElement career;

	@FindBy(xpath = "//h1[text()='IT Trainer Jobs in Chennai ']")
	private WebElement text;

	@FindBy(xpath = "//a[@href='mailto:contact@greenstechnologys.com']")
	private WebElement mail;

	public WebElement getCareer() {
		return career;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getMail() {
		return mail;
	}

}
