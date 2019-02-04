package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MLB {
	private final WebDriver driver;

	public MLB(WebDriver passWebDriver) {
		this.driver = passWebDriver;

	}

	@FindBy(xpath = "//input[@title='Search']")
	WebElement Nets;

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement Yonkee;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement PedroAraujo() {
		return Nets;
	}

	public WebElement AndrewCashner() {
		return Yonkee;
	}

}
