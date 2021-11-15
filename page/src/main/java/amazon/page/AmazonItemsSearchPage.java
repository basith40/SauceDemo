package amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonUtility.AmazonPageBase;

public class AmazonItemsSearchPage extends AmazonPageBase{
	
	@FindBy(css = "#twotabsearchtextbox")
	WebElement searchBox;
	@FindBy(css = "#nav-search-submit-button")
	WebElement searchButton;

	public AmazonItemsSearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement amazonSearchBox() {
		return searchBox;
	}
	public WebElement amazonSearchButton() {
		return searchButton;
	}
	

}
