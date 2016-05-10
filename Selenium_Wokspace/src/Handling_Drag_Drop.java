import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new FirefoxDriver();
		try {
			
			Driver.manage().window().maximize();
			//Driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
			Driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Dropdown.html");
			
			WebElement source = Driver.findElement(By.xpath(".//*[@id='drag1']"));
			WebElement target = Driver.findElement(By.xpath(".//*[@id='div1']"));
			
			Actions Builder = new Actions(Driver);
			Builder.doubleClick(target).build().perform();
			Thread.sleep(5000);
			Builder.dragAndDrop(source, target).perform();
			System.out.println(target.getText());
			Thread.sleep(5000);
			Driver.close();
		}catch(Exception e){
			Driver.close();
			System.out.println("Error occured");
		}
	}
}
