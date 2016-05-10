import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		try {
			
			Driver.manage().window().maximize();
			Driver.get("https://dl.dropboxusercontent.com/u/55228056/Locators.html");
			List<WebElement> table_tr = Driver.findElements(By.cssSelector("table[id='items']>tbody>tr"));
			System.out.println(table_tr.size());
			//List<WebElement> table_th = new ArrayList<WebElement>();
			for (WebElement tr:table_tr){
				List<WebElement> table_th = tr.findElements(By.cssSelector("td"));
				for (WebElement th : table_th){
					System.out.println(th.getText());
				}
				System.out.println("================");
			}
			Actions builder = new Actions(Driver);
			builder.click(table_tr.get(0))
			.keyDown(Keys.CONTROL)
			.click(table_tr.get(1))
			.keyUp(Keys.CONTROL)
			.build().perform();
			List<WebElement> table_tr_1 = Driver.findElements(By.cssSelector("table[id='items']>tbody>tr"));
			System.out.println(table_tr_1.size());
			Thread.sleep(5000);
			Driver.close();
		}catch(Exception e){
		Driver.close();
		}
	}
}
