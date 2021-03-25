package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Launch Chrome Driver and open website*/
		WebDriverManager.chromedriver().setup();  //set up chromedriver using webdriver manager class . .exe
		ChromeDriver driver1=new ChromeDriver(); //Launch chrome browser with classname chrome driver and get method
		driver1.get("http://leaftaps.com/opentaps"); //Load URL
		driver1.manage().window().maximize(); //Maximize the window	
		/*Login*/
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager"); //Find user ID and type the value
		driver1.findElement(By.id("password")).sendKeys("crmsfa"); //Find password and type the value
		driver1.findElement(By.className("decorativeSubmit")).click(); //Find the login button and click
		String title=driver1.getTitle();
		System.out.println(title);//Verify title
		driver1.findElement(By.linkText("CRM/SFA")).click(); //click CRM/SFA link
		driver1.findElement(By.linkText("Create Contact")).click();
		/*Create Contact page*/	
		driver1.findElement(By.id("firstNameField")).sendKeys("Ayesha");
		driver1.findElement(By.id("lastNameField")).sendKeys("Mohammed");
		driver1.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("AyeshaLocal");
		driver1.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MohammedLocal");
		driver1.findElement(By.id("createContactForm_departmentName")).sendKeys("Arts");
		driver1.findElement(By.id("createContactForm_description")).sendKeys("https://github.com/TestLeafPages/SelFebPseudo/blob/master/week2/day2.assignments/CreateContact.java");
		driver1.findElement(By.id("createContactForm_primaryEmail")).sendKeys("uyirinai@gmail.com");
		WebElement province=driver1.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd_province=new Select(province);
		dd_province.selectByVisibleText("New York");
		driver1.findElement(By.className("smallSubmit")).click(); //Create Contact 
		String outputtitle=driver1.getTitle();
		System.out.println(outputtitle);//Verify create Contact title
		/*Edit Contact page*/	
		driver1.findElementByXPath("//a[@class='subMenuButton']").click();
		driver1.findElement(By.id("updateContactForm_description")).clear();
		driver1.findElement(By.id("updateContactForm_importantNote")).sendKeys("Monisha");
		driver1.findElement(By.xpath("//span[text()='Important Note']/following::input")).click();
		String updateoutputtitle=driver1.getTitle();
		System.out.println(updateoutputtitle);//Verify create Contact title
		
	}

}
