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

import PageObjectModel.NBA;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NBAnews {
	private WebDriver driver = null;

	@Test
	public void NBANews() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		NBA cd = PageFactory.initElements(driver, NBA.class);
		Actions action = new Actions(driver);
		action.sendKeys(cd.MichaelJordan(), "NBA").perform();
		action.sendKeys(cd.MichaelJordan(), Keys.RETURN).perform();
		action.click(cd.LebronJames()).perform();
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"rso\"]/div"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
		driver.close();
	}

}
