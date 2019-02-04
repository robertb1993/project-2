package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MLS {
	private final WebDriver driver;

	public MLS(WebDriver passWebDriver) {
		this.driver = passWebDriver;

	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement England;

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement Brazil;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement DavidBeckham() {
		return England;
	}

	public WebElement Kaká() {
		return Brazil;
	}
}
