package AssignmentWeek2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindOpportunities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();  //set up chromedriver using webdriver manager class . .exe
		ChromeDriver driver1=new ChromeDriver(); //Launch chrome browser with classname chrome driver and get method
		driver1.get("http://leaftaps.com/opentaps"); //Load URL
		driver1.manage().window().maximize(); //Maximize the window	
		
		/*** LOGIN ***/
		
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager"); //Find user ID and type the value
		driver1.findElement(By.id("password")).sendKeys("crmsfa"); //Find password and type the value
		driver1.findElement(By.className("decorativeSubmit")).click(); //Find the login button and click
		String title=driver1.getTitle();
		System.out.println(title);//Verify title
		driver1.findElement(By.linkText("CRM/SFA")).click(); //click CRM/SFA link
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[@href='/crmsfa/control/opportunitiesMain']")).click();
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Find Opportunities")).click();
		List<WebElement> OppID=driver1.findElements(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]"));  //Goto Opportunities table and fetch first column
		for(WebElement i:OppID) 
		{
			System.out.println(i.getText());
		}
		
		String oppTitle=driver1.getTitle();
		System.out.println(oppTitle); //Print Title
		

	}

}
