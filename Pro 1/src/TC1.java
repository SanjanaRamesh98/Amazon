import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Generic{
	@Test
	public void testlogin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("9590289106");
		driver.findElement(By.id("pass")).sendKeys("sanjanasanu98");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook");
		System.out.println("1");

}
}
