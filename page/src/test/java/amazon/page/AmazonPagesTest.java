package amazon.page;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import amazonUtility.AmazonBase;

public class AmazonPagesTest extends AmazonBase{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test
	public void amazonPageTest() throws InterruptedException {		
		AmazonItemsSearchPage aisp = new AmazonItemsSearchPage(driver);
		aisp.searchBox.sendKeys("hats for men");
		aisp.searchButton.click();
		log.info("Search hats for men");
		AmazonItemSelectePage aip = new AmazonItemSelectePage(driver);
		aip.hat().click();
		Thread.sleep(3000);
		log.info("Add the first hat appearing to Cart");
		AmazonItemAddingPage aiap = new AmazonItemAddingPage(driver);
		aiap.itemQuentity().click();
		aiap.picewanted().click();
		aiap.addincart().click();
		log.info("quantity 2");
		AmazonItemsCartAssertingPage aica = new AmazonItemsCartAssertingPage(driver);
		aica.chackCart().click();
		AssertJUnit.assertEquals(aica.cartAssert().getText(), "Subtotal (2 items): $33.98");
		log.info("Open cart and assert that the total price and quantity are correct");
		AmazonItemReducePage airp = new AmazonItemReducePage(driver);
		airp.qTag().click();
		airp.qNumber().click();
		Thread.sleep(2000);
		log.info("Reduce the quantity from 2 to 1 in Cart");
		AmazonReduceItemAssertPage aria = new AmazonReduceItemAssertPage(driver);
		AssertJUnit.assertEquals(aria.actualCart().getText(), "Subtotal (1 item): $16.99");
		log.info("Assert that the total price and quantity has been correctly changed");
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = getBrowser();
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
