package com.google;


import org.testng.annotations.Test;
public class GooglePage extends TestBaseForGoogle  {
	@Test
	public void Google () {
	
			    String Title1="Automation Testing";
			    g.getinputField().sendKeys(Title1);
			    g.getSearchButton().submit();
			    String Title2=driver.getTitle();
			    System.out.println(Title2);
			    if(Title1.equals(Title2))
			    	System.out.println("Same");
			    else
			    	
			    	System.out.println("Different");
	}
	}