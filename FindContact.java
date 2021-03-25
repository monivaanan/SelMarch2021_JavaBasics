package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		
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

		/*** HOME PAGE ***/
		
		driver1.findElementByLinkText("Contacts").click();
		Thread.sleep(1000);
		driver1.findElementByLinkText("Find Contacts").click();
		Thread.sleep(2000);
		/*** FIND CONTACTS***/
		driver1.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']//li[3]")).click();  //Click email
		driver1.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("uyirinai@gmail.com");  //Enter mail Id
		driver1.findElement(By.xpath("//button[text()='Find Contacts']")).click(); //Search
		Thread.sleep(2000);
	
		driver1.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click(); //first column in the grid
		String firstName=driver1.findElementById("viewContact_firstName_sp").getText();  //Get first name
		System.out.println(firstName);
		driver1.findElementByLinkText("Edit").click();
		Thread.sleep(2000);
		WebElement mCampaign=driver1.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select v_mCampaign=new Select(mCampaign);
		v_mCampaign.selectByValue("DEMO_MKTG_CAMP");  //Select by value
		Thread.sleep(1000); 
		
		driver1.findElement(By.xpath("//input[@value='Add']")).click(); 
		Thread.sleep(2000);
		
		driver1.findElement(By.id("updateContactForm_departmentName")).sendKeys("Selenium Automation Testing");
		driver1.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		
		WebElement checkmc=driver1.findElement(By.id("viewContact_marketingCampaigns_sp"));
		String test1=checkmc.getText(); 
		System.out.println(test1); //Get the text of Marketing campaign and Verify it
		
		String finalTitle=driver1.getTitle();
		System.out.println(finalTitle); //Print Title
		

	}

}
