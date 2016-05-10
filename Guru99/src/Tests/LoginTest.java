package Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import Pages.Login_page;
public class LoginTest {
	
	@Test
	public void Test_Loginpage(){
		FirefoxProfile profile = new FirefoxProfile(); 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		String username = "mngr36460";
		String password = "UnAqApA";
		Login_page login_obj = new Login_page(driver);
		System.out.println("Created login_obj object");
		login_obj.Login_to_Site(username, password);
	}
	

}

