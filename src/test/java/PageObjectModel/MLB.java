package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class MLB {
	private final WebDriver driver;

	public MLB(WebDriver passWebDriver) {
		this.driver = passWebDriver;
	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement Nets ;

	@FindBy(xpath = "(//*[@class='hdtb-mitem hdtb-imb']//a)[3]")
	WebElement Yonkee;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement PedroAraujo() {
		return Nets;
	}

	public WebElement 	AndrewCashner() {
		return Yonkee;
	}
	

}
