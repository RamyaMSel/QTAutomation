package Selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
//		d.get("https://money.rediff.com/gainers/bse/daily/groupa");
//		WebElement element=d.findElement(By.xpath("//a[contains(text(),'Triveni Turbine')]/ancestor::tr//td[4]"));
//        String title =element.getText();
//        System.out.println(title);
        
        
//        d.get("https://www.moneycontrol.com/stocksmarketsindia/");
//		WebElement element=d.findElement(By.xpath("(//a[contains(text(),'Reliance')])[1]/ancestor::tr/td[4]"));
//        String title =element.getText();
//        System.out.println(title);
//        
        
        d.get("https://www.moneycontrol.com/stocksmarketsindia/");
		//WebElement element=d.findElement(By.xpath("//a[contains(text(),'S&P BSE Smallcap')]/ancestor::tr/td[2]"));
        WebElement element=d.findElement(By.xpath("//*[@id=\"maindindi\"]/div[1]/table/tbody/tr[5]/td[4]"));
        String title =element.getText();
        System.out.println(title);
        
        
	}

}
