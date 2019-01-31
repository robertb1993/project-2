package TestCases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.Bangladesh;
import PageObjectModel.MLB;
import PageObjectModel.MLS;
import PageObjectModel.NBA;
import PageObjectModel.NFL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class  News {
	private WebDriver driver;

	@Test
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = {"Test1"})
	public void BanglaNews() throws Exception {

		Bangladesh bd = PageFactory.initElements(driver, Bangladesh.class);
		Thread.sleep(3000);
		bd.GoogleSearch().sendKeys("Bangladesh");
		bd.GoogleSearch().sendKeys(Keys.RETURN);

		bd.Dhaka().click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
	}

	@Test
	public void NFLNews() throws Exception {

		NFL ab = PageFactory.initElements(driver, NFL.class);
		Thread.sleep(3000);
		ab.SearchforNFL().sendKeys("NFL");
		ab.SearchforNFL().sendKeys(Keys.RETURN);
		ab.NFLscore().click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd']"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
	}

	@Test
	public void NBANews() throws Exception {

		NBA cd = PageFactory.initElements(driver, NBA.class);
		Thread.sleep(3000);
		cd.MichaelJordan().sendKeys("NBA");
		cd.MichaelJordan().sendKeys(Keys.RETURN);
		cd.LebronJames().click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());
	}

	@Test
	public void MLBNews() throws Exception {

		MLB tk = PageFactory.initElements(driver, MLB.class);
		Thread.sleep(3000);
		tk.PedroAraujo().sendKeys("MLB");
		tk.PedroAraujo().sendKeys(Keys.RETURN);
		tk.AndrewCashner().click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());

	}

	@Test
	public void MLSNews() throws Exception {

		MLS kk = PageFactory.initElements(driver, MLS.class);
		Thread.sleep(3000);
		kk.DavidBeckham().sendKeys("MLS");
		kk.DavidBeckham().sendKeys(Keys.RETURN);
		kk.Kaká().click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bkWMgd"));
		for (WebElement link : allLinks)
			System.out.println(link.getText());

	}
}
