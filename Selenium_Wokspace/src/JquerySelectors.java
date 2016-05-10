import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JquerySelectors {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dl.dropbox.com/u/55228056/Locators.html");
		//Expected list of selected Checkbox
		List<String> checked = Arrays.asList(new
		String[]{"user1_admin", "user3_browser"});
		//Create an instance of JavaScript Executor from driver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locate all the Checkbox which are checked by calling jQuery
		//find() method.
		//find() method returns elements in array
		List<WebElement> elements = (List<WebElement>)
		js.executeScript("return jQuery.find(':checked')");
		System.out.println(elements.size());
		//Verify two Checkbox are selected
//		35Locating Elements
//		assertEquals(elements.size(),2);
//		//Verify correct Checkbox are selected
//		for (WebElement element : elements)
//		assertTrue(checked.contains(element.getAttribute("id")));
		//driver.close();

	}

}
