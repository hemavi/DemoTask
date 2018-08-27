package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class CertificationPOM extends Base{

	public CertificationPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement text;
	
	@FindBy(xpath="//a[@href='selenium-course-content.html']")
	private WebElement seleniumcrse;
	
	@FindBy(className="testimonial-content")
	private WebElement testimonial;
	
	@FindBy(id="pageHeader")
	private WebElement header;

	public WebElement getText() {
		return text;
	}

	public WebElement getSeleniumcrse() {
		return seleniumcrse;
	}

	public WebElement getTestimonial() {
		return testimonial;
	}

	public WebElement getHeader() {
		return header;
	}
	
	
}
