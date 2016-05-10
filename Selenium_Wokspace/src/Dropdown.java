import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver Driver = new FirefoxDriver();
				try {
					
					Driver.manage().window().maximize();
					//Driver.get("http://dl.dropbox.com/u/55228056/DoubleClickDemo.html");
					Driver.get("file:///home/amuthupa/Eclipse_Workspace/Selenium_Wokspace/src/Dropdown_Select.html");
					Select list = new Select(Driver.findElement(By.xpath("//Select")));
					System.out.println(list.isMultiple());
					list.selectByIndex(1);
					Thread.sleep(5000);
					list.selectByVisibleText("Audi");
					System.out.println(list.getFirstSelectedOption().getText());
					System.out.println(list.getFirstSelectedOption());
					Thread.sleep(5000);
					Process p = Runtime.getRuntime().exec("hostname");
					p.waitFor();
					
					//System.out.println((p.getInputStream()).read(b));
					
					Driver.close();
				}catch(Exception e){
					Driver.close();
					System.out.println("Error occured");
				}
			}

		}
