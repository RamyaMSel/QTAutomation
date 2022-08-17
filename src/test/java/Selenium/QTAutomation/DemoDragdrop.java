package Selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDragdrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
        d.get("http://uitestpractice.com/");
        
       WebElement dragicon = d.findElement(By.id("draggable"));
       WebElement dropicon = d.findElement(By.id("droppable"));
       
       Actions a=new Actions(d);
       a.dragAndDrop(dragicon, dropicon).build().perform();
       System.out.println("Drag N Drop is performed");
       
       Actions a1=new Actions(d);
       WebElement ele = d.findElement(By.name("dblClick"));
       a1.doubleClick(ele).build().perform();
       System.out.println("Double clicked");
       
        
	}

}
