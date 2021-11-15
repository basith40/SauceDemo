package amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import amazonUtility.AmazonPageBase;

public class AmazonItemsCartAssertingPage extends AmazonPageBase{

	public AmazonItemsCartAssertingPage(WebDriver driver) {
		super(driver);
	}
	By cart = By.cssSelector("#nav-cart");
	By itemAssert = By.xpath("//*[@data-name='Subtotals']");
	
	public WebElement chackCart() {
		return driver.findElement(cart);
	}
	public WebElement cartAssert() {
		return driver.findElement(itemAssert);
	}

}
