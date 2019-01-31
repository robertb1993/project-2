package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class NFL {
	private final WebDriver driver;

	public NFL(WebDriver passWebDriver) {
		this.driver = passWebDriver;
	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement Gaints;

	@FindBy(xpath = "(//*[@class='hdtb-mitem hdtb-imb']//a)[3]")
	WebElement Jets;

	public WebDriver getDriver() {
	   return driver;
	}

	public WebElement SearchforNFL() {
		return Gaints;
	}

	public WebElement NFLscore() {
		return Jets;
	}
}
