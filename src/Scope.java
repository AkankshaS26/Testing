import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	//1. Give me the count of the links on the page.
	// 2. a = tag name & count of footer section
		
		
		
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//limiting Webdriver Scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	// 3.count the coloumn section link
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
	// 4. count the each link in coloumn section and check if the page are opening
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		Thread.sleep(5000L);
		
	Set<String> abc=driver.getWindowHandles(); //4 windows
	Iterator<String> it = abc.iterator();
	
	
	 while(it.hasNext())
	 {
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getTitle());
	 }
			
			
			
		}
		
		

	}

}
