package Selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {

    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver d=new ChromeDriver();
            d.manage().window().maximize();
            d.get("http://www.uitestpractice.com/Students/Form");
            
            WebElement firstname=d.findElement(By.id("firstname"));
            firstname.sendKeys("Ramya");
            Thread.sleep(300);
            System.out.println("First Name is "+ firstname.getAttribute("value"));

            WebElement lastname=d.findElement(By.id("lastname"));
            lastname.sendKeys("MS");
            lastname.getAttribute("value");
            System.out.println("Last Name is "+ lastname.getAttribute("value"));
            Thread.sleep(300);

            WebElement status=d.findElement(By.xpath("(//label[contains(text(), 'Martial Status')]//following-sibling::label/input[@type='radio'])[2]"));
            status.click();
            Thread.sleep(300);

            WebElement hobbies=d.findElement(By.xpath("(//label[contains(text(), 'Hobby')]//following-sibling::label/input[@type='checkbox'])[2]"));
            hobbies.click();
            Thread.sleep(300);

            WebElement element=d.findElement(By.id("sel1"));
            Select select=new Select(element);
            select.selectByVisibleText("India");
            Thread.sleep(300);

            WebElement dob=d.findElement(By.id("datepicker"));
            dob.sendKeys("09/16/1992");
            Thread.sleep(300);

            WebElement phonenumber=d.findElement(By.id("phonenumber"));
            phonenumber.sendKeys("123456");
            Thread.sleep(300);

            WebElement username=d.findElement(By.id("username"));
            username.sendKeys("ABC");
            Thread.sleep(300);

            WebElement email=d.findElement(By.id("email"));
            email.sendKeys("test@gmail.com");
            Thread.sleep(300);
            
            WebElement comment=d.findElement(By.id("comment"));
            comment.sendKeys("Entering comment to show on console");
            Thread.sleep(300);
           WebElement pwd=d.findElement(By.id("pwd"));
            pwd.sendKeys("test");
            Thread.sleep(300);
            d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
            
            //d.findElement(By.className("btn btn-default ")).click();
            System.out.println("Application Automated Successfully");
            d.close();
    }

	
	}

