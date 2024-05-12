import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		

		driver.get("http://spicejet.com"); //URL in the browser
		

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Count the number of checkboxes
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefincAdt")).click(); //4times
			i++;
		}*/
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		    
		    driver.findElement(By.id("btnclosepaxoption")).click();
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    
		

	}

}
