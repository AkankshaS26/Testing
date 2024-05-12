import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Egde.driver","\"G:\\Akanksha\\edgedriver_win64\\msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		
		
		driver.get("https://google.com");
		
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("G://screenshot.png"));
	

	}

}
