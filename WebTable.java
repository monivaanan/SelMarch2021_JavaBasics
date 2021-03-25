package AssignmentWeek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();  						//set up chromedriver using webdriver manager class . .exe
		ChromeDriver driver=new ChromeDriver(); 						//Launch chrome browser with classname chrome driver and get method
		driver.get("http://leafground.com/pages/table.html"); 			//Load URL
		driver.manage().window().maximize(); 							//Maximize the window
		
		List<WebElement> tableRows=driver.findElements(By.tagName("tr")); //Identify Row using row tags available in the table. 
		int numRow=tableRows.size(); 
		System.out.println("No. of Rows\t:" +numRow);  //print Row size
		
		List<WebElement> tableCols=null;
		List<Integer> progressList=new ArrayList<Integer>();  		//To save all progress% in an array list.
		
		for(int i=1;i<numRow;i++) 									//Iterate through each row , where actual row context is available
		{
			WebElement eachRow=tableRows.get(i);   
			tableCols=eachRow.findElements(By.tagName("td")); 		// with Row index , identify the columns using column tags available for each rows.
			//System.out.println("No. of Columns\t:" +tableCols.size());
			String showText=tableCols.get(1).getText();  			//Print the values of first column(Progress) from table
			//System.out.println(showText);
			String showNum=showText.replaceAll("[^0-9]", "");  		//Returns as String , remove %
			int progress=Integer.parseInt(showNum); 				//Convert to Integer and store it in a variable.
			progressList.add(progress);  							//  Get the progress value of 'Learn to interact with Elements'
			System.out.println(progress); 
		}
		
	System.out.println("No. of Columns\t:" +tableCols.size()); 		//print column size
	
	/******Find the vital task for the least completed progress and check the box**********/
	
	Collections.sort(progressList);
	int leastCompleted=Collections.min(progressList);  
	System.out.println("Least completed Progress:" +leastCompleted);
	
	WebElement vital=driver.findElementByXPath("//td[contains(text(),'"+leastCompleted+"%')]/following-sibling::td/input"); //add dynamic value in the findElement expression
	if(vital.isSelected()==false) {
		vital.click();
		System.out.println("Vital is checked");
	}	
	
	}

}
