package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class CoursesPOM extends Base{
	
	public CoursesPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement crse;
	
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement java;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement core;
	
	@FindBy(xpath="//span[text()='JAVA and J2EE Training in Chennai']")
	private WebElement text;

	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement anita;
	
	public WebElement getAnita() {
		return anita;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getCrse() {
		return crse;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getCore() {
		return core;
	}
	
	
	

}
