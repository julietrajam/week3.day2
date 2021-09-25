package week3.day2.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		from.clear();
		from.sendKeys("MS",Keys.ENTER);
		
		
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		to.clear();
		to.sendKeys("MDU",Keys.ENTER);
		
		WebElement sortedDate=driver.findElement(By.id("chkSelectDateOnly"));
		sortedDate.click();
		
		List<WebElement> trains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		
		Thread.sleep(8000);
		List<String> trainList = new ArrayList<String>();
		System.out.println("No of trains are: " + trains.size());
		for (int i = 0; i < trains.size(); i++) {
			String trainName = trains.get(i).getText();
			trainList.add(trainName);
		}
		System.out.println("\n****Before Sorting****\n");
		for (String UnSortedTrainList : trainList) {
			System.out.println(UnSortedTrainList);
		}
		System.out.println("\n****After Sorting****\n");
		Collections.sort(trainList);
		for (String SortedTrainList : trainList) {
			System.out.println(SortedTrainList);
		}
	}
}