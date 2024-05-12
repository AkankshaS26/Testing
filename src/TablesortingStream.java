import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TablesortingStream {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		//click on that column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelement into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//capture text of all webelement into(original)list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		//sort on the original list of step3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		
		//compare original list v/s sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		List<String>price;
		//scan the name column with getText ->Beans -> print the price of the Beans
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggi(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		// a = for every item of list
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);

	

	}

	private static String getPriceVeggi(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}
}
