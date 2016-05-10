import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		try {
			Driver.manage().window().maximize();
			Driver.get("http://www.flipkart.com/");
			Driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Driver.close();
		}

	}

}
