package endtoend;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon{
	WebDriver driver;
	public Amazon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	@FindBy(id="createAccountSubmit")
	WebElement createAccount;
	public WebElement getCreateAccount(){
		return createAccount;
}
	@FindBy(id="ap_customer_name")
	WebElement fullname;
	public WebElement getFullname(){
		return fullname;
	}
	@FindBy(id="ap_email")
	WebElement email;
	public WebElement getEmail(){
		return email;
}
	@FindBy(id="ap_password")
	WebElement password;
	public WebElement getPassword(){
		return password;
	}
	@FindBy(id="ap_password_check")
	WebElement reEnterPassword;
	public WebElement getReEnterPassword(){
		return reEnterPassword;
}
	@FindBy(id="continue")
	WebElement accountCreate;
	public WebElement getAccountCreate(){
		return accountCreate;
	}
	
	public List<WebElement> getInputs() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement getSerchButton() {
		// TODO Auto-generated method stub
		return null;
	}
	public void clear() {
		//TODO Auto-generated method stub
		
	}

}

