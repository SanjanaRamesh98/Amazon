import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
		@BeforeMethod
		public void openAppln() {
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		@AfterMethod
		public void closeAppln() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
		
	}


