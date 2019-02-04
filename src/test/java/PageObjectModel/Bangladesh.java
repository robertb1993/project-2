package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
public  class Bangladesh {
	private final WebDriver driver;

	public Bangladesh(WebDriver passWebDriver) {
		this.driver = passWebDriver;

	}

	@FindBy(xpath = "//*[@class='SDkEP']//input")
	WebElement googleSearch;

	@FindBy(xpath = "//a[contains(text(),'News')]")
	WebElement dhaka;

	public WebDriver Driver() {
		return driver;
	}

	public WebElement GoogleSearch() {
		return googleSearch;
	}

	public WebElement Dhaka() {
		return dhaka;
	}

}
