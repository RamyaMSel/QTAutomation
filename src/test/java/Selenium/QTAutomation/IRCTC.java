package Selenium.QTAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		  WebDriverManager.chromedriver().setup();


	        ChromeOptions option =new ChromeOptions();
	        option.addArguments("--disable-notification");
	        WebDriver driver = new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.get("https://www.irctc.co.in/nget/train-search");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        String Home_Title =driver.getTitle();
	        System.out.println(Home_Title);
	        Assert.assertEquals(Home_Title,"IRCTC Next Generation eTicketing System");
	        System.out.println("correct page is open");
	    WebElement from=    driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	    from.sendKeys("HYB");
	    //span[@class='ng-star-inserted' and text()='HYDERABAD DECAN - HYB']
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='HYDERABAD DECAN - HYB']")).click();


	    WebElement to=    driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	    to.sendKeys("Pune");
	    driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted' and text()='PUNE JN - PUNE']")).click();
	    to.click();

	    //Date :
	    //WebElement s_date=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	        //s_date.clear();
	    //s_date.sendKeys("12/08/2022");
	    //s_date.click();


	    //input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']
	    WebElement coach =    driver.findElement(By.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
	    coach.click();
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='Sleeper (SL)']")).click();

	    

	    //*[@class='css-label_c t_c' and text()='Person With Disability Concession']
	    driver.findElement(By.xpath("//*[@class='css-label_c t_c' and text()='Person With Disability Concession']")).click();
	    //driver.switchTo().alert().accept();
	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@class='ng-tns-c56-53 ui-confirmdialog-acceptbutton ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//button[@type='button']//span/following-sibling::span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
	    //div[@class='col-sm-5 col-xs-11 train-heading']

	    List<WebElement> numer_of_train=driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
	    System.out.println("Number of Train Available "+numer_of_train.size());
	    for(WebElement t_name:numer_of_train)
	    {
	        String train_Name=t_name.getText();
	        System.out.println(train_Name);
	    }
	    //TakesScreenshot ts=new (driver)TakesScreenshot;


	    LocalDateTime myDateObj = LocalDateTime.now();
	    String name=myDateObj.toString();
	    System.out.println(name);
	    String name1=myDateObj.toString().replace(":", "").replace(" ", "").replace(".", "");
	    System.out.println(name1);




	    TakesScreenshot ts=(TakesScreenshot)driver;

	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File des =new File("C:\\Users\\ramya.ms\\Desktop\\screenshot\\"+name1+".png");
	    FileUtils.copyFile(src,des);

	    Thread.sleep(5000);
	    driver.close();


	    }
	

}

