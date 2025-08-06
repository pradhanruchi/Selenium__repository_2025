package cars;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BenzTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("Benz is launched",true);
	}
	

}
