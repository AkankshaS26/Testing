import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome - ChromeDriver extend -> Methods close get
		//Firefox-FirefoxDriver -> Methods close get
		//Safari-safaridriver -> Methods close get
		//WebDriver close get
		//WebDriver Methods + Class methods
		
		//Chromedriver.exe -> Chrome browser provide by selenium manager
		//step to invoke chrome driver
		

		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		
		
		//webdriver.chrome.driver->value of path
		//webDriver driver = new ChromeDriver();
		
		//  FireFox launch
		//geckodriver
		
		//webdriver.gecko.driver
		
		//System.setProperty("webdriver.gecko.driver", "\"G:\\Akanksha\\chromedriver.exe\"");
		//WebDriver driver=new FirefoxDriver();
		
		/*driver1.get("https://rahulshettyacademy.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();*/
		
	

	}

}
