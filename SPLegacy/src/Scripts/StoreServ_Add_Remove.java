package Scripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class StoreServ_Add_Remove {
	
	Loginpage login = new Loginpage();
	JavascriptExecutor js = (JavascriptExecutor) login.driver;
	String s841 = "15.162.6.78";
	@BeforeClass
	public static void Testing_Initiated(){
		System.out.println("========================================");
		System.out.println("Testing Inititated");
		System.out.println("========================================");
	}
	@Test
	public void Test_StoreServ_configuration() throws Exception{
				
		// Implicitly waiting  30 Seconds for each statement 
		login.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		// Storing all the frames available in the page
		List<WebElement> list_frames = login.driver.findElements(By.tagName("frame"));
				
		// Switching to left frame fo click SPmaint opption.
		login.driver.switchTo().frame("leftFrame");
				
		// Clicking hte SPmaint button
		login.driver.findElement(By.linkText("SPmaint")).click();
				
		// Switching back to Main page
		login.driver.switchTo().defaultContent();
		
		// Switching to mainFrame
		login.driver.switchTo().frame(list_frames.get(2).getAttribute("name"));
				
		// Clicking the Storeserv configuration Management for adding/removing the storeserv
		login.driver.findElement(By.xpath(".//a[@class='menuitem' and contains(text(), 'StoreServ Configuration Management')]")).click();
		System.out.println("Reached Storeserv page");
				
		if (login.driver.findElement(By.xpath("//input[@id='buttonstyle1']"))!=null){
			
			add_storeserv();
			
			// Check whether the element is present or not by using the function isElementPresent
			if(isElementPresent(By.xpath("//tr[@id='blue_tbl_row']/td[2]"))){
				String SS_ID = login.driver.findElement(By.xpath("//tr[@id='blue_tbl_row']/td[2]")).getText();
				assertEquals("s841",SS_ID);
				System.out.println("Storeserv Added");
			}else{
				File srcFile =((TakesScreenshot) login.driver).getScreenshotAs(OutputType.FILE);
				String Screenshotname = "Add_Storeserv_Failed_1";
				FileUtils.copyFile(srcFile,new File("/home/amuthupa/Desktop/"+Screenshotname+".png"));
				fail("Storeserv Adding failed");
				
			}
			
		}
		else {
			remove_storeserv();
			String Add_ss = login.driver.findElement(By.xpath("//input[@id='buttonstyle1']")).getText();
			assertEquals("Add New StoreServ",Add_ss);			
			System.out.println("Storeserv Removed");
		}
						
		
	}
	
	
	
	// Check whether an element is present or not
	private boolean isElementPresent(By by) {
		try {
			login.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	public void add_storeserv() throws InterruptedException{
		login.driver.findElement(By.xpath("//input[@id='buttonstyle1']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 30);		 
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td>input[value='add']")));
//		JavascriptExecutor js = (JavascriptExecutor) login.driver;
//		js.executeScript("document.getElementByName('mode').setAttribute('type', 'text')");
		login.driver.findElement(By.name("ipaddr")).clear();
		login.driver.findElement(By.name("ipaddr")).sendKeys(s841);
		Thread.sleep(5);
		login.driver.findElement(By.cssSelector("td>input[name='inserv_user_nm']")).sendKeys("3paradm");
		login.driver.findElement(By.cssSelector("td>input[name='inserv_user_pw']")).sendKeys("3pardata");
		login.driver.findElement(By.cssSelector("input[id='buttonstyle1'][value='Add IP Address']")).click();
		Thread.sleep(180);
	}
	
	public void remove_storeserv() throws Exception{
		login.driver.findElement(By.xpath("//input[@id='buttonstyle1'][3]")).click();
		Alert alerts = login.driver.switchTo().alert();
		alerts.accept();
		Thread.sleep(2000);
		alerts.accept();
		Thread.sleep(2000);
		
		
		
	}

}
