package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

	WebDriver driver;
	By username = By.xpath("//input[@name='uid']");
	By password = By.xpath("//input[@name='password']");
	By Login_Button = By.xpath("//input[@name='btnLogin']");
	
	public Login_page(WebDriver driver){
		this.driver = driver;
	}
	public void Login_to_Site(String usrname, String password){
		
		this.driver.findElement(username).sendKeys(usrname);
		this.driver.findElement(this.password).sendKeys(password);
		this.driver.findElement(Login_Button).click();
		try{ 
				Alert alt = driver.switchTo().alert();
				String actualBoxtitle = alt.getText(); // get content of the Alter Message
				System.out.println("Error message: "+actualBoxtitle);
				alt.accept(); 
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
