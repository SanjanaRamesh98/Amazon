import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POM_Test {
	@Test
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

}
