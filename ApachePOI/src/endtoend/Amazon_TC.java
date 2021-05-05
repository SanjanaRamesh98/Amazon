package endtoend;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_TC extends TestBase {
	@Test
	public void Amazon() {
		page.getSignin().click();
		page.getCreateAccount().click();
		page.getEmail().sendKeys("sanjanaramesh626@gmail.com");
		page.getPassword().sendKeys("sanj");
		page.getReEnterPassword().sendKeys("sanj");
		page.getAccountCreate().click();
	}
	
	@Test( dataProvider="getdata")
	public void searchItem(String input) throws InterruptedException
	{
		
		page.getSerchButton().clear();
		page.getSerchButton().sendKeys(input);
		Thread.sleep(2000);
		List<WebElement> search=page.getInputs();
		for(WebElement element:search)	{	
		Reporter.log(element.getText(),true);
		
	}
		page.getSerchButton().submit();
		boolean Title=driver.getTitle().contains(input);
		Assert.assertTrue(Title);
	}


	@DataProvider
	public String[][] getdata() throws Exception {
		
		String xlPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumAutomation\\TestData\\TestData.xlsx";
		String xlSheet="Sheet1";
		int rowCount=ExcelUtility.getRowCount(xlPath,xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath,xlSheet,rowCount);
		String[][] data=new String [rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				 data[i-1][j]=ExcelUtility.getCellData(xlPath,xlSheet,i,j);
			}
		}
		return data;
	}
	}


