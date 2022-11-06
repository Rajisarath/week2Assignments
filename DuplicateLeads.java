package week2.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
				
				ChromeDriver driver=new ChromeDriver();	
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Launch the browser
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("Democsr2");
				
				//Enter the password
				driver.findElement(By.xpath("(//label[text()='Password']/following-sibling::input)")).sendKeys("crmsfa");
				
				//Click Login
				driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
				
				//Click crm/sfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
				//Click Leads link
				driver.findElement(By.xpath("//a[contains(text(),'Lead')] ")).click();
				
				
			    
				
				//Click Find leads
				driver.findElement(By.xpath("//a[contains(text(),'Find')]  ")).click();
				
				//Click on Email
				driver.findElement(By.xpath("//span[text()='Email']  ")).click();
				
				//Enter Email
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("raji.testleaf@gmail.com");
				
				//Click find leads button
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')] ")).click();
				Thread.sleep(3000);
				//Click First Resulting lead
				driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[20]")).click();
				
				//Click Duplicate Lead
				driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
				
				
				//Verify the title as 'Duplicate Lead'
				String Duplicate = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
				System.out.println(Duplicate);
		        String compareTextname="Duplicate Lead";
		       
		        if(compareTextname.contains(Duplicate)) {
		        	System.out.println("duplicate name is successfully executed");
		        }else {
		        	System.out.println("duplicate name is not executed");
		        }
		        
		        
		        
		        //Click Create Lead
		        driver.findElement(By.xpath("//input[@type='submit']")).click();
		        
		        String text = driver.findElement(By.xpath("//span[text()='Raji']")).getText();
		        String text1="Raji";
		        //Confirm the duplicated lead name is same as captured name
		        if(text.contains(text1)) {
		        	System.out.println("Firstname is matched");
		        }else {
		        	System.out.println("Firstname is not matched");
		        }
		        driver.close();
				
				

				

				
				
				
				
		
		

	}

}
