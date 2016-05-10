package Scripts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {

	public WebDriver driver = new FirefoxDriver();
	private  String uname = "spdood";
	private String pword = "gs;Dubs15";
	private String spip_id = "sp99280";
	Loginpage(){
		
		Logged_In();
		http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1403812
	}
	@Test
	public void Logged_In(){
		String URL = "https://"+uname+":"+pword+"@"+spip_id+"/sp/sp_main.php?fchk=noflash";
		try{
			driver.get(URL);
			driver.manage().window().maximize();
			String Page_Title = driver.getTitle();
//			System.out.println(Page_Title);
//			if (Page_Title.equals("SPOCC")){
//				System.out.println("True");
//			}
//			else
//				System.out.println("False");
			assertEquals("SPOCC",Page_Title);
		}catch(Exception e){
			System.out.println("====================================");
			System.out.println("Error while logging in to the SPOCC");
			System.out.println("====================================");
		}
		
	}
	
	
}
