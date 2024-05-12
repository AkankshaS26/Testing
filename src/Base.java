import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		
		String[] itemsNeeded = {"cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
	}
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
       // For cucumber
		for(int i=0;i<products.size();i++)
		{
			//Brocolli 1kg
			
		String[] name=products.get(i).getText().split("-");
		@SuppressWarnings("unused")
		String formattedName=name[0].trim();
		
		//format it to get actual vegetable name
		//check wheather name you extracted is present in array or not.
		//convert array into array list for easy search
		
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
	
		if(itemsNeededList.contains("formattedName"));
		{
			j++;
			
			//click on add to cart
		 driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
		 
		 if(j==itemsNeeded.length)
		 break;
		 
		 
		 
			
		}
		
		}
		
	

	}

}
