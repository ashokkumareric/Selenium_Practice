package Scripts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Support_Operations {
	Loginpage login = new Loginpage();
	
	@Test
	public void Test_Support_ops() throws Exception{
		
		// Implicitly waiting  30 Seconds for each statement 
		login.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		// Get Parent window Handle
		String ParentWindowID = login.driver.getWindowHandle();
		System.out.println("Window Handle: "+ ParentWindowID);
		
		// Storing all the frames available in the page
		List<WebElement> list_frames = login.driver.findElements(By.tagName("frame"));
				
		// Switching to left frame to click SPmaint option.
		login.driver.switchTo().frame("leftFrame");
				
		// Clicking the SPmaint button
		login.driver.findElement(By.linkText("Support")).click();
				
		// Switching back to Main page
		login.driver.switchTo().defaultContent();
		// 
		//Switching to mainFrame
		login.driver.switchTo().frame(list_frames.get(2).getAttribute("name"));
		
		//Click Launch Splore to generate SPlore
		login.driver.findElement(By.xpath("//a[contains(text(),'Launch SPLOR')]")).click();
	
		//waitForPopUp()
		Set<String> WinHandles = login.driver.getWindowHandles();
		
		//Switching to the popup window
		for(String str : WinHandles){
			System.out.println(str);
			if (str != ParentWindowID){
				login.driver.switchTo().window(str);
			}
		}
		Thread.sleep(45000);
		
		login.driver.manage().window().maximize();
		String WindowTitle = login.driver.getTitle();
		String WindowTitle_DOM = login.driver.findElement(By.xpath(""))
		
		login.driver.findElement(By.xpath("//a[contains(text(),'View SPLOR Contents')]")).click();
				
		//waitForPopUp()
		Set<String> WinHandles_1 = login.driver.getWindowHandles();
				
		//Switching to the popup window
		for(String str : WinHandles_1){
			System.out.println(str);
//			if (str == ParentWindowID){
//				login.driver.switchTo().window(str);
//			}
		}
				

		
		
		
		
		
		
		
		
		
	}
	
}
