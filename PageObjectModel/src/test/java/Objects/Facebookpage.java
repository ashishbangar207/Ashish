package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {
WebDriver driver;
	
	public Facebookpage(WebDriver driver ) {
		this.driver=driver;
		
	}
	
	By username_editbox =By.xpath("//*[@id='email']");
	By password_editbox=By.xpath("//*[@id='pass']");
	By Login_btn =By.xpath("//*[@name='login']");
	
	
	public void Enterusername() {
		driver.findElement(username_editbox).sendKeys("8999474207");
		
	}
	public void Enterthepassword() {
		driver.findElement(password_editbox).sendKeys("ashish@12345");
	}
	public void clickbtn () {
		driver.findElement(Login_btn).click();
		String title = driver.getTitle();
		assertEquals(title,"Facebook");
		
	}

}
