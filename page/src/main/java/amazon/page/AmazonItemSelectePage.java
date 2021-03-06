package amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import amazonUtility.AmazonPageBase;

public class AmazonItemSelectePage extends AmazonPageBase{

	public AmazonItemSelectePage(WebDriver driver) {
		super(driver);
	}
	private By firstHat = By.xpath("//*[contains(@class,'s-main-slot')]/div[3]");
	
	public WebElement hat() {
		return driver.findElement(firstHat);
	}

}
