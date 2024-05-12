import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com"); //URL in the browser
		// //a[@value='MAA'] - Xpath for chennai
		
		// //a[@value='BLR']
		
		driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// second method without using index
		
		driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
		

	}

}
