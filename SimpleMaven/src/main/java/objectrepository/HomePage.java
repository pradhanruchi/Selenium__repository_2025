package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement computersLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardsLink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	 
}
