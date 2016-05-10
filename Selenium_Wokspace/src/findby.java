import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class findby {

	public static WebDriver driver = new FirefoxDriver();
	
	// Find elements by using findby
	@FindBy(name = "q")
	WebElement search;
	@FindBy(name = "btnG")
	WebElement btnclick;
	
	//Constructor which will initialize the page once the findby class is called
	findby(WebDriver driver){
			//Initialize page factory objects in the page
		PageFactory.initElements(driver, this);

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("http://www.google.com");
		findby obj = new findby(driver);
		//sending values to search box
		obj.search.sendKeys("Selenium");
		obj.btnclick.click();
		
		

	}

}
