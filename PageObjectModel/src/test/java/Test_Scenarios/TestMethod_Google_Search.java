package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Facebookpage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_Google_Search {
	GoogleSearchPage repo;
	

	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
	}
	
	@Test
	public void SearchOperation() throws InterruptedException {
		
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
		
	}
	@Test
	public void verifyFcebbokAccess() {
		repo= new GoogleSearchPage(driver);
		repo.Facebook_link();
		
		
	}
	@Test
	public void verify_Facebook_login() {
		Facebookpage Facebook = new Facebookpage (driver);
		Facebook.Enterusername();
		Facebook.Enterthepassword();
		Facebook.clickbtn();	
	}
	
	public void AccessFacebookLink () {
		
	}
	
	
	@AfterTest
	public void aftertest() {
		
		//driver.quit();
		
		
	}
}
