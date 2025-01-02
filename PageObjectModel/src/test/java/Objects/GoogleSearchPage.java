package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver ) {
		this.driver=driver;
		
		
	}
	By SearchBox = By.xpath("//*[@name='q']");
	By Search_btn =By.xpath("//*[@name='btnK']");
	By facebook_link=By.xpath("//a/h3[text()='Facebook - log in or sign up']");

	public void searchgoogle(String Searchinput) {
		try {
			driver.findElement(SearchBox).sendKeys(Searchinput);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);
			
		}catch (Exception e ){
			System.out.println("display the exception"+e.getMessage());
			
		}
		
	}
	public void Facebook_link() {
		try {
			driver.findElement(facebook_link).click();
			Thread.sleep(2000);
		}catch (Exception d) {
			System.out.println("cath the facebook link exception"+d.getMessage());
		}
	}

}
