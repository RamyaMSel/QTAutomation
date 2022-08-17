package Selenium.QTAutomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	@Test
	public static void soft()
	{
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(90, 10);
		System.out.println("not matching");
		
		sa.assertEquals(10, 10);
		System.out.println(" matching");

		
		sa.assertAll();
	}

}
