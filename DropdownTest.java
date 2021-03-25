package AssignmentWeek2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://www.leafground.com/pages/Dropdown.html");
		driver1.manage().window().maximize();
		
		  WebElement dropdown1= driver1.findElement(By.id("dropdown1"));
		   Select dd1=new Select(dropdown1);  
		   dd1.selectByIndex(1);
		   Thread.sleep(1000);
		   
		   WebElement dropdown2= driver1.findElement(By.name("dropdown2"));
		   Select dd2=new Select(dropdown2);  
		   dd2.selectByIndex(2);
		   Thread.sleep(1000);
		   
		   WebElement dropdown3= driver1.findElement(By.id("dropdown3"));
		   Select dd3=new Select(dropdown3);  
		   dd3.selectByIndex(3);
		   Thread.sleep(1000);
		   
		   WebElement dropdown4=driver1.findElement(By.className("dropdown"));
		   Select dd4=new Select(dropdown4);  
		   dd4.selectByIndex(4);
		   List<WebElement> numDropDowns = driver1.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[*]"));
		   System.out.println("The number of links is " + numDropDowns.size());
		   Thread.sleep(1000);
		 
		   
		   
		   WebElement dropdownSS=driver1.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
		   dropdownSS.sendKeys("Appium");
		   Thread.sleep(1000);
		   
		   WebElement mulsel=driver1.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[*]"));
		   Select ms=new Select(mulsel); 
		   boolean multiselect=ms.isMultiple();
		   System.out.println("Multiselect is: " +multiselect);
		   ms.selectByIndex(1);
		   ms.selectByIndex(3); 

	}

}
