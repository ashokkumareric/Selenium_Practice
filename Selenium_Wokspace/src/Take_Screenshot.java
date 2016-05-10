import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Take_Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		try {
			
			Driver.manage().window().maximize();
			//Driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
			Driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/DragDrop.html");
			File srcFile =((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
			String Screenshotname = "Dropdown_Screenshot_1";
			FileUtils.copyFile(srcFile,new File("/home/amuthupa/Desktop/"+Screenshotname+".png"));
			
			Driver.close();
		}catch(Exception e){
			Driver.close();
			System.out.println("Error occured");
		}
	}

}
