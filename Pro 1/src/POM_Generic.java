import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Generic {
	@FindBy(xpath="//div[.='Login']")
	private WebElement login;
	
	public void LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void clickLogin() {
	login.click();
}
}
