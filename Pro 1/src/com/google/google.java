package com.google;


	import org.testng.annotations.Test;

	public class google extends TestBaseForGoogle  {
	@Test

	public void Search()
	{
		g.getinputField().sendKeys("Automation Testing");
		g.getSearchButton().submit();
	}
	}


