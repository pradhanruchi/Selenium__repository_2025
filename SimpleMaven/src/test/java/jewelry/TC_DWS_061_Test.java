package jewelry;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)

public class TC_DWS_061_Test extends BaseClass {
	@Test
	public void clickOnJewelry() {
		ExtentTest test=ereport.createTest("clickOnJewelry");
		HomePage hp=new HomePage(driver);
		hp.getJewelryLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Jewelry");
		test.log(Status.PASS, "Jewelry page is displayed");
	}

}
