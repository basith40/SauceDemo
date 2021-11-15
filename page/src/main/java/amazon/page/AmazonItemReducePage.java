package amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonUtility.AmazonPageBase;

public class AmazonItemReducePage extends AmazonPageBase{

	public AmazonItemReducePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#a-autoid-1-announce")
	WebElement quentityTag;
	@FindBy(xpath = "//*[@class='a-popover-wrapper']/div/ul/li[2]")
	WebElement quantityNumber;
	
	
	public WebElement qTag() {
		return quentityTag;
	}
	public WebElement qNumber() {
		return quantityNumber;
	}

}
