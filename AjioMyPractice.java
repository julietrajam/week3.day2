package week3.day2.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioMyPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Type Bags
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags",Keys.ENTER);
		
		Thread.sleep(2000);
		//Select Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		//Select Fashion Bags
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		
		/*
		 * WebElement
		 * btndwn=driver.findElement(By.xpath("//span[contains(text(),'ASSURED')]"));
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].scrollIntoView(true)", btndwn);
		 */
		
		WebElement totalbag=driver.findElement(By.className("length"));
		String bagcount=totalbag.getText();
		System.out.println("Total no of bags:"+bagcount);
		
		List<WebElement> brandList=driver.findElements(By.className("brand"));
		
		System.out.println("No of Brands:"+brandList.size());
		
		System.out.println("Bag Brands");
		for (WebElement brands : brandList) {
			String brandNames=brands.getText();
			System.out.println(brandNames);
			
		}
		
		
		
		List<WebElement> bagNameList=driver.findElements(By.className("name"));
		System.out.println("No of Bag names:"+bagNameList.size());
		
		System.out.println("Bag Names");
		
		for (WebElement webElement : bagNameList) {
			
			String bagnames=webElement.getText();
			System.out.println(bagnames);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
