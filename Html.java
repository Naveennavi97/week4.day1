package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> column = driver.findElements(By.xpath("(//table)[1]//th"));
		int csize = column.size();
		System.out.println("column size is " + csize);
		List<String>Library1=new ArrayList<String>();
		for (int i = 1; i <csize +1; i++) {
			String element = driver.findElement(By.xpath("(//table)[1]/tbody/tr[1]/td["+i+"]")).getText();
			Library1.add(element);
			
	}
		System.out.println("Market Share Value is :");
		System.out.println(Library1);
		
		List<String>library2=new ArrayList<String>();
		for (int j = 2; j < csize+1; j++) {
			String element2 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td["+j+"]")).getText();
			library2.add(element2);
		}
		
			System.out.println("Absolute usage is : ");
			System.out.println(library2);
		}
}

