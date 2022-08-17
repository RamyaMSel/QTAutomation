package Selenium.QTAutomation;

//package zahir.Qtautomation;
//zahir
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondprogram {
  public static void main(String[] args) throws InterruptedException {


  WebDriverManager.chromedriver().setup();
  WebDriver d=new ChromeDriver();
  d.manage().window().maximize();
  d.get("http://www.uitestpractice.com/Students/Form");
  d.findElement(By.id("firstname ")).sendKeys("zahir");
  d.findElement(By.id("lastname ")).sendKeys("shaikh");
  d.findElement(By.name("optradio")).click();  
  d.findElement(By.xpath("//input[@value='cricket']")).click();

  WebElement element=d.findElement(By.id("sel1"));
  Select select=new Select(element);
  select.selectByVisibleText("Canada");
  d.findElement(By.id("datepicker")).click(); 
  WebElement Month=d.findElement(By.className("ui-datepicker-month")); 
  Select select_M=new Select(Month); 
  select_M.selectByVisibleText("july");

  WebElement yrs=d.findElement(By.className("ui-datepicker-year")); 
  Select select_yrs=new Select(yrs); 
  select_yrs.selectByVisibleText("2022");
  d.findElement(By.className("ui-state-default ui-state-active ui-state-hover")).click();

  d.findElement(By.id("phonenumber")).sendKeys("7020092912");

  d.findElement(By.id("username")).sendKeys("Zahirshiakh");

  d.findElement(By.id("email")).sendKeys("shaikhzahir7020@gmail.com");
  d.findElement(By.id("comment")).sendKeys("nice programe ");

  d.findElement(By.id("pwd")).sendKeys("zahir@123"); 
  Thread.sleep(500);

  d.findElement(By.className("btn btn-default")).click();

System.out.println("ok");

d.close();

}

}