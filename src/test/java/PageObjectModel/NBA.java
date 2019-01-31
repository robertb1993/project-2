package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  abstract class NBA {
	private final WebDriver driver;

	public NBA(WebDriver passWebDriver) {
		this.driver = passWebDriver;
	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement Lakers;

	@FindBy(xpath = "(//*[@class='hdtb-mitem hdtb-imb']//a)[3]")
	WebElement 	MaiamiHeats;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement  MichaelJordan () {
		return Lakers;
	}

	public WebElement LebronJames() {
		return MaiamiHeats;
	}

}
