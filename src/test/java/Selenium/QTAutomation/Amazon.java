package Selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		String title = d.getTitle();
		System.out.println(title);
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
		 d.findElement(By.id("nav-search-submit-button")).click();
		 
		 d.findElement(By.id("a-autoid-0-announce")).click();
			 
		 
		 WebElement ele2 = d.findElement(By.xpath("//*[@id=\"a-popover-2\"]/div/div/ul/li[5]"));
	      ele2.click();
		    
		    
	      
	      WebElement ele1 = d.findElement(By.id("s-result-sort-select"));
	    
	        Select s = new Select(ele1);
	        List<WebElement> opt = s.getOptions();
	        int Count=opt.size();
	        System.out.println("options count is :"+Count);
	
			   
		    d.close();
	}

}
