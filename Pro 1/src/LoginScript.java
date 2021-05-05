import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScript {
	public static void main(String[] args) {
		
		//Launch the browser
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		//Open the browser
		WebDriver driver=new FirefoxDriver();
		//Enter the test URL
		driver.get("https://www.facebook.com");
		//Enter the valid username
		driver.findElement(By.id("email")).sendKeys("9590289106");
		//Enter the valid password 
		driver.findElement(By.id("pass")).sendKeys("sanjanasanu98");
		//Click on Login button
		driver.findElement(By.name("login")).click();
		//Verify home page is displayed or not
		String title=driver.getTitle();
		System.out.println(title);	
		
		if(title.equals("Faebook")) {
			System.out.println("Homepage is dispalyed:pass");	
		}
		else {
			System.out.println("Homepage is dispalyed:fail");
		}
	}
}
