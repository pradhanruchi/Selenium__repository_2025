package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Ruchi Pradhan
 */

public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * 
	 * @param driver
	 */

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();

	}

	/**
	 * This method will minimize the window
	 */
	public void minimize(WebDriver driver) {

		driver.manage().window().minimize();
	}

	/**
	 * This method perform mouseHover actions
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);

		act.moveToElement(element).perform();
	}

	/**
	 * This method perform scrolling actions
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();

	}

	/**
	 * This method perform scrolling by x,y co-ordinates
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scroll(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}

	/**
	 * This method perform select class by using index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectDropdown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method dropdown by using select by value
	 * 
	 * @param element
	 * @param value
	 */

	public void selectDropDown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method dropdown by using selectbyvisible text
	 * 
	 * @param text
	 * @param element
	 */

	public void selectDropDown(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * this method using switchToFrame for String name or id
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);

	}

	/**
	 * This method switchToFrame for element
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);

	}

	/**
	 * This method switchToAlert for popups
	 * 
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();

	}

	/**
	 * This method switchToAlertAndAceept
	 * 
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	/**
	 * This method for switchToAlertAndDismiss
	 * 
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	/**
	 * This method for taking TakesScreenshot
	 * 
	 * @param driver
	 * @throws IOException
	 */
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jutil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + jutil.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);

	}
	/**
	 * This method for getting all the window ids 
	 * @param driver
	 * @param expUrl
	 */

	public void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			@Nullable
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(expUrl)) {
				break;
			}
		}

	}
	/**
	 * this method for getting url title
	 * @param driver
	 */
	public void switchToWindow(String expTitle,WebDriver driver) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expTitle)) {
				break;
			}
		}
	}

}
