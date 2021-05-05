package endtoend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	WebDriver driver;
	Amazon page;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser,String Url) {
		if(Browser.equalsIgnoreCase("Firefox")){
    		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
    		 driver=new FirefoxDriver();
    		 driver.manage().window().maximize();
    	}
		if(Browser.equalsIgnoreCase("Edge")){
    		System.setProperty("webdriver.edge.driver", "./Softwares/edgedriver.exe");
   		    driver=new EdgeDriver();
    	}
		page=new Amazon(driver);
		driver.get(Url);
	}
	@AfterClass
	public void tearDown(){
		driver.close();
	}
}
