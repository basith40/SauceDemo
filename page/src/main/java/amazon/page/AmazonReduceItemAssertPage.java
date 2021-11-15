package amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonUtility.AmazonPageBase;

public class AmazonReduceItemAssertPage extends AmazonPageBase{
	
	@FindBy(xpath = "//*[@id=\"activeCartViewForm\"]/div[3]")
	private WebElement reduceCart;

	public AmazonReduceItemAssertPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement actualCart() {
		return reduceCart;
	}

}
