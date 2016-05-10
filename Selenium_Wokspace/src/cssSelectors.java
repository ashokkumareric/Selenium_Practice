import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectors {

	public static WebDriver Driver = new FirefoxDriver(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Driver.manage().window().maximize();
			Driver.get("http://www.flipkart.com/");
			Driver.findElement(By.cssSelector("a[class='menu-text fk-inline-block'][data-tracking-id='electronics']>span:hover"));
			
//			Driver.findElement(By.id("fk-top-search-box")).sendKeys("T-shirts");
//  Using cssselector :
//	1. full path like xpath html body div[1] div[1] div[2] div[1] div div[2] div[2] form div div div[2] input[1]
//			Driver.findElement(By.cssSelector("html body div[1] div[1] div[2] div[1] div div[2] div[2] form div div div[2] input[1]")).click();
//	2. using relative path.. let us assume that the input is the first input in the hierarchy
//			Driver.findElement(By.cssSelector("html body div[1] div[1] div[2] div[1] div div[2] div[2] form div div div[2] input")).click();
//  3. Using class selector
			
//  4. using ID selector
//			Driver.findElement(By.cssSelector("input#Search")).click();
//				(or)
//			Driver.findElement(By.cssSelector("#Search")).click();	
//  5. using attribute selector :[Worked]
//			Driver.findElement(By.cssSelector("input[value=Search]")).click();
//  6. using combination of 2 attributes:[Worked]
//			WebElement previousButton = Driver.findElement(By.cssSelector("input[type='submit'][value='Search']"))
//			previousButton.click();
//  7. using cssSelectors to get the links available in the page:
//  	The following will give the <input> tabs with attribute "type" links available in the webpage			
//			WebElement previousButton = Driver.findElement(By.cssSelector("input[type]"))
//  8. using cssSelectors to get the links available in the page: [This is vice versa of type 7]
//			We have function not() which help us in getting the tags other than the <input> tag with attribute <type>
//	  	The following will give the <input> tabs with attribute "type" links available in the webpage			
//				WebElement previousButton = Driver.findElement(By.cssSelector("input:not([type])"))
//		Some other uses :
//	#		input[id^='ctrl'] >> Starting with:
//				For example, if the ID of an element is ctrl_12,
//				this will locate and return elements with ctrl at
//				the beginning of the ID.
//	#		input[id$='_userName'] >> Ending with:
//				For example, if the ID for an element is a_1_
//				userName, this will locate and return elements
//				with _userName at the end of the ID.				
//	#		Input[id*='userName'] >> Containing:
//		For example, if the ID of an element is panel_
//		login_userName_textfield, this will use
//		the userName part in the middle to match and
//		locate the element.
//		Thread.sleep(5000);

// Getting the links in a page		
//		List<WebElement> links = Driver.findElements(By.tagName("a"));
//		for(WebElement link : links) 
//		{
//			System.out.println("Links: "+link.getAttribute("href"));
//		}
//		System.out.println(links.size());
			Driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}

