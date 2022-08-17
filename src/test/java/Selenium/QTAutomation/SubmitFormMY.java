package Selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitFormMY {

	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Form");
		
		d.findElement(By.id("firstname")).sendKeys("Ramya");
		d.findElement(By.id("lastname")).sendKeys("Saanvi");
		
		d.findElement(By.name("optradio")).click();
		d.findElement(By.xpath("//input[@value='read']")).click();
		
		WebElement ele = d.findElement(By.id("sel1"));
	    Select s= new Select(ele);
	    s.selectByVisibleText("Iceland");
	    
	    d.findElement(By.id("datepicker")).click();
	    
	    
	    WebElement ele2 = d.findElement(By.className("ui-datepicker-month"));
	    Select s2= new Select(ele2);
	    s2.selectByVisibleText("Sep");
	    
	    d.findElement(By.className("ui-state-default")).click();
	    
	    d.findElement(By.id("phonenumber")).sendKeys("9886543332");
	    d.findElement(By.id("username")).sendKeys("rams");
	    d.findElement(By.id("email")).sendKeys("rams@gmail.com");
        WebElement com = d.findElement(By.id("comment"));
	    com.sendKeys("Ram from mysore");
	    
	  String text=com.getAttribute("value");
	  System.out.println(text);
	  
	  d.findElement(By.id("pwd")).sendKeys("1234");
	 Thread.sleep(10000);
	  WebElement submit=d.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button"));
      submit.click();
      System.out.println("submitted");
      
     
	}

}
