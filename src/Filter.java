import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
	List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
	//5 results
	
	List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
	//1 results
	Assert.assertEqual(veggies.size(),filteredList.size());

	}

}
