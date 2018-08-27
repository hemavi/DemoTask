package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class TestimonialsPOM extends Base {

	public TestimonialsPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='testimonial.html']")
	private WebElement test;
	
	@FindBy(id="article-wrapper")
	private WebElement test1;
	
	@FindBy(xpath="//*[@id='box-wrapper']/div[2]/text()[5]")
	private WebElement phn;

	public WebElement getTest() {
		return test;
	}

	public WebElement getTest1() {
		return test1;
	}

	public WebElement getPhn() {
		return phn;
	}
	
	
}
