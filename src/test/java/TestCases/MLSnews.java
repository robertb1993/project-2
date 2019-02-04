package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.MLS;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MLSnews {
	private WebDriver driver = null;

	@Test
	public void MLSNews() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MLS kk = PageFactory.initElements(driver, MLS.class);
		Actions action = new Actions(driver);
		action.sendKeys(kk.DavidBeckham(), "MLS").perform();
		action.sendKeys(kk.DavidBeckham(), Keys.RETURN).perform();
		action.click(kk.Kaká()).perform();
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
		driver.close();

	}
}
