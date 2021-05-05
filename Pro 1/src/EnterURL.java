import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterURL {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
	}

}
