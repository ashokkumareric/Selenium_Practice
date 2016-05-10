import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///home/amuthupa/Desktop/button.html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert alerts= driver.switchTo().alert();
//		String str = alerts.getText();
//		System.out.println(str);
		alerts.sendKeys("Hello world");
		Thread.sleep(5000);
		alerts.accept();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert alerts_2= driver.switchTo().alert();
		Thread.sleep(10);
		alerts_2.dismiss();
		Thread.sleep(10);
		driver.close();
		driver.findElement(By.xpath(".//*[@id='anchor']")).click();
		
	}

}
