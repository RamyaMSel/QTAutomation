package Selenium.QTAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSelenium {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver d=new EdgeDriver();
        d.manage().window().maximize();
        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");

      String text=d.findElement(By.id("p3")).getText();
        System.out.println(text);
        WebElement username = d.findElement(By.id("input1"));
        WebElement password = d.findElement(By.id("input2"));

        d.findElement(By.id("input1")).sendKeys("JAVA");
        d.findElement(By.id("input2")).sendKeys("SELENIUM");
        String Un1=username.getAttribute("value");
        System.out.println(Un1);
        String Pw1=password.getAttribute("value");
        System.out.println(Pw1);

        username.clear();
        password.clear();

        username.sendKeys("selenium");
        String Un2=username.getAttribute("value");
        System.out.println(Un2);

        password.sendKeys("java");
        String Pw2=password.getAttribute("Value");
        System.out.println(Pw2) ;

        }
}
