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

import PageObjectModel.Bangladesh;
import PageObjectModel.MLB;
import PageObjectModel.MLS;
import PageObjectModel.NBA;
import PageObjectModel.NFL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class  BangladeshiNews {
	private WebDriver driver = null;

	@Test
	public void BanglaNews() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Bangladesh bd = PageFactory.initElements(driver, Bangladesh.class);
		Actions action = new Actions(driver);
		action.sendKeys(bd.GoogleSearch(), "Bangladesh").perform();
		action.sendKeys(bd.GoogleSearch(), Keys.RETURN).perform();
		action.click(bd.Dhaka()).perform();
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
		driver.close();
	}

}
