package week2.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactButtonAss {
	public static void main(String[] args) throws IOException, InterruptedException {		       WebDriverManager.chromedriver().setup();
	WebDriverManager.chromedriver().setup();
				
		       ChromeDriver driver=new ChromeDriver();		
				
				
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		       driver.get("http://leaftaps.com/opentaps/control/main");
				
		      //driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("Democsr2");
				
				//Enter the password
				driver.findElement(By.xpath("(//label[text()='Password']/following-sibling::input)")).sendKeys("crmsfa");
				
				//Click Login
				driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
				
				//Click crm/sfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
				//Click Contacts Tab
			
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				
				//Click Create Contact
				driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
				////a[text()='Create Contact']
				
				//Type First Name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("raji");
				
				//Type Last Name
				driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("sarath");
				
				//Click Create Contact Button
				driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
				
				//Print the first name and browser title 
				////span[contains(@id,'viewContact_firstName_sp')]
				String cont = driver.findElement(By.xpath("//span[text()='First name']")).getText();
                String cont1 = driver.findElement(By.xpath("//div[text()='View Contact']")).getText();
				System.out.println("browser title "+ cont1);
				System.out.println("first name " + cont);
				
				//Close the browser

				driver.close();
	

}
}
