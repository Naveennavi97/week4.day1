package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

public class LeafGround {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowsize = rows.size();
		System.out.println("rowsize is " +rowsize);
		List<WebElement> column = driver.findElements(By.xpath("//table//tbody//th"));
		int columnsize = column.size();
		System.out.println("columnsize is " +columnsize);
		
		List<WebElement> least = driver.findElements(By.xpath("//table//tbody//td[2]"));
		List<Integer>list=new ArrayList<Integer>();
		 for (WebElement each : least) {
			 String text = each.getText();
			// System.out.println(text);
			 String replace = text.replace("%","");
			 System.out.println(replace);
		int parseInt = Integer.parseInt(replace);
		list.add(parseInt);
		//System.out.println(parseInt);
		}
		// System.out.println(list);
		 //Collections.sort(list);
		 Set<Integer>set=new TreeSet<Integer>(list);
		 System.out.println(set);
		if (set.contains(20)) {
			driver.findElement(By.xpath("(//input[@name='vital'])[5]")).click();
			
			
		}
	
}//input[@name='vital']
}

