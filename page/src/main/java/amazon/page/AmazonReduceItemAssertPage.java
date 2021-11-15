package amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonUtility.AmazonPageBase;

public class AmazonReduceItemAssertPage extends AmazonPageBase{

	public AmazonReduceItemAssertPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"activeCartViewForm\"]/div[3]")
	WebElement reduceCart;
	
	
	public WebElement actualCart() {
		return reduceCart;
	}

}
