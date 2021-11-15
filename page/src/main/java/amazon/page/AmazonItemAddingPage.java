package amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import amazonUtility.AmazonPageBase;

public class AmazonItemAddingPage extends AmazonPageBase{
	private By quentity = By.cssSelector(".a-dropdown-label");
	private By qNumber = By.xpath("//*[@class='a-popover-wrapper']/div/ul/li[2]");
	private By addtocart = By.cssSelector("#add-to-cart-button");

	public AmazonItemAddingPage(WebDriver driver) {
		super(driver);
	}	
	
	
	public WebElement itemQuentity() {
		return driver.findElement(quentity);
	}
	public WebElement picewanted() {
		return driver.findElement(qNumber);
	}
	public WebElement addincart() {
		return driver.findElement(addtocart);
	}

}
