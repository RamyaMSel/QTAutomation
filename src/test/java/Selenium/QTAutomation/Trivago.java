package Selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trivago {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.trivago.in/");
		d.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
		Thread.sleep(5000);
		d.findElement(By.xpath("(//span[@data-testid='suggestion-title'])[1]")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("//span[text()='17'][1]")).click();
		d.findElement(By.xpath("(//span[@class='flex flex-col text-s text-grey-900'])[3]")).click();
	d.findElement(By.xpath("(//span[@class='inline-flex leading-none transform self-center'])[2]")).click();
	d.findElement(By.xpath("(//span[@class='flex items-center justify-center'])[3]")).click();
	Thread.sleep(30000);
	d.findElement(By.xpath("//select[@id='sorting-selector']")).click();
	d.findElement(By.xpath("//*[@id='sorting-selector']/option[5]")).click();
	
	List<WebElement> ele1 = d.findElements(By.xpath("//*[@data-testid='item-name']//span[@itemprop='name']"));
	int count =ele1.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		String names = ele1.get(i).getText();
		System.out.println(names);
	}
	
	System.out.println("........Ratings display.......");
	
	List<WebElement> Listofhotelrating = d.findElements(By.xpath("//span[@itemprop='ratingValue']"));
	
    for(int i=0;i<Listofhotelrating.size();i++)
        {
        System.out.println("Hotel ratings in descending order:"+ Listofhotelrating.get(i).getText());
        }
   
	
	}

}

	

