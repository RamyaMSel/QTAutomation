package Selenium.QTAutomation;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pepperfry {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pepperfry.com/");
		String title = d.getTitle();
		System.out.println(title);
		if(title.equals(title))
		{
			System.out.println("Title Matching");
		}else
		{
			System.out.println("Title not matching");
		}
		
		 d.findElement(By.xpath("//*[@id=\"menu_wrapper\"]/ul/li[1]/a")).click();
		 d.findElement(By.linkText("Seating")).click();
         d.findElement(By.linkText("Benches")).click();
         
         List<WebElement> E1=d.findElements(By.xpath("//li[@class='clip-main-cat carousel-cell ']"));
         System.out.println("bench count is " +E1.size());
      WebElement e = d.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[6]/a/div/div[2]/p"));
      if (e.equals("1 option"))
      {
    	  System.out.println("Industrial benches are NOT more than one");
      }
      else
      {
    	  System.out.println("industrial benches are more than one" +e.getText());
    	
      
         
         
     }

	  d.close();
         

  
	
	}
}
	


