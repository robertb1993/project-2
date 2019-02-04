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

import PageObjectModel.NFL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NFLnews {
	private WebDriver driver = null;

	@Test
	public void NFLNews() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		NFL ab = PageFactory.initElements(driver, NFL.class);
		Actions action = new Actions(driver);
		action.sendKeys(ab.SearchforNFL(), "NFL").perform();
		action.sendKeys(ab.SearchforNFL(), Keys.RETURN).perform();
		action.click(ab.NFLscore()).perform();
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
		driver.close();
	}

}
