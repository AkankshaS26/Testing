import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		//move to specific element
		a.moveToElement(move).contextClick().build().perform();
		

	}

}
