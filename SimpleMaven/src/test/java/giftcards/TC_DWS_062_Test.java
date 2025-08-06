package giftcards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)

public class TC_DWS_062_Test extends BaseClass {
	@Test
	public void clickOnGiftCards() throws InterruptedException {
		ExtentTest test=ereport.createTest("clickOnGiftCards");
		HomePage hp=new HomePage(driver);
		hp.getGiftcardsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards");
		test.log(Status.PASS, "Gift Cards page is displayed");
		
		Select sel=new Select(driver.findElement(By.id("products-orderby")));
		sel.selectByContainsVisibleText("Price: Low to High");
		Thread.sleep(1000);
		
		
	}
	
	

}
