import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String webtext = "";
		Implicit_Wait_Ajax obj = new Implicit_Wait_Ajax();
		
		try {
			driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Implicit_Wait.html");
			driver.manage().window().maximize();
			// Setting Explicit wait..this will make all the selenium commands to wait for specified time 
			
			driver.findElement(By.xpath("//button[contains(text(),'Change Content')]")).click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.textToBePresentInElement(By.cssSelector("div[id='demo']"),"AJAX is not a new programming language.\n AJAX is a technique for creating fast and dynamic web pages."));
			
			
			System.out.println("WebText: "+ webtext);
			driver.close();
			
		}catch (Exception e){
			File srcFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String Screenshotname = "Explicitwait_Screenshot_Error1";
			FileUtils.copyFile(srcFile,new File("/home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Explicit_Wait"+Screenshotname+".png"));
			driver.close();
			System.out.println("Error occured");
		}
	}

}
