package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//label[text()='Username']/following::input")).sendKeys("DemoSalesManager");  //Username  - Text based following x path
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa"); //Password - Attribute based
	driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();//Login
	driver.findElementByXPath("//div[@id='label']//a[1]").click(); //Click link - parent based id xpath
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();   //Click Lead from home page
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeLeadsForm']")).click(); //Click Merge Leads
	Thread.sleep(2000);
	driver.findElementByXPath("//table[@class='twoColumnForm']//td[2]//img").click(); //Select Look up FROM LEAD
	driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]")).click();//select first record
	driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();////Select  Look up TO LEAD
	driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td[1]/div/a")).click();//select first record
	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	String CompanyName=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	System.out.println(CompanyName);
	}
	
	//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a
	

	}


