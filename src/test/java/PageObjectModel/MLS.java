package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class MLS {
	private final WebDriver driver;

	public MLS(WebDriver passWebDriver) {
		this.driver = passWebDriver;
	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement England ;

	@FindBy(xpath = "(//*[@class='hdtb-mitem hdtb-imb']//a)[3]")
	WebElement Brazil;

	//public WebDriver getDriver() {
		//return driver;
	//}

	public WebElement DavidBeckham() {
		return England;
	}

	public WebElement 	Kaká() {
		return  Brazil;
	}
}
