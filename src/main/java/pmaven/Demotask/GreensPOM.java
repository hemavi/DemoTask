package pmaven.Demotask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class GreensPOM extends Base{
	
	public GreensPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement text;
	
	@FindBy(xpath="//h2[text()='Greens Technologys Overall Reviews']")
	private WebElement text1;

	public WebElement getText() {
		return text;
	}

	public WebElement getText1() {
		return text1;
	}
	
	
}
