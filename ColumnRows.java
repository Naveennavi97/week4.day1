package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ColumnRows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> row1 = driver.findElements(By.xpath("(//table)[1]//tr"));
        int rowsize1 = row1.size();
        System.out.println("row size is " + rowsize1);
		List<WebElement> row2 = driver.findElements(By.xpath("(//table)[2]//tr"));
        int rowsize2 = row2.size();
        System.out.println("row size is " + rowsize2);
        
        List<WebElement> column = driver.findElements(By.xpath("(//table)[1]//th"));
        int columnsize = column.size();
        System.out.println("column size is " +  columnsize);
        
        List<WebElement> column2 = driver.findElements(By.xpath("(//table)[2]//th"));
        int columnsize2 = column2.size();
        System.out.println("column size is " +  columnsize2);
		
	}
	

}
