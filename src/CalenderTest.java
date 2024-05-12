import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		
		String monthNumber = "6";
		String date = "15";
		String year = "2024";
		String[] expectedList = {monthNumber,date, year};
		
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker_inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calender_navigation_label")).click();
		driver.findElement(By.cssSelector(".react-calender_navigation_label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calender_year-view_months_month")).get(Integer.parseInt(monthNumber)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		
	//System.out.println(driver.findElement(By.cssSelector("react-date-picker_inputGroup")).getText());
		
		List<WebElement> actualList =driver.findElements(By.cssSelector("..react-date-picker_inputGroup_input"));
		for(int i=0; i<actualList.size();i++)
		{
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
			
		}
		driver.close();
		
	}

}
