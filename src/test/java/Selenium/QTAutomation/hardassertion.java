package Selenium.QTAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion {

	@Test
	public static void Hard()
	{
		Assert.assertEquals(false, true);
		System.out.println("not matching");
		
		Assert.assertEquals(10, 10);
		System.out.println(" matching");

		
	}

}
