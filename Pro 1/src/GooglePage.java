import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePage {
	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
	}

}
