import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=5;i++) {
			js.executeScript("window.scrollBy(0,500)");
		}
	}

}
