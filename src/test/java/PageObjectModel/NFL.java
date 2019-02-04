package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NFL {
	private final WebDriver driver;

	public NFL(WebDriver passWebDriver) {
		this.driver = passWebDriver;

	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement Gaints;

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement Jets;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement SearchforNFL() {
		return Gaints;
	}

	public WebElement NFLscore() {
		return Jets;
	}
}
