import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		try {
			
			Driver.manage().window().maximize();
			//Driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
			Driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Doubleclick.html");
			WebElement verify_color = Driver.findElement(By.cssSelector("div[id='area']"));
			WebElement message = Driver.findElement(By.id("message"));
			System.out.println(verify_color.getText());
			System.out.println(verify_color.getAttribute("style"));
			System.out.println(verify_color.getCssValue("bg-color"));
			System.out.println(verify_color.isDisplayed());
			System.out.println(message.getCssValue("background-color"));
			System.out.println("==============================");
			System.out.println(message.getCssValue("background-color").toString());
			Actions builder = new Actions(Driver);
			builder.doubleClick(message).build().perform();
			Thread.sleep(5000);
			System.out.println("==============================");
			System.out.println(message.getCssValue("background-color").toString());
			Driver.close();
		}catch(Exception e){
			Driver.close();
			System.out.println("Error occured");
		}
	}	
}
