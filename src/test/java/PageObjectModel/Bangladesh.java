package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
public abstract class Bangladesh {
	private final WebDriver driver;
    
    public Bangladesh(WebDriver passWebDriver) {
                    this.driver = passWebDriver;
}
    
    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    WebElement googleSearch;
    
    @FindBy(xpath = "(//*[@class='hdtb-mitem hdtb-imb']//a)[3]")
    WebElement dhaka;

   public WebDriver getDriver() {
                   return driver;
  }

    public WebElement GoogleSearch() {
                    return googleSearch;
    }

    public WebElement Dhaka() {
                    return dhaka;
    }

}
