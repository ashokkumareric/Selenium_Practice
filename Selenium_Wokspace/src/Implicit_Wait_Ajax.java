import java.io.File;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait_Ajax {
	public String read_file() throws Exception{
		String Strings = "";
		int read;
		try
		{
			FileReader in = new FileReader("/home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/ajax_info.txt");
			//BufferedReader reader = new BufferedReader(in);
			System.out.println("Entered readfile function");
			while((read = in.read()) != -1)
			{
				//Strings += (char)read;
				if ((char)read == '\n'){
					read = ' ';
					Strings += (char)read;
				}else{
					Strings += (char)read;
				}
				//line = reader.readLine();
			}	
		}
		catch(Exception e)
		{
				System.out.println("File not found");
		}
		return Strings;
	}
		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String filetext,webtext = "";
		Implicit_Wait_Ajax obj = new Implicit_Wait_Ajax();
		int compare_value;
		try {
			driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Implicit_Wait.html");
			driver.manage().window().maximize();
			// Setting Implicit wait..this will make all the selenium commands to wait for specified time 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[contains(text(),'Change Content')]")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webtext += driver.findElement(By.cssSelector("div[id='demo']")).getText();
			filetext = obj.read_file();
			System.out.println("WebText: "+ webtext);
			System.out.println("fileText: "+ filetext);
			compare_value = filetext.compareToIgnoreCase(webtext);
			System.out.println("Compare Value: "+compare_value);
			driver.close();
			if (webtext.equals(webtext)){
				System.out.println("Equal");
			}else{
				System.out.println("Not Equal");
			}
		}catch (Exception e){
			File srcFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String Screenshotname = "Dropdown_Screenshot_Error1";
			FileUtils.copyFile(srcFile,new File("/home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Implicit_Wait"+Screenshotname+".png"));
			driver.close();
			System.out.println("Error occured");
		}
	}

}
