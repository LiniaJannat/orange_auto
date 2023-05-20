package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSet {
	
	
	public static WebDriver driver; 
	
	
	@BeforeSuite
	
	public void Setup () {
		
		  WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        ChromeDriverService service = ChromeDriverService.createDefaultService();
			driver = new ChromeDriver(service, options);
		
		
		
	}
	
	@AfterSuite
	public void teardown () {
		
		  // Quit the WebDriver
        if (driver != null) {
            driver.quit();
        }
	}
	
	
	

}
